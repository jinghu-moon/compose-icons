package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GhostSmileLine: ImageVector
    get() {
        if (_ghostSmileLine != null) return _ghostSmileLine!!
        _ghostSmileLine = remixIcon(
            name = "GhostSmileLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 16.971 2.000 21.000 6.029 21.000 11.000 L 21.000 18.500 C 21.000 20.433 19.433 22.000 17.500 22.000 C 16.300 22.000 15.241 21.396 14.611 20.476 C 14.098 21.386 13.120 22.000 12.000 22.000 C 10.880 22.000 9.902 21.386 9.387 20.475 C 8.759 21.396 7.700 22.000 6.500 22.000 C 4.631 22.000 3.105 20.536 3.005 18.692 L 3.000 18.500 L 3.000 11.000 C 3.000 6.029 7.029 2.000 12.000 2.000 ZM 12.000 4.000 C 8.215 4.000 5.131 7.005 5.004 10.759 L 5.000 11.000 L 4.999 18.446 L 5.002 18.584 C 5.045 19.375 5.703 20.000 6.500 20.000 C 6.952 20.000 7.367 19.801 7.647 19.465 L 7.735 19.348 C 8.570 18.125 10.399 18.202 11.128 19.490 C 11.305 19.804 11.634 20.000 12.000 20.000 C 12.365 20.000 12.693 19.804 12.869 19.493 C 13.569 18.252 15.290 18.132 16.164 19.215 L 16.261 19.346 C 16.540 19.753 16.998 20.000 17.500 20.000 C 18.280 20.000 18.920 19.405 18.993 18.645 L 19.000 18.500 L 19.000 11.000 C 19.000 7.134 15.866 4.000 12.000 4.000 ZM 16.000 13.000 C 16.000 15.209 14.209 17.000 12.000 17.000 C 9.858 17.000 8.109 15.316 8.005 13.200 L 8.000 13.000 L 10.000 13.000 C 10.000 14.105 10.895 15.000 12.000 15.000 C 13.105 15.000 14.000 14.105 14.000 13.000 L 16.000 13.000 ZM 12.000 7.000 C 13.105 7.000 14.000 7.895 14.000 9.000 C 14.000 10.105 13.105 11.000 12.000 11.000 C 10.895 11.000 10.000 10.105 10.000 9.000 C 10.000 7.895 10.895 7.000 12.000 7.000 Z"),
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
        return _ghostSmileLine!!
    }

private var _ghostSmileLine: ImageVector? = null
