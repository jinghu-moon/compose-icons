package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CloudOffFill: ImageVector
    get() {
        if (_cloudOffFill != null) return _cloudOffFill!!
        _cloudOffFill = remixIcon(
            name = "CloudOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.515 2.101 22.607 21.192l-1.414 1.414L19.178 20.592C18.503 20.856 17.768 21 17 21h-10C3.686 21 1 18.314 1 15 1 12.385 2.673 10.16 5.008 9.339 5.003 9.226 5 9.114 5 9 5 8.222 5.127 7.474 5.361 6.775L2.101 3.515 3.515 2.101ZM17 9c.698 0 1.369 .119 1.992 .339C21.326 10.16 23 12.385 23 15c0 1.088-.29 2.109-.796 2.989L14.011 9.796C14.891 9.29 15.912 9 17 9ZM12 2c3.242 0 5.969 2.204 6.765 5.195C18.197 7.068 17.607 7 17 7c-1.643 0-3.17 .495-4.441 1.345L7.694 3.481C8.882 2.553 10.376 2 12 2Z"),
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
        return _cloudOffFill!!
    }

private var _cloudOffFill: ImageVector? = null
