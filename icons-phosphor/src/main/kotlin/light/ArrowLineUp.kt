package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineUp: ImageVector
    get() {
        if (_arrowLineUp != null) return _arrowLineUp!!
        _arrowLineUp = phosphorLightIcon(
            name = "ArrowLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.240 139.760 C 205.845 141.256 206.506 143.508 205.963 145.634 C 205.420 147.760 203.760 149.420 201.634 149.963 C 199.508 150.506 197.256 149.845 195.760 148.240 L 134.000 86.490 L 134.000 224.000 C 134.000 227.314 131.314 230.000 128.000 230.000 C 124.686 230.000 122.000 227.314 122.000 224.000 L 122.000 86.490 L 60.240 148.240 C 57.876 150.443 54.192 150.378 51.907 148.093 C 49.622 145.808 49.557 142.124 51.760 139.760 L 123.760 67.760 C 126.103 65.420 129.897 65.420 132.240 67.760 ZM 216.000 34.000 L 40.000 34.000 C 36.686 34.000 34.000 36.686 34.000 40.000 C 34.000 43.314 36.686 46.000 40.000 46.000 L 216.000 46.000 C 219.314 46.000 222.000 43.314 222.000 40.000 C 222.000 36.686 219.314 34.000 216.000 34.000 Z"),
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
        return _arrowLineUp!!
    }

private var _arrowLineUp: ImageVector? = null
