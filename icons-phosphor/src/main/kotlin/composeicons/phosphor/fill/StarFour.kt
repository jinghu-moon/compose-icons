package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StarFour: ImageVector
    get() {
        if (_starFour != null) return _starFour!!
        _starFour = phosphorFillIcon(
            name = "StarFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 128c.052 6.726-4.162 12.747-10.5 15l-63.44 23.07L143 229.5c-2.328 6.271-8.311 10.432-15 10.432-6.689 0-12.672-4.161-15-10.432L89.94 166.06 26.5 143C20.229 140.672 16.068 134.689 16.068 128c0-6.689 4.161-12.672 10.432-15L89.94 89.94 113 26.5c2.328-6.271 8.311-10.432 15-10.432 6.689 0 12.672 4.161 15 10.432l23.07 63.44L229.5 113c6.338 2.253 10.552 8.274 10.5 15Z"),
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
