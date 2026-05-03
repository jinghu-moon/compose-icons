package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretDoubleLeft: ImageVector
    get() {
        if (_caretDoubleLeft != null) return _caretDoubleLeft!!
        _caretDoubleLeft = phosphorLightIcon(
            name = "CaretDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.240 203.760 C 205.845 205.256 206.506 207.508 205.963 209.634 C 205.420 211.760 203.760 213.420 201.634 213.963 C 199.508 214.506 197.256 213.845 195.760 212.240 L 115.760 132.240 C 113.420 129.897 113.420 126.103 115.760 123.760 L 195.760 43.760 C 198.124 41.557 201.808 41.622 204.093 43.907 C 206.378 46.192 206.443 49.876 204.240 52.240 L 128.490 128.000 ZM 48.490 128.000 L 124.240 52.240 C 126.443 49.876 126.378 46.192 124.093 43.907 C 121.808 41.622 118.124 41.557 115.760 43.760 L 35.760 123.760 C 33.420 126.103 33.420 129.897 35.760 132.240 L 115.760 212.240 C 117.256 213.845 119.508 214.506 121.634 213.963 C 123.760 213.420 125.420 211.760 125.963 209.634 C 126.506 207.508 125.845 205.256 124.240 203.760 Z"),
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
        return _caretDoubleLeft!!
    }

private var _caretDoubleLeft: ImageVector? = null
