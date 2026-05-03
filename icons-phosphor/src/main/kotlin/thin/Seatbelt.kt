package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Seatbelt: ImageVector
    get() {
        if (_seatbelt != null) return _seatbelt!!
        _seatbelt = phosphorThinIcon(
            name = "Seatbelt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 108.000 C 150.091 108.000 168.000 90.091 168.000 68.000 C 168.000 45.909 150.091 28.000 128.000 28.000 C 105.909 28.000 88.000 45.909 88.000 68.000 C 88.000 90.091 105.909 108.000 128.000 108.000 ZM 128.000 36.000 C 145.673 36.000 160.000 50.327 160.000 68.000 C 160.000 85.673 145.673 100.000 128.000 100.000 C 110.327 100.000 96.000 85.673 96.000 68.000 C 96.000 50.327 110.327 36.000 128.000 36.000 ZM 204.000 224.000 C 204.000 226.209 202.209 228.000 200.000 228.000 L 56.000 228.000 C 54.336 228.002 52.844 226.973 52.255 225.416 C 51.666 223.860 52.102 222.101 53.350 221.000 L 156.350 130.160 C 137.045 121.321 114.720 122.007 95.994 132.014 C 77.268 142.020 64.291 160.199 60.910 181.160 C 60.601 183.098 58.932 184.525 56.970 184.530 C 56.756 184.529 56.542 184.512 56.330 184.480 C 55.279 184.315 54.336 183.738 53.711 182.877 C 53.086 182.016 52.830 180.941 53.000 179.890 C 56.881 155.861 72.037 135.145 93.763 124.171 C 115.489 113.197 141.157 113.294 162.800 124.430 L 189.350 101.000 C 191.007 99.536 193.536 99.693 195.000 101.350 C 196.464 103.007 196.307 105.536 194.650 107.000 L 66.580 220.000 L 200.000 220.000 C 202.209 220.000 204.000 221.791 204.000 224.000 ZM 190.440 148.670 C 199.297 161.381 204.031 176.508 204.000 192.000 C 204.000 194.209 202.209 196.000 200.000 196.000 C 197.791 196.000 196.000 194.209 196.000 192.000 C 196.030 178.138 191.796 164.603 183.870 153.230 C 183.011 152.058 182.856 150.512 183.464 149.192 C 184.073 147.872 185.349 146.986 186.799 146.877 C 188.248 146.769 189.642 147.455 190.440 148.670 Z"),
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
        return _seatbelt!!
    }

private var _seatbelt: ImageVector? = null
