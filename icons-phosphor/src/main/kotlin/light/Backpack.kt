package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Backpack: ImageVector
    get() {
        if (_backpack != null) return _backpack!!
        _backpack = phosphorLightIcon(
            name = "Backpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 166.000 42.340 L 166.000 32.000 C 166.000 19.850 156.150 10.000 144.000 10.000 L 112.000 10.000 C 99.850 10.000 90.000 19.850 90.000 32.000 L 90.000 42.340 C 62.686 45.426 42.035 68.513 42.000 96.000 L 42.000 216.000 C 42.000 223.732 48.268 230.000 56.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 96.000 C 213.965 68.513 193.314 45.426 166.000 42.340 ZM 112.000 22.000 L 144.000 22.000 C 149.523 22.000 154.000 26.477 154.000 32.000 L 154.000 42.000 L 102.000 42.000 L 102.000 32.000 C 102.000 26.477 106.477 22.000 112.000 22.000 ZM 170.000 162.000 L 86.000 162.000 L 86.000 152.000 C 86.000 146.477 90.477 142.000 96.000 142.000 L 160.000 142.000 C 165.523 142.000 170.000 146.477 170.000 152.000 ZM 86.000 174.000 L 138.000 174.000 L 138.000 184.000 C 138.000 187.314 140.686 190.000 144.000 190.000 C 147.314 190.000 150.000 187.314 150.000 184.000 L 150.000 174.000 L 170.000 174.000 L 170.000 218.000 L 86.000 218.000 ZM 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 L 182.000 218.000 L 182.000 152.000 C 182.000 139.850 172.150 130.000 160.000 130.000 L 96.000 130.000 C 83.850 130.000 74.000 139.850 74.000 152.000 L 74.000 218.000 L 56.000 218.000 C 54.895 218.000 54.000 217.105 54.000 216.000 L 54.000 96.000 C 54.000 72.804 72.804 54.000 96.000 54.000 L 160.000 54.000 C 183.196 54.000 202.000 72.804 202.000 96.000 ZM 150.000 88.000 C 150.000 91.314 147.314 94.000 144.000 94.000 L 112.000 94.000 C 108.686 94.000 106.000 91.314 106.000 88.000 C 106.000 84.686 108.686 82.000 112.000 82.000 L 144.000 82.000 C 147.314 82.000 150.000 84.686 150.000 88.000 Z"),
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
        return _backpack!!
    }

private var _backpack: ImageVector? = null
