package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CraneTower: ImageVector
    get() {
        if (_craneTower != null) return _craneTower!!
        _craneTower = phosphorLightIcon(
            name = "CraneTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 82.000 L 107.710 82.000 L 85.370 37.320 C 84.354 35.285 82.275 33.999 80.000 34.000 L 48.000 34.000 C 44.686 34.000 42.000 36.686 42.000 40.000 L 42.000 82.000 L 24.000 82.000 C 20.686 82.000 18.000 84.686 18.000 88.000 C 18.000 91.314 20.686 94.000 24.000 94.000 L 42.000 94.000 L 42.000 210.000 L 24.000 210.000 C 20.686 210.000 18.000 212.686 18.000 216.000 C 18.000 219.314 20.686 222.000 24.000 222.000 L 128.000 222.000 C 131.314 222.000 134.000 219.314 134.000 216.000 C 134.000 212.686 131.314 210.000 128.000 210.000 L 110.000 210.000 L 110.000 94.000 L 210.000 94.000 L 210.000 184.000 C 210.000 185.105 209.105 186.000 208.000 186.000 L 192.000 186.000 C 190.895 186.000 190.000 185.105 190.000 184.000 L 190.000 176.000 C 190.000 172.686 187.314 170.000 184.000 170.000 C 180.686 170.000 178.000 172.686 178.000 176.000 L 178.000 184.000 C 178.000 191.732 184.268 198.000 192.000 198.000 L 208.000 198.000 C 215.732 198.000 222.000 191.732 222.000 184.000 L 222.000 94.000 L 240.000 94.000 C 243.314 94.000 246.000 91.314 246.000 88.000 C 246.000 84.686 243.314 82.000 240.000 82.000 ZM 54.000 46.000 L 76.290 46.000 L 94.290 82.000 L 54.000 82.000 ZM 54.000 210.000 L 54.000 158.000 L 98.000 158.000 L 98.000 210.000 ZM 98.000 146.000 L 54.000 146.000 L 54.000 94.000 L 98.000 94.000 Z"),
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
        return _craneTower!!
    }

private var _craneTower: ImageVector? = null
