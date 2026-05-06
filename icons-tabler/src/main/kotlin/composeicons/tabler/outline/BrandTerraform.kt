package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTerraform: ImageVector
    get() {
        if (_brandTerraform != null) return _brandTerraform!!
        _brandTerraform = tablerOutlineIcon(
            name = "BrandTerraform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 15.5 3.524 9.284C3.201 9.109 3 8.771 3 8.404v-4.054c0-.483 .259-.93 .678-1.17 .419-.241 .935-.239 1.352 .004L15 9v10.65c-0 .483-.259 .93-.678 1.17-.419 .241-.935 .239-1.352-.004L9.496 18.789C9.189 18.61 9 18.281 9 17.926v-11.926")
            addPathData("M15 15.5l5.504-3.21c.307-.179 .496-.508 .496-.864v-3.576c-0-.483-.259-.93-.678-1.17-.419-.241-.935-.239-1.352 .004L15 9")
        }
        return _brandTerraform!!
    }

private var _brandTerraform: ImageVector? = null
