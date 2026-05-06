package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) return _tagChevron!!
        _tagChevron = phosphorFillIcon(
            name = "TagChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246.66 132.44 201 200.88c-2.962 4.44-7.943 7.11-13.28 7.12h-155.72c-2.952 .002-5.665-1.622-7.058-4.224-1.393-2.602-1.24-5.76 .398-8.216L70.39 128l-45-67.56c-1.633-2.448-1.791-5.595-.41-8.194C26.361 49.647 29.057 48.016 32 48h155.72c5.337 .01 10.318 2.68 13.28 7.12l45.63 68.44c1.803 2.682 1.815 6.186 .03 8.88Z"),
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
