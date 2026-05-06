package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FishBone: ImageVector
    get() {
        if (_fishBone != null) return _fishBone!!
        _fishBone = tablerOutlineIcon(
            name = "FishBone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.69 7.44C15.598 8.708 14.998 10.326 15 12c-.003 1.679 .601 3.302 1.699 4.571 1.914-.684 3.691-2.183 5.301-4.565C20.387 9.622 18.606 8.123 16.688 7.441")
            addPathData("M2 9.504c.771 .869 1.579 1.704 2.422 2.504C3.579 12.805 2.77 13.638 2 14.506")
            addPathData("M18 11v.01")
            addPathData("M4.422 12h10.578")
            addPathData("M7 10v4")
            addPathData("M11 8v8")
        }
        return _fishBone!!
    }

private var _fishBone: ImageVector? = null
