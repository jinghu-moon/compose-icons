package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cards: ImageVector
    get() {
        if (_cards != null) return _cards!!
        _cards = tablerOutlineIcon(
            name = "Cards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.604 7.197 10.742 4.088c.238-.102 .507-.104 .746-.004 .239 .099 .428 .291 .524 .531l4.924 11.902c.213 .502-.016 1.082-.514 1.304L9.285 20.93c-.238 .102-.507 .104-.747 .005-.239-.099-.428-.291-.524-.532L3.09 8.5C2.877 7.998 3.106 7.418 3.604 7.196v.001")
            addPathData("M15 4h1c.552 0 1 .448 1 1v3.5")
            addPathData("M20 6c.264 .112 .52 .217 .768 .315 .508 .216 .746 .803 .53 1.311L19 13")
        }
        return _cards!!
    }

private var _cards: ImageVector? = null
