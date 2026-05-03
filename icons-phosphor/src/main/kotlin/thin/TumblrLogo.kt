package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TumblrLogo: ImageVector
    get() {
        if (_tumblrLogo != null) return _tumblrLogo!!
        _tumblrLogo = phosphorThinIcon(
            name = "TumblrLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 116.000 C 194.209 116.000 196.000 114.209 196.000 112.000 L 196.000 72.000 C 196.000 69.791 194.209 68.000 192.000 68.000 L 148.000 68.000 L 148.000 24.000 C 148.000 21.791 146.209 20.000 144.000 20.000 L 112.000 20.000 C 109.791 20.000 108.000 21.791 108.000 24.000 C 107.972 48.289 88.289 67.972 64.000 68.000 C 61.791 68.000 60.000 69.791 60.000 72.000 L 60.000 112.000 C 60.000 114.209 61.791 116.000 64.000 116.000 L 92.000 116.000 L 92.000 176.000 C 92.039 209.121 118.879 235.961 152.000 236.000 L 192.000 236.000 C 194.209 236.000 196.000 234.209 196.000 232.000 L 196.000 184.000 C 196.000 181.791 194.209 180.000 192.000 180.000 L 160.000 180.000 C 153.373 180.000 148.000 174.627 148.000 168.000 L 148.000 116.000 ZM 160.000 188.000 L 188.000 188.000 L 188.000 228.000 L 152.000 228.000 C 123.295 227.967 100.033 204.705 100.000 176.000 L 100.000 112.000 C 100.000 109.791 98.209 108.000 96.000 108.000 L 68.000 108.000 L 68.000 75.850 C 93.549 73.843 113.843 53.549 115.850 28.000 L 140.000 28.000 L 140.000 72.000 C 140.000 74.209 141.791 76.000 144.000 76.000 L 188.000 76.000 L 188.000 108.000 L 144.000 108.000 C 141.791 108.000 140.000 109.791 140.000 112.000 L 140.000 168.000 C 140.000 179.046 148.954 188.000 160.000 188.000 Z"),
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
        return _tumblrLogo!!
    }

private var _tumblrLogo: ImageVector? = null
