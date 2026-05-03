package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowCircleDown: ImageVector
    get() {
        if (_arrowCircleDown != null) return _arrowCircleDown!!
        _arrowCircleDown = phosphorLightIcon(
            name = "ArrowCircleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 164.240 131.760 C 166.580 134.103 166.580 137.897 164.240 140.240 L 132.240 172.240 C 129.897 174.580 126.103 174.580 123.760 172.240 L 91.760 140.240 C 89.557 137.876 89.622 134.192 91.907 131.907 C 94.192 129.622 97.876 129.557 100.240 131.760 L 122.000 153.510 L 122.000 88.000 C 122.000 84.686 124.686 82.000 128.000 82.000 C 131.314 82.000 134.000 84.686 134.000 88.000 L 134.000 153.510 L 155.760 131.760 C 158.103 129.420 161.897 129.420 164.240 131.760 Z"),
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
        return _arrowCircleDown!!
    }

private var _arrowCircleDown: ImageVector? = null
