package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Mosque: ImageVector
    get() {
        if (_mosque != null) return _mosque!!
        _mosque = phosphorBoldIcon(
            name = "Mosque",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 124c-2.718-.01-5.427 .326-8.06 1-1.29-41.54-29.35-62.32-50-77.58C150.18 38.73 140 31.21 140 24c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 7.21-10.18 14.73-22 23.45C73.37 62.71 45.31 83.45 44 125.03c-9.581-2.474-19.767-.376-27.59 5.681C8.586 136.769 4.004 146.105 4 156v52c0 6.627 5.373 12 12 12h224c6.627 0 12-5.373 12-12v-52c0-17.673-14.327-32-32-32ZM44 196h-16v-40c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM108.31 66.74c7-5.14 14-10.36 19.69-16.27 5.68 5.91 12.74 11.13 19.69 16.27 17.11 12.66 34.71 25.7 39.21 49.26h-117.8C73.6 92.44 91.2 79.4 108.31 66.74ZM188 196h-24v-28c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v28h-24v-28c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v28h-24v-56h120ZM228 196h-16v-40c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _mosque!!
    }

private var _mosque: ImageVector? = null
