package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SearchAi4Fill: ImageVector
    get() {
        if (_searchAi4Fill != null) return _searchAi4Fill!!
        _searchAi4Fill = remixIcon(
            name = "SearchAi4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.313 20.899l-1.414 1.414L18.071 19.485l1.414-1.414 2.828 2.828ZM11 2c4.968 0 9 4.032 9 9 0 4.968-4.032 9-9 9C6.032 20 2 15.968 2 11 2 6.032 6.032 2 11 2ZM11.471 7.318c-.176-.426-.765-.426-.941 0l-.253 .611C9.844 8.972 9.038 9.805 8.025 10.256l-.718 .319c-.41 .183-.41 .78 0 .963l.76 .338c.988 .439 1.78 1.242 2.22 2.251l.246 .565c.181 .414 .753 .414 .934 0l.247-.565c.44-1.009 1.231-1.812 2.219-2.251l.76-.338c.41-.183 .41-.78 0-.963l-.718-.319C12.962 9.805 12.156 8.972 11.724 7.93l-.253-.611Z"),
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
        return _searchAi4Fill!!
    }

private var _searchAi4Fill: ImageVector? = null
