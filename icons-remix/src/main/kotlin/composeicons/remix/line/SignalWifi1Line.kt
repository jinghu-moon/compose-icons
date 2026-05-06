package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SignalWifi1Line: ImageVector
    get() {
        if (_signalWifi1Line != null) return _signalWifi1Line!!
        _signalWifi1Line = remixIcon(
            name = "SignalWifi1Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c4.284 0 8.219 1.497 11.31 3.996L12 21 .69 6.997C3.781 4.497 7.716 3 12 3ZM12 15c-.693 0-1.367 .117-2 .341l2 2.476 1.999-2.477C13.37 15.12 12.694 15 12 15ZM12 5C8.973 5 6.078 5.842 3.58 7.392l5.109 6.324C9.698 13.256 10.819 13 12 13c1.181 0 2.303 .256 3.312 .715L20.42 7.391C17.923 5.842 15.028 5 12 5Z"),
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
        return _signalWifi1Line!!
    }

private var _signalWifi1Line: ImageVector? = null
