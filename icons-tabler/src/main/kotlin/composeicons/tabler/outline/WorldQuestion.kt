package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldQuestion: ImageVector
    get() {
        if (_worldQuestion != null) return _worldQuestion!!
        _worldQuestion = tablerOutlineIcon(
            name = "WorldQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.975 11.33C20.685 7.453 17.938 4.2 14.164 3.265 10.39 2.33 6.442 3.924 4.376 7.218c-2.066 3.294-1.784 7.542 .7 10.533 2.484 2.991 6.608 4.049 10.225 2.622")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h9.9")
            addPathData("M11.5 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3c1.779 2.849 2.673 6.161 2.57 9.518M14.014 17.921c-.4 1.075-.907 2.106-1.514 3.079")
            addPathData("M19 22v.01")
            addPathData("M19 19c.923-.003 1.724-.636 1.941-1.532 .217-.897-.207-1.826-1.027-2.25-.819-.42-1.819-.219-2.414 .483")
        }
        return _worldQuestion!!
    }

private var _worldQuestion: ImageVector? = null
