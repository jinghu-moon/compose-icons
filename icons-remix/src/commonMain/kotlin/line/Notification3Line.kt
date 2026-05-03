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
                pathData = parseSvgPathData("M 20.000 17.000 L 22.000 17.000 L 22.000 19.000 L 2.000 19.000 L 2.000 17.000 L 4.000 17.000 L 4.000 10.000 C 4.000 5.582 7.582 2.000 12.000 2.000 C 16.418 2.000 20.000 5.582 20.000 10.000 L 20.000 17.000 ZM 18.000 17.000 L 18.000 10.000 C 18.000 6.686 15.314 4.000 12.000 4.000 C 8.686 4.000 6.000 6.686 6.000 10.000 L 6.000 17.000 L 18.000 17.000 ZM 9.000 21.000 L 15.000 21.000 L 15.000 23.000 L 9.000 23.000 L 9.000 21.000 Z"),
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
