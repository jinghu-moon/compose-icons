package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EarthquakeLine: ImageVector
    get() {
        if (_earthquakeLine != null) return _earthquakeLine!!
        _earthquakeLine = remixIcon(
            name = "EarthquakeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 21c-.513 0-.936-.386-.993-.883L4 20v-9h-3L11.327 1.612c.35-.318 .868-.344 1.246-.079l.099 .079L23 11h-3v9c0 .513-.386 .935-.883 .993L19 21h-14ZM12 3.702 6 9.156v9.844l4.357-.001 1.393-1.499L8 14l5-3L10.5 9l3-3-.5 3L15.5 11l-4 3L15 17l-1.25 1.999L18 19v-9.843L12 3.702Z"),
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
        return _earthquakeLine!!
    }

private var _earthquakeLine: ImageVector? = null
