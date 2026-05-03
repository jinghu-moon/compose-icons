package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) return _cloudFog!!
        _cloudFog = phosphorBoldIcon(
            name = "CloudFog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 208.000 L 72.000 208.000 C 65.373 208.000 60.000 202.627 60.000 196.000 C 60.000 189.373 65.373 184.000 72.000 184.000 L 120.000 184.000 C 126.627 184.000 132.000 189.373 132.000 196.000 C 132.000 202.627 126.627 208.000 120.000 208.000 ZM 184.000 184.000 L 160.000 184.000 C 153.373 184.000 148.000 189.373 148.000 196.000 C 148.000 202.627 153.373 208.000 160.000 208.000 L 184.000 208.000 C 190.627 208.000 196.000 202.627 196.000 196.000 C 196.000 189.373 190.627 184.000 184.000 184.000 ZM 160.000 220.000 L 104.000 220.000 C 97.373 220.000 92.000 225.373 92.000 232.000 C 92.000 238.627 97.373 244.000 104.000 244.000 L 160.000 244.000 C 166.627 244.000 172.000 238.627 172.000 232.000 C 172.000 225.373 166.627 220.000 160.000 220.000 ZM 232.000 96.000 C 231.956 137.955 197.955 171.956 156.000 172.000 L 76.000 172.000 C 56.347 171.990 38.379 160.901 29.559 143.339 C 20.738 125.776 22.572 104.742 34.299 88.971 C 46.026 73.201 65.642 65.389 85.000 68.780 C 98.084 34.515 133.773 14.483 169.838 21.161 C 205.903 27.839 232.053 59.322 232.000 96.000 ZM 208.000 96.000 C 208.000 67.281 184.719 44.000 156.000 44.000 C 127.281 44.000 104.000 67.281 104.000 96.000 C 104.000 102.627 98.627 108.000 92.000 108.000 C 85.373 108.000 80.000 102.627 80.000 96.000 C 80.000 94.760 80.000 93.520 80.090 92.290 C 78.735 92.098 77.368 92.001 76.000 92.000 C 60.536 92.000 48.000 104.536 48.000 120.000 C 48.000 135.464 60.536 148.000 76.000 148.000 L 156.000 148.000 C 184.705 147.967 207.967 124.705 208.000 96.000 Z"),
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
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
