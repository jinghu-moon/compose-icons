package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SearchAi2Fill: ImageVector
    get() {
        if (_searchAi2Fill != null) return _searchAi2Fill!!
        _searchAi2Fill = remixIcon(
            name = "SearchAi2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.313 20.899l-1.414 1.414L18.071 19.485l1.414-1.414 2.828 2.828ZM11 2c.264 0 .525 .014 .783 .036C11.285 2.911 11 3.922 11 5 11 8.314 13.686 11 17 11c1.078 0 2.088-.286 2.963-.784 .022 .259 .037 .52 .037 .784 0 4.968-4.032 9-9 9C6.032 20 2 15.968 2 11 2 6.032 6.032 2 11 2ZM16.529 1.318c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.243-2.219 2.251l-.247 .565c-.18 .414-.753 .414-.934 0l-.246-.565C15.848 7.118 15.055 6.315 14.067 5.876l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611Z"),
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
        return _searchAi2Fill!!
    }

private var _searchAi2Fill: ImageVector? = null
