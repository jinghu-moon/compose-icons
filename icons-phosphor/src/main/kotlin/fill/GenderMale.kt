package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GenderMale: ImageVector
    get() {
        if (_genderMale != null) return _genderMale!!
        _genderMale = phosphorFillIcon(
            name = "GenderMale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 140.000 C 152.000 159.882 135.882 176.000 116.000 176.000 C 96.118 176.000 80.000 159.882 80.000 140.000 C 80.000 120.118 96.118 104.000 116.000 104.000 C 135.882 104.000 152.000 120.118 152.000 140.000 ZM 216.000 40.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 56.000 232.000 C 47.163 232.000 40.000 224.837 40.000 216.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 200.000 24.000 C 208.837 24.000 216.000 31.163 216.000 40.000 ZM 192.000 72.000 C 192.000 67.582 188.418 64.000 184.000 64.000 L 152.000 64.000 C 147.582 64.000 144.000 67.582 144.000 72.000 C 144.000 76.418 147.582 80.000 152.000 80.000 L 164.690 80.000 L 146.690 98.000 C 124.752 81.913 94.127 85.421 76.396 106.053 C 58.664 126.685 59.799 157.489 79.002 176.760 C 98.205 196.030 129.004 197.274 149.699 179.616 C 170.393 161.957 174.010 131.345 158.000 109.350 L 176.000 91.350 L 176.000 104.000 C 176.000 108.418 179.582 112.000 184.000 112.000 C 188.418 112.000 192.000 108.418 192.000 104.000 Z"),
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
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
