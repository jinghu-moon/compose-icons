package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MouseSimple: ImageVector
    get() {
        if (_mouseSimple != null) return _mouseSimple!!
        _mouseSimple = phosphorFillIcon(
            name = "MouseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 16.000 L 112.000 16.000 C 76.670 16.039 48.039 44.670 48.000 80.000 L 48.000 176.000 C 48.039 211.330 76.670 239.961 112.000 240.000 L 144.000 240.000 C 179.330 239.961 207.961 211.330 208.000 176.000 L 208.000 80.000 C 207.961 44.670 179.330 16.039 144.000 16.000 ZM 136.000 112.000 C 136.000 116.418 132.418 120.000 128.000 120.000 C 123.582 120.000 120.000 116.418 120.000 112.000 L 120.000 64.000 C 120.000 59.582 123.582 56.000 128.000 56.000 C 132.418 56.000 136.000 59.582 136.000 64.000 Z"),
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
        return _mouseSimple!!
    }

private var _mouseSimple: ImageVector? = null
