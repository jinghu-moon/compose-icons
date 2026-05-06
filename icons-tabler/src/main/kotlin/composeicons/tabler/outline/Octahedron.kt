package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Octahedron: ImageVector
    get() {
        if (_octahedron != null) return _octahedron!!
        _octahedron = tablerOutlineIcon(
            name = "Octahedron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.859 21.652l8.845-8.949c.189-.185 .296-.439 .296-.703 0-.265-.107-.518-.296-.704L12.859 2.348c-.478-.465-1.24-.465-1.718 0L2.296 11.297c-.189 .185-.296 .439-.296 .703 0 .265 .107 .518 .296 .704l8.845 8.949c.479 .464 1.24 .463 1.718-.001")
            addPathData("M2 12c.004 .086 .103 .178 .296 .246l8.845 2.632c.459 .163 1.259 .163 1.718 0l8.845-2.632c.195-.07 .294-.156 .296-.243")
            addPathData("M12 2.12v19.76")
        }
        return _octahedron!!
    }

private var _octahedron: ImageVector? = null
