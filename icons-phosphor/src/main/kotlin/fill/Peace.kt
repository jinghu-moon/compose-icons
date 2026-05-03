package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Peace: ImageVector
    get() {
        if (_peace != null) return _peace!!
        _peace = phosphorFillIcon(
            name = "Peace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 136.000 143.370 L 182.000 175.570 C 170.191 189.020 153.787 197.578 136.000 199.570 ZM 56.000 128.000 C 55.988 140.052 59.019 151.911 64.810 162.480 L 120.000 123.840 L 120.000 56.460 C 83.582 60.568 56.044 91.351 56.000 128.000 ZM 120.000 199.540 L 120.000 143.370 L 74.000 175.570 C 85.814 189.008 102.217 197.556 120.000 199.540 ZM 136.000 56.460 L 136.000 123.840 L 191.190 162.480 C 202.670 141.426 202.915 116.037 191.842 94.766 C 180.768 73.495 159.832 59.132 136.000 56.460 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.412 24.061 231.939 70.588 232.000 128.000 ZM 216.000 128.000 C 216.000 79.399 176.601 40.000 128.000 40.000 C 79.399 40.000 40.000 79.399 40.000 128.000 C 40.000 176.601 79.399 216.000 128.000 216.000 C 176.578 215.945 215.945 176.578 216.000 128.000 Z"),
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
        return _peace!!
    }

private var _peace: ImageVector? = null
