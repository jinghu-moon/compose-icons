package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = tablerFilledIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9.585v6.415h6.414l-2.707 2.707c-.035 .035-.072 .067-.112 .097l-.11 .071-.114 .054-.105 .035-.149 .03L11 19h-4.586L4.707 20.707c-.251 .26-.623 .364-.973 .273-.35-.092-.623-.365-.714-.714-.092-.35 .013-.721 .273-.973L5 17.584v-4.584l.003-.075 .017-.126 .03-.111 .044-.111 .052-.098 .067-.096 .08-.09Z")
            addPathData("M19.414 11l-3 3h-4.914l2.914-3Z")
            addPathData("M13 4.586v4.998l-3 3v-4.999Z")
            addPathData("M16.482 3c1.198-.001 2.347 .474 3.194 1.321 .847 .847 1.324 1.995 1.324 3.193 .001 .505-.08 1.007-.239 1.487L15 9v-5.76C15.469 3.082 15.968 3 16.482 3")
        }
        return _feather!!
    }

private var _feather: ImageVector? = null
