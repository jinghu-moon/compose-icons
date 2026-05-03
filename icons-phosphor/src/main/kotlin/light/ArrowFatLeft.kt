package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowFatLeft: ImageVector
    get() {
        if (_arrowFatLeft != null) return _arrowFatLeft!!
        _arrowFatLeft = phosphorLightIcon(
            name = "ArrowFatLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 74.000 L 126.000 74.000 L 126.000 32.000 C 125.998 29.575 124.536 27.389 122.295 26.462 C 120.055 25.534 117.476 26.046 115.760 27.760 L 19.760 123.760 C 17.420 126.103 17.420 129.897 19.760 132.240 L 115.760 228.240 C 117.476 229.954 120.055 230.466 122.295 229.538 C 124.536 228.611 125.998 226.425 126.000 224.000 L 126.000 182.000 L 208.000 182.000 C 215.732 182.000 222.000 175.732 222.000 168.000 L 222.000 88.000 C 222.000 80.268 215.732 74.000 208.000 74.000 ZM 210.000 168.000 C 210.000 169.105 209.105 170.000 208.000 170.000 L 120.000 170.000 C 116.686 170.000 114.000 172.686 114.000 176.000 L 114.000 209.510 L 32.490 128.000 L 114.000 46.490 L 114.000 80.000 C 114.000 83.314 116.686 86.000 120.000 86.000 L 208.000 86.000 C 209.105 86.000 210.000 86.895 210.000 88.000 Z"),
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
        return _arrowFatLeft!!
    }

private var _arrowFatLeft: ImageVector? = null
