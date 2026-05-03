package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PinterestLine: ImageVector
    get() {
        if (_pinterestLine != null) return _pinterestLine!!
        _pinterestLine = remixIcon(
            name = "PinterestLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.492 19.191 C 8.515 18.855 8.563 18.520 8.635 18.190 C 8.698 17.895 8.889 17.060 9.169 15.850 L 9.176 15.819 C 9.299 15.287 9.431 14.719 9.563 14.153 C 9.642 13.812 9.704 13.548 9.744 13.460 C 9.550 13.012 9.453 12.526 9.460 12.037 C 9.460 10.700 10.216 9.664 11.196 9.664 C 11.556 9.658 11.900 9.814 12.138 10.090 C 12.376 10.366 12.486 10.733 12.440 11.086 C 12.440 11.538 12.355 11.884 11.986 13.121 C 11.916 13.359 11.867 13.525 11.821 13.692 C 11.770 13.880 11.726 14.050 11.689 14.214 C 11.593 14.600 11.681 15.011 11.926 15.319 C 12.171 15.627 12.542 15.797 12.932 15.776 C 14.424 15.776 15.532 13.791 15.532 11.228 C 15.532 9.258 14.241 7.954 12.100 7.954 C 11.022 7.911 9.975 8.325 9.201 9.100 C 8.427 9.875 7.995 10.944 8.006 12.061 C 7.982 12.663 8.171 13.254 8.518 13.705 C 8.699 13.844 8.769 14.089 8.693 14.294 C 8.652 14.463 8.553 14.847 8.516 14.976 C 8.495 15.103 8.415 15.213 8.301 15.271 C 8.187 15.330 8.052 15.330 7.946 15.274 C 6.785 14.795 6.150 13.496 6.150 11.835 C 6.150 8.849 8.641 6.250 12.342 6.250 C 15.477 6.250 17.823 8.579 17.823 11.390 C 17.823 14.922 15.891 17.494 13.134 17.494 C 12.339 17.520 11.584 17.162 11.087 16.535 L 11.044 16.712 C 10.950 17.099 10.903 17.293 10.837 17.564 L 10.835 17.572 C 10.689 18.172 10.587 18.588 10.547 18.745 C 10.441 19.100 10.307 19.448 10.147 19.784 C 10.742 19.925 11.363 20.000 12.001 20.000 C 16.419 20.000 20.001 16.418 20.001 12.000 C 20.001 7.582 16.419 4.000 12.001 4.000 C 7.583 4.000 4.001 7.582 4.001 12.000 C 4.001 15.159 5.832 17.891 8.492 19.191 ZM 12.001 22.000 C 6.478 22.000 2.001 17.523 2.001 12.000 C 2.001 6.477 6.478 2.000 12.001 2.000 C 17.524 2.000 22.001 6.477 22.001 12.000 C 22.001 17.523 17.524 22.000 12.001 22.000 Z"),
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
        return _pinterestLine!!
    }

private var _pinterestLine: ImageVector? = null
