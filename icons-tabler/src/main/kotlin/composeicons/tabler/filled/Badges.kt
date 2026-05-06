package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Badges: ImageVector
    get() {
        if (_badges != null) return _badges!!
        _badges = tablerFilledIcon(
            name = "Badges",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.486 12.143 12 14.833 7.514 12.143c-.309-.185-.693-.19-1.007-.012C6.194 12.308 6 12.64 6 13v4c0 .351 .185 .676 .486 .857l5 3c.316 .19 .712 .19 1.028 0l5-3c.301-.181 .486-.506 .486-.857v-4c-0-.36-.194-.692-.507-.869-.313-.177-.698-.173-1.007 .012Z")
            addPathData("M16.486 3.143 12 5.833 7.514 3.143C7.205 2.958 6.821 2.953 6.507 3.131 6.194 3.308 6 3.64 6 4v4c0 .351 .185 .676 .486 .857l5 3c.316 .19 .712 .19 1.028 0l5-3C17.815 8.676 18 8.351 18 8v-4c-0-.36-.194-.692-.507-.869-.313-.177-.698-.173-1.007 .012Z")
        }
        return _badges!!
    }

private var _badges: ImageVector? = null
