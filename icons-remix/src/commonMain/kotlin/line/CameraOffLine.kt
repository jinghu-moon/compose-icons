package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CameraOffLine: ImageVector
    get() {
        if (_cameraOffLine != null) return _cameraOffLine!!
        _cameraOffLine = remixIcon(
            name = "CameraOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.586 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 6.000 C 2.000 5.448 2.448 5.000 3.000 5.000 L 3.586 5.000 L 1.394 2.808 L 2.808 1.393 L 22.607 21.192 L 21.192 22.607 L 19.586 21.000 ZM 5.586 7.000 L 4.000 7.000 L 4.000 19.000 L 17.586 19.000 L 15.405 16.819 C 14.469 17.559 13.286 18.000 12.000 18.000 C 8.963 18.000 6.500 15.538 6.500 12.500 C 6.500 11.214 6.941 10.031 7.681 9.095 L 5.586 7.000 ZM 9.111 10.525 C 8.725 11.087 8.500 11.767 8.500 12.500 C 8.500 14.433 10.067 16.000 12.000 16.000 C 12.733 16.000 13.413 15.775 13.976 15.390 L 9.111 10.525 ZM 22.000 17.786 L 20.000 15.786 L 20.000 7.000 L 16.172 7.000 L 14.172 5.000 L 9.829 5.000 L 9.521 5.307 L 8.107 3.893 L 9.000 3.000 L 15.000 3.000 L 17.000 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 17.786 ZM 11.263 7.049 C 11.504 7.017 11.750 7.000 12.000 7.000 C 15.038 7.000 17.500 9.462 17.500 12.500 C 17.500 12.750 17.483 12.996 17.451 13.237 L 15.113 10.899 C 14.779 10.251 14.249 9.721 13.601 9.387 L 11.263 7.049 Z"),
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
        return _cameraOffLine!!
    }

private var _cameraOffLine: ImageVector? = null
