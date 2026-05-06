package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.StarFour: ImageVector
    get() {
        if (_starFour != null) return _starFour!!
        _starFour = phosphorRegularIcon(
            name = "StarFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.5 113 166.06 89.94 143 26.5C140.672 20.229 134.689 16.068 128 16.068c-6.689 0-12.672 4.161-15 10.432L89.94 89.94 26.5 113c-6.271 2.328-10.432 8.311-10.432 15 0 6.689 4.161 12.672 10.432 15l63.44 23.07L113 229.5c2.328 6.271 8.311 10.432 15 10.432 6.689 0 12.672-4.161 15-10.432l23.07-63.44L229.5 143c6.271-2.328 10.432-8.311 10.432-15 0-6.689-4.161-12.672-10.432-15ZM157.08 152.3c-2.221 .809-3.971 2.559-4.78 4.78L128 223.9 103.7 157.08c-.809-2.221-2.559-3.971-4.78-4.78L32.1 128 98.92 103.7c2.221-.809 3.971-2.559 4.78-4.78L128 32.1l24.3 66.82c.809 2.221 2.559 3.971 4.78 4.78L223.9 128Z"),
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
        return _starFour!!
    }

private var _starFour: ImageVector? = null
