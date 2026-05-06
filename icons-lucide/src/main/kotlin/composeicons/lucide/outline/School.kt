package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.School: ImageVector
    get() {
        if (_school != null) return _school!!
        _school = lucideOutlineIcon(
            name = "School",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 21v-3c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2v3")
            addPathData("M18 4.933v16.067")
            addPathData("M4 6 11.106 2.21c.563-.281 1.225-.281 1.788 0L20 6")
            addPathData("M6 11 2.48 13.147c-.298 .181-.48 .505-.48 .854v4.999c0 1.105 .895 2 2 2h16c1.105 0 2-.895 2-2v-5c-0-.349-.182-.672-.48-.853L18 11")
            addPathData("M6 4.933v16.067")
            addPathData("M14 9c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _school!!
    }

private var _school: ImageVector? = null
