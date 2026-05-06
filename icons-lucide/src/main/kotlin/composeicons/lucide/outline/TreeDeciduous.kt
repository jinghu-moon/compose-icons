package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TreeDeciduous: ImageVector
    get() {
        if (_treeDeciduous != null) return _treeDeciduous!!
        _treeDeciduous = lucideOutlineIcon(
            name = "TreeDeciduous",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 19C6.238 19.004 4.682 17.855 4.166 16.17c-.515-1.684 .132-3.508 1.594-4.49C4.861 10.557 4.741 8.999 5.456 7.752 6.172 6.505 7.577 5.822 9 6.03v-.03C9 4.343 10.343 3 12 3c1.657 0 3 1.343 3 3v.04c1.423-.208 2.828 .475 3.544 1.722 .715 1.247 .595 2.805-.304 3.928 1.453 .986 2.093 2.803 1.579 4.482C19.304 17.85 17.756 18.997 16 19Z")
            addPathData("M12 19v3")
        }
        return _treeDeciduous!!
    }

private var _treeDeciduous: ImageVector? = null
