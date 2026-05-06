package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PartyPopper: ImageVector
    get() {
        if (_partyPopper != null) return _partyPopper!!
        _partyPopper = lucideOutlineIcon(
            name = "PartyPopper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.8 11.3 2 22 12.7 18.21")
            addPathData("M4 3h.01")
            addPathData("M22 8h.01")
            addPathData("M15 2h.01")
            addPathData("M22 20h.01")
            addPathData("M22 2l-2.24 .75c-1.315 .438-2.136 1.745-1.96 3.12 .1 .86-.57 1.63-1.45 1.63h-.38c-.86 0-1.6 .6-1.76 1.44L14 10")
            addPathData("M22 13l-.82-.33c-.86-.34-1.82 .2-1.98 1.11C19.09 14.48 18.48 15 17.77 15h-.77")
            addPathData("M11 2l.33 .82c.34 .86-.2 1.82-1.11 1.98C9.52 4.9 9 5.52 9 6.23v.77")
            addPathData("M11 13c1.93 1.93 2.83 4.17 2 5-.83 .83-3.07-.07-5-2C6.07 14.07 5.17 11.83 6 11c.83-.83 3.07 .07 5 2Z")
        }
        return _partyPopper!!
    }

private var _partyPopper: ImageVector? = null
