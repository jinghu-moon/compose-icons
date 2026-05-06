package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileJs: ImageVector
    get() {
        if (_fileJs != null) return _fileJs!!
        _fileJs = phosphorThinIcon(
            name = "FileJs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.83 85.17l-56-56C154.079 28.42 153.061 27.999 152 28h-96C49.373 28 44 33.373 44 40v72c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-72c0-2.209 1.791-4 4-4h92v52c0 2.209 1.791 4 4 4h52v124c0 2.209-1.791 4-4 4h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h24c6.627 0 12-5.373 12-12v-128c.001-1.061-.42-2.079-1.17-2.83ZM156 41.65 198.34 84h-42.34ZM143.84 195.8c-.506 5.037-3.229 9.586-7.43 12.41-4.39 2.91-10 3.77-15.22 3.77-4.789-.034-9.556-.662-14.19-1.87-2.05-.655-3.214-2.814-2.635-4.886 .579-2.072 2.693-3.316 4.785-2.814 4.22 1.17 16.56 3.29 22.83-.88 2.268-1.533 3.709-4.02 3.91-6.75 .83-6.45-4.38-8.69-15.64-11.94-9.68-2.8-21.72-6.28-20.14-18.77 .49-4.914 3.135-9.356 7.22-12.13 4.56-3.07 11-4.36 19.1-3.82 3.533 .233 7.04 .772 10.48 1.61 2.137 .566 3.411 2.758 2.845 4.895-.566 2.137-2.758 3.411-4.895 2.845-4.29-1.13-16.81-3.12-23.06 1.11-2.187 1.467-3.571 3.863-3.75 6.49-.66 5.17 3.89 7 14.42 10.08 9.79 2.85 23.17 6.69 21.37 20.65ZM76 152v38c0 12.15-9.85 22-22 22C41.85 212 32 202.15 32 190c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 0 7.732 6.268 14 14 14 7.732 0 14-6.268 14-14v-38c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _fileJs!!
    }

private var _fileJs: ImageVector? = null
