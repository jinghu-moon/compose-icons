package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandApplePodcast: ImageVector
    get() {
        if (_brandApplePodcast != null) return _brandApplePodcast!!
        _brandApplePodcast = tablerOutlineIcon(
            name = "BrandApplePodcast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.364 18.364C21.879 14.849 21.879 9.151 18.364 5.636 14.849 2.121 9.151 2.121 5.636 5.636 2.121 9.151 2.121 14.849 5.636 18.364")
            addPathData("M11.766 22h.468c1.009 0 1.86-.751 1.985-1.752l.5-4c.071-.569-.106-1.142-.485-1.572-.38-.43-.926-.676-1.5-.676h-1.468c-.574-0-1.12 .246-1.5 .676-.38 .43-.557 1.002-.485 1.572l.5 4c.125 1.001 .976 1.752 1.985 1.752")
            addPathData("M10 9c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 7.895 13.105 7 12 7c-1.105 0-2 .895-2 2")
        }
        return _brandApplePodcast!!
    }

private var _brandApplePodcast: ImageVector? = null
