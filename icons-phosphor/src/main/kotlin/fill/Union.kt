package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Union: ImageVector
    get() {
        if (_union != null) return _union!!
        _union = phosphorFillIcon(
            name = "Union",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 184.000 136.000 C 184.000 166.928 158.928 192.000 128.000 192.000 C 97.072 192.000 72.000 166.928 72.000 136.000 L 72.000 80.000 C 72.000 75.582 75.582 72.000 80.000 72.000 C 84.418 72.000 88.000 75.582 88.000 80.000 L 88.000 136.000 C 88.000 158.091 105.909 176.000 128.000 176.000 C 150.091 176.000 168.000 158.091 168.000 136.000 L 168.000 80.000 C 168.000 75.582 171.582 72.000 176.000 72.000 C 180.418 72.000 184.000 75.582 184.000 80.000 Z"),
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
        return _union!!
    }

private var _union: ImageVector? = null
