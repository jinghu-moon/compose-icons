package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SearchAi4Line: ImageVector
    get() {
        if (_searchAi4Line != null) return _searchAi4Line!!
        _searchAi4Line = remixIcon(
            name = "SearchAi4Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.313 20.899l-1.414 1.414L18.071 19.485l1.414-1.414 2.828 2.828ZM11 2c4.968 0 9 4.032 9 9 0 4.968-4.032 9-9 9-4.968 0-9-4.032-9-9C2 6.032 6.032 2 11 2ZM11 4c-3.867 0-7 3.133-7 7 0 3.868 3.133 7 7 7 3.868 0 7-3.132 7-7C18 7.132 14.867 4 11 4ZM10.529 7.319c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.718 .318c.41 .183 .41 .781 0 .964l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .565c-.18 .414-.753 .414-.934 0l-.246-.565C9.848 13.119 9.055 12.316 8.067 11.877l-.76-.338c-.41-.183-.41-.781 0-.964l.718-.318C9.038 9.806 9.844 8.973 10.276 7.93l.253-.611Z"),
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
        return _searchAi4Line!!
    }

private var _searchAi4Line: ImageVector? = null
