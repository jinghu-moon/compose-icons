package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SignalWifi3Line: ImageVector
    get() {
        if (_signalWifi3Line != null) return _signalWifi3Line!!
        _signalWifi3Line = remixIcon(
            name = "SignalWifi3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c4.284 0 8.219 1.497 11.31 3.996L12 21 .69 6.997C3.781 4.497 7.716 3 12 3ZM12 10c-1.898 0-3.683 .481-5.241 1.327l5.241 6.49 5.241-6.49C15.684 10.481 13.898 10 12 10ZM12 5C8.973 5 6.078 5.842 3.58 7.392L5.484 9.749C7.4 8.637 9.626 8 12 8c2.375 0 4.601 .637 6.516 1.749L20.42 7.391C17.923 5.842 15.028 5 12 5Z"),
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
        return _signalWifi3Line!!
    }

private var _signalWifi3Line: ImageVector? = null
