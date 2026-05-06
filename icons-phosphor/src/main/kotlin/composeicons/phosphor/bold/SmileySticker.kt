package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SmileySticker: ImageVector
    get() {
        if (_smileySticker != null) return _smileySticker!!
        _smileySticker = phosphorBoldIcon(
            name = "SmileySticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C85.576 20.038 47.103 44.909 29.654 83.579 12.205 122.248 19.011 167.552 47.053 199.387c28.042 31.835 72.125 44.303 112.687 31.873 1.888-.574 3.605-1.604 5-3l63.57-63.57c1.394-1.396 2.424-3.113 3-5 10.02-32.761 3.914-68.332-16.457-95.876C194.482 36.269 162.259 20.014 128 20ZM209.12 149.91l-59.2 59.2c-36.672 9.866-75.397-6.139-94.402-39.018C36.513 137.214 41.972 95.668 68.825 68.815 95.678 41.962 137.224 36.503 170.102 55.508c32.878 19.005 48.884 57.73 39.018 94.402ZM76 108C76 99.163 83.163 92 92 92c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM180 108c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM178.39 158C167.39 177.06 149 188 128 188 107 188 88.64 177.07 77.61 158c-3.168-5.724-1.167-12.931 4.498-16.202 5.665-3.272 12.907-1.403 16.282 4.202 3.89 6.73 12.91 18 29.61 18 16.7 0 25.72-11.28 29.61-18 2.101-3.797 6.088-6.163 10.428-6.189 4.339-.026 8.355 2.293 10.501 6.064 2.146 3.771 2.09 8.408-.149 12.125Z"),
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
        return _smileySticker!!
    }

private var _smileySticker: ImageVector? = null
