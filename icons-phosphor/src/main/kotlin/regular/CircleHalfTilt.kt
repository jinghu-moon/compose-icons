package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) return _circleHalfTilt!!
        _circleHalfTilt = phosphorRegularIcon(
            name = "CircleHalfTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 201.540 54.460 C 160.925 13.845 95.075 13.845 54.460 54.460 C 13.845 95.075 13.845 160.925 54.460 201.540 C 95.075 242.155 160.925 242.155 201.540 201.540 C 242.155 160.925 242.155 95.075 201.540 54.460 ZM 184.000 195.870 C 179.068 199.947 173.703 203.468 168.000 206.370 L 168.000 99.310 L 184.000 83.310 ZM 104.000 163.310 L 120.000 147.310 L 120.000 215.590 C 114.586 215.084 109.230 214.080 104.000 212.590 ZM 88.000 206.370 C 82.180 203.407 76.712 199.797 71.700 195.610 L 88.000 179.310 ZM 136.000 131.310 L 152.000 115.310 L 152.000 212.630 C 146.770 214.120 141.414 215.124 136.000 215.630 ZM 40.000 128.000 C 40.009 93.867 59.755 62.818 90.664 48.337 C 121.572 33.855 158.067 38.553 184.300 60.390 L 60.380 184.310 C 47.163 168.528 39.945 148.585 40.000 128.000 ZM 200.000 178.590 L 200.000 77.410 C 221.327 107.765 221.327 148.235 200.000 178.590 Z"),
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
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
