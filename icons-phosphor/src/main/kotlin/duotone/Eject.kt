package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Eject: ImageVector
    get() {
        if (_eject != null) return _eject!!
        _eject = phosphorDuotoneIcon(
            name = "Eject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 168.000 L 216.000 192.000 C 216.000 196.418 212.418 200.000 208.000 200.000 L 48.000 200.000 C 43.582 200.000 40.000 196.418 40.000 192.000 L 40.000 168.000 C 40.000 163.582 43.582 160.000 48.000 160.000 L 208.000 160.000 C 212.418 160.000 216.000 163.582 216.000 168.000 ZM 48.230 128.000 L 207.770 128.000 C 214.930 128.000 218.660 119.730 213.770 114.630 L 140.030 37.130 C 136.871 33.851 132.513 31.998 127.960 31.998 C 123.407 31.998 119.049 33.851 115.890 37.130 L 42.150 114.630 C 37.340 119.730 41.070 128.000 48.230 128.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 208.000 152.000 L 48.000 152.000 C 39.163 152.000 32.000 159.163 32.000 168.000 L 32.000 192.000 C 32.000 200.837 39.163 208.000 48.000 208.000 L 208.000 208.000 C 216.837 208.000 224.000 200.837 224.000 192.000 L 224.000 168.000 C 224.000 159.163 216.837 152.000 208.000 152.000 ZM 208.000 192.000 L 48.000 192.000 L 48.000 168.000 L 208.000 168.000 ZM 48.240 136.000 L 207.760 136.000 C 214.242 136.031 220.118 132.190 222.690 126.240 C 225.233 120.434 224.008 113.666 219.590 109.120 L 145.860 31.610 C 141.191 26.747 134.741 23.999 128.000 23.999 C 121.259 23.999 114.809 26.747 110.140 31.610 L 36.410 109.120 L 36.410 109.120 C 31.992 113.666 30.767 120.434 33.310 126.240 C 35.882 132.190 41.758 136.031 48.240 136.000 ZM 121.730 42.640 C 123.380 40.953 125.640 40.002 128.000 40.002 C 130.360 40.002 132.620 40.953 134.270 42.640 L 207.850 120.000 L 48.140 120.000 Z"),
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
        return _eject!!
    }

private var _eject: ImageVector? = null
