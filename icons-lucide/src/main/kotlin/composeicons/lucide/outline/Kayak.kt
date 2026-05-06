package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Kayak: ImageVector
    get() {
        if (_kayak != null) return _kayak!!
        _kayak = lucideOutlineIcon(
            name = "Kayak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 17c-.552 0-1 .448-1 1v1c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2Z")
            addPathData("M20.97 3.61c.063-.165 .022-.352-.103-.477-.125-.125-.312-.165-.477-.103C10.2 6.6 6.6 10.2 3.03 20.39c-.063 .165-.022 .352 .103 .477 .125 .125 .312 .165 .477 .103C13.8 17.4 17.4 13.8 20.97 3.61")
            addPathData("M6.707 6.707 17.293 17.293")
            addPathData("M7 5C7 3.895 6.105 3 5 3 3.895 3 3 3.895 3 5c0 1.105 .895 2 2 2h1C6.552 7 7 6.552 7 6Z")
        }
        return _kayak!!
    }

private var _kayak: ImageVector? = null
