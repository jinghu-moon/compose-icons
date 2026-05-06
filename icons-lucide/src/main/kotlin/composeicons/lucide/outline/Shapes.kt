package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shapes: ImageVector
    get() {
        if (_shapes != null) return _shapes!!
        _shapes = lucideOutlineIcon(
            name = "Shapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.3 10c-.263 .014-.512-.12-.644-.348-.132-.228-.125-.51 .018-.731L11.4 3c.119-.214 .342-.351 .587-.36 .245-.009 .477 .111 .611 .317l3.702 5.943c.149 .214 .167 .492 .047 .723-.12 .231-.358 .376-.619 .377Z")
            addPathData("M4 14h5c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-5C3.448 21 3 20.552 3 20v-5c0-.552 .448-1 1-1Z")
            addPathData("M21 17.5C21 19.433 19.433 21 17.5 21 15.567 21 14 19.433 14 17.5 14 15.567 15.567 14 17.5 14 19.433 14 21 15.567 21 17.5Z")
        }
        return _shapes!!
    }

private var _shapes: ImageVector? = null
