package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberOne: ImageVector
    get() {
        if (_numberOne != null) return _numberOne!!
        _numberOne = phosphorRegularIcon(
            name = "NumberOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 48.000 L 144.000 208.000 C 144.000 212.418 140.418 216.000 136.000 216.000 C 131.582 216.000 128.000 212.418 128.000 208.000 L 128.000 62.130 L 100.120 78.860 C 96.331 81.135 91.415 79.909 89.140 76.120 C 86.865 72.331 88.091 67.415 91.880 65.140 L 131.880 41.140 C 134.352 39.655 137.431 39.615 139.941 41.035 C 142.450 42.456 144.001 45.117 144.000 48.000 Z"),
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
        return _numberOne!!
    }

private var _numberOne: ImageVector? = null
