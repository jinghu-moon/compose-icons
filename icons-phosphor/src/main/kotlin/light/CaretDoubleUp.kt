package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretDoubleUp: ImageVector
    get() {
        if (_caretDoubleUp != null) return _caretDoubleUp!!
        _caretDoubleUp = phosphorLightIcon(
            name = "CaretDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.240 195.760 C 213.845 197.256 214.506 199.508 213.963 201.634 C 213.420 203.760 211.760 205.420 209.634 205.963 C 207.508 206.506 205.256 205.845 203.760 204.240 L 128.000 128.490 L 52.240 204.240 C 49.876 206.443 46.192 206.378 43.907 204.093 C 41.622 201.808 41.557 198.124 43.760 195.760 L 123.760 115.760 C 126.103 113.420 129.897 113.420 132.240 115.760 ZM 52.240 124.240 L 128.000 48.490 L 203.760 124.240 C 206.124 126.443 209.808 126.378 212.093 124.093 C 214.378 121.808 214.443 118.124 212.240 115.760 L 132.240 35.760 C 129.897 33.420 126.103 33.420 123.760 35.760 L 43.760 115.760 C 41.557 118.124 41.622 121.808 43.907 124.093 C 46.192 126.378 49.876 126.443 52.240 124.240 Z"),
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
        return _caretDoubleUp!!
    }

private var _caretDoubleUp: ImageVector? = null
