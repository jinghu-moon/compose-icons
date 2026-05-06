package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Crown: ImageVector
    get() {
        if (_crown != null) return _crown!!
        _crown = lucideOutlineIcon(
            name = "Crown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.562 3.266c.088-.16 .256-.259 .438-.259 .182 0 .35 .099 .438 .259l2.952 5.604c.143 .263 .395 .448 .689 .505 .293 .057 .597-.02 .827-.211L21.183 5.5c.168-.137 .406-.15 .588-.031 .182 .118 .267 .341 .21 .55L19.147 16.265c-.119 .431-.509 .73-.956 .734h-12.381c-.447-.003-.838-.303-.957-.734L2.02 6.02c-.057-.21 .028-.432 .21-.55 .182-.118 .42-.106 .588 .031L7.094 9.165c.23 .19 .534 .268 .827 .211 .293-.057 .546-.242 .689-.505Z")
            addPathData("M5 21h14")
        }
        return _crown!!
    }

private var _crown: ImageVector? = null
