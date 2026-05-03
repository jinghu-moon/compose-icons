package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Union: ImageVector
    get() {
        if (_union != null) return _union!!
        _union = phosphorDuotoneIcon(
            name = "Union",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 200.000 64.000 L 200.000 144.000 C 200.000 183.764 167.764 216.000 128.000 216.000 C 88.235 216.000 56.000 183.764 56.000 144.000 L 56.000 64.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 208.000 64.000 L 208.000 144.000 C 208.000 188.183 172.183 224.000 128.000 224.000 C 83.817 224.000 48.000 188.183 48.000 144.000 L 48.000 64.000 C 48.000 59.582 51.582 56.000 56.000 56.000 C 60.418 56.000 64.000 59.582 64.000 64.000 L 64.000 144.000 C 64.000 179.346 92.654 208.000 128.000 208.000 C 163.346 208.000 192.000 179.346 192.000 144.000 L 192.000 64.000 C 192.000 59.582 195.582 56.000 200.000 56.000 C 204.418 56.000 208.000 59.582 208.000 64.000 Z"),
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
