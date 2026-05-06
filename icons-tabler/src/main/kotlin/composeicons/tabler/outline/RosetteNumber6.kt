package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RosetteNumber6: ImageVector
    get() {
        if (_rosetteNumber6 != null) return _rosetteNumber6!!
        _rosetteNumber6 = tablerOutlineIcon(
            name = "RosetteNumber6",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 9C14 8.448 13.552 8 13 8h-2c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1h-3")
            addPathData("M5 7.2C5 5.985 5.985 5 7.2 5h1c.581-0 1.138-.23 1.55-.64l.7-.7c.413-.415 .974-.649 1.56-.649 .586 0 1.147 .233 1.56 .649l.7 .7c.412 .41 .97 .64 1.55 .64h1c1.215 0 2.2 .985 2.2 2.2v1c0 .58 .23 1.138 .64 1.55l.7 .7c.415 .413 .649 .974 .649 1.56 0 .586-.233 1.147-.649 1.56l-.7 .7c-.41 .412-.64 .969-.64 1.55v1c0 1.215-.985 2.2-2.2 2.2h-1c-.581 0-1.138 .23-1.55 .64l-.7 .7c-.413 .415-.974 .649-1.56 .649-.586 0-1.147-.233-1.56-.649l-.7-.7c-.412-.41-.969-.64-1.55-.64h-1C5.985 19.02 5 18.035 5 16.82v-1c-0-.581-.23-1.138-.64-1.55l-.7-.7c-.415-.413-.649-.974-.649-1.56 0-.586 .233-1.147 .649-1.56l.7-.7C4.77 9.338 5 8.781 5 8.2v-1")
        }
        return _rosetteNumber6!!
    }

private var _rosetteNumber6: ImageVector? = null
