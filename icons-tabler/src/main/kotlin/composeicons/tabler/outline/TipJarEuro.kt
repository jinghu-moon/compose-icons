package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TipJarEuro: ImageVector
    get() {
        if (_tipJarEuro != null) return _tipJarEuro!!
        _tipJarEuro = tablerOutlineIcon(
            name = "TipJarEuro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 4v1.882c0 .685 .387 1.312 1 1.618 .613 .306 1 .933 1 1.618v8.882c0 1.657-1.343 3-3 3h-8C6.343 21 5 19.657 5 18v-8.882C5 8.433 5.387 7.806 6 7.5 6.613 7.194 7 6.567 7 5.882v-1.882")
            addPathData("M6 4h12-12")
            addPathData("M12 13h-3")
            addPathData("M14 10.172c-1.243-.44-2.628-.017-3.413 1.044-.785 1.06-.785 2.509 0 3.569 .785 1.06 2.169 1.484 3.413 1.044")
        }
        return _tipJarEuro!!
    }

private var _tipJarEuro: ImageVector? = null
