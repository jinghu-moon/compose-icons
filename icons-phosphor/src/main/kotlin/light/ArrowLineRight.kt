package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineRight: ImageVector
    get() {
        if (_arrowLineRight != null) return _arrowLineRight!!
        _arrowLineRight = phosphorLightIcon(
            name = "ArrowLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 188.240 123.760 C 190.580 126.103 190.580 129.897 188.240 132.240 L 116.240 204.240 C 113.876 206.443 110.192 206.378 107.907 204.093 C 105.622 201.808 105.557 198.124 107.760 195.760 L 169.510 134.000 L 32.000 134.000 C 28.686 134.000 26.000 131.314 26.000 128.000 C 26.000 124.686 28.686 122.000 32.000 122.000 L 169.510 122.000 L 107.760 60.240 C 105.557 57.876 105.622 54.192 107.907 51.907 C 110.192 49.622 113.876 49.557 116.240 51.760 ZM 216.000 34.000 C 212.686 34.000 210.000 36.686 210.000 40.000 L 210.000 216.000 C 210.000 219.314 212.686 222.000 216.000 222.000 C 219.314 222.000 222.000 219.314 222.000 216.000 L 222.000 40.000 C 222.000 36.686 219.314 34.000 216.000 34.000 Z"),
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
        return _arrowLineRight!!
    }

private var _arrowLineRight: ImageVector? = null
