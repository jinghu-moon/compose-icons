package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListPlus: ImageVector
    get() {
        if (_listPlus != null) return _listPlus!!
        _listPlus = phosphorLightIcon(
            name = "ListPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 34.000 64.000 C 34.000 60.686 36.686 58.000 40.000 58.000 L 216.000 58.000 C 219.314 58.000 222.000 60.686 222.000 64.000 C 222.000 67.314 219.314 70.000 216.000 70.000 L 40.000 70.000 C 36.686 70.000 34.000 67.314 34.000 64.000 ZM 40.000 134.000 L 216.000 134.000 C 219.314 134.000 222.000 131.314 222.000 128.000 C 222.000 124.686 219.314 122.000 216.000 122.000 L 40.000 122.000 C 36.686 122.000 34.000 124.686 34.000 128.000 C 34.000 131.314 36.686 134.000 40.000 134.000 ZM 144.000 186.000 L 40.000 186.000 C 36.686 186.000 34.000 188.686 34.000 192.000 C 34.000 195.314 36.686 198.000 40.000 198.000 L 144.000 198.000 C 147.314 198.000 150.000 195.314 150.000 192.000 C 150.000 188.686 147.314 186.000 144.000 186.000 ZM 232.000 186.000 L 214.000 186.000 L 214.000 168.000 C 214.000 164.686 211.314 162.000 208.000 162.000 C 204.686 162.000 202.000 164.686 202.000 168.000 L 202.000 186.000 L 184.000 186.000 C 180.686 186.000 178.000 188.686 178.000 192.000 C 178.000 195.314 180.686 198.000 184.000 198.000 L 202.000 198.000 L 202.000 216.000 C 202.000 219.314 204.686 222.000 208.000 222.000 C 211.314 222.000 214.000 219.314 214.000 216.000 L 214.000 198.000 L 232.000 198.000 C 235.314 198.000 238.000 195.314 238.000 192.000 C 238.000 188.686 235.314 186.000 232.000 186.000 Z"),
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
        return _listPlus!!
    }

private var _listPlus: ImageVector? = null
