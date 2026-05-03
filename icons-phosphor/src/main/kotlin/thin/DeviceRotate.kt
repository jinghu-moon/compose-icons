package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DeviceRotate: ImageVector
    get() {
        if (_deviceRotate != null) return _deviceRotate!!
        _deviceRotate = phosphorThinIcon(
            name = "DeviceRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 202.830 218.830 L 178.830 242.830 C 177.267 244.393 174.733 244.393 173.170 242.830 C 171.607 241.267 171.607 238.733 173.170 237.170 L 190.340 220.000 L 80.000 220.000 C 68.954 220.000 60.000 211.046 60.000 200.000 L 60.000 104.000 C 60.000 101.791 61.791 100.000 64.000 100.000 C 66.209 100.000 68.000 101.791 68.000 104.000 L 68.000 200.000 C 68.000 206.627 73.373 212.000 80.000 212.000 L 190.340 212.000 L 173.170 194.830 C 171.607 193.267 171.607 190.733 173.170 189.170 C 174.733 187.607 177.267 187.607 178.830 189.170 L 202.830 213.170 C 203.581 213.920 204.003 214.938 204.003 216.000 C 204.003 217.062 203.581 218.080 202.830 218.830 ZM 80.000 68.000 C 81.619 68.001 83.079 67.027 83.698 65.531 C 84.318 64.036 83.975 62.314 82.830 61.170 L 65.660 44.000 L 176.000 44.000 C 182.627 44.000 188.000 49.373 188.000 56.000 L 188.000 152.000 C 188.000 154.209 189.791 156.000 192.000 156.000 C 194.209 156.000 196.000 154.209 196.000 152.000 L 196.000 56.000 C 196.000 44.954 187.046 36.000 176.000 36.000 L 65.660 36.000 L 82.830 18.830 C 84.393 17.267 84.393 14.733 82.830 13.170 C 81.267 11.607 78.733 11.607 77.170 13.170 L 53.170 37.170 C 52.419 37.920 51.997 38.938 51.997 40.000 C 51.997 41.062 52.419 42.080 53.170 42.830 L 77.170 66.830 C 77.921 67.580 78.939 68.001 80.000 68.000 Z"),
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
        return _deviceRotate!!
    }

private var _deviceRotate: ImageVector? = null
