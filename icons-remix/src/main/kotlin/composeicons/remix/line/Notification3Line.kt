package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Notification3Line: ImageVector
    get() {
        if (_notification3Line != null) return _notification3Line!!
        _notification3Line = remixIcon(
            name = "Notification3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 17h2v2h-20v-2h2v-7C4 5.582 7.582 2 12 2c4.418 0 8 3.582 8 8v7ZM18 17v-7C18 6.686 15.314 4 12 4 8.686 4 6 6.686 6 10v7h12ZM9 21h6v2h-6v-2Z"),
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
        return _notification3Line!!
    }

private var _notification3Line: ImageVector? = null
