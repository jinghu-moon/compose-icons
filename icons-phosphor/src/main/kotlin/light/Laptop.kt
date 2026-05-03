package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Laptop: ImageVector
    get() {
        if (_laptop != null) return _laptop!!
        _laptop = phosphorLightIcon(
            name = "Laptop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 170.000 L 222.000 170.000 L 222.000 72.000 C 222.000 59.850 212.150 50.000 200.000 50.000 L 56.000 50.000 C 43.850 50.000 34.000 59.850 34.000 72.000 L 34.000 170.000 L 24.000 170.000 C 20.686 170.000 18.000 172.686 18.000 176.000 L 18.000 192.000 C 18.000 204.150 27.850 214.000 40.000 214.000 L 216.000 214.000 C 228.150 214.000 238.000 204.150 238.000 192.000 L 238.000 176.000 C 238.000 172.686 235.314 170.000 232.000 170.000 ZM 46.000 72.000 C 46.000 66.477 50.477 62.000 56.000 62.000 L 200.000 62.000 C 205.523 62.000 210.000 66.477 210.000 72.000 L 210.000 170.000 L 46.000 170.000 ZM 226.000 192.000 C 226.000 197.523 221.523 202.000 216.000 202.000 L 40.000 202.000 C 34.477 202.000 30.000 197.523 30.000 192.000 L 30.000 182.000 L 226.000 182.000 ZM 150.000 88.000 C 150.000 91.314 147.314 94.000 144.000 94.000 L 112.000 94.000 C 108.686 94.000 106.000 91.314 106.000 88.000 C 106.000 84.686 108.686 82.000 112.000 82.000 L 144.000 82.000 C 147.314 82.000 150.000 84.686 150.000 88.000 Z"),
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
        return _laptop!!
    }

private var _laptop: ImageVector? = null
