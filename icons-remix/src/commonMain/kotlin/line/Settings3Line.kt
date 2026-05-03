package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Settings3Line: ImageVector
    get() {
        if (_settings3Line != null) return _settings3Line!!
        _settings3Line = remixIcon(
            name = "Settings3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.339 17.000 C 2.907 16.251 2.583 15.470 2.361 14.674 C 3.334 14.178 4.000 13.167 4.000 12.000 C 4.000 10.835 3.335 9.824 2.364 9.327 C 2.810 7.717 3.659 6.216 4.865 4.990 C 5.781 5.584 6.989 5.655 8.000 5.072 C 9.010 4.489 9.553 3.406 9.496 2.316 C 11.161 1.885 12.885 1.900 14.503 2.319 C 14.448 3.408 14.990 4.489 16.000 5.072 C 17.010 5.655 18.219 5.584 19.135 4.990 C 19.713 5.580 20.228 6.252 20.660 7.000 C 21.092 7.749 21.417 8.530 21.638 9.326 C 20.666 9.822 20.000 10.834 20.000 12.000 C 20.000 13.166 20.665 14.176 21.636 14.673 C 21.189 16.284 20.341 17.784 19.135 19.010 C 18.219 18.416 17.010 18.345 16.000 18.928 C 14.989 19.512 14.447 20.594 14.503 21.684 C 12.838 22.116 11.115 22.100 9.496 21.682 C 9.552 20.592 9.009 19.511 8.000 18.928 C 6.989 18.345 5.781 18.416 4.865 19.010 C 4.286 18.420 3.772 17.749 3.339 17.000 ZM 9.000 17.196 C 10.091 17.826 10.875 18.823 11.250 19.966 C 11.749 20.013 12.250 20.014 12.749 19.968 C 13.124 18.824 13.908 17.827 15.000 17.196 C 16.092 16.566 17.347 16.385 18.525 16.632 C 18.815 16.224 19.065 15.789 19.273 15.334 C 18.471 14.437 18.000 13.260 18.000 12.000 C 18.000 10.740 18.471 9.563 19.273 8.667 C 19.169 8.441 19.054 8.218 18.928 8.000 C 18.802 7.782 18.667 7.571 18.523 7.368 C 17.346 7.615 16.091 7.434 15.000 6.804 C 13.908 6.174 13.125 5.178 12.749 4.035 C 12.251 3.987 11.749 3.986 11.251 4.033 C 10.876 5.177 10.092 6.174 9.000 6.804 C 7.908 7.434 6.652 7.615 5.474 7.368 C 5.185 7.776 4.935 8.211 4.727 8.666 C 5.529 9.563 6.000 10.740 6.000 12.000 C 6.000 13.260 5.529 14.437 4.727 15.334 C 4.831 15.560 4.946 15.782 5.072 16.000 C 5.197 16.218 5.332 16.429 5.476 16.632 C 6.654 16.386 7.908 16.566 9.000 17.196 ZM 12.000 15.000 C 10.343 15.000 9.000 13.657 9.000 12.000 C 9.000 10.343 10.343 9.000 12.000 9.000 C 13.657 9.000 15.000 10.343 15.000 12.000 C 15.000 13.657 13.657 15.000 12.000 15.000 ZM 12.000 13.000 C 12.552 13.000 13.000 12.552 13.000 12.000 C 13.000 11.448 12.552 11.000 12.000 11.000 C 11.447 11.000 11.000 11.448 11.000 12.000 C 11.000 12.552 11.447 13.000 12.000 13.000 Z"),
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
        return _settings3Line!!
    }

private var _settings3Line: ImageVector? = null
