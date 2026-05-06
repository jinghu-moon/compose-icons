package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashHand: ImageVector
    get() {
        if (_washHand != null) return _washHand!!
        _washHand = tablerOutlineIcon(
            name = "WashHand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.486 8.965C3.654 8.985 3.826 8.998 4 9c.79 .009 1.539-.178 2-.5C6.426 8.204 6.777 8 7.5 8h1")
            addPathData("M16 8l.615 .034c.552 .067 1.046 .23 1.385 .466 .461 .322 1.21 .509 2 .5 .17 0 .339-.014 .503-.034")
            addPathData("M14 10.5l.586 .578c.572 .502 1.428 .502 2 0 .476-.433 .55-1.112 .176-1.622L15 7C14.63 6.494 13.669 6 13 6h-3.117c-.504 0-.929 .376-.992 .876l-.499 3.986C8.164 12.687 9.255 14.419 11 15c.695 .231 1.459 .115 2.053-.314 .594-.428 .947-1.116 .947-1.848v-2.338")
            addPathData("M3 6 4.721 16.329c.161 .964 .995 1.671 1.973 1.671h10.612c.978 0 1.812-.707 1.973-1.671L21 6")
        }
        return _washHand!!
    }

private var _washHand: ImageVector? = null
