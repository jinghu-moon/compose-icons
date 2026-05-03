package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FunnelSimple: ImageVector
    get() {
        if (_funnelSimple != null) return _funnelSimple!!
        _funnelSimple = phosphorLightIcon(
            name = "FunnelSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 198.000 136.000 C 198.000 139.314 195.314 142.000 192.000 142.000 L 64.000 142.000 C 60.686 142.000 58.000 139.314 58.000 136.000 C 58.000 132.686 60.686 130.000 64.000 130.000 L 192.000 130.000 C 195.314 130.000 198.000 132.686 198.000 136.000 ZM 232.000 82.000 L 24.000 82.000 C 20.686 82.000 18.000 84.686 18.000 88.000 C 18.000 91.314 20.686 94.000 24.000 94.000 L 232.000 94.000 C 235.314 94.000 238.000 91.314 238.000 88.000 C 238.000 84.686 235.314 82.000 232.000 82.000 ZM 152.000 178.000 L 104.000 178.000 C 100.686 178.000 98.000 180.686 98.000 184.000 C 98.000 187.314 100.686 190.000 104.000 190.000 L 152.000 190.000 C 155.314 190.000 158.000 187.314 158.000 184.000 C 158.000 180.686 155.314 178.000 152.000 178.000 Z"),
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
