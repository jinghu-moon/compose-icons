package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CookieMan: ImageVector
    get() {
        if (_cookieMan != null) return _cookieMan!!
        _cookieMan = tablerOutlineIcon(
            name = "CookieMan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2c2.188-0 4.121 1.422 4.773 3.51 .652 2.088-.129 4.358-1.928 5.602l.147 .369 1.755-.803c.969-.443 2.12-.032 2.571 .918 .423 .896 .079 1.966-.787 2.447l-.148 .076L16 15.208v2.02l1.426 1.425 .114 .125c.657 .778 .608 1.93-.112 2.65-.72 .72-1.872 .769-2.65 .112l-.125-.114L12.574 19.346l-.114-.124c-.059-.07-.112-.143-.161-.22h-.599q-.071 .114-.16 .22l-.115 .125L9.345 21.426c-.742 .745-1.939 .772-2.714 .061-.775-.711-.851-1.906-.172-2.709l.114-.125L8 17.227v-2.019L5.617 14.118l-.148-.075C4.603 13.562 4.259 12.492 4.682 11.596c.429-.902 1.489-1.318 2.424-.978l.147 .06 1.755 .803 .147-.369C7.868 10.222 7.073 8.78 7.005 7.217v-.217c0-2.761 2.239-5 5-5h-.005")
            addPathData("M12 16h.01")
            addPathData("M12 13h.01")
            addPathData("M10 7h.01")
            addPathData("M14 7h.01")
            addPathData("M12 9h.01")
        }
        return _cookieMan!!
    }

private var _cookieMan: ImageVector? = null
