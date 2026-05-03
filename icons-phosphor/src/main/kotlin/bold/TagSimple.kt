package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TagSimple: ImageVector
    get() {
        if (_tagSimple != null) return _tagSimple!!
        _tagSimple = phosphorBoldIcon(
            name = "TagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 250.000 121.340 L 204.360 52.910 C 200.652 47.345 194.407 44.001 187.720 44.000 L 40.000 44.000 C 28.954 44.000 20.000 52.954 20.000 64.000 L 20.000 192.000 C 20.000 203.046 28.954 212.000 40.000 212.000 L 187.720 212.000 C 194.407 211.999 200.652 208.655 204.360 203.090 L 250.000 134.660 C 252.690 130.628 252.690 125.372 250.000 121.340 ZM 185.580 188.000 L 44.000 188.000 L 44.000 68.000 L 185.580 68.000 L 225.580 128.000 Z"),
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
        return _tagSimple!!
    }

private var _tagSimple: ImageVector? = null
