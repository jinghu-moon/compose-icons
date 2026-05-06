package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.User4Line: ImageVector
    get() {
        if (_user4Line != null) return _user4Line!!
        _user4Line = remixIcon(
            name = "User4Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 20h14v2h-14v-2ZM12 18C7.582 18 4 14.418 4 10 4 5.582 7.582 2 12 2c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM12 16c3.314 0 6-2.686 6-6C18 6.686 15.314 4 12 4 8.686 4 6 6.686 6 10c0 3.314 2.686 6 6 6Z"),
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
        return _user4Line!!
    }

private var _user4Line: ImageVector? = null
