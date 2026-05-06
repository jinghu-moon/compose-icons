package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandLoom: ImageVector
    get() {
        if (_brandLoom != null) return _brandLoom!!
        _brandLoom = tablerOutlineIcon(
            name = "BrandLoom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.464 6.518C16.095 3.507 12.548 2.172 9.533 3.532 6.519 4.893 5.174 8.437 6.527 11.455c1.353 3.018 4.893 4.373 7.914 3.028")
            addPathData("M17.482 17.464c3.011-1.369 4.346-4.916 2.986-7.931C19.107 6.519 15.563 5.174 12.545 6.527 9.527 7.879 8.172 11.419 9.517 14.441")
            addPathData("M6.54 17.482c1.369 3.011 4.916 4.347 7.93 2.986 3.015-1.36 4.36-4.904 3.008-7.922C16.126 9.528 12.586 8.173 9.564 9.517")
            addPathData("M6.518 6.54C3.507 7.909 2.171 11.456 3.532 14.47c1.36 3.015 4.904 4.36 7.922 3.008 3.018-1.352 4.373-4.892 3.029-7.914")
        }
        return _brandLoom!!
    }

private var _brandLoom: ImageVector? = null
