package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.User2Line: ImageVector
    get() {
        if (_user2Line != null) return _user2Line!!
        _user2Line = remixIcon(
            name = "User2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 22c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8h-16ZM13 16.083v3.917h4.659C16.942 17.973 15.168 16.447 13 16.083ZM11 20v-3.917C8.832 16.447 7.058 17.973 6.341 20h4.659ZM12 13C8.685 13 6 10.315 6 7 6 3.685 8.685 1 12 1c3.315 0 6 2.685 6 6 0 3.315-2.685 6-6 6ZM12 11c2.21 0 4-1.79 4-4C16 4.79 14.21 3 12 3 9.79 3 8 4.79 8 7c0 2.21 1.79 4 4 4Z"),
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
        return _user2Line!!
    }

private var _user2Line: ImageVector? = null
