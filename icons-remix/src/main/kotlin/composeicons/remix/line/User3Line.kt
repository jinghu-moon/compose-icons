package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.User3Line: ImageVector
    get() {
        if (_user3Line != null) return _user3Line!!
        _user3Line = remixIcon(
            name = "User3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 22h-2v-2c0-1.657-1.343-3-3-3h-6C7.343 17 6 18.343 6 20v2h-2v-2C4 17.239 6.239 15 9 15h6c2.761 0 5 2.239 5 5v2ZM12 13C8.686 13 6 10.314 6 7 6 3.686 8.686 1 12 1c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6ZM12 11c2.209 0 4-1.791 4-4C16 4.791 14.209 3 12 3 9.791 3 8 4.791 8 7c0 2.209 1.791 4 4 4Z"),
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
        return _user3Line!!
    }

private var _user3Line: ImageVector? = null
