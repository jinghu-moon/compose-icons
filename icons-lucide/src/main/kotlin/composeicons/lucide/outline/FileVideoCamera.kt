package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileVideoCamera: ImageVector
    get() {
        if (_fileVideoCamera != null) return _fileVideoCamera!!
        _fileVideoCamera = lucideOutlineIcon(
            name = "FileVideoCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12v-8C4 2.895 4.895 2 6 2h8c.64-.002 1.254 .253 1.706 .706l3.588 3.588c.453 .452 .708 1.066 .706 1.706v12c0 1.105-.895 2-2 2")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M10 17.843l3.033-1.755c.199-.119 .447-.12 .648-.004 .201 .116 .323 .332 .319 .564v4.704c-.003 .229-.126 .44-.324 .555-.198 .115-.443 .117-.643 .005L10 20.157")
            addPathData("M4 16h5c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-5C3.448 22 3 21.552 3 21v-4c0-.552 .448-1 1-1Z")
        }
        return _fileVideoCamera!!
    }

private var _fileVideoCamera: ImageVector? = null
