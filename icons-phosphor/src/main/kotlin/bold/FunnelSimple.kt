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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.000 136.000 C 204.000 142.627 198.627 148.000 192.000 148.000 L 64.000 148.000 C 57.373 148.000 52.000 142.627 52.000 136.000 C 52.000 129.373 57.373 124.000 64.000 124.000 L 192.000 124.000 C 198.627 124.000 204.000 129.373 204.000 136.000 ZM 232.000 76.000 L 24.000 76.000 C 17.373 76.000 12.000 81.373 12.000 88.000 C 12.000 94.627 17.373 100.000 24.000 100.000 L 232.000 100.000 C 238.627 100.000 244.000 94.627 244.000 88.000 C 244.000 81.373 238.627 76.000 232.000 76.000 ZM 152.000 172.000 L 104.000 172.000 C 97.373 172.000 92.000 177.373 92.000 184.000 C 92.000 190.627 97.373 196.000 104.000 196.000 L 152.000 196.000 C 158.627 196.000 164.000 190.627 164.000 184.000 C 164.000 177.373 158.627 172.000 152.000 172.000 Z"),
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
        return _funnelSimple!!
    }

private var _funnelSimple: ImageVector? = null
