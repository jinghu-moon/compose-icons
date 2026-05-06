package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AccountCircleLine: ImageVector
    get() {
        if (_accountCircleLine != null) return _accountCircleLine!!
        _accountCircleLine = remixIcon(
            name = "AccountCircleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12.16 16c-2.035 0-3.868 .869-5.147 2.256C8.38 19.347 10.114 20 12 20c1.969 0 3.773-.712 5.167-1.892C15.896 16.807 14.122 16 12.16 16ZM12 4C7.582 4 4 7.582 4 12c0 1.811 .602 3.481 1.616 4.821C7.256 15.084 9.581 14 12.16 14c2.484 0 4.734 1.007 6.362 2.634C19.453 15.327 20 13.727 20 12 20 7.582 16.418 4 12 4ZM12 5c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4C9.791 13 8 11.209 8 9 8 6.791 9.791 5 12 5ZM12 7c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 7.895 13.105 7 12 7Z"),
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
        return _accountCircleLine!!
    }

private var _accountCircleLine: ImageVector? = null
