package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoSpark: ImageVector
    get() {
        if (_photoSpark != null) return _photoSpark!!
        _photoSpark = tablerOutlineIcon(
            name = "PhotoSpark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h.01")
            addPathData("M12 21h-6C4.343 21 3 19.657 3 18v-12C3 4.343 4.343 3 6 3h12c1.657 0 3 1.343 3 3v6")
            addPathData("M3 16 8 11c.928-.893 2.072-.893 3 0l3.993 3.993")
            addPathData("M14 14l1-1c.47-.452 .995-.675 1.52-.67")
            addPathData("M19 22.5c.419-1.73 1.77-3.081 3.5-3.5C20.77 18.581 19.419 17.23 19 15.5c-.419 1.73-1.77 3.081-3.5 3.5 1.73 .419 3.081 1.77 3.5 3.5")
        }
        return _photoSpark!!
    }

private var _photoSpark: ImageVector? = null
