package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Size: ImageVector
    get() {
        if (_size != null) return _size!!
        _size = radixIcon(
            name = "Size",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.591 3.059 C 11.796 3.101 11.950 3.283 11.950 3.500 L 11.950 7.499 L 11.941 7.591 C 11.899 7.796 11.717 7.949 11.500 7.949 C 11.283 7.949 11.101 7.795 11.059 7.590 L 11.050 7.500 L 11.050 4.586 L 4.587 11.049 L 7.500 11.050 L 7.591 11.059 C 7.796 11.101 7.949 11.282 7.949 11.499 C 7.949 11.748 7.748 11.949 7.499 11.949 L 3.500 11.949 C 3.381 11.949 3.266 11.902 3.182 11.818 C 3.098 11.733 3.050 11.618 3.050 11.499 L 3.050 7.500 L 3.060 7.409 C 3.102 7.205 3.283 7.050 3.500 7.050 C 3.718 7.050 3.900 7.204 3.942 7.409 L 3.950 7.500 L 3.950 10.414 L 10.414 3.950 L 7.500 3.950 C 7.252 3.950 7.050 3.749 7.050 3.500 C 7.050 3.252 7.252 3.050 7.500 3.050 L 11.500 3.050 L 11.591 3.059 Z"),
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
        return _size!!
    }

private var _size: ImageVector? = null
