package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGoogleOne: ImageVector
    get() {
        if (_brandGoogleOne != null) return _brandGoogleOne!!
        _brandGoogleOne = tablerOutlineIcon(
            name = "BrandGoogleOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 5v13.982c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-13.982C15 3.895 14.105 3 13 3c-1.105 0-2 .895-2 2")
            addPathData("M6.63 8.407c-.811 .802-.844 2.102-.074 2.944 .77 .834 2.051 .869 2.862 .077L14.368 6.594c.812-.792 .846-2.11 .076-2.945-.363-.4-.874-.634-1.414-.648-.54-.015-1.062 .192-1.447 .571L6.63 8.407")
        }
        return _brandGoogleOne!!
    }

private var _brandGoogleOne: ImageVector? = null
