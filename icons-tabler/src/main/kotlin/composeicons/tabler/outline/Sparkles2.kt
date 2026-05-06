package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sparkles2: ImageVector
    get() {
        if (_sparkles2 != null) return _sparkles2!!
        _sparkles2 = tablerOutlineIcon(
            name = "Sparkles2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 7c.52-.138 1.027-.32 1.516-.546 .911-.438 1.494-1.015 1.937-1.932C16.66 4.094 16.835 3.594 17 3c.165 .595 .34 1.095 .547 1.521 .443 .918 1.026 1.495 1.937 1.933 .426 .205 .925 .38 1.516 .546-.52 .138-1.027 .321-1.516 .547-.911 .438-1.494 1.015-1.937 1.932-.228 .49-.411 .999-.547 1.521-.165-.594-.34-1.095-.547-1.521C16.01 8.561 15.427 7.985 14.516 7.547 14.028 7.32 13.521 7.137 13 7")
            addPathData("M3 14c.558-.154 1.109-.332 1.652-.532C7.194 12.515 8.505 11.23 9.468 8.662 9.669 8.116 9.847 7.561 10 7c.153 .561 .331 1.116 .532 1.662 .963 2.567 2.275 3.853 4.816 4.806q.75 .28 1.652 .532c-.558 .154-1.109 .332-1.652 .532-2.542 .953-3.854 2.238-4.816 4.806-.201 .546-.379 1.101-.532 1.662-.153-.561-.331-1.116-.532-1.662C8.505 16.77 7.193 15.485 4.652 14.532 4.109 14.332 3.558 14.154 3 14")
        }
        return _sparkles2!!
    }

private var _sparkles2: ImageVector? = null
