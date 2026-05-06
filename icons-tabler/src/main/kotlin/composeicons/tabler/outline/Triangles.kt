package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Triangles: ImageVector
    get() {
        if (_triangles != null) return _triangles!!
        _triangles = tablerOutlineIcon(
            name = "Triangles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.974 21h8.052c.36-0 .69-.198 .86-.516 .169-.317 .15-.702-.05-1.001L14.811 13.435c-.18-.272-.485-.435-.811-.435-.326 0-.631 .163-.811 .435L9.164 19.483c-.199 .299-.217 .683-.048 1 .169 .317 .498 .515 .858 .517")
            addPathData("M4.98 16h14.04c.542 0 .98-.443 .98-.989-0-.189-.055-.374-.156-.534L12.824 3.454C12.646 3.171 12.335 2.999 12 2.999c-.335 0-.646 .172-.824 .455L4.156 14.477c-.289 .46-.159 1.066 .294 1.366 .158 .102 .342 .157 .53 .157")
        }
        return _triangles!!
    }

private var _triangles: ImageVector? = null
