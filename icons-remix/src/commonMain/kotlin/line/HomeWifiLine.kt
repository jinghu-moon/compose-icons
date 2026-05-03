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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 19.000 L 18.000 19.000 L 18.000 9.157 L 12.000 3.703 L 6.000 9.157 L 6.000 19.000 ZM 19.000 21.000 L 5.000 21.000 C 4.448 21.000 4.000 20.552 4.000 20.000 L 4.000 11.000 L 1.000 11.000 L 11.327 1.612 C 11.709 1.265 12.291 1.265 12.673 1.612 L 23.000 11.000 L 20.000 11.000 L 20.000 20.000 C 20.000 20.552 19.552 21.000 19.000 21.000 ZM 8.000 10.000 C 11.866 10.000 15.000 13.134 15.000 17.000 L 13.000 17.000 C 13.000 14.239 10.761 12.000 8.000 12.000 L 8.000 10.000 ZM 8.000 14.000 C 9.657 14.000 11.000 15.343 11.000 17.000 L 8.000 17.000 L 8.000 14.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _homeWifiLine!!
    }

private var _homeWifiLine: ImageVector? = null
