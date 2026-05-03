package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Info: ImageVector
    get() {
        if (_info != null) return _info!!
        _info = phosphorThinIcon(
            name = "Info",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 140.000 176.000 C 140.000 178.209 138.209 180.000 136.000 180.000 C 129.373 180.000 124.000 174.627 124.000 168.000 L 124.000 128.000 C 124.000 125.791 122.209 124.000 120.000 124.000 C 117.791 124.000 116.000 122.209 116.000 120.000 C 116.000 117.791 117.791 116.000 120.000 116.000 C 126.627 116.000 132.000 121.373 132.000 128.000 L 132.000 168.000 C 132.000 170.209 133.791 172.000 136.000 172.000 C 138.209 172.000 140.000 173.791 140.000 176.000 ZM 124.000 92.000 C 128.418 92.000 132.000 88.418 132.000 84.000 C 132.000 79.582 128.418 76.000 124.000 76.000 C 119.582 76.000 116.000 79.582 116.000 84.000 C 116.000 88.418 119.582 92.000 124.000 92.000 ZM 228.000 128.000 C 228.000 183.228 183.228 228.000 128.000 228.000 C 72.772 228.000 28.000 183.228 28.000 128.000 C 28.000 72.772 72.772 28.000 128.000 28.000 C 183.203 28.061 227.939 72.797 228.000 128.000 ZM 220.000 128.000 C 220.000 77.190 178.810 36.000 128.000 36.000 C 77.190 36.000 36.000 77.190 36.000 128.000 C 36.000 178.810 77.190 220.000 128.000 220.000 C 178.787 219.945 219.945 178.787 220.000 128.000 Z"),
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
        return _info!!
    }

private var _info: ImageVector? = null
