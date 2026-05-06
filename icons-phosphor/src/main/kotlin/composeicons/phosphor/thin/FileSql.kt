package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileSql: ImageVector
    get() {
        if (_fileSql != null) return _fileSql!!
        _fileSql = phosphorThinIcon(
            name = "FileSql",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 116c2.209 0 4-1.791 4-4v-72c0-2.209 1.791-4 4-4h92v52c0 2.209 1.791 4 4 4h52v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-24c.001-1.061-.42-2.079-1.17-2.83l-56-56C154.079 28.42 153.061 27.999 152 28h-96C49.373 28 44 33.373 44 40v72c0 2.209 1.791 4 4 4ZM156 41.65 198.35 84h-42.35ZM224 208c0 2.209-1.791 4-4 4h-28c-2.209 0-4-1.791-4-4v-56c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v52h24c2.209 0 4 1.791 4 4ZM87.85 195.8c-.506 5.037-3.229 9.586-7.43 12.41C76 211.12 70.38 212 65.2 212c-4.793-.04-9.563-.675-14.2-1.89-2.05-.655-3.214-2.814-2.635-4.886 .579-2.072 2.693-3.316 4.785-2.814 4.22 1.17 16.56 3.29 22.83-.88 2.268-1.533 3.709-4.02 3.91-6.75 .83-6.45-4.38-8.69-15.64-11.94C54.57 180.04 42.53 176.56 44.11 164.07c.49-4.914 3.135-9.356 7.22-12.13 4.56-3.07 11-4.36 19.1-3.82 3.53 .233 7.033 .771 10.47 1.61 2.06 .617 3.264 2.751 2.726 4.833-.538 2.082-2.625 3.366-4.726 2.907-4.3-1.13-16.81-3.12-23.06 1.11-2.184 1.469-3.568 3.864-3.75 6.49-.66 5.17 3.89 7 14.42 10.08 9.76 2.85 23.14 6.69 21.34 20.65ZM136 148c-15.44 0-28 14.35-28 32 0 17.65 12.56 32 28 32 5.971-.034 11.741-2.156 16.31-6l4.86 4.85c1.574 1.493 4.051 1.459 5.583-.076 1.533-1.535 1.562-4.012 .067-5.584l-5.06-5.06c4.109-5.904 6.289-12.937 6.24-20.13 0-17.65-12.56-32-28-32ZM136 204c-11 0-20-10.77-20-24 0-13.23 9-24 20-24 11 0 20 10.77 20 24 .032 5.066-1.353 10.04-4 14.36l-5.19-5.19c-1.002-1.053-2.496-1.479-3.903-1.114-1.407 .365-2.505 1.465-2.868 2.873-.363 1.407 .066 2.901 1.121 3.901l5.47 5.47c-3.039 2.37-6.776 3.671-10.63 3.7Z"),
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
        return _fileSql!!
    }

private var _fileSql: ImageVector? = null
