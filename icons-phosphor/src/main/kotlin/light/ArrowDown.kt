package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = phosphorLightIcon(
            name = "ArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.240 148.240 L 132.240 220.240 C 129.897 222.580 126.103 222.580 123.760 220.240 L 51.760 148.240 C 49.557 145.876 49.622 142.192 51.907 139.907 C 54.192 137.622 57.876 137.557 60.240 139.760 L 122.000 201.510 L 122.000 40.000 C 122.000 36.686 124.686 34.000 128.000 34.000 C 131.314 34.000 134.000 36.686 134.000 40.000 L 134.000 201.510 L 195.760 139.760 C 198.124 137.557 201.808 137.622 204.093 139.907 C 206.378 142.192 206.443 145.876 204.240 148.240 Z"),
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
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
