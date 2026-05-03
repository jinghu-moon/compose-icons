package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = radixIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.360 0.729 C 8.555 0.534 8.872 0.534 9.067 0.729 L 14.270 5.932 L 14.335 6.011 C 14.463 6.205 14.441 6.469 14.270 6.639 L 7.347 13.563 C 6.761 14.149 5.811 14.149 5.225 13.563 L 1.436 9.774 C 0.887 9.225 0.853 8.356 1.334 7.767 L 1.436 7.653 L 8.360 0.729 ZM 2.143 8.360 C 1.948 8.555 1.948 8.872 2.143 9.067 L 5.933 12.856 C 6.128 13.051 6.444 13.052 6.640 12.856 L 7.894 11.601 L 3.398 7.105 L 2.143 8.360 ZM 4.105 6.398 L 8.601 10.894 L 13.210 6.286 L 8.714 1.790 L 4.105 6.398 Z"),
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
        return _eraser!!
    }

private var _eraser: ImageVector? = null
