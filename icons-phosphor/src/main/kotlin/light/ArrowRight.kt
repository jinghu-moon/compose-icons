package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) return _arrowRight!!
        _arrowRight = phosphorLightIcon(
            name = "ArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.240 132.240 L 148.240 204.240 C 145.876 206.443 142.192 206.378 139.907 204.093 C 137.622 201.808 137.557 198.124 139.760 195.760 L 201.510 134.000 L 40.000 134.000 C 36.686 134.000 34.000 131.314 34.000 128.000 C 34.000 124.686 36.686 122.000 40.000 122.000 L 201.510 122.000 L 139.760 60.240 C 137.557 57.876 137.622 54.192 139.907 51.907 C 142.192 49.622 145.876 49.557 148.240 51.760 L 220.240 123.760 C 222.580 126.103 222.580 129.897 220.240 132.240 Z"),
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
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
