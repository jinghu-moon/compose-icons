package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SearchAi3Line: ImageVector
    get() {
        if (_searchAi3Line != null) return _searchAi3Line!!
        _searchAi3Line = remixIcon(
            name = "SearchAi3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2c4.968 0 9 4.032 9 9 0 2.124-.737 4.077-1.969 5.617l4.282 4.282-1.414 1.415L16.617 18.031C15.077 19.263 13.124 20 11 20c-4.968 0-9-4.032-9-9C2 6.032 6.032 2 11 2ZM11 4c-3.867 0-7 3.133-7 7 0 3.867 3.133 7 7 7 1.896 0 3.615-.752 4.875-1.975l.149-.15C17.247 14.615 18 12.895 18 11 18 7.132 14.867 4 11 4ZM10.529 7.319c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .565c-.18 .414-.753 .414-.934 0l-.246-.565C9.848 13.119 9.055 12.316 8.067 11.877l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319C9.038 9.806 9.844 8.973 10.276 7.93l.253-.611Z"),
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
        return _searchAi3Line!!
    }

private var _searchAi3Line: ImageVector? = null
