package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GhostFill: ImageVector
    get() {
        if (_ghostFill != null) return _ghostFill!!
        _ghostFill = remixIcon(
            name = "GhostFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 16.971 2.000 21.000 6.029 21.000 11.000 L 21.000 18.500 C 21.000 20.433 19.433 22.000 17.500 22.000 C 16.300 22.000 15.241 21.396 14.611 20.476 C 14.098 21.386 13.120 22.000 12.000 22.000 C 10.880 22.000 9.902 21.386 9.387 20.475 C 8.759 21.396 7.700 22.000 6.500 22.000 C 4.631 22.000 3.105 20.536 3.005 18.692 L 3.000 18.500 L 3.000 11.000 C 3.000 6.029 7.029 2.000 12.000 2.000 ZM 12.000 12.000 C 10.895 12.000 10.000 13.119 10.000 14.500 C 10.000 15.881 10.895 17.000 12.000 17.000 C 13.105 17.000 14.000 15.881 14.000 14.500 C 14.000 13.119 13.105 12.000 12.000 12.000 ZM 9.500 8.000 C 8.672 8.000 8.000 8.672 8.000 9.500 C 8.000 10.328 8.672 11.000 9.500 11.000 C 10.328 11.000 11.000 10.328 11.000 9.500 C 11.000 8.672 10.328 8.000 9.500 8.000 ZM 14.500 8.000 C 13.672 8.000 13.000 8.672 13.000 9.500 C 13.000 10.328 13.672 11.000 14.500 11.000 C 15.328 11.000 16.000 10.328 16.000 9.500 C 16.000 8.672 15.328 8.000 14.500 8.000 Z"),
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
        return _ghostFill!!
    }

private var _ghostFill: ImageVector? = null
