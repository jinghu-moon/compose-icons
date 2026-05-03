package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GhostSmileFill: ImageVector
    get() {
        if (_ghostSmileFill != null) return _ghostSmileFill!!
        _ghostSmileFill = remixIcon(
            name = "GhostSmileFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 16.971 2.000 21.000 6.029 21.000 11.000 L 21.000 18.500 C 21.000 20.433 19.433 22.000 17.500 22.000 C 16.300 22.000 15.241 21.396 14.611 20.476 C 14.098 21.386 13.120 22.000 12.000 22.000 C 10.880 22.000 9.902 21.386 9.387 20.475 C 8.759 21.396 7.700 22.000 6.500 22.000 C 4.631 22.000 3.105 20.536 3.005 18.692 L 3.000 18.500 L 3.000 11.000 C 3.000 6.029 7.029 2.000 12.000 2.000 ZM 16.000 13.000 L 14.000 13.000 C 14.000 14.105 13.105 15.000 12.000 15.000 C 10.946 15.000 10.082 14.184 10.005 13.149 L 10.000 13.000 L 8.000 13.000 L 8.005 13.200 C 8.109 15.316 9.858 17.000 12.000 17.000 C 14.142 17.000 15.891 15.316 15.995 13.200 L 16.000 13.000 ZM 12.000 7.000 C 10.895 7.000 10.000 7.895 10.000 9.000 C 10.000 10.105 10.895 11.000 12.000 11.000 C 13.105 11.000 14.000 10.105 14.000 9.000 C 14.000 7.895 13.105 7.000 12.000 7.000 Z"),
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
        return _ghostSmileFill!!
    }

private var _ghostSmileFill: ImageVector? = null
