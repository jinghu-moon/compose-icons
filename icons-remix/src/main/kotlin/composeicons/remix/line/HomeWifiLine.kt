package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HomeWifiLine: ImageVector
    get() {
        if (_homeWifiLine != null) return _homeWifiLine!!
        _homeWifiLine = remixIcon(
            name = "HomeWifiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 19h12v-9.843L12 3.703 6 9.157v9.843ZM19 21h-14C4.448 21 4 20.552 4 20v-9h-3L11.327 1.612c.381-.347 .964-.347 1.345 0L23 11h-3v9c0 .552-.448 1-1 1ZM8 10c3.866 0 7 3.134 7 7h-2C13 14.239 10.761 12 8 12v-2ZM8 14c1.657 0 3 1.343 3 3h-3v-3Z"),
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
        return _homeWifiLine!!
    }

private var _homeWifiLine: ImageVector? = null
