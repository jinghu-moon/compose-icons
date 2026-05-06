package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FunnelSimpleX: ImageVector
    get() {
        if (_funnelSimpleX != null) return _funnelSimpleX!!
        _funnelSimpleX = phosphorBoldIcon(
            name = "FunnelSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 148h-128c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h128c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM232 76h-208C17.373 76 12 81.373 12 88c0 6.627 5.373 12 12 12h208c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM128 172h-24c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h24c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM224.49 167.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L192 183 176.49 167.48c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L175 200l-15.52 15.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L192 217l15.51 15.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L209 200l15.52-15.51c2.249-2.255 3.51-5.311 3.504-8.496-.006-3.185-1.277-6.237-3.534-8.484Z"),
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
        return _funnelSimpleX!!
    }

private var _funnelSimpleX: ImageVector? = null
