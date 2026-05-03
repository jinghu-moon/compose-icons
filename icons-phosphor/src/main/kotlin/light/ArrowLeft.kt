package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) return _arrowLeft!!
        _arrowLeft = phosphorLightIcon(
            name = "ArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 128.000 C 222.000 131.314 219.314 134.000 216.000 134.000 L 54.490 134.000 L 116.240 195.760 C 117.845 197.256 118.506 199.508 117.963 201.634 C 117.420 203.760 115.760 205.420 113.634 205.963 C 111.508 206.506 109.256 205.845 107.760 204.240 L 35.760 132.240 C 33.420 129.897 33.420 126.103 35.760 123.760 L 107.760 51.760 C 110.124 49.557 113.808 49.622 116.093 51.907 C 118.378 54.192 118.443 57.876 116.240 60.240 L 54.490 122.000 L 216.000 122.000 C 219.314 122.000 222.000 124.686 222.000 128.000 Z"),
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
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
