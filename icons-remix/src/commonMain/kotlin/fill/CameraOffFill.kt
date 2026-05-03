package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CameraOffFill: ImageVector
    get() {
        if (_cameraOffFill != null) return _cameraOffFill!!
        _cameraOffFill = remixIcon(
            name = "CameraOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.586 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 6.000 C 2.000 5.448 2.448 5.000 3.000 5.000 L 3.586 5.000 L 1.394 2.808 L 2.808 1.393 L 22.607 21.192 L 21.192 22.607 L 19.586 21.000 ZM 7.555 8.970 C 6.589 10.035 6.000 11.449 6.000 13.000 C 6.000 16.314 8.686 19.000 12.000 19.000 C 13.552 19.000 14.966 18.411 16.031 17.445 L 14.614 16.028 C 13.913 16.634 12.999 17.000 12.000 17.000 C 9.791 17.000 8.000 15.209 8.000 13.000 C 8.000 12.001 8.366 11.087 8.972 10.386 L 7.555 8.970 ZM 22.000 17.786 L 17.955 13.741 C 17.985 13.498 18.000 13.251 18.000 13.000 C 18.000 9.686 15.314 7.000 12.000 7.000 C 11.749 7.000 11.502 7.015 11.260 7.045 L 8.107 3.893 L 9.000 3.000 L 15.000 3.000 L 17.000 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 17.786 ZM 13.509 9.294 C 14.505 9.700 15.300 10.496 15.706 11.492 L 13.509 9.294 Z"),
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
        return _cameraOffFill!!
    }

private var _cameraOffFill: ImageVector? = null
