package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FunnelSimple: ImageVector
    get() {
        if (_funnelSimple != null) return _funnelSimple!!
        _funnelSimple = phosphorRegularIcon(
            name = "FunnelSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 136.000 C 200.000 140.418 196.418 144.000 192.000 144.000 L 64.000 144.000 C 59.582 144.000 56.000 140.418 56.000 136.000 C 56.000 131.582 59.582 128.000 64.000 128.000 L 192.000 128.000 C 196.418 128.000 200.000 131.582 200.000 136.000 ZM 232.000 80.000 L 24.000 80.000 C 19.582 80.000 16.000 83.582 16.000 88.000 C 16.000 92.418 19.582 96.000 24.000 96.000 L 232.000 96.000 C 236.418 96.000 240.000 92.418 240.000 88.000 C 240.000 83.582 236.418 80.000 232.000 80.000 ZM 152.000 176.000 L 104.000 176.000 C 99.582 176.000 96.000 179.582 96.000 184.000 C 96.000 188.418 99.582 192.000 104.000 192.000 L 152.000 192.000 C 156.418 192.000 160.000 188.418 160.000 184.000 C 160.000 179.582 156.418 176.000 152.000 176.000 Z"),
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
