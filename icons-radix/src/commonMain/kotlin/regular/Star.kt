package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = radixIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.223 0.666 C 7.325 0.420 7.675 0.420 7.777 0.666 L 9.413 4.600 C 9.456 4.704 9.554 4.775 9.666 4.784 L 13.914 5.125 C 14.180 5.146 14.287 5.478 14.085 5.651 L 13.856 5.846 L 10.849 8.424 C 10.764 8.497 10.726 8.611 10.752 8.720 L 11.671 12.572 L 11.741 12.866 C 11.795 13.093 11.586 13.279 11.380 13.228 L 11.293 13.191 L 11.035 13.033 L 7.656 10.970 C 7.560 10.912 7.440 10.912 7.344 10.970 L 3.707 13.191 L 3.620 13.228 C 3.414 13.279 3.205 13.093 3.259 12.866 L 3.328 12.572 L 4.248 8.720 C 4.267 8.639 4.251 8.553 4.206 8.485 L 4.151 8.424 L 0.915 5.651 C 0.713 5.478 0.820 5.146 1.086 5.125 L 1.387 5.100 L 5.334 4.784 C 5.418 4.777 5.494 4.736 5.545 4.672 L 5.587 4.600 L 7.223 0.666 ZM 6.510 4.984 C 6.346 5.378 6.002 5.662 5.593 5.754 L 5.413 5.781 L 2.843 5.986 L 4.802 7.664 L 4.931 7.791 C 5.168 8.060 5.284 8.417 5.250 8.774 L 5.221 8.953 L 4.622 11.460 L 6.822 10.117 L 6.983 10.034 C 7.313 9.891 7.687 9.891 8.017 10.034 L 8.178 10.117 L 10.377 11.460 L 9.779 8.953 C 9.666 8.479 9.828 7.981 10.198 7.664 L 12.156 5.986 L 9.587 5.781 C 9.162 5.747 8.784 5.507 8.571 5.146 L 8.490 4.984 L 7.500 2.603 L 6.510 4.984 Z"),
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
        return _star!!
    }

private var _star: ImageVector? = null
