package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CashRegister: ImageVector
    get() {
        if (_cashRegister != null) return _cashRegister!!
        _cashRegister = tablerOutlineIcon(
            name = "CashRegister",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 15h-2.5c-.398 0-.779 .158-1.061 .439-.281 .281-.439 .663-.439 1.061 0 .398 .158 .779 .439 1.061 .281 .281 .663 .439 1.061 .439h1c.398 0 .779 .158 1.061 .439 .281 .281 .439 .663 .439 1.061 0 .398-.158 .779-.439 1.061-.281 .281-.663 .439-1.061 .439h-2.5")
            addPathData("M19 21v1M19 14v1")
            addPathData("M13 21h-7c-.53 0-1.039-.211-1.414-.586C4.211 20.039 4 19.53 4 19v-10C4 8.47 4.211 7.961 4.586 7.586 4.961 7.211 5.47 7 6 7h2M20 10.12v-1.12c0-.53-.211-1.039-.586-1.414C19.039 7.211 18.53 7 18 7h-2")
            addPathData("M16 10v-6c0-.53-.211-1.039-.586-1.414C15.039 2.211 14.53 2 14 2h-4C9.47 2 8.961 2.211 8.586 2.586 8.211 2.961 8 3.47 8 4v6M16 10h-8M16 10h1M8 10h-1")
            addPathData("M8 14v.01")
            addPathData("M8 17v.01")
            addPathData("M12 13.99v.01")
            addPathData("M12 17v.01")
        }
        return _cashRegister!!
    }

private var _cashRegister: ImageVector? = null
