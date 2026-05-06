package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGooglePodcasts: ImageVector
    get() {
        if (_brandGooglePodcasts != null) return _brandGooglePodcasts!!
        _brandGooglePodcasts = tablerOutlineIcon(
            name = "BrandGooglePodcasts",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v2")
            addPathData("M12 19v2")
            addPathData("M12 8v8")
            addPathData("M8 17v2")
            addPathData("M4 11v2")
            addPathData("M20 11v2")
            addPathData("M8 5v8")
            addPathData("M16 7v-2")
            addPathData("M16 19v-8")
        }
        return _brandGooglePodcasts!!
    }

private var _brandGooglePodcasts: ImageVector? = null
