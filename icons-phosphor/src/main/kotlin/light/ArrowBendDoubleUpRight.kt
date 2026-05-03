package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendDoubleUpRight: ImageVector
    get() {
        if (_arrowBendDoubleUpRight != null) return _arrowBendDoubleUpRight!!
        _arrowBendDoubleUpRight = phosphorLightIcon(
            name = "ArrowBendDoubleUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.240 108.240 L 180.240 156.240 C 177.876 158.443 174.192 158.378 171.907 156.093 C 169.622 153.808 169.557 150.124 171.760 147.760 L 215.510 104.000 L 171.760 60.240 C 169.557 57.876 169.622 54.192 171.907 51.907 C 174.192 49.622 177.876 49.557 180.240 51.760 L 228.240 99.760 C 230.580 102.103 230.580 105.897 228.240 108.240 ZM 180.240 99.760 L 132.240 51.760 C 130.744 50.155 128.492 49.494 126.366 50.037 C 124.240 50.580 122.580 52.240 122.037 54.366 C 121.494 56.492 122.155 58.744 123.760 60.240 L 161.510 98.000 L 128.000 98.000 C 71.694 98.066 26.066 143.694 26.000 200.000 C 26.000 203.314 28.686 206.000 32.000 206.000 C 35.314 206.000 38.000 203.314 38.000 200.000 C 38.055 150.317 78.317 110.055 128.000 110.000 L 161.510 110.000 L 123.760 147.760 C 122.155 149.256 121.494 151.508 122.037 153.634 C 122.580 155.760 124.240 157.420 126.366 157.963 C 128.492 158.506 130.744 157.845 132.240 156.240 L 180.240 108.240 C 182.580 105.897 182.580 102.103 180.240 99.760 Z"),
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
        return _arrowBendDoubleUpRight!!
    }

private var _arrowBendDoubleUpRight: ImageVector? = null
