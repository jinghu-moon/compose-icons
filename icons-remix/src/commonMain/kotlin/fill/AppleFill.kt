package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AppleFill: ImageVector
    get() {
        if (_appleFill != null) return _appleFill!!
        _appleFill = remixIcon(
            name = "AppleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.673 7.222 C 10.797 7.222 9.441 6.226 8.013 6.262 C 6.129 6.286 4.401 7.354 3.429 9.046 C 1.473 12.442 2.925 17.458 4.833 20.218 C 5.769 21.562 6.873 23.074 8.337 23.026 C 9.741 22.966 10.269 22.114 11.973 22.114 C 13.665 22.114 14.145 23.026 15.633 22.990 C 17.145 22.966 18.105 21.622 19.029 20.266 C 20.097 18.706 20.541 17.194 20.565 17.110 C 20.529 17.098 17.625 15.982 17.589 12.622 C 17.565 9.814 19.881 8.470 19.989 8.410 C 18.669 6.478 16.641 6.262 15.933 6.214 C 14.085 6.070 12.537 7.222 11.673 7.222 ZM 14.793 4.390 C 15.573 3.454 16.089 2.146 15.945 0.850 C 14.829 0.898 13.485 1.594 12.681 2.530 C 11.961 3.358 11.337 4.690 11.505 5.962 C 12.741 6.058 14.013 5.326 14.793 4.390 Z"),
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
        return _appleFill!!
    }

private var _appleFill: ImageVector? = null
