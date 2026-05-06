package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Campfire: ImageVector
    get() {
        if (_campfire != null) return _campfire!!
        _campfire = tablerFilledIcon(
            name = "Campfire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.757 16.03c.513-.127 1.037 .167 1.195 .671 .158 .505-.104 1.045-.598 1.233l-.111 .035-16 4c-.513 .127-1.037-.167-1.195-.671-.158-.505 .104-1.045 .598-1.233l.111-.035 16-4Z")
            addPathData("M3.03 16.757c.123-.492 .595-.814 1.098-.749l.115 .022 16 4c.514 .128 .838 .635 .74 1.155-.098 .52-.585 .874-1.11 .807l-.116-.022-16-4c-.536-.134-.861-.677-.727-1.213Z")
            addPathData("M13.553 2.106C9.379 4.192 7 7.464 7 11c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C17 9.953 16.812 9.192 16.394 8.295l-.169-.345-.33-.647C15.274 6.063 15 4.965 15 3c-0-.346-.18-.668-.474-.85-.295-.182-.663-.199-.973-.044Z")
        }
        return _campfire!!
    }

private var _campfire: ImageVector? = null
