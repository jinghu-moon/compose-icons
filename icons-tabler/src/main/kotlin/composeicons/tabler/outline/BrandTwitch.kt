package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTwitch: ImageVector
    get() {
        if (_brandTwitch != null) return _brandTwitch!!
        _brandTwitch = tablerOutlineIcon(
            name = "BrandTwitch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 5v11c0 .552 .448 1 1 1h2v4l4-4h5.584c.266 0 .52-.105 .707-.293l2.415-2.414c.187-.188 .293-.442 .293-.708v-8.585c0-.552-.448-1-1-1h-14c-.552 0-1 .448-1 1h.001")
            addPathData("M16 8v4")
            addPathData("M12 8v4")
        }
        return _brandTwitch!!
    }

private var _brandTwitch: ImageVector? = null
