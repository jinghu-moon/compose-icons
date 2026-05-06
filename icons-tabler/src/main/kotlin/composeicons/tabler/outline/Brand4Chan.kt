package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Brand4Chan: ImageVector
    get() {
        if (_brand4Chan != null) return _brand4Chan!!
        _brand4Chan = tablerOutlineIcon(
            name = "Brand4Chan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 11c0 0 6.054-1.05 6-4.5C19.962 4.176 17.515 3.31 16.984 5c0 0-.502-2-2.01-2C13.466 3 11.99 6 14 11")
            addPathData("M13.98 11c0 0 6.075-1.05 6.02-4.5C19.962 4.176 17.507 3.31 16.975 5c0 0-.505-2-2.017-2-1.513 0-3 3-.977 8h-.001")
            addPathData("M13 13.98l.062 .309 .081 .35 .075 .29 .092 .328 .11 .358 .061 .188 .139 .392c.64 1.73 1.841 3.837 3.88 3.805 2.324-.038 3.19-2.493 1.5-3.025l.148-.045 .165-.058c.033-.013 .066-.026 .098-.039l.222-.098C20.219 16.455 21 15.903 21 14.958c0-1.513-3-3-8-.977")
            addPathData("M10.02 13l-.309 .062-.35 .081-.29 .075-.328 .092-.358 .11-.188 .061-.392 .139C6.075 14.26 3.968 15.46 4 17.5c.038 2.324 2.493 3.19 3.025 1.5l.045 .148 .058 .165 .039 .098 .098 .222C7.545 20.219 8.097 21 9.042 21c1.513 0 3-3 .977-8")
            addPathData("M11 10.02l-.062-.309-.081-.35-.075-.29-.092-.328-.11-.358-.128-.382-.148-.399C9.646 5.917 8.46 3.97 6.5 4 4.176 4.038 3.31 6.493 5 7.025l-.148 .045-.164 .058c-.034 .013-.067 .026-.1 .039l-.22 .098C3.78 7.545 3 8.097 3 9.042c0 1.513 3 3 8 .977")
        }
        return _brand4Chan!!
    }

private var _brand4Chan: ImageVector? = null
