package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DrawFill: ImageVector
    get() {
        if (_drawFill != null) return _drawFill!!
        _drawFill = remixIcon(
            name = "DrawFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.656 2.101 C 18.047 1.710 18.681 1.710 19.071 2.101 L 21.899 4.929 C 22.290 5.319 22.290 5.952 21.899 6.343 L 18.228 10.014 C 19.088 11.133 19.771 12.250 20.226 13.286 C 20.608 14.153 20.854 15.012 20.887 15.798 C 20.920 16.584 20.738 17.404 20.132 18.011 C 19.319 18.824 18.140 18.875 17.091 18.660 C 16.006 18.438 14.788 17.885 13.563 17.110 L 14.634 15.420 C 15.739 16.119 16.726 16.544 17.492 16.701 C 18.294 16.866 18.615 16.700 18.718 16.597 C 18.795 16.520 18.907 16.331 18.889 15.882 C 18.870 15.431 18.718 14.825 18.396 14.093 C 18.039 13.282 17.499 12.376 16.801 11.440 L 14.828 13.414 C 14.641 13.602 14.386 13.707 14.121 13.707 L 11.293 13.707 C 10.741 13.707 10.293 13.259 10.293 12.707 L 10.293 9.879 C 10.293 9.614 10.398 9.359 10.586 9.172 L 12.442 7.313 C 11.484 6.749 10.512 6.371 9.596 6.188 C 7.887 5.846 6.497 6.188 5.636 7.050 C 4.774 7.911 4.432 9.302 4.773 11.011 C 5.114 12.711 6.120 14.605 7.757 16.242 C 9.515 18.000 11.565 19.029 13.352 19.290 L 13.063 21.269 C 10.785 20.935 8.355 19.669 6.343 17.657 C 4.465 15.780 3.240 13.541 2.812 11.402 C 2.387 9.272 2.740 7.117 4.222 5.636 C 5.703 4.154 7.858 3.801 9.988 4.227 C 11.288 4.487 12.625 5.043 13.896 5.860 L 17.656 2.101 Z"),
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
        return _drawFill!!
    }

private var _drawFill: ImageVector? = null
