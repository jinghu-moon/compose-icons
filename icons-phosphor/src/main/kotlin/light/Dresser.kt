package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Dresser: ImageVector
    get() {
        if (_dresser != null) return _dresser!!
        _dresser = phosphorLightIcon(
            name = "Dresser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 142.000 192.000 C 142.000 195.314 139.314 198.000 136.000 198.000 L 120.000 198.000 C 116.686 198.000 114.000 195.314 114.000 192.000 C 114.000 188.686 116.686 186.000 120.000 186.000 L 136.000 186.000 C 139.314 186.000 142.000 188.686 142.000 192.000 ZM 120.000 70.000 L 136.000 70.000 C 139.314 70.000 142.000 67.314 142.000 64.000 C 142.000 60.686 139.314 58.000 136.000 58.000 L 120.000 58.000 C 116.686 58.000 114.000 60.686 114.000 64.000 C 114.000 67.314 116.686 70.000 120.000 70.000 ZM 136.000 122.000 L 120.000 122.000 C 116.686 122.000 114.000 124.686 114.000 128.000 C 114.000 131.314 116.686 134.000 120.000 134.000 L 136.000 134.000 C 139.314 134.000 142.000 131.314 142.000 128.000 C 142.000 124.686 139.314 122.000 136.000 122.000 ZM 214.000 40.000 L 214.000 216.000 C 214.000 223.732 207.732 230.000 200.000 230.000 L 56.000 230.000 C 48.268 230.000 42.000 223.732 42.000 216.000 L 42.000 40.000 C 42.000 32.268 48.268 26.000 56.000 26.000 L 200.000 26.000 C 207.732 26.000 214.000 32.268 214.000 40.000 ZM 54.000 154.000 L 202.000 154.000 L 202.000 102.000 L 54.000 102.000 ZM 54.000 40.000 L 54.000 90.000 L 202.000 90.000 L 202.000 40.000 C 202.000 38.895 201.105 38.000 200.000 38.000 L 56.000 38.000 C 54.895 38.000 54.000 38.895 54.000 40.000 ZM 202.000 216.000 L 202.000 166.000 L 54.000 166.000 L 54.000 216.000 C 54.000 217.105 54.895 218.000 56.000 218.000 L 200.000 218.000 C 201.105 218.000 202.000 217.105 202.000 216.000 Z"),
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
        return _dresser!!
    }

private var _dresser: ImageVector? = null
