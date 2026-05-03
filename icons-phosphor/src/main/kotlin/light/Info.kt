package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Info: ImageVector
    get() {
        if (_info != null) return _info!!
        _info = phosphorLightIcon(
            name = "Info",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 142.000 176.000 C 142.000 179.314 139.314 182.000 136.000 182.000 C 128.268 182.000 122.000 175.732 122.000 168.000 L 122.000 128.000 C 122.000 126.895 121.105 126.000 120.000 126.000 C 116.686 126.000 114.000 123.314 114.000 120.000 C 114.000 116.686 116.686 114.000 120.000 114.000 C 127.732 114.000 134.000 120.268 134.000 128.000 L 134.000 168.000 C 134.000 169.105 134.895 170.000 136.000 170.000 C 139.314 170.000 142.000 172.686 142.000 176.000 ZM 124.000 94.000 C 129.523 94.000 134.000 89.523 134.000 84.000 C 134.000 78.477 129.523 74.000 124.000 74.000 C 118.477 74.000 114.000 78.477 114.000 84.000 C 114.000 89.523 118.477 94.000 124.000 94.000 ZM 230.000 128.000 C 230.000 184.333 184.333 230.000 128.000 230.000 C 71.667 230.000 26.000 184.333 26.000 128.000 C 26.000 71.667 71.667 26.000 128.000 26.000 C 184.306 26.066 229.934 71.694 230.000 128.000 ZM 218.000 128.000 C 218.000 78.294 177.706 38.000 128.000 38.000 C 78.294 38.000 38.000 78.294 38.000 128.000 C 38.000 177.706 78.294 218.000 128.000 218.000 C 177.683 217.945 217.945 177.683 218.000 128.000 Z"),
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
        return _info!!
    }

private var _info: ImageVector? = null
