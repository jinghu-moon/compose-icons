package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsDownUp: ImageVector
    get() {
        if (_arrowsDownUp != null) return _arrowsDownUp!!
        _arrowsDownUp = phosphorLightIcon(
            name = "ArrowsDownUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 116.240 171.760 C 118.580 174.103 118.580 177.897 116.240 180.240 L 84.240 212.240 C 81.897 214.580 78.103 214.580 75.760 212.240 L 43.760 180.240 C 41.557 177.876 41.622 174.192 43.907 171.907 C 46.192 169.622 49.876 169.557 52.240 171.760 L 74.000 193.510 L 74.000 48.000 C 74.000 44.686 76.686 42.000 80.000 42.000 C 83.314 42.000 86.000 44.686 86.000 48.000 L 86.000 193.510 L 107.760 171.760 C 110.103 169.420 113.897 169.420 116.240 171.760 ZM 212.240 75.760 L 180.240 43.760 C 177.897 41.420 174.103 41.420 171.760 43.760 L 139.760 75.760 C 137.557 78.124 137.622 81.808 139.907 84.093 C 142.192 86.378 145.876 86.443 148.240 84.240 L 170.000 62.490 L 170.000 208.000 C 170.000 211.314 172.686 214.000 176.000 214.000 C 179.314 214.000 182.000 211.314 182.000 208.000 L 182.000 62.490 L 203.760 84.240 C 206.124 86.443 209.808 86.378 212.093 84.093 C 214.378 81.808 214.443 78.124 212.240 75.760 Z"),
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
        return _arrowsDownUp!!
    }

private var _arrowsDownUp: ImageVector? = null
