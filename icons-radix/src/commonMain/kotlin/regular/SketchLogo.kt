package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) return _sketchLogo!!
        _sketchLogo = radixIcon(
            name = "SketchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.037 1.177 L 11.114 1.193 C 11.189 1.217 11.255 1.264 11.303 1.329 L 14.303 5.429 C 14.309 5.437 14.313 5.446 14.318 5.454 C 14.321 5.459 14.324 5.464 14.327 5.469 C 14.334 5.480 14.340 5.492 14.345 5.505 C 14.349 5.514 14.352 5.523 14.356 5.532 C 14.359 5.542 14.361 5.552 14.363 5.562 C 14.366 5.571 14.368 5.580 14.369 5.590 C 14.372 5.605 14.373 5.621 14.373 5.637 C 14.373 5.641 14.375 5.646 14.375 5.650 L 14.375 5.661 C 14.373 5.742 14.344 5.822 14.290 5.888 L 7.790 13.788 C 7.719 13.875 7.612 13.925 7.500 13.925 C 7.388 13.925 7.281 13.875 7.210 13.788 L 0.710 5.888 C 0.704 5.881 0.699 5.873 0.693 5.865 C 0.691 5.862 0.689 5.859 0.687 5.855 C 0.648 5.796 0.627 5.729 0.625 5.661 L 0.625 5.650 C 0.625 5.646 0.626 5.641 0.626 5.637 C 0.627 5.618 0.628 5.600 0.632 5.582 C 0.633 5.576 0.634 5.570 0.636 5.564 C 0.640 5.548 0.644 5.532 0.650 5.516 C 0.653 5.510 0.655 5.504 0.657 5.498 C 0.665 5.481 0.674 5.464 0.685 5.448 C 0.687 5.444 0.689 5.440 0.691 5.436 C 0.693 5.434 0.695 5.431 0.697 5.429 L 3.697 1.329 L 3.750 1.270 C 3.809 1.218 3.883 1.185 3.963 1.177 L 7.463 0.827 L 7.537 0.827 L 11.037 1.177 ZM 5.151 6.025 L 7.499 12.108 L 9.849 6.025 L 5.151 6.025 ZM 1.794 6.025 L 6.757 12.057 L 4.224 6.067 L 4.211 6.025 L 1.794 6.025 ZM 10.789 6.025 C 10.785 6.039 10.782 6.053 10.776 6.067 L 8.242 12.056 L 13.204 6.025 L 10.789 6.025 ZM 10.922 5.275 L 10.925 5.275 L 10.925 5.250 L 10.922 5.275 ZM 5.659 5.275 L 9.341 5.275 L 7.500 2.182 L 5.659 5.275 ZM 4.429 1.883 L 4.824 5.210 L 6.956 1.630 L 4.429 1.883 ZM 10.175 5.210 L 10.570 1.883 L 8.043 1.630 L 10.175 5.210 ZM 10.934 5.176 L 13.188 5.176 L 11.249 2.525 L 10.934 5.176 ZM 1.812 5.176 L 4.066 5.176 L 3.750 2.524 L 1.812 5.176 Z"),
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
        return _sketchLogo!!
    }

private var _sketchLogo: ImageVector? = null
