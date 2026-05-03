package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ZoomInLine: ImageVector
    get() {
        if (_zoomInLine != null) return _zoomInLine!!
        _zoomInLine = remixIcon(
            name = "ZoomInLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.031 16.617 L 22.314 20.899 L 20.899 22.314 L 16.617 18.031 C 15.077 19.263 13.124 20.000 11.000 20.000 C 6.032 20.000 2.000 15.968 2.000 11.000 C 2.000 6.032 6.032 2.000 11.000 2.000 C 15.968 2.000 20.000 6.032 20.000 11.000 C 20.000 13.124 19.263 15.077 18.031 16.617 ZM 16.025 15.875 C 17.247 14.615 18.000 12.896 18.000 11.000 C 18.000 7.133 14.868 4.000 11.000 4.000 C 7.133 4.000 4.000 7.133 4.000 11.000 C 4.000 14.868 7.133 18.000 11.000 18.000 C 12.896 18.000 14.615 17.247 15.875 16.025 L 16.025 15.875 ZM 10.000 10.000 L 10.000 7.000 L 12.000 7.000 L 12.000 10.000 L 15.000 10.000 L 15.000 12.000 L 12.000 12.000 L 12.000 15.000 L 10.000 15.000 L 10.000 12.000 L 7.000 12.000 L 7.000 10.000 L 10.000 10.000 Z"),
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
        return _zoomInLine!!
    }

private var _zoomInLine: ImageVector? = null
