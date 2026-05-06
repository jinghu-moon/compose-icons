package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CashBanknoteHeart: ImageVector
    get() {
        if (_cashBanknoteHeart != null) return _cashBanknoteHeart!!
        _cashBanknoteHeart = tablerOutlineIcon(
            name = "CashBanknoteHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.872 11.13C14.479 9.83 13.261 8.956 11.904 8.999c-1.357 .043-2.517 .993-2.826 2.315-.31 1.322 .307 2.688 1.504 3.329")
            addPathData("M10 18h-5C3.895 18 3 17.105 3 16v-8C3 6.895 3.895 6 5 6h14c1.105 0 2 .895 2 2v3")
            addPathData("M6 12h.01")
            addPathData("M18 22l3.35-3.284c.415-.403 .65-.956 .651-1.534 .001-.578-.232-1.132-.646-1.537-.869-.851-2.257-.854-3.129-.006l-.224 .22-.223-.22c-.868-.85-2.256-.853-3.128-.006-.415 .403-.65 .956-.651 1.534-.001 .578 .232 1.133 .645 1.537L18 22")
        }
        return _cashBanknoteHeart!!
    }

private var _cashBanknoteHeart: ImageVector? = null
