package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGooglePlay: ImageVector
    get() {
        if (_brandGooglePlay != null) return _brandGooglePlay!!
        _brandGooglePlay = tablerOutlineIcon(
            name = "BrandGooglePlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 3.71v16.58c0 .25 .134 .481 .35 .606 .217 .125 .483 .125 .7-0L19.672 12.476c.17-.098 .275-.28 .275-.476 0-.197-.105-.378-.275-.477L5.05 3.104c-.217-.125-.484-.125-.7 0C4.133 3.229 4 3.461 4 3.711v-.001")
            addPathData("M15 9 4.5 20.5")
            addPathData("M4.5 3.5 15 15")
        }
        return _brandGooglePlay!!
    }

private var _brandGooglePlay: ImageVector? = null
