package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DraftingCompass: ImageVector
    get() {
        if (_draftingCompass != null) return _draftingCompass!!
        _draftingCompass = lucideOutlineIcon(
            name = "DraftingCompass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.99 6.74l1.93 3.44")
            addPathData("M19.136 12c-1.88 1.915-4.452 2.994-7.135 2.994C9.317 14.994 6.745 13.915 4.865 12")
            addPathData("M21 21 18.84 17.16")
            addPathData("M3 21 11.02 6.74")
            addPathData("M14 5c0 1.105-.895 2-2 2C10.895 7 10 6.105 10 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _draftingCompass!!
    }

private var _draftingCompass: ImageVector? = null
