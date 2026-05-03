package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) return _personSimpleWalk!!
        _personSimpleWalk = phosphorDuotoneIcon(
            name = "PersonSimpleWalk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 176.000 48.000 C 176.000 61.255 165.255 72.000 152.000 72.000 C 138.745 72.000 128.000 61.255 128.000 48.000 C 128.000 34.745 138.745 24.000 152.000 24.000 C 165.255 24.000 176.000 34.745 176.000 48.000 Z"),
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
                pathData = parseSvgPathData("M 152.000 80.000 C 169.673 80.000 184.000 65.673 184.000 48.000 C 184.000 30.327 169.673 16.000 152.000 16.000 C 134.327 16.000 120.000 30.327 120.000 48.000 C 120.000 65.673 134.327 80.000 152.000 80.000 ZM 152.000 32.000 C 160.837 32.000 168.000 39.163 168.000 48.000 C 168.000 56.837 160.837 64.000 152.000 64.000 C 143.163 64.000 136.000 56.837 136.000 48.000 C 136.000 39.163 143.163 32.000 152.000 32.000 ZM 216.000 144.000 C 216.000 148.418 212.418 152.000 208.000 152.000 C 172.690 152.000 155.050 134.190 140.880 119.880 C 138.140 117.110 135.520 114.480 132.880 112.040 L 119.450 142.920 L 156.650 169.490 C 158.752 170.992 160.000 173.416 160.000 176.000 L 160.000 232.000 C 160.000 236.418 156.418 240.000 152.000 240.000 C 147.582 240.000 144.000 236.418 144.000 232.000 L 144.000 180.120 L 112.930 157.920 L 79.340 235.190 C 78.069 238.112 75.186 240.001 72.000 240.000 C 70.901 240.003 69.815 239.774 68.810 239.330 C 64.760 237.570 62.903 232.861 64.660 228.810 L 118.740 104.440 C 109.430 102.790 97.820 105.640 84.040 113.020 C 73.050 119.082 62.793 126.387 53.470 134.790 C 50.234 137.689 45.275 137.475 42.301 134.308 C 39.326 131.140 39.424 126.178 42.520 123.130 C 45.020 120.780 104.210 65.910 141.240 98.050 C 145.070 101.370 148.720 105.050 152.240 108.630 C 166.190 122.700 179.360 136.000 208.000 136.000 C 212.418 136.000 216.000 139.582 216.000 144.000 Z"),
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
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
