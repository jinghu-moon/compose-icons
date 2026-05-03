package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineDownRight: ImageVector
    get() {
        if (_arrowLineDownRight != null) return _arrowLineDownRight!!
        _arrowLineDownRight = phosphorLightIcon(
            name = "ArrowLineDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 40.000 C 222.000 43.314 219.314 46.000 216.000 46.000 L 40.000 46.000 C 36.686 46.000 34.000 43.314 34.000 40.000 C 34.000 36.686 36.686 34.000 40.000 34.000 L 216.000 34.000 C 219.314 34.000 222.000 36.686 222.000 40.000 ZM 192.000 98.000 C 188.686 98.000 186.000 100.686 186.000 104.000 L 186.000 185.520 L 84.240 83.760 C 81.876 81.557 78.192 81.622 75.907 83.907 C 73.622 86.192 73.557 89.876 75.760 92.240 L 177.520 194.000 L 96.000 194.000 C 92.686 194.000 90.000 196.686 90.000 200.000 C 90.000 203.314 92.686 206.000 96.000 206.000 L 192.000 206.000 C 195.314 206.000 198.000 203.314 198.000 200.000 L 198.000 104.000 C 198.000 100.686 195.314 98.000 192.000 98.000 Z"),
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
        return _arrowLineDownRight!!
    }

private var _arrowLineDownRight: ImageVector? = null
