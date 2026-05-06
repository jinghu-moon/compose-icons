package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = tablerOutlineIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.555 3.843l3.602 3.602c.54 .54 .843 1.271 .843 2.034 0 .763-.303 1.495-.843 2.035l-2.643 2.643c-.54 .54-1.271 .843-2.035 .843-.763 0-1.495-.303-2.035-.843l-.301-.301L6.586 20.414c-.332 .332-.771 .537-1.239 .578L5.172 21h-1.172c-.507-0-.934-.38-.993-.883L3 20v-1.172c0-.47 .165-.924 .467-1.284l.119-.13L4 17h2v-2h2v-2l2.144-2.144-.301-.301C9.303 10.015 9 9.284 9 8.521c0-.763 .303-1.495 .843-2.035L12.486 3.843c.54-.54 1.271-.843 2.035-.843 .763 0 1.495 .303 2.035 .843")
            addPathData("M15 9h.01")
        }
        return _key!!
    }

private var _key: ImageVector? = null
