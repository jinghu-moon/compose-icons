package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowFatLineUp: ImageVector
    get() {
        if (_arrowFatLineUp != null) return _arrowFatLineUp!!
        _arrowFatLineUp = phosphorThinIcon(
            name = "ArrowFatLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 226.830 117.170 L 130.830 21.170 C 130.080 20.419 129.062 19.997 128.000 19.997 C 126.938 19.997 125.920 20.419 125.170 21.170 L 29.170 117.170 C 28.025 118.314 27.682 120.036 28.302 121.531 C 28.921 123.027 30.381 124.001 32.000 124.000 L 76.000 124.000 L 76.000 184.000 C 76.000 186.209 77.791 188.000 80.000 188.000 L 176.000 188.000 C 178.209 188.000 180.000 186.209 180.000 184.000 L 180.000 124.000 L 224.000 124.000 C 225.619 124.001 227.079 123.027 227.698 121.531 C 228.318 120.036 227.975 118.314 226.830 117.170 ZM 176.000 116.000 C 173.791 116.000 172.000 117.791 172.000 120.000 L 172.000 180.000 L 84.000 180.000 L 84.000 120.000 C 84.000 117.791 82.209 116.000 80.000 116.000 L 41.660 116.000 L 128.000 29.660 L 214.340 116.000 ZM 180.000 216.000 C 180.000 218.209 178.209 220.000 176.000 220.000 L 80.000 220.000 C 77.791 220.000 76.000 218.209 76.000 216.000 C 76.000 213.791 77.791 212.000 80.000 212.000 L 176.000 212.000 C 178.209 212.000 180.000 213.791 180.000 216.000 Z"),
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
        return _arrowFatLineUp!!
    }

private var _arrowFatLineUp: ImageVector? = null
