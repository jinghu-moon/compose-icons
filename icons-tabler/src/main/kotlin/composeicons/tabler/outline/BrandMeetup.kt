package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMeetup: ImageVector
    get() {
        if (_brandMeetup != null) return _brandMeetup!!
        _brandMeetup = tablerOutlineIcon(
            name = "BrandMeetup",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.455 10.82C6.39 8.657 8.5 7 11 7c2.104 0 2.844 1.915 2 4l-2 6")
            addPathData("M6.981 7 3 16.914")
            addPathData("M13 11c.937-2.16 3.071-3.802 5.42-3.972 2.104 0 3.128 1.706 2.284 3.792l-2.454 6.094C17.397 18.59 19 19.5 21 19")
        }
        return _brandMeetup!!
    }

private var _brandMeetup: ImageVector? = null
