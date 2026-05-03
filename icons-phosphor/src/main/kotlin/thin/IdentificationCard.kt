package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.IdentificationCard: ImageVector
    get() {
        if (_identificationCard != null) return _identificationCard!!
        _identificationCard = phosphorThinIcon(
            name = "IdentificationCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 196.000 112.000 C 196.000 114.209 194.209 116.000 192.000 116.000 L 152.000 116.000 C 149.791 116.000 148.000 114.209 148.000 112.000 C 148.000 109.791 149.791 108.000 152.000 108.000 L 192.000 108.000 C 194.209 108.000 196.000 109.791 196.000 112.000 ZM 192.000 140.000 L 152.000 140.000 C 149.791 140.000 148.000 141.791 148.000 144.000 C 148.000 146.209 149.791 148.000 152.000 148.000 L 192.000 148.000 C 194.209 148.000 196.000 146.209 196.000 144.000 C 196.000 141.791 194.209 140.000 192.000 140.000 ZM 228.000 56.000 L 228.000 200.000 C 228.000 206.627 222.627 212.000 216.000 212.000 L 40.000 212.000 C 33.373 212.000 28.000 206.627 28.000 200.000 L 28.000 56.000 C 28.000 49.373 33.373 44.000 40.000 44.000 L 216.000 44.000 C 222.627 44.000 228.000 49.373 228.000 56.000 ZM 220.000 56.000 C 220.000 53.791 218.209 52.000 216.000 52.000 L 40.000 52.000 C 37.791 52.000 36.000 53.791 36.000 56.000 L 36.000 200.000 C 36.000 202.209 37.791 204.000 40.000 204.000 L 216.000 204.000 C 218.209 204.000 220.000 202.209 220.000 200.000 ZM 131.870 167.000 C 132.290 168.404 131.909 169.925 130.877 170.965 C 129.845 172.005 128.326 172.397 126.920 171.988 C 125.513 171.578 124.442 170.432 124.130 169.000 C 121.060 157.000 109.000 148.000 96.000 148.000 C 83.000 148.000 71.000 157.000 67.870 169.000 C 67.414 170.765 65.823 171.999 64.000 172.000 C 63.662 172.000 63.326 171.957 63.000 171.870 C 60.864 171.316 59.579 169.137 60.130 167.000 C 63.019 156.433 70.527 147.738 80.560 143.340 C 70.250 136.525 65.627 123.756 69.186 111.920 C 72.744 100.085 83.641 91.982 96.000 91.982 C 108.359 91.982 119.256 100.085 122.814 111.920 C 126.373 123.756 121.750 136.525 111.440 143.340 C 121.480 147.728 128.992 156.428 131.870 167.000 ZM 96.000 140.000 C 107.046 140.000 116.000 131.046 116.000 120.000 C 116.000 108.954 107.046 100.000 96.000 100.000 C 84.954 100.000 76.000 108.954 76.000 120.000 C 76.000 131.046 84.954 140.000 96.000 140.000 Z"),
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
        return _identificationCard!!
    }

private var _identificationCard: ImageVector? = null
