package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Popsicle: ImageVector
    get() {
        if (_popsicle != null) return _popsicle!!
        _popsicle = phosphorFillIcon(
            name = "Popsicle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 8.000 C 88.254 8.044 56.044 40.254 56.000 80.000 L 56.000 176.000 C 56.000 184.837 63.163 192.000 72.000 192.000 L 104.000 192.000 L 104.000 232.000 C 104.000 245.255 114.745 256.000 128.000 256.000 C 141.255 256.000 152.000 245.255 152.000 232.000 L 152.000 192.000 L 184.000 192.000 C 192.837 192.000 200.000 184.837 200.000 176.000 L 200.000 80.000 C 199.956 40.254 167.746 8.044 128.000 8.000 ZM 112.000 152.000 C 112.000 156.418 108.418 160.000 104.000 160.000 C 99.582 160.000 96.000 156.418 96.000 152.000 L 96.000 72.000 C 96.000 67.582 99.582 64.000 104.000 64.000 C 108.418 64.000 112.000 67.582 112.000 72.000 ZM 136.000 232.000 C 136.000 236.418 132.418 240.000 128.000 240.000 C 123.582 240.000 120.000 236.418 120.000 232.000 L 120.000 192.000 L 136.000 192.000 ZM 160.000 152.000 C 160.000 156.418 156.418 160.000 152.000 160.000 C 147.582 160.000 144.000 156.418 144.000 152.000 L 144.000 72.000 C 144.000 67.582 147.582 64.000 152.000 64.000 C 156.418 64.000 160.000 67.582 160.000 72.000 Z"),
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
        return _popsicle!!
    }

private var _popsicle: ImageVector? = null
