package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.QuillPenAiFill: ImageVector
    get() {
        if (_quillPenAiFill != null) return _quillPenAiFill!!
        _quillPenAiFill = remixIcon(
            name = "QuillPenAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.713 7.128l-.247 .566c-.18 .414-.753 .414-.934 0L3.287 7.128C2.847 6.119 2.055 5.316 1.068 4.877L.308 4.539c-.411-.183-.411-.78 0-.963l.717-.319C2.038 2.807 2.844 1.974 3.276 .931L3.529 .32c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338C5.945 5.316 5.153 6.119 4.713 7.128ZM3.064 21.613C4.089 15.422 6.311 1.997 21 1.997 19.504 4.997 18.5 6.497 17.5 7.497l-1 1 1.5 1c-1 3-4 6.5-8 7-2.669 .333-4.336 2.167-5.002 5.5h-1.998c.021-.124 .042-.252 .064-.383Z"),
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
        return _quillPenAiFill!!
    }

private var _quillPenAiFill: ImageVector? = null
