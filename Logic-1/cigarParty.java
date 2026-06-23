public boolean cigarParty(int cigars, boolean isWeekend) {
  return cigars >= 40 && (isWeekend || cigars <= 60);
}
