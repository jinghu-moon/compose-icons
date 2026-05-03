package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Option: ImageVector
    get() {
        if (_option != null) return _option!!
        _option = phosphorLightIcon(
            name = "Option",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 192.000 C 230.000 195.314 227.314 198.000 224.000 198.000 L 160.940 198.000 C 155.632 198.018 150.776 195.016 148.420 190.260 L 96.840 87.110 C 96.504 86.434 95.815 86.004 95.060 86.000 L 32.000 86.000 C 28.686 86.000 26.000 83.314 26.000 80.000 C 26.000 76.686 28.686 74.000 32.000 74.000 L 95.060 74.000 C 100.368 73.982 105.224 76.984 107.580 81.740 L 159.160 184.890 C 159.496 185.566 160.185 185.996 160.940 186.000 L 224.000 186.000 C 227.314 186.000 230.000 188.686 230.000 192.000 ZM 152.000 86.000 L 224.000 86.000 C 227.314 86.000 230.000 83.314 230.000 80.000 C 230.000 76.686 227.314 74.000 224.000 74.000 L 152.000 74.000 C 148.686 74.000 146.000 76.686 146.000 80.000 C 146.000 83.314 148.686 86.000 152.000 86.000 Z"),
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
        return _option!!
    }

private var _option: ImageVector? = null
