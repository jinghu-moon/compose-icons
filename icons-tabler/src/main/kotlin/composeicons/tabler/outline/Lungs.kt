package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lungs: ImageVector
    get() {
        if (_lungs != null) return _lungs!!
        _lungs = tablerOutlineIcon(
            name = "Lungs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.081 20C7.693 20 9 18.665 9 17.02v-9.763C9 6.563 8.448 6 7.768 6c-.205 0-.405 .052-.584 .15l-.13 .083C5.594 7.292 4.622 8.88 3.65 12.057c-.42 1.37-.636 2.962-.648 4.775-.012 1.675 1.261 3.054 2.877 3.161L6.082 20")
            addPathData("M17.92 20C16.307 20 15 18.665 15 17.02v-9.763C15 6.563 15.552 6 16.233 6c.204 0 .405 .052 .584 .15l.13 .083c1.46 1.059 2.432 2.647 3.405 5.824 .42 1.37 .636 2.962 .648 4.775 .012 1.675-1.261 3.054-2.878 3.161L17.92 20")
            addPathData("M9 12c1.657 0 3-1.343 3-3 0 1.657 1.343 3 3 3")
            addPathData("M12 4v5")
        }
        return _lungs!!
    }

private var _lungs: ImageVector? = null
