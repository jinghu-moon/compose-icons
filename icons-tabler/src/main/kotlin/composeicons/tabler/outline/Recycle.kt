package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Recycle: ImageVector
    get() {
        if (_recycle != null) return _recycle!!
        _recycle = tablerOutlineIcon(
            name = "Recycle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17l-2 2 2 2")
            addPathData("M10 19h9c.646-.033 1.237-.377 1.584-.924 .348-.546 .409-1.227 .166-1.826l-.55-1")
            addPathData("M8.536 11 7.804 8.268 5.072 9")
            addPathData("M7.804 8.268 3.304 16.062c-.294 .576-.291 1.259 .008 1.833 .299 .574 .857 .968 1.498 1.057l1.141 .024")
            addPathData("M15.464 11l2.732 .732L18.928 9")
            addPathData("M18.196 11.732 13.696 3.938c-.352-.543-.945-.882-1.592-.91-.647-.028-1.267 .259-1.664 .77l-.591 .976")
        }
        return _recycle!!
    }

private var _recycle: ImageVector? = null
