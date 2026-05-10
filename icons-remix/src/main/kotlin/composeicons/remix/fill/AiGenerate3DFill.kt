package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AiGenerate3DFill: ImageVector
    get() {
        if (_aiGenerate3DFill != null) return _aiGenerate3DFill!!
        _aiGenerate3DFill = remixIcon(
            name = "AiGenerate3DFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.268 2.312C13.474 3.33 13 4.609 13 6c0 3.314 2.686 6 6 6 .892 0 1.739-.196 2.5-.546v6.046L12 23 2.5 17.5v-11L12 1l2.268 1.312ZM4.5 16.347 12 20.69v-8.69L4.5 7.657v8.689ZM18.529 2.319c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .565c-.18 .414-.753 .414-.934 0l-.246-.565C17.848 8.119 17.055 7.316 16.067 6.877l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611Z"),
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
        return _aiGenerate3DFill!!
    }

private var _aiGenerate3DFill: ImageVector? = null
