package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineDown: ImageVector
    get() {
        if (_arrowLineDown != null) return _arrowLineDown!!
        _arrowLineDown = phosphorLightIcon(
            name = "ArrowLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 51.760 116.240 C 49.557 113.876 49.622 110.192 51.907 107.907 C 54.192 105.622 57.876 105.557 60.240 107.760 L 122.000 169.510 L 122.000 32.000 C 122.000 28.686 124.686 26.000 128.000 26.000 C 131.314 26.000 134.000 28.686 134.000 32.000 L 134.000 169.510 L 195.760 107.760 C 198.124 105.557 201.808 105.622 204.093 107.907 C 206.378 110.192 206.443 113.876 204.240 116.240 L 132.240 188.240 C 129.897 190.580 126.103 190.580 123.760 188.240 ZM 216.000 210.000 L 40.000 210.000 C 36.686 210.000 34.000 212.686 34.000 216.000 C 34.000 219.314 36.686 222.000 40.000 222.000 L 216.000 222.000 C 219.314 222.000 222.000 219.314 222.000 216.000 C 222.000 212.686 219.314 210.000 216.000 210.000 Z"),
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
        return _arrowLineDown!!
    }

private var _arrowLineDown: ImageVector? = null
