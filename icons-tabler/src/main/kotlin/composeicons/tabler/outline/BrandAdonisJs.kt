package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdonisJs: ImageVector
    get() {
        if (_brandAdonisJs != null) return _brandAdonisJs!!
        _brandAdonisJs = tablerOutlineIcon(
            name = "BrandAdonisJs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3c7.2 0 9 1.8 9 9 0 7.2-1.8 9-9 9C4.8 21 3 19.2 3 12 3 4.8 4.8 3 12 3")
            addPathData("M8.863 16.922C10 16.5 10.5 16 12 16c1.5 0 2 .5 3.138 .922 .713 .264 1.516-.102 1.778-.772 .126-.32 .11-.673-.044-.983L13.164 7.693c-.297-.598-1.058-.859-1.7-.583-.272 .114-.494 .32-.627 .583L7.128 15.167c-.321 .648-.017 1.415 .679 1.714 .332 .143 .715 .167 1.056 .04v.001")
        }
        return _brandAdonisJs!!
    }

private var _brandAdonisJs: ImageVector? = null
