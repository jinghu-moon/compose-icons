package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowDownRight: ImageVector
    get() {
        if (_arrowElbowDownRight != null) return _arrowElbowDownRight!!
        _arrowElbowDownRight = phosphorLightIcon(
            name = "ArrowElbowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.240 180.240 L 172.240 228.240 C 169.876 230.443 166.192 230.378 163.907 228.093 C 161.622 225.808 161.557 222.124 163.760 219.760 L 201.510 182.000 L 72.000 182.000 C 68.686 182.000 66.000 179.314 66.000 176.000 L 66.000 32.000 C 66.000 28.686 68.686 26.000 72.000 26.000 C 75.314 26.000 78.000 28.686 78.000 32.000 L 78.000 170.000 L 201.510 170.000 L 163.760 132.240 C 162.155 130.744 161.494 128.492 162.037 126.366 C 162.580 124.240 164.240 122.580 166.366 122.037 C 168.492 121.494 170.744 122.155 172.240 123.760 L 220.240 171.760 C 222.580 174.103 222.580 177.897 220.240 180.240 Z"),
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
        return _arrowElbowDownRight!!
    }

private var _arrowElbowDownRight: ImageVector? = null
