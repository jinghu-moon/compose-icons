package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CreditCardHand: ImageVector
    get() {
        if (_creditCardHand != null) return _creditCardHand!!
        _creditCardHand = tablerOutlineIcon(
            name = "CreditCardHand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 4h9.914c.702 0 1.381 .246 1.92 .695L19 9")
            addPathData("M11.15 9h8.85c1.105 0 2 .895 2 2v7c0 1.105-.895 2-2 2h-13C5.895 20 5 19.105 5 18v-8.7")
            addPathData("M3 8l7.2 4.7c.828 .533 1.93 .304 2.477-.516 .546-.819 .334-1.925-.477-2.484L8 7")
            addPathData("M5 16h17")
        }
        return _creditCardHand!!
    }

private var _creditCardHand: ImageVector? = null
