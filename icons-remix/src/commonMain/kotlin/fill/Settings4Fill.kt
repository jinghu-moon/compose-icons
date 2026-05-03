package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Settings4Fill: ImageVector
    get() {
        if (_settings4Fill != null) return _settings4Fill!!
        _settings4Fill = remixIcon(
            name = "Settings4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.334 4.545 C 6.349 3.636 7.551 2.932 8.876 2.497 C 9.609 3.413 10.736 3.999 12.000 3.999 C 13.264 3.999 14.391 3.413 15.125 2.497 C 16.449 2.932 17.651 3.636 18.666 4.545 C 18.240 5.637 18.297 6.905 18.928 7.999 C 19.560 9.094 20.631 9.777 21.791 9.954 C 21.928 10.614 22.000 11.298 22.000 11.999 C 22.000 12.700 21.928 13.384 21.791 14.045 C 20.631 14.222 19.560 14.905 18.928 15.999 C 18.297 17.093 18.240 18.362 18.666 19.454 C 17.651 20.362 16.449 21.066 15.125 21.501 C 14.391 20.586 13.264 19.999 12.000 19.999 C 10.736 19.999 9.609 20.586 8.876 21.501 C 7.551 21.066 6.349 20.362 5.334 19.454 C 5.760 18.362 5.703 17.093 5.072 15.999 C 4.440 14.905 3.369 14.222 2.209 14.045 C 2.072 13.384 2.000 12.700 2.000 11.999 C 2.000 11.298 2.072 10.614 2.209 9.954 C 3.369 9.777 4.440 9.094 5.072 7.999 C 5.703 6.905 5.760 5.637 5.334 4.545 ZM 13.500 14.597 C 14.935 13.769 15.427 11.934 14.598 10.499 C 13.770 9.064 11.935 8.573 10.500 9.401 C 9.065 10.230 8.573 12.064 9.402 13.499 C 10.230 14.934 12.065 15.426 13.500 14.597 Z"),
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
        return _settings4Fill!!
    }

private var _settings4Fill: ImageVector? = null
