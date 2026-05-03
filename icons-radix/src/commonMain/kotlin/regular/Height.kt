package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Height: ImageVector
    get() {
        if (_height != null) return _height!!
        _height = radixIcon(
            name = "Height",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.252 1.624 C 7.426 1.509 7.664 1.528 7.818 1.682 L 10.318 4.182 L 10.376 4.252 C 10.491 4.427 10.472 4.665 10.318 4.819 C 10.164 4.972 9.926 4.992 9.752 4.876 L 9.681 4.819 L 7.950 3.087 L 7.950 11.913 L 9.681 10.182 C 9.857 10.006 10.142 10.006 10.318 10.182 C 10.494 10.358 10.494 10.643 10.318 10.819 L 7.818 13.319 C 7.734 13.403 7.619 13.450 7.500 13.450 C 7.380 13.450 7.266 13.403 7.181 13.319 L 4.681 10.819 L 4.624 10.748 C 4.508 10.574 4.528 10.336 4.681 10.182 C 4.835 10.028 5.073 10.009 5.248 10.124 L 5.318 10.182 L 7.050 11.913 L 7.050 3.087 L 5.318 4.819 C 5.142 4.994 4.857 4.994 4.681 4.819 C 4.506 4.643 4.506 4.358 4.681 4.182 L 7.181 1.682 L 7.252 1.624 Z"),
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
        return _height!!
    }

private var _height: ImageVector? = null
