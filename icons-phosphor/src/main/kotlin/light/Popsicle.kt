package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Popsicle: ImageVector
    get() {
        if (_popsicle != null) return _popsicle!!
        _popsicle = phosphorLightIcon(
            name = "Popsicle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 10.000 C 89.358 10.044 58.044 41.358 58.000 80.000 L 58.000 176.000 C 58.000 183.732 64.268 190.000 72.000 190.000 L 106.000 190.000 L 106.000 232.000 C 106.000 244.150 115.850 254.000 128.000 254.000 C 140.150 254.000 150.000 244.150 150.000 232.000 L 150.000 190.000 L 184.000 190.000 C 191.732 190.000 198.000 183.732 198.000 176.000 L 198.000 80.000 C 197.956 41.358 166.642 10.044 128.000 10.000 ZM 138.000 232.000 C 138.000 237.523 133.523 242.000 128.000 242.000 C 122.477 242.000 118.000 237.523 118.000 232.000 L 118.000 190.000 L 138.000 190.000 ZM 186.000 176.000 C 186.000 177.105 185.105 178.000 184.000 178.000 L 72.000 178.000 C 70.895 178.000 70.000 177.105 70.000 176.000 L 70.000 80.000 C 70.000 47.967 95.967 22.000 128.000 22.000 C 160.033 22.000 186.000 47.967 186.000 80.000 ZM 118.000 72.000 L 118.000 152.000 C 118.000 155.314 115.314 158.000 112.000 158.000 C 108.686 158.000 106.000 155.314 106.000 152.000 L 106.000 72.000 C 106.000 68.686 108.686 66.000 112.000 66.000 C 115.314 66.000 118.000 68.686 118.000 72.000 ZM 150.000 72.000 L 150.000 152.000 C 150.000 155.314 147.314 158.000 144.000 158.000 C 140.686 158.000 138.000 155.314 138.000 152.000 L 138.000 72.000 C 138.000 68.686 140.686 66.000 144.000 66.000 C 147.314 66.000 150.000 68.686 150.000 72.000 Z"),
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
