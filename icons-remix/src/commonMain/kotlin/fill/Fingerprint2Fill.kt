package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Fingerprint2Fill: ImageVector
    get() {
        if (_fingerprint2Fill != null) return _fingerprint2Fill!!
        _fingerprint2Fill = remixIcon(
            name = "Fingerprint2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 1.000 C 16.971 1.000 21.000 5.029 21.000 10.000 L 21.000 14.000 C 21.000 17.038 19.494 19.725 17.189 21.355 C 17.716 19.663 18.000 17.865 18.000 16.000 L 18.000 13.999 L 16.000 13.999 L 16.000 16.000 L 15.997 16.315 C 15.953 18.564 15.446 20.700 14.566 22.630 C 13.752 22.871 12.891 23.000 12.000 23.000 C 11.659 23.000 11.322 22.981 10.990 22.944 C 12.264 20.935 13.000 18.554 13.000 16.000 L 13.000 9.000 L 11.000 9.000 L 11.000 16.000 L 10.996 16.288 C 10.937 18.589 10.171 20.714 8.908 22.455 C 7.946 22.103 7.060 21.591 6.283 20.951 C 7.359 19.589 8.000 17.869 8.000 16.000 L 8.000 10.000 L 8.005 9.800 C 8.038 9.134 8.234 8.510 8.554 7.968 L 7.109 6.523 C 6.411 7.504 6.000 8.704 6.000 10.000 L 6.000 16.000 L 5.996 16.225 C 5.951 17.444 5.543 18.569 4.875 19.497 C 3.699 17.976 3.000 16.070 3.000 14.000 L 3.000 10.000 C 3.000 5.029 7.029 1.000 12.000 1.000 ZM 12.000 4.000 C 10.704 4.000 9.504 4.411 8.524 5.109 L 9.968 6.554 C 10.564 6.202 11.258 6.000 12.000 6.000 C 14.209 6.000 16.000 7.791 16.000 10.000 L 16.000 12.000 L 18.000 12.000 L 18.000 10.000 C 18.000 6.686 15.314 4.000 12.000 4.000 Z"),
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
        return _fingerprint2Fill!!
    }

private var _fingerprint2Fill: ImageVector? = null
