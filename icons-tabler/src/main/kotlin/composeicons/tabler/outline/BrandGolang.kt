package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGolang: ImageVector
    get() {
        if (_brandGolang != null) return _brandGolang!!
        _brandGolang = tablerOutlineIcon(
            name = "BrandGolang",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.695 14.305c1.061 1.06 2.953 .888 4.226-.384 1.272-1.273 1.444-3.165 .384-4.226-1.061-1.06-2.953-.888-4.226 .384-1.272 1.273-1.444 3.165-.384 4.226")
            addPathData("M12.68 9.233c-1.084-.497-2.545-.191-3.591 .846-1.284 1.273-1.457 3.165-.388 4.226 1.07 1.06 2.978 .888 4.261-.384C13.495 13.401 13.857 12.731 14 12h-2.427")
            addPathData("M5.5 15h-1.5")
            addPathData("M6 9h-2")
            addPathData("M5 12h-3")
        }
        return _brandGolang!!
    }

private var _brandGolang: ImageVector? = null
