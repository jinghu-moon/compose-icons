package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GoogleCardboardLogo: ImageVector
    get() {
        if (_googleCardboardLogo != null) return _googleCardboardLogo!!
        _googleCardboardLogo = phosphorThinIcon(
            name = "GoogleCardboardLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 52.000 L 32.000 52.000 C 25.373 52.000 20.000 57.373 20.000 64.000 L 20.000 192.000 C 20.000 198.627 25.373 204.000 32.000 204.000 L 96.000 204.000 C 97.061 204.001 98.079 203.580 98.830 202.830 L 125.170 176.490 C 126.750 174.969 129.250 174.969 130.830 176.490 L 157.170 202.830 C 157.921 203.580 158.939 204.001 160.000 204.000 L 224.000 204.000 C 230.627 204.000 236.000 198.627 236.000 192.000 L 236.000 64.000 C 236.000 57.373 230.627 52.000 224.000 52.000 ZM 228.000 192.000 C 228.000 194.209 226.209 196.000 224.000 196.000 L 161.660 196.000 L 136.490 170.830 C 134.238 168.571 131.180 167.301 127.990 167.301 C 124.800 167.301 121.742 168.571 119.490 170.830 L 94.340 196.000 L 32.000 196.000 C 29.791 196.000 28.000 194.209 28.000 192.000 L 28.000 64.000 C 28.000 61.791 29.791 60.000 32.000 60.000 L 224.000 60.000 C 226.209 60.000 228.000 61.791 228.000 64.000 ZM 80.000 100.000 C 64.536 100.000 52.000 112.536 52.000 128.000 C 52.000 143.464 64.536 156.000 80.000 156.000 C 95.464 156.000 108.000 143.464 108.000 128.000 C 108.000 112.536 95.464 100.000 80.000 100.000 ZM 80.000 148.000 C 68.954 148.000 60.000 139.046 60.000 128.000 C 60.000 116.954 68.954 108.000 80.000 108.000 C 91.046 108.000 100.000 116.954 100.000 128.000 C 100.000 139.046 91.046 148.000 80.000 148.000 ZM 176.000 100.000 C 160.536 100.000 148.000 112.536 148.000 128.000 C 148.000 143.464 160.536 156.000 176.000 156.000 C 191.464 156.000 204.000 143.464 204.000 128.000 C 204.000 112.536 191.464 100.000 176.000 100.000 ZM 176.000 148.000 C 164.954 148.000 156.000 139.046 156.000 128.000 C 156.000 116.954 164.954 108.000 176.000 108.000 C 187.046 108.000 196.000 116.954 196.000 128.000 C 196.000 139.046 187.046 148.000 176.000 148.000 Z"),
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
        return _googleCardboardLogo!!
    }

private var _googleCardboardLogo: ImageVector? = null
