package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.X: ImageVector
    get() {
        if (_x != null) return _x!!
        _x = phosphorLightIcon(
            name = "X",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.240 195.760 C 205.845 197.256 206.506 199.508 205.963 201.634 C 205.420 203.760 203.760 205.420 201.634 205.963 C 199.508 206.506 197.256 205.845 195.760 204.240 L 128.000 136.490 L 60.240 204.240 C 57.876 206.443 54.192 206.378 51.907 204.093 C 49.622 201.808 49.557 198.124 51.760 195.760 L 119.510 128.000 L 51.760 60.240 C 49.557 57.876 49.622 54.192 51.907 51.907 C 54.192 49.622 57.876 49.557 60.240 51.760 L 128.000 119.510 L 195.760 51.760 C 198.124 49.557 201.808 49.622 204.093 51.907 C 206.378 54.192 206.443 57.876 204.240 60.240 L 136.490 128.000 Z"),
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
        return _x!!
    }

private var _x: ImageVector? = null
