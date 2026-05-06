package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDrupal: ImageVector
    get() {
        if (_brandDrupal != null) return _brandDrupal!!
        _brandDrupal = tablerOutlineIcon(
            name = "BrandDrupal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2C12 6.308 5 8 5 14c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7C19 8 12 6.303 12 2")
            addPathData("M12 11.33c-.656 .689-1.327 1.363-2.012 2.023C8.988 14.31 8 15.32 8 17c0 2.17 1.79 4 4 4 2.21 0 4-1.827 4-4 0-1.676-.989-2.685-1.983-3.642C13.597 12.954 11.758 11.001 8.5 7.5L12 11.33")
        }
        return _brandDrupal!!
    }

private var _brandDrupal: ImageVector? = null
