package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineLeft: ImageVector
    get() {
        if (_arrowLineLeft != null) return _arrowLineLeft!!
        _arrowLineLeft = phosphorLightIcon(
            name = "ArrowLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 128.000 C 230.000 131.314 227.314 134.000 224.000 134.000 L 86.490 134.000 L 148.240 195.760 C 149.845 197.256 150.506 199.508 149.963 201.634 C 149.420 203.760 147.760 205.420 145.634 205.963 C 143.508 206.506 141.256 205.845 139.760 204.240 L 67.760 132.240 C 65.420 129.897 65.420 126.103 67.760 123.760 L 139.760 51.760 C 142.124 49.557 145.808 49.622 148.093 51.907 C 150.378 54.192 150.443 57.876 148.240 60.240 L 86.490 122.000 L 224.000 122.000 C 227.314 122.000 230.000 124.686 230.000 128.000 ZM 40.000 34.000 C 36.686 34.000 34.000 36.686 34.000 40.000 L 34.000 216.000 C 34.000 219.314 36.686 222.000 40.000 222.000 C 43.314 222.000 46.000 219.314 46.000 216.000 L 46.000 40.000 C 46.000 36.686 43.314 34.000 40.000 34.000 Z"),
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
        return _arrowLineLeft!!
    }

private var _arrowLineLeft: ImageVector? = null
