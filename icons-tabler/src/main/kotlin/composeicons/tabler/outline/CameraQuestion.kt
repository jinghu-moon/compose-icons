package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraQuestion: ImageVector
    get() {
        if (_cameraQuestion != null) return _cameraQuestion!!
        _cameraQuestion = tablerOutlineIcon(
            name = "CameraQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 20h-10C3.895 20 3 19.105 3 18v-9C3 7.895 3.895 7 5 7h1C7.105 7 8 6.105 8 5 8 4.448 8.448 4 9 4h6c.552 0 1 .448 1 1 0 1.105 .895 2 2 2h1c1.105 0 2 .895 2 2v2.5")
            addPathData("M14.975 12.612c-.171-1.307-1.175-2.35-2.475-2.569-1.3-.22-2.591 .435-3.182 1.613-.591 1.178-.343 2.604 .61 3.515 .954 .91 2.39 1.091 3.539 .447")
            addPathData("M19 22v.01")
            addPathData("M19 19c.923-.003 1.724-.636 1.941-1.532 .217-.897-.207-1.826-1.027-2.25-.819-.42-1.819-.219-2.414 .483")
        }
        return _cameraQuestion!!
    }

private var _cameraQuestion: ImageVector? = null
