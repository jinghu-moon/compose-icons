package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = lucideOutlineIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 11.4v-2.3")
            addPathData("M12 17l6.59-6.59")
            addPathData("M15.05 5.7l-.218-.691C14.411 3.806 13.275 3 12 3c-1.275 0-2.41 .806-2.832 2.009L4.418 19.695c-.097 .304-.044 .636 .144 .894 .188 .258 .488 .411 .808 .411h13.253c.32 0 .621-.153 .81-.413 .188-.259 .241-.593 .141-.897L18.45 16.2")
            addPathData("M22 9c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _metronome!!
    }

private var _metronome: ImageVector? = null
