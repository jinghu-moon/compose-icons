package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) return _piggyBank!!
        _piggyBank = lucideOutlineIcon(
            name = "PiggyBank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 17h3v2c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-3c.944-.314 1.686-1.056 2-2h1c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1h-1C20 8.426 19.259 6.944 18 6v-3c-1.259 0-2.445 .593-3.2 1.6L14.5 5h-3.5C7.686 5 5 7.686 5 11v1c0 1.574 .741 3.056 2 4v3c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1Z")
            addPathData("M16 10h.01")
            addPathData("M2 8v1c0 1.105 .895 2 2 2h1")
        }
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
