package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FunnelSimple: ImageVector
    get() {
        if (_funnelSimple != null) return _funnelSimple!!
        _funnelSimple = phosphorBoldIcon(
            name = "FunnelSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 136c0 6.627-5.373 12-12 12h-128c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h128c6.627 0 12 5.373 12 12ZM232 76h-208C17.373 76 12 81.373 12 88c0 6.627 5.373 12 12 12h208c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM152 172h-48c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _funnelSimple!!
    }

private var _funnelSimple: ImageVector? = null
