package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Width: ImageVector
    get() {
        if (_width != null) return _width!!
        _width = radixIcon(
            name = "Width",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.182 4.682 C 10.336 4.528 10.573 4.509 10.748 4.624 L 10.818 4.682 L 13.318 7.182 L 13.376 7.252 C 13.475 7.402 13.475 7.598 13.376 7.748 L 13.318 7.818 L 10.818 10.318 C 10.643 10.494 10.358 10.494 10.182 10.318 C 10.006 10.143 10.006 9.857 10.182 9.682 L 11.913 7.950 L 3.087 7.950 L 4.818 9.682 L 4.876 9.752 C 4.991 9.927 4.972 10.165 4.818 10.318 C 4.665 10.472 4.427 10.491 4.252 10.376 L 4.182 10.318 L 1.682 7.818 C 1.506 7.643 1.506 7.357 1.682 7.182 L 4.182 4.682 L 4.252 4.624 C 4.427 4.509 4.665 4.528 4.818 4.682 C 4.972 4.836 4.992 5.073 4.876 5.248 L 4.818 5.318 L 3.087 7.050 L 11.913 7.050 L 10.182 5.318 L 10.124 5.248 C 10.009 5.073 10.028 4.836 10.182 4.682 Z"),
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
        return _width!!
    }

private var _width: ImageVector? = null
