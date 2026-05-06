package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) return _folderOpen!!
        _folderOpen = lucideOutlineIcon(
            name = "FolderOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 14 7.5 11.1C7.832 10.44 8.501 10.017 9.24 10h10.76c.619-.001 1.204 .285 1.584 .774 .38 .489 .511 1.127 .356 1.726l-1.54 6c-.229 .888-1.033 1.506-1.95 1.5h-14.45C2.895 20 2 19.105 2 18v-13C2 3.895 2.895 3 4 3h3.9c.68-.007 1.316 .332 1.69 .9l.81 1.2c.37 .562 .997 .9 1.67 .9h5.93c1.105 0 2 .895 2 2v2"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
