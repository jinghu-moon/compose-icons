package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pointer: ImageVector
    get() {
        if (_pointer != null) return _pointer!!
        _pointer = tablerFilledIcon(
            name = "Pointer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.039 4.277 L 6.943 17.840 C 7.128 18.677 7.863 19.356 8.774 19.482 L 8.944 19.498 C 9.738 19.546 10.496 19.161 10.926 18.492 L 10.971 18.414 L 12.371 16.342 L 16.421 20.392 C 16.809 20.780 17.335 20.998 17.883 20.998 C 18.431 20.998 18.957 20.780 19.345 20.392 L 20.392 19.345 C 20.780 18.957 20.998 18.432 20.998 17.884 L 20.990 17.702 C 20.947 17.218 20.735 16.765 20.392 16.422 L 16.345 12.374 L 18.448 10.962 C 19.174 10.577 19.628 9.684 19.501 8.773 C 19.375 7.863 18.697 7.128 17.800 6.928 L 4.276 3.038 C 3.926 2.938 3.549 3.035 3.292 3.293 C 3.035 3.551 2.939 3.928 3.040 4.278 Z"),
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
        return _pointer!!
    }

private var _pointer: ImageVector? = null
