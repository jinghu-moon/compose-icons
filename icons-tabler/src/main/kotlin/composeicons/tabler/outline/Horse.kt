package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Horse: ImageVector
    get() {
        if (_horse != null) return _horse!!
        _horse = tablerOutlineIcon(
            name = "Horse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 10l-.85 8.507c-.038 .382 .086 .762 .344 1.046 .257 .284 .623 .447 1.006 .447h.146c.818 0 1.553-.498 1.857-1.257l.994-2.486c.304-.759 1.039-1.257 1.857-1.257h1.292c.818-0 1.553 .498 1.857 1.257l.994 2.486c.304 .759 1.039 1.257 1.857 1.257h.146c.385-0 .752-.162 1.011-.446 .259-.284 .387-.664 .353-1.048L19 9h-8C11 6 8 4 5 4L2 10l2 2L7 10")
            addPathData("M22 14v-2C22 10.343 20.657 9 19 9")
        }
        return _horse!!
    }

private var _horse: ImageVector? = null
