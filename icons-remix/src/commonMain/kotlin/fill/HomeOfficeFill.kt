package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HomeOfficeFill: ImageVector
    get() {
        if (_homeOfficeFill != null) return _homeOfficeFill!!
        _homeOfficeFill = remixIcon(
            name = "HomeOfficeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.800 9.000 L 12.000 9.000 L 12.000 17.000 L 11.000 17.000 L 11.000 21.000 L 5.000 21.000 C 4.448 21.000 4.000 20.552 4.000 20.000 L 4.000 11.000 L 1.000 11.000 L 11.327 1.612 C 11.709 1.265 12.291 1.265 12.673 1.612 L 20.800 9.000 ZM 14.000 11.000 L 23.000 11.000 L 23.000 18.000 L 14.000 18.000 L 14.000 11.000 ZM 13.000 21.000 L 24.000 21.000 L 24.000 19.000 L 13.000 19.000 L 13.000 21.000 Z"),
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
        return _homeOfficeFill!!
    }

private var _homeOfficeFill: ImageVector? = null
