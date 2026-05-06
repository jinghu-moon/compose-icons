package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.QuillPenAiLine: ImageVector
    get() {
        if (_quillPenAiLine != null) return _quillPenAiLine!!
        _quillPenAiLine = remixIcon(
            name = "QuillPenAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.713 7.128l-.247 .566c-.18 .414-.753 .414-.934 0L3.287 7.128C2.847 6.119 2.055 5.316 1.068 4.877L.308 4.539c-.411-.183-.411-.78 0-.963l.717-.319C2.038 2.807 2.844 1.974 3.276 .931L3.529 .32c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338C5.945 5.316 5.153 6.119 4.713 7.128ZM6.334 15.815c.176-.582 .373-1.159 .605-1.783C8.995 8.506 12.42 5.082 18.013 4.215c-.513 1.144-.998 1.938-1.427 2.368-.334 .334-.667 .668-1.001 1.002L14.172 8.999l1.456 1.455c-1.13 2.085-3.363 3.744-5.876 4.059-1.316 .165-2.458 .607-3.418 1.303ZM18 9.997 17 8.997c.333-.334 .666-.667 1.003-1.003C19.002 6.993 20.001 4.994 21 1.997 6.311 1.997 4.089 15.422 3.064 21.613c-.022 .131-.043 .259-.064 .383h1.998C5.664 18.663 7.331 16.83 10 16.497c4-.5 7-3.5 8-6.5Z"),
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
        return _quillPenAiLine!!
    }

private var _quillPenAiLine: ImageVector? = null
