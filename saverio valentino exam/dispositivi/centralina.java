package dispositivi;

interface centralina
{
  long  TIMER = 10000;
  
  void  signal(long n);
  void  stop();
  void  start(long n);
  void  pause();
}
