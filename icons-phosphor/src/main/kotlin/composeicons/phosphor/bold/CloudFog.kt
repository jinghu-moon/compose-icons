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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 208h-48c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h48c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM184 184h-24c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h24c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM160 220h-56c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h56c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM232 96c-.044 41.955-34.045 75.956-76 76h-80C56.347 171.99 38.379 160.901 29.559 143.339 20.738 125.776 22.572 104.742 34.299 88.971 46.026 73.201 65.642 65.389 85 68.78 98.084 34.515 133.773 14.483 169.838 21.161 205.903 27.839 232.053 59.322 232 96ZM208 96C208 67.281 184.719 44 156 44c-28.719 0-52 23.281-52 52 0 6.627-5.373 12-12 12C85.373 108 80 102.627 80 96c0-1.24 0-2.48 .09-3.71C78.735 92.098 77.368 92.001 76 92 60.536 92 48 104.536 48 120c0 15.464 12.536 28 28 28h80c28.705-.033 51.967-23.295 52-52Z"),
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
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
