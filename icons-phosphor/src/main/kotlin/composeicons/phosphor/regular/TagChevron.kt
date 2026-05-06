package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) return _tagChevron!!
        _tagChevron = phosphorRegularIcon(
            name = "TagChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246.66 123.56 201 55.12C198.038 50.68 193.057 48.01 187.72 48h-155.72c-2.952-.002-5.665 1.622-7.058 4.224-1.393 2.602-1.24 5.76 .398 8.216L70.39 128l-45 67.56c-1.633 2.448-1.791 5.595-.41 8.194 1.381 2.599 4.077 4.23 7.02 4.246h155.72c5.337-.01 10.318-2.68 13.28-7.12l45.63-68.44c1.803-2.682 1.815-6.186 .03-8.88ZM187.72 192h-140.72L86.71 132.44c1.794-2.688 1.794-6.192 0-8.88L47 64h140.72l42.67 64Z"),
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
