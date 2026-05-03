package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = phosphorBoldIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 84.380 L 140.100 16.090 L 139.840 15.890 C 132.807 10.699 123.213 10.699 116.180 15.890 L 115.920 16.090 L 28.000 84.380 C 21.209 89.467 18.367 98.285 20.910 106.380 L 52.910 213.890 L 52.990 214.150 C 55.637 222.412 63.324 228.013 72.000 228.000 L 184.000 228.000 C 192.677 228.006 200.361 222.397 203.000 214.130 L 203.080 213.870 L 235.080 106.360 C 237.615 98.273 234.779 89.467 228.000 84.380 ZM 181.000 204.000 L 75.000 204.000 L 44.620 101.870 L 128.000 37.090 L 211.380 101.870 Z"),
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
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
