package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Image: ImageVector
    get() {
        if (_image != null) return _image!!
        _image = radixIcon(
            name = "Image",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.500 1.000 C 13.328 1.000 14.000 1.672 14.000 2.500 L 14.000 12.500 C 14.000 13.328 13.328 14.000 12.500 14.000 L 2.500 14.000 C 1.723 14.000 1.085 13.410 1.008 12.653 L 1.000 12.500 L 1.000 2.500 C 1.000 1.672 1.672 1.000 2.500 1.000 L 12.500 1.000 ZM 2.000 9.636 L 2.000 12.500 L 2.010 12.601 C 2.050 12.796 2.204 12.950 2.399 12.990 L 2.500 13.000 L 8.941 13.000 L 7.528 11.439 L 7.528 11.439 L 3.988 7.647 L 2.000 9.636 ZM 8.483 11.152 L 10.155 13.000 L 12.500 13.000 L 12.601 12.990 C 12.796 12.950 12.950 12.796 12.990 12.601 L 13.000 12.500 L 13.000 10.637 L 11.000 8.637 L 8.483 11.152 ZM 2.399 2.010 C 2.171 2.056 2.000 2.258 2.000 2.500 L 2.000 8.363 L 3.682 6.682 L 3.752 6.625 C 3.827 6.575 3.916 6.548 4.008 6.550 C 4.130 6.552 4.246 6.604 4.329 6.693 L 7.873 10.489 L 10.682 7.682 L 10.752 7.624 C 10.927 7.509 11.165 7.528 11.318 7.682 L 13.000 9.363 L 13.000 2.500 C 13.000 2.258 12.829 2.056 12.601 2.010 L 12.500 2.000 L 2.500 2.000 L 2.399 2.010 ZM 7.500 3.749 C 8.467 3.749 9.251 4.533 9.251 5.500 C 9.251 6.467 8.467 7.251 7.500 7.251 C 6.533 7.251 5.749 6.467 5.749 5.500 C 5.749 4.533 6.533 3.749 7.500 3.749 ZM 7.500 4.649 C 7.030 4.649 6.649 5.030 6.649 5.500 C 6.649 5.970 7.030 6.351 7.500 6.351 C 7.970 6.351 8.351 5.970 8.351 5.500 C 8.351 5.030 7.970 4.649 7.500 4.649 Z"),
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
        return _image!!
    }

private var _image: ImageVector? = null
