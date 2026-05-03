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
                pathData = parseSvgPathData("M 5.000 20.000 L 19.000 20.000 L 19.000 22.000 L 5.000 22.000 L 5.000 20.000 ZM 12.000 18.000 C 7.582 18.000 4.000 14.418 4.000 10.000 C 4.000 5.582 7.582 2.000 12.000 2.000 C 16.418 2.000 20.000 5.582 20.000 10.000 C 20.000 14.418 16.418 18.000 12.000 18.000 ZM 12.000 16.000 C 15.314 16.000 18.000 13.314 18.000 10.000 C 18.000 6.686 15.314 4.000 12.000 4.000 C 8.686 4.000 6.000 6.686 6.000 10.000 C 6.000 13.314 8.686 16.000 12.000 16.000 Z"),
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
