package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SearchAi2Line: ImageVector
    get() {
        if (_searchAi2Line != null) return _searchAi2Line!!
        _searchAi2Line = remixIcon(
            name = "SearchAi2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.313 20.899l-1.414 1.414L18.071 19.485l1.414-1.414 2.828 2.828ZM11 2c.264 0 .525 .014 .783 .036-.341 .599-.581 1.261-.699 1.966C11.056 4.002 11.028 4 11 4 7.133 4 4 7.133 4 11c0 3.868 3.133 7 7 7 3.868 0 7-3.132 7-7 0-.028-.003-.057-.003-.085 .705-.118 1.367-.358 1.966-.699 .022 .258 .037 .52 .037 .784 0 4.968-4.032 9-9 9C6.032 20 2 15.968 2 11 2 6.032 6.032 2 11 2ZM16.529 1.319c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .565c-.18 .414-.753 .414-.934 0l-.246-.565C15.848 7.119 15.055 6.316 14.067 5.877l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611Z"),
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
        return _searchAi2Line!!
    }

private var _searchAi2Line: ImageVector? = null
