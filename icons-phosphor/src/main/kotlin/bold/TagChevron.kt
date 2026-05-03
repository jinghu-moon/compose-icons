package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) return _tagChevron!!
        _tagChevron = phosphorBoldIcon(
            name = "TagChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 250.000 121.340 L 204.360 52.910 C 200.652 47.345 194.407 44.001 187.720 44.000 L 32.000 44.000 C 27.570 43.993 23.498 46.428 21.405 50.332 C 19.313 54.236 19.542 58.975 22.000 62.660 L 65.580 128.000 L 22.000 193.340 C 19.542 197.025 19.313 201.764 21.405 205.668 C 23.498 209.572 27.570 212.007 32.000 212.000 L 187.720 212.000 C 194.407 211.999 200.652 208.655 204.360 203.090 L 250.000 134.660 C 252.690 130.628 252.690 125.372 250.000 121.340 ZM 185.580 188.000 L 54.420 188.000 L 90.000 134.660 C 92.690 130.628 92.690 125.372 90.000 121.340 L 54.420 68.000 L 185.580 68.000 L 225.580 128.000 Z"),
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
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
