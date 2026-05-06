package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Butterfly: ImageVector
    get() {
        if (_butterfly != null) return _butterfly!!
        _butterfly = tablerOutlineIcon(
            name = "Butterfly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18.176c-.08 1.361-1.068 2.497-2.405 2.765C8.258 21.209 6.908 20.542 6.31 19.317c-.599-1.225-.296-2.7 .737-3.59l-.025 .023C4.953 15.024 3.708 12.912 4.074 10.75 4.441 8.587 6.312 7.004 8.505 7c1.414 0 2.675 .652 3.5 1.671C13.206 7.188 15.212 6.623 17.01 7.262c1.798 .639 2.998 2.343 2.993 4.252-.005 1.909-1.213 3.606-3.015 4.236 1.037 .913 1.316 2.416 .676 3.641-.64 1.224-2.033 1.854-3.375 1.524C12.947 20.585 12.004 19.382 12.005 18L12 18.176")
            addPathData("M12 19v-10")
            addPathData("M9 3l3 2L15 3")
        }
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
