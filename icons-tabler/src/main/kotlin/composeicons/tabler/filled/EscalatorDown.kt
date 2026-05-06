package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) return _escalatorDown!!
        _escalatorDown = tablerFilledIcon(
            name = "EscalatorDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.233 6c.741 0 1.455 .274 2.006 .77L18.384 15h1.116c1.859-0 3.393 1.452 3.495 3.308l.005 .192C23 20.433 21.433 22 19.5 22h-2.733c-.741-0-1.455-.274-2.006-.77L5.617 13h-1.117C2.641 13 1.107 11.548 1.005 9.692L1 9.5C1 7.567 2.567 6 4.5 6Z")
            addPathData("M18 2c.552 0 1 .448 1 1v4.584L20.293 6.293c.356-.356 .922-.392 1.32-.083l.094 .083c.39 .39 .39 1.023 0 1.414l-3 3c-.035 .035-.072 .067-.112 .097l-.11 .071-.114 .054-.105 .035-.149 .03L18 11l-.075-.003-.126-.017-.111-.03-.111-.044-.098-.052-.096-.067-.09-.08-3-3c-.26-.251-.364-.623-.273-.973 .092-.35 .365-.623 .714-.714 .35-.092 .721 .013 .973 .273L17 7.586v-4.586c0-.552 .448-1 1-1")
        }
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null
