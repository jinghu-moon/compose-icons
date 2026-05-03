package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Coffee: ImageVector
    get() {
        if (_coffee != null) return _coffee!!
        _coffee = phosphorThinIcon(
            name = "Coffee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 84.000 56.000 L 84.000 24.000 C 84.000 21.791 85.791 20.000 88.000 20.000 C 90.209 20.000 92.000 21.791 92.000 24.000 L 92.000 56.000 C 92.000 58.209 90.209 60.000 88.000 60.000 C 85.791 60.000 84.000 58.209 84.000 56.000 ZM 120.000 60.000 C 122.209 60.000 124.000 58.209 124.000 56.000 L 124.000 24.000 C 124.000 21.791 122.209 20.000 120.000 20.000 C 117.791 20.000 116.000 21.791 116.000 24.000 L 116.000 56.000 C 116.000 58.209 117.791 60.000 120.000 60.000 ZM 152.000 60.000 C 154.209 60.000 156.000 58.209 156.000 56.000 L 156.000 24.000 C 156.000 21.791 154.209 20.000 152.000 20.000 C 149.791 20.000 148.000 21.791 148.000 24.000 L 148.000 56.000 C 148.000 58.209 149.791 60.000 152.000 60.000 ZM 244.000 120.000 L 244.000 128.000 C 244.000 147.882 227.882 164.000 208.000 164.000 L 207.590 164.000 C 201.317 183.520 188.739 200.404 171.830 212.000 L 208.000 212.000 C 210.209 212.000 212.000 213.791 212.000 216.000 C 212.000 218.209 210.209 220.000 208.000 220.000 L 32.000 220.000 C 29.791 220.000 28.000 218.209 28.000 216.000 C 28.000 213.791 29.791 212.000 32.000 212.000 L 68.170 212.000 C 43.086 194.824 28.063 166.401 28.000 136.000 L 28.000 88.000 C 28.000 85.791 29.791 84.000 32.000 84.000 L 208.000 84.000 C 227.882 84.000 244.000 100.118 244.000 120.000 ZM 204.000 136.000 L 204.000 92.000 L 36.000 92.000 L 36.000 136.000 C 36.066 168.511 54.826 198.086 84.210 212.000 L 155.790 212.000 C 185.174 198.086 203.934 168.511 204.000 136.000 ZM 236.000 120.000 C 235.999 106.082 225.775 94.278 212.000 92.290 L 212.000 136.000 C 211.998 142.707 211.260 149.394 209.800 155.940 C 224.534 154.991 235.999 142.764 236.000 128.000 Z"),
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
        return _coffee!!
    }

private var _coffee: ImageVector? = null
