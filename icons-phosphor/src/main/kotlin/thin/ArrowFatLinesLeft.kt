package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowFatLinesLeft: ImageVector
    get() {
        if (_arrowFatLinesLeft != null) return _arrowFatLinesLeft!!
        _arrowFatLinesLeft = phosphorThinIcon(
            name = "ArrowFatLinesLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 76.000 L 124.000 76.000 L 124.000 32.000 C 124.001 30.381 123.027 28.921 121.531 28.302 C 120.036 27.682 118.314 28.025 117.170 29.170 L 21.170 125.170 C 20.419 125.920 19.997 126.938 19.997 128.000 C 19.997 129.062 20.419 130.080 21.170 130.830 L 117.170 226.830 C 118.314 227.975 120.036 228.318 121.531 227.698 C 123.027 227.079 124.001 225.619 124.000 224.000 L 124.000 180.000 L 152.000 180.000 C 154.209 180.000 156.000 178.209 156.000 176.000 L 156.000 80.000 C 156.000 77.791 154.209 76.000 152.000 76.000 ZM 148.000 172.000 L 120.000 172.000 C 117.791 172.000 116.000 173.791 116.000 176.000 L 116.000 214.340 L 29.660 128.000 L 116.000 41.660 L 116.000 80.000 C 116.000 82.209 117.791 84.000 120.000 84.000 L 148.000 84.000 ZM 220.000 80.000 L 220.000 176.000 C 220.000 178.209 218.209 180.000 216.000 180.000 C 213.791 180.000 212.000 178.209 212.000 176.000 L 212.000 80.000 C 212.000 77.791 213.791 76.000 216.000 76.000 C 218.209 76.000 220.000 77.791 220.000 80.000 ZM 188.000 80.000 L 188.000 176.000 C 188.000 178.209 186.209 180.000 184.000 180.000 C 181.791 180.000 180.000 178.209 180.000 176.000 L 180.000 80.000 C 180.000 77.791 181.791 76.000 184.000 76.000 C 186.209 76.000 188.000 77.791 188.000 80.000 Z"),
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
        return _arrowFatLinesLeft!!
    }

private var _arrowFatLinesLeft: ImageVector? = null
