package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ScanSmiley: ImageVector
    get() {
        if (_scanSmiley != null) return _scanSmiley!!
        _scanSmiley = phosphorRegularIcon(
            name = "ScanSmiley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 40v36c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-28h-28c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h36c4.418 0 8 3.582 8 8ZM216 172c-4.418 0-8 3.582-8 8v28h-28c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h36c4.418 0 8-3.582 8-8v-36c0-4.418-3.582-8-8-8ZM76 208h-28v-28c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v36c0 4.418 3.582 8 8 8h36c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM40 84c4.418 0 8-3.582 8-8v-28h28c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-36c-4.418 0-8 3.582-8 8v36c0 4.418 3.582 8 8 8ZM128 200C88.235 200 56 167.764 56 128 56 88.235 88.235 56 128 56c39.764 0 72 32.235 72 72-.044 39.746-32.254 71.956-72 72ZM184 128C184 97.072 158.928 72 128 72 97.072 72 72 97.072 72 128c0 30.928 25.072 56 56 56 30.914-.033 55.967-25.086 56-56ZM116 116c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12ZM152 104c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM146.71 146c-3.81 3.37-12 6-18.71 6-6.71 0-14.9-2.63-18.71-6-2.136-1.944-5.154-2.586-7.896-1.679-2.742 .907-4.783 3.221-5.339 6.055-.556 2.834 .459 5.748 2.655 7.624 7.83 6.91 20.35 10 29.29 10 8.94 0 21.46-3.09 29.29-10 2.196-1.876 3.211-4.789 2.655-7.624-.556-2.834-2.597-5.149-5.339-6.055-2.742-.907-5.76-.265-7.896 1.679Z"),
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
        return _scanSmiley!!
    }

private var _scanSmiley: ImageVector? = null
