package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Subtract: ImageVector
    get() {
        if (_subtract != null) return _subtract!!
        _subtract = phosphorLightIcon(
            name = "Subtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.910 83.080 C 166.335 43.887 131.345 15.904 91.666 18.105 C 51.986 20.305 20.305 51.986 18.105 91.666 C 15.904 131.345 43.887 166.335 83.080 172.910 C 89.655 212.103 124.645 240.086 164.324 237.885 C 204.004 235.685 235.685 204.004 237.885 164.324 C 240.086 124.645 212.103 89.655 172.910 83.080 ZM 226.000 160.000 C 225.996 162.977 225.789 165.951 225.380 168.900 L 171.620 115.130 C 173.203 108.877 174.002 102.451 174.000 96.000 C 174.000 95.830 174.000 95.660 174.000 95.490 C 204.396 102.010 226.082 128.913 226.000 160.000 ZM 146.710 155.190 L 202.210 210.690 C 196.349 215.569 189.687 219.396 182.520 222.000 L 127.720 167.190 C 134.597 164.129 140.993 160.087 146.710 155.190 ZM 155.190 146.710 C 160.088 140.990 164.130 134.590 167.190 127.710 L 222.000 182.520 C 219.384 189.690 215.543 196.352 210.650 202.210 ZM 30.000 96.000 C 30.000 59.549 59.549 30.000 96.000 30.000 C 132.451 30.000 162.000 59.549 162.000 96.000 C 162.000 132.451 132.451 162.000 96.000 162.000 C 59.567 161.956 30.044 132.433 30.000 96.000 ZM 95.490 174.000 L 96.000 174.000 C 102.451 174.002 108.877 173.203 115.130 171.620 L 168.900 225.380 C 134.756 230.098 102.748 207.696 95.490 174.000 Z"),
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
        return _subtract!!
    }

private var _subtract: ImageVector? = null
