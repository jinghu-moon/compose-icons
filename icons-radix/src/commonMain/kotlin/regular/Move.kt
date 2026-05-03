package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Move: ImageVector
    get() {
        if (_move != null) return _move!!
        _move = radixIcon(
            name = "Move",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.500 9.000 C 7.776 9.000 8.000 9.224 8.000 9.500 L 8.000 12.613 L 8.932 11.682 C 9.108 11.506 9.393 11.506 9.569 11.682 C 9.744 11.858 9.744 12.143 9.569 12.319 L 7.819 14.069 C 7.665 14.222 7.427 14.241 7.252 14.126 L 7.182 14.069 L 5.432 12.319 L 5.374 12.248 C 5.259 12.074 5.278 11.836 5.432 11.682 C 5.586 11.528 5.824 11.509 5.998 11.624 L 6.069 11.682 L 7.000 12.613 L 7.000 9.500 C 7.000 9.224 7.224 9.000 7.500 9.000 ZM 11.682 5.432 C 11.836 5.278 12.073 5.259 12.248 5.374 L 12.318 5.432 L 14.068 7.182 L 14.126 7.252 C 14.241 7.427 14.222 7.665 14.068 7.819 L 12.318 9.569 C 12.143 9.744 11.858 9.744 11.682 9.569 C 11.506 9.393 11.506 9.108 11.682 8.932 L 12.613 8.000 L 9.500 8.000 C 9.224 8.000 9.000 7.776 9.000 7.500 C 9.000 7.224 9.224 7.000 9.500 7.000 L 12.613 7.000 L 11.682 6.069 L 11.624 5.998 C 11.509 5.824 11.528 5.586 11.682 5.432 ZM 2.682 5.432 C 2.858 5.256 3.143 5.256 3.319 5.432 C 3.494 5.608 3.494 5.893 3.319 6.069 L 2.387 7.000 L 5.500 7.000 L 5.601 7.010 C 5.829 7.057 6.000 7.259 6.000 7.500 C 6.000 7.742 5.829 7.944 5.601 7.990 L 5.500 8.000 L 2.387 8.000 L 3.319 8.932 L 3.376 9.002 C 3.491 9.177 3.472 9.415 3.319 9.569 C 3.165 9.722 2.927 9.742 2.752 9.626 L 2.682 9.569 L 0.932 7.819 C 0.756 7.643 0.756 7.358 0.932 7.182 L 2.682 5.432 ZM 7.252 0.874 C 7.427 0.759 7.665 0.778 7.819 0.932 L 9.569 2.682 L 9.626 2.752 C 9.741 2.927 9.722 3.165 9.569 3.319 C 9.415 3.472 9.177 3.492 9.002 3.376 L 8.932 3.319 L 8.000 2.387 L 8.000 5.500 L 7.990 5.601 C 7.944 5.829 7.742 6.000 7.500 6.000 C 7.259 6.000 7.057 5.829 7.010 5.601 L 7.000 5.500 L 7.000 2.387 L 6.069 3.319 C 5.893 3.494 5.608 3.494 5.432 3.319 C 5.256 3.143 5.256 2.858 5.432 2.682 L 7.182 0.932 L 7.252 0.874 Z"),
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
        return _move!!
    }

private var _move: ImageVector? = null
