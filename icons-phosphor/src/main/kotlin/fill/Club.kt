package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Club: ImageVector
    get() {
        if (_club != null) return _club!!
        _club = phosphorFillIcon(
            name = "Club",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 144.000 C 239.993 164.171 229.138 182.780 211.583 192.715 C 194.028 202.651 172.487 202.377 155.190 192.000 L 150.750 192.000 L 159.660 221.700 C 160.387 224.122 159.926 226.745 158.417 228.774 C 156.908 230.803 154.529 231.999 152.000 232.000 L 104.000 232.000 C 101.471 231.999 99.092 230.803 97.583 228.774 C 96.074 226.745 95.613 224.122 96.340 221.700 L 105.250 192.000 L 100.810 192.000 C 80.525 204.190 54.766 202.312 36.464 187.308 C 18.161 172.305 11.266 147.415 19.240 125.133 C 27.213 102.850 48.334 87.985 72.000 88.000 C 72.780 88.000 73.550 88.000 74.330 88.000 C 67.502 65.074 75.990 40.341 95.458 26.440 C 114.926 12.539 141.074 12.539 160.542 26.440 C 180.010 40.341 188.498 65.074 181.670 88.000 C 182.440 88.000 183.220 88.000 184.000 88.000 C 214.914 88.033 239.967 113.086 240.000 144.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _club!!
    }

private var _club: ImageVector? = null
