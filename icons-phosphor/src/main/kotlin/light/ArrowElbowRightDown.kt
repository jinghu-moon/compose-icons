package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowRightDown: ImageVector
    get() {
        if (_arrowElbowRightDown != null) return _arrowElbowRightDown!!
        _arrowElbowRightDown = phosphorLightIcon(
            name = "ArrowElbowRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.240 164.240 L 180.240 212.240 C 177.897 214.580 174.103 214.580 171.760 212.240 L 123.760 164.240 C 122.155 162.744 121.494 160.492 122.037 158.366 C 122.580 156.240 124.240 154.580 126.366 154.037 C 128.492 153.494 130.744 154.155 132.240 155.760 L 170.000 193.510 L 170.000 70.000 L 32.000 70.000 C 28.686 70.000 26.000 67.314 26.000 64.000 C 26.000 60.686 28.686 58.000 32.000 58.000 L 176.000 58.000 C 179.314 58.000 182.000 60.686 182.000 64.000 L 182.000 193.510 L 219.760 155.760 C 222.124 153.557 225.808 153.622 228.093 155.907 C 230.378 158.192 230.443 161.876 228.240 164.240 Z"),
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
        return _arrowElbowRightDown!!
    }

private var _arrowElbowRightDown: ImageVector? = null
