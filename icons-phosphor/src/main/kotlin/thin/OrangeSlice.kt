package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) return _orangeSlice!!
        _orangeSlice = phosphorThinIcon(
            name = "OrangeSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 84.000 L 8.000 84.000 C 5.791 84.000 4.000 85.791 4.000 88.000 C 4.000 156.483 59.517 212.000 128.000 212.000 C 196.483 212.000 252.000 156.483 252.000 88.000 C 252.000 85.791 250.209 84.000 248.000 84.000 ZM 71.530 150.130 L 124.000 97.660 L 124.000 171.900 C 104.506 170.984 85.946 163.284 71.530 150.130 ZM 65.870 144.470 C 52.716 130.054 45.016 111.494 44.100 92.000 L 118.340 92.000 ZM 132.000 97.660 L 184.470 150.130 C 170.054 163.284 151.494 170.984 132.000 171.900 ZM 190.130 144.470 L 137.660 92.000 L 211.900 92.000 C 210.984 111.494 203.284 130.054 190.130 144.470 ZM 128.000 204.000 C 65.522 203.927 14.297 154.439 12.070 92.000 L 36.070 92.000 C 38.247 141.180 78.752 179.932 127.980 179.932 C 177.208 179.932 217.713 141.180 219.890 92.000 L 243.890 92.000 C 241.663 154.423 190.463 203.905 128.000 204.000 Z"),
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
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null
