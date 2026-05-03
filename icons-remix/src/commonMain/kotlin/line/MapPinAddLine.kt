package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MapPinAddLine: ImageVector
    get() {
        if (_mapPinAddLine != null) return _mapPinAddLine!!
        _mapPinAddLine = remixIcon(
            name = "MapPinAddLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 20.899 L 16.950 15.950 C 19.683 13.216 19.683 8.784 16.950 6.050 C 14.216 3.317 9.784 3.317 7.050 6.050 C 4.317 8.784 4.317 13.216 7.050 15.950 L 12.000 20.899 ZM 12.000 23.728 L 5.636 17.364 C 2.121 13.849 2.121 8.151 5.636 4.636 C 9.151 1.121 14.849 1.121 18.364 4.636 C 21.879 8.151 21.879 13.849 18.364 17.364 L 12.000 23.728 ZM 11.000 10.000 L 11.000 7.000 L 13.000 7.000 L 13.000 10.000 L 16.000 10.000 L 16.000 12.000 L 13.000 12.000 L 13.000 15.000 L 11.000 15.000 L 11.000 12.000 L 8.000 12.000 L 8.000 10.000 L 11.000 10.000 Z"),
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
        return _mapPinAddLine!!
    }

private var _mapPinAddLine: ImageVector? = null
