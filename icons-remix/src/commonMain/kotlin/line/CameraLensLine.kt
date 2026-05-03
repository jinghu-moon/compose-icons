package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CameraLensLine: ImageVector
    get() {
        if (_cameraLensLine != null) return _cameraLensLine!!
        _cameraLensLine = remixIcon(
            name = "CameraLensLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.858 19.710 L 12.000 16.000 L 5.070 16.000 C 6.107 17.792 7.819 19.145 9.858 19.710 ZM 4.252 14.000 L 8.536 14.000 L 5.071 7.999 C 4.390 9.176 4.000 10.542 4.000 12.000 C 4.000 12.691 4.088 13.361 4.252 14.000 ZM 6.395 6.292 L 8.536 10.000 L 12.000 4.000 C 9.817 4.000 7.838 4.874 6.395 6.292 ZM 14.142 4.290 L 12.000 8.000 L 18.930 8.000 C 17.893 6.208 16.181 4.855 14.142 4.290 ZM 19.748 10.000 L 15.464 10.000 L 18.929 16.001 C 19.610 14.824 20.000 13.458 20.000 12.000 C 20.000 11.309 19.913 10.639 19.748 10.000 ZM 17.605 17.708 L 15.464 14.000 L 12.000 20.000 C 14.183 20.000 16.162 19.126 17.605 17.708 ZM 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 ZM 13.155 10.000 L 10.845 10.000 L 9.691 12.000 L 10.845 14.000 L 13.155 14.000 L 14.309 12.000 L 13.155 10.000 Z"),
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
        return _cameraLensLine!!
    }

private var _cameraLensLine: ImageVector? = null
