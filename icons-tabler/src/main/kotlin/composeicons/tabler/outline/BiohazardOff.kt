package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BiohazardOff: ImageVector
    get() {
        if (_biohazardOff != null) return _biohazardOff!!
        _biohazardOff = tablerOutlineIcon(
            name = "BiohazardOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.586 10.586c-.518 .504-.725 1.248-.54 1.946 .185 .699 .733 1.243 1.432 1.424 .7 .181 1.443-.029 1.943-.551")
            addPathData("M11.939 14c0 .173 .048 .351 .056 .533v.217c-0 2.539-1.997 4.629-4.533 4.745h-.217")
            addPathData("M2.495 14.745c0-1.83 1.052-3.498 2.704-4.286 1.652-.788 3.61-.558 5.033 .593")
            addPathData("M16.745 19.495c-1.391 0-2.713-.61-3.615-1.669-.902-1.059-1.295-2.46-1.075-3.834h-.06")
            addPathData("M14.533 10.538c1.438-.757 3.164-.726 4.574 .082 1.41 .808 2.309 2.281 2.383 3.905v.217")
            addPathData("M10.295 10.929C8.725 10.33 7.589 8.945 7.307 7.289M7.967 3.965c.147-.234 .314-.455 .5-.66l.164-.172")
            addPathData("M15.349 3.133c1.023 1.023 1.525 2.456 1.362 3.894-.163 1.438-.972 2.723-2.198 3.491")
            addPathData("M3 3 21 21")
        }
        return _biohazardOff!!
    }

private var _biohazardOff: ImageVector? = null
