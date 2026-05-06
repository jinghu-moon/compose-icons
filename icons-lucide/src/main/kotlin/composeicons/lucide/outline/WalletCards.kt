package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WalletCards: ImageVector
    get() {
        if (_walletCards != null) return _walletCards!!
        _walletCards = lucideOutlineIcon(
            name = "WalletCards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3Z")
            addPathData("M3 9C3 7.895 3.895 7 5 7h14c1.105 0 2 .895 2 2")
            addPathData("M3 11h3c.8 0 1.6 .3 2.1 .9l1.1 .9c1.6 1.6 4.1 1.6 5.7 0L16 11.9c.5-.5 1.3-.9 2.1-.9h2.9")
        }
        return _walletCards!!
    }

private var _walletCards: ImageVector? = null
