package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BellSimpleRinging: ImageVector
    get() {
        if (_bellSimpleRinging != null) return _bellSimpleRinging!!
        _bellSimpleRinging = phosphorFillIcon(
            name = "BellSimpleRinging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 224.000 C 168.000 228.418 164.418 232.000 160.000 232.000 L 96.000 232.000 C 91.582 232.000 88.000 228.418 88.000 224.000 C 88.000 219.582 91.582 216.000 96.000 216.000 L 160.000 216.000 C 164.418 216.000 168.000 219.582 168.000 224.000 ZM 227.390 60.320 C 218.399 42.747 204.898 27.879 188.270 17.240 C 185.853 15.696 182.794 15.564 180.252 16.895 C 177.711 18.225 176.077 20.814 175.969 23.681 C 175.861 26.547 177.296 29.252 179.730 30.770 C 193.996 39.845 205.554 52.595 213.190 67.680 C 215.288 71.471 220.024 72.903 223.871 70.909 C 227.718 68.915 229.278 64.220 227.390 60.320 ZM 35.710 72.000 C 38.698 71.999 41.436 70.333 42.810 67.680 C 50.446 52.595 62.004 39.845 76.270 30.770 C 78.704 29.252 80.139 26.547 80.031 23.681 C 79.923 20.814 78.289 18.225 75.748 16.895 C 73.206 15.564 70.147 15.696 67.730 17.240 C 51.102 27.879 37.601 42.747 28.610 60.320 C 27.325 62.799 27.427 65.769 28.877 68.155 C 30.328 70.542 32.918 71.999 35.710 72.000 ZM 208.000 112.000 C 208.000 67.817 172.183 32.000 128.000 32.000 C 83.817 32.000 48.000 67.817 48.000 112.000 C 48.000 138.280 43.220 160.390 34.190 175.940 C 31.305 180.887 31.284 186.998 34.135 191.965 C 36.986 196.932 42.273 199.996 48.000 200.000 L 208.000 200.000 C 213.723 199.989 219.004 196.922 221.850 191.956 C 224.696 186.991 224.673 180.884 221.790 175.940 C 212.780 160.380 208.000 138.270 208.000 112.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _bellSimpleRinging!!
    }

private var _bellSimpleRinging: ImageVector? = null
