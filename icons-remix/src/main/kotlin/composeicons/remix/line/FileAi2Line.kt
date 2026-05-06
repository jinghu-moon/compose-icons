package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileAi2Line: ImageVector
    get() {
        if (_fileAi2Line != null) return _fileAi2Line!!
        _fileAi2Line = remixIcon(
            name = "FileAi2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.529 15.319c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.875 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .566c-.18 .414-.753 .414-.934 0l-.246-.566c-.439-1.009-1.232-1.812-2.22-2.251l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611ZM19.998 2c.553 0 1.002 .456 1.002 .992v10.008h-2v-9h-9v5h-5v11h8v2h-9.007C3.445 22 3 21.55 3 20.993v-12.993L9.003 2h10.995Z"),
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
        return _fileAi2Line!!
    }

private var _fileAi2Line: ImageVector? = null
