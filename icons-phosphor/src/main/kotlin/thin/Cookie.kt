package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cookie: ImageVector
    get() {
        if (_cookie != null) return _cookie!!
        _cookie = phosphorThinIcon(
            name = "Cookie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 161.660 166.340 C 164.782 169.465 164.780 174.529 161.656 177.652 C 158.532 180.774 153.468 180.774 150.344 177.652 C 147.220 174.529 147.218 169.465 150.340 166.340 C 151.841 164.838 153.877 163.994 156.000 163.994 C 158.123 163.994 160.159 164.838 161.660 166.340 ZM 86.340 158.340 C 83.218 161.465 83.220 166.529 86.344 169.652 C 89.468 172.774 94.532 172.774 97.656 169.652 C 100.780 166.529 100.782 161.465 97.660 158.340 C 96.159 156.838 94.123 155.994 92.000 155.994 C 89.877 155.994 87.841 156.838 86.340 158.340 ZM 89.660 102.340 C 86.535 99.218 81.471 99.220 78.348 102.344 C 75.226 105.468 75.226 110.532 78.348 113.656 C 81.471 116.780 86.535 116.782 89.660 113.660 C 91.162 112.159 92.006 110.123 92.006 108.000 C 92.006 105.877 91.162 103.841 89.660 102.340 ZM 126.340 118.340 C 123.218 121.465 123.220 126.529 126.344 129.652 C 129.468 132.774 134.532 132.774 137.656 129.652 C 140.780 126.529 140.782 121.465 137.660 118.340 C 136.159 116.838 134.123 115.994 132.000 115.994 C 129.877 115.994 127.841 116.838 126.340 118.340 ZM 228.000 128.000 C 228.000 183.228 183.228 228.000 128.000 228.000 C 72.772 228.000 28.000 183.228 28.000 128.000 C 28.000 72.772 72.772 28.000 128.000 28.000 C 130.209 28.000 132.000 29.791 132.000 32.000 C 132.028 56.289 151.711 75.972 176.000 76.000 C 178.209 76.000 180.000 77.791 180.000 80.000 C 180.028 104.289 199.711 123.972 224.000 124.000 C 226.209 124.000 228.000 125.791 228.000 128.000 ZM 219.920 131.840 C 194.344 129.794 174.068 109.425 172.140 83.840 C 146.555 81.912 126.186 61.636 124.140 36.060 C 74.370 38.139 35.296 79.452 35.989 129.260 C 36.682 179.068 76.892 219.278 126.700 219.971 C 176.508 220.664 217.821 181.590 219.900 131.820 Z"),
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
        return _cookie!!
    }

private var _cookie: ImageVector? = null
