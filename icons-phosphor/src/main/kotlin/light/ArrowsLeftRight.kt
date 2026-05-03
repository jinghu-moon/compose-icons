package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsLeftRight: ImageVector
    get() {
        if (_arrowsLeftRight != null) return _arrowsLeftRight!!
        _arrowsLeftRight = phosphorLightIcon(
            name = "ArrowsLeftRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.240 171.760 C 214.580 174.103 214.580 177.897 212.240 180.240 L 180.240 212.240 C 177.876 214.443 174.192 214.378 171.907 212.093 C 169.622 209.808 169.557 206.124 171.760 203.760 L 193.510 182.000 L 48.000 182.000 C 44.686 182.000 42.000 179.314 42.000 176.000 C 42.000 172.686 44.686 170.000 48.000 170.000 L 193.510 170.000 L 171.760 148.240 C 169.557 145.876 169.622 142.192 171.907 139.907 C 174.192 137.622 177.876 137.557 180.240 139.760 ZM 75.760 116.240 C 78.124 118.443 81.808 118.378 84.093 116.093 C 86.378 113.808 86.443 110.124 84.240 107.760 L 62.490 86.000 L 208.000 86.000 C 211.314 86.000 214.000 83.314 214.000 80.000 C 214.000 76.686 211.314 74.000 208.000 74.000 L 62.490 74.000 L 84.240 52.240 C 86.443 49.876 86.378 46.192 84.093 43.907 C 81.808 41.622 78.124 41.557 75.760 43.760 L 43.760 75.760 C 41.420 78.103 41.420 81.897 43.760 84.240 Z"),
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
        return _arrowsLeftRight!!
    }

private var _arrowsLeftRight: ImageVector? = null
