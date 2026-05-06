package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LinkPlus: ImageVector
    get() {
        if (_linkPlus != null) return _linkPlus!!
        _linkPlus = tablerOutlineIcon(
            name = "LinkPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 15 15 9")
            addPathData("M11 6l.463-.536c.938-.938 2.21-1.465 3.536-1.465 1.326 0 2.598 .527 3.536 1.465 .94 .937 1.468 2.209 1.467 3.536-0 1.327-.529 2.599-1.468 3.536")
            addPathData("M12.603 18.534c-1.975 1.951-5.152 1.951-7.127 0C4.531 17.6 4 16.327 4 14.998c0-1.328 .532-2.602 1.476-3.535L6 11")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _linkPlus!!
    }

private var _linkPlus: ImageVector? = null
