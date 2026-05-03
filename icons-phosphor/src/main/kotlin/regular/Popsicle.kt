package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Popsicle: ImageVector
    get() {
        if (_popsicle != null) return _popsicle!!
        _popsicle = phosphorRegularIcon(
            name = "Popsicle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 8.000 C 88.254 8.044 56.044 40.254 56.000 80.000 L 56.000 176.000 C 56.000 184.837 63.163 192.000 72.000 192.000 L 104.000 192.000 L 104.000 232.000 C 104.000 245.255 114.745 256.000 128.000 256.000 C 141.255 256.000 152.000 245.255 152.000 232.000 L 152.000 192.000 L 184.000 192.000 C 192.837 192.000 200.000 184.837 200.000 176.000 L 200.000 80.000 C 199.956 40.254 167.746 8.044 128.000 8.000 ZM 136.000 232.000 C 136.000 236.418 132.418 240.000 128.000 240.000 C 123.582 240.000 120.000 236.418 120.000 232.000 L 120.000 192.000 L 136.000 192.000 ZM 184.000 176.000 L 72.000 176.000 L 72.000 80.000 C 72.000 49.072 97.072 24.000 128.000 24.000 C 158.928 24.000 184.000 49.072 184.000 80.000 L 184.000 176.000 ZM 120.000 72.000 L 120.000 152.000 C 120.000 156.418 116.418 160.000 112.000 160.000 C 107.582 160.000 104.000 156.418 104.000 152.000 L 104.000 72.000 C 104.000 67.582 107.582 64.000 112.000 64.000 C 116.418 64.000 120.000 67.582 120.000 72.000 ZM 152.000 72.000 L 152.000 152.000 C 152.000 156.418 148.418 160.000 144.000 160.000 C 139.582 160.000 136.000 156.418 136.000 152.000 L 136.000 72.000 C 136.000 67.582 139.582 64.000 144.000 64.000 C 148.418 64.000 152.000 67.582 152.000 72.000 Z"),
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
