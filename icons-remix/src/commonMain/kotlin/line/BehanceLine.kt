package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BehanceLine: ImageVector
    get() {
        if (_behanceLine != null) return _behanceLine!!
        _behanceLine = remixIcon(
            name = "BehanceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.500 11.000 C 8.605 11.000 9.500 10.105 9.500 9.000 C 9.500 7.895 8.605 7.000 7.500 7.000 L 3.000 7.000 L 3.000 11.000 L 7.500 11.000 ZM 8.500 13.000 L 3.000 13.000 L 3.000 17.000 L 8.500 17.000 C 9.605 17.000 10.500 16.105 10.500 15.000 C 10.500 13.895 9.605 13.000 8.500 13.000 ZM 10.563 11.573 C 11.724 12.273 12.500 13.546 12.500 15.000 C 12.500 17.209 10.709 19.000 8.500 19.000 L 1.000 19.000 L 1.000 5.000 L 7.500 5.000 C 9.709 5.000 11.500 6.791 11.500 9.000 C 11.500 9.980 11.148 10.877 10.563 11.573 ZM 15.500 6.000 L 21.000 6.000 L 21.000 7.500 L 15.500 7.500 L 15.500 6.000 ZM 23.000 14.500 L 15.500 14.500 L 15.500 14.750 C 15.500 16.269 16.731 17.500 18.250 17.500 C 19.319 17.500 20.245 16.890 20.700 16.000 L 22.834 16.000 C 22.285 18.017 20.441 19.500 18.250 19.500 C 15.627 19.500 13.500 17.373 13.500 14.750 L 13.500 13.250 C 13.500 10.627 15.627 8.500 18.250 8.500 C 20.873 8.500 23.000 10.627 23.000 13.250 L 23.000 14.500 ZM 20.896 12.500 C 20.570 11.346 19.509 10.500 18.250 10.500 C 16.991 10.500 15.930 11.346 15.604 12.500 L 20.896 12.500 Z"),
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
        return _behanceLine!!
    }

private var _behanceLine: ImageVector? = null
