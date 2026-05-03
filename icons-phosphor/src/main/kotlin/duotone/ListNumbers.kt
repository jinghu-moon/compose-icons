package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ListNumbers: ImageVector
    get() {
        if (_listNumbers != null) return _listNumbers!!
        _listNumbers = phosphorDuotoneIcon(
            name = "ListNumbers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 64.000 L 216.000 192.000 L 104.000 192.000 L 104.000 64.000 Z"),
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
                pathData = parseSvgPathData("M 224.000 128.000 C 224.000 132.418 220.418 136.000 216.000 136.000 L 104.000 136.000 C 99.582 136.000 96.000 132.418 96.000 128.000 C 96.000 123.582 99.582 120.000 104.000 120.000 L 216.000 120.000 C 220.418 120.000 224.000 123.582 224.000 128.000 ZM 104.000 72.000 L 216.000 72.000 C 220.418 72.000 224.000 68.418 224.000 64.000 C 224.000 59.582 220.418 56.000 216.000 56.000 L 104.000 56.000 C 99.582 56.000 96.000 59.582 96.000 64.000 C 96.000 68.418 99.582 72.000 104.000 72.000 ZM 216.000 184.000 L 104.000 184.000 C 99.582 184.000 96.000 187.582 96.000 192.000 C 96.000 196.418 99.582 200.000 104.000 200.000 L 216.000 200.000 C 220.418 200.000 224.000 196.418 224.000 192.000 C 224.000 187.582 220.418 184.000 216.000 184.000 ZM 43.580 55.160 L 48.000 52.940 L 48.000 104.000 C 48.000 108.418 51.582 112.000 56.000 112.000 C 60.418 112.000 64.000 108.418 64.000 104.000 L 64.000 40.000 C 64.002 37.226 62.567 34.649 60.207 33.190 C 57.848 31.731 54.901 31.599 52.420 32.840 L 36.420 40.840 C 32.466 42.817 30.863 47.626 32.840 51.580 C 34.817 55.534 39.626 57.137 43.580 55.160 ZM 79.770 156.720 C 78.876 150.318 75.409 144.557 70.170 140.770 C 59.380 132.935 44.329 135.009 36.060 145.470 C 34.539 147.423 33.334 149.603 32.490 151.930 C 31.289 154.660 31.705 157.831 33.571 160.158 C 35.436 162.484 38.441 163.580 41.367 163.000 C 44.292 162.421 46.652 160.262 47.490 157.400 C 47.770 156.633 48.168 155.914 48.670 155.270 C 51.602 151.617 56.888 150.917 60.670 153.680 C 62.440 154.932 63.618 156.855 63.930 159.000 C 64.215 161.060 63.648 163.147 62.360 164.780 C 62.331 164.815 62.304 164.852 62.280 164.890 L 33.590 203.210 C 31.777 205.636 31.489 208.877 32.845 211.584 C 34.202 214.292 36.972 216.001 40.000 216.000 L 72.000 216.000 C 76.418 216.000 80.000 212.418 80.000 208.000 C 80.000 203.582 76.418 200.000 72.000 200.000 L 56.000 200.000 L 75.080 174.470 C 78.989 169.436 80.682 163.028 79.770 156.720 Z"),
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
        return _listNumbers!!
    }

private var _listNumbers: ImageVector? = null
