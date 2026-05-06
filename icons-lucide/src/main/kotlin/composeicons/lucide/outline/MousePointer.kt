package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MousePointer: ImageVector
    get() {
        if (_mousePointer != null) return _mousePointer!!
        _mousePointer = lucideOutlineIcon(
            name = "MousePointer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.586 12.586 19 19")
            addPathData("M3.688 3.037c-.186-.078-.402-.036-.544 .107-.143 .143-.185 .358-.107 .544L9.537 19.687c.082 .198 .281 .323 .496 .309 .214-.014 .396-.163 .451-.371l1.569-6.083c.17-.724 .728-1.294 1.448-1.479l6.124-1.579c.209-.054 .359-.236 .373-.451 .014-.215-.111-.415-.31-.496Z")
        }
        return _mousePointer!!
    }

private var _mousePointer: ImageVector? = null
