package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowFatUp: ImageVector
    get() {
        if (_arrowFatUp != null) return _arrowFatUp!!
        _arrowFatUp = phosphorLightIcon(
            name = "ArrowFatUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.240 115.760 L 132.240 19.760 C 129.897 17.420 126.103 17.420 123.760 19.760 L 27.760 115.760 C 26.046 117.476 25.534 120.055 26.462 122.295 C 27.389 124.536 29.575 125.998 32.000 126.000 L 74.000 126.000 L 74.000 208.000 C 74.000 215.732 80.268 222.000 88.000 222.000 L 168.000 222.000 C 175.732 222.000 182.000 215.732 182.000 208.000 L 182.000 126.000 L 224.000 126.000 C 226.425 125.998 228.611 124.536 229.538 122.295 C 230.466 120.055 229.954 117.476 228.240 115.760 ZM 176.000 114.000 C 172.686 114.000 170.000 116.686 170.000 120.000 L 170.000 208.000 C 170.000 209.105 169.105 210.000 168.000 210.000 L 88.000 210.000 C 86.895 210.000 86.000 209.105 86.000 208.000 L 86.000 120.000 C 86.000 116.686 83.314 114.000 80.000 114.000 L 46.490 114.000 L 128.000 32.490 L 209.510 114.000 Z"),
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
        return _arrowFatUp!!
    }

private var _arrowFatUp: ImageVector? = null
