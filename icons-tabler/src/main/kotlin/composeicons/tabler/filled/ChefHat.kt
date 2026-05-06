package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = tablerFilledIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 19.002v1.998c-0 .507-.38 .934-.883 .993L18 22h-12C5.448 22 5 21.552 5 21v-1.994c0-.552 .448-1 1-1l12-.004c.552 0 1 .448 1 1")
            addPathData("M12 2c1.944-0 3.712 1.126 4.533 2.888l.06 .137 .136-.009c2.258-.102 4.304 1.323 4.99 3.477l.063 .213c.634 2.34-.502 4.798-2.696 5.831l-.087 .037v1.428c0 .552-.448 1-1 1L5.999 17.006c-.507-0-.934-.38-.993-.883l-.007-.117v-1.433l-.123-.055C3.632 13.919 2.691 12.833 2.276 11.517l-.064-.223C1.797 9.732 2.163 8.066 3.194 6.822 4.225 5.577 5.793 4.908 7.405 5.024l.066-.142C8.259 3.198 9.916 2.09 11.773 2.005Z")
        }
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
