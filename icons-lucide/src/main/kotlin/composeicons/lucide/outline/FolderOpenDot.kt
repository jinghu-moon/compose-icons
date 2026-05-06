package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderOpenDot: ImageVector
    get() {
        if (_folderOpenDot != null) return _folderOpenDot!!
        _folderOpenDot = lucideOutlineIcon(
            name = "FolderOpenDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 14 7.45 11.1C7.791 10.424 8.483 9.999 9.24 10h10.76c.619-.001 1.204 .285 1.584 .774 .38 .489 .511 1.127 .356 1.726l-1.55 6c-.228 .884-1.027 1.502-1.94 1.5h-14.45C2.895 20 2 19.105 2 18v-13C2 3.9 2.9 3 4 3h3.93c.669 .003 1.292 .341 1.66 .9l.82 1.2c.368 .559 .991 .897 1.66 .9h5.93c1.105 0 2 .895 2 2v2")
            addPathData("M15 15c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
        }
        return _folderOpenDot!!
    }

private var _folderOpenDot: ImageVector? = null
