package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.OctahedronPlus: ImageVector
    get() {
        if (_octahedronPlus != null) return _octahedronPlus!!
        _octahedronPlus = tablerOutlineIcon(
            name = "OctahedronPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21.498 12.911l.206-.208c.189-.185 .296-.439 .296-.703 0-.265-.107-.518-.296-.704L12.859 2.348c-.478-.465-1.24-.465-1.718 0L2.296 11.297c-.189 .185-.296 .439-.296 .703 0 .265 .107 .518 .296 .704l8.845 8.949c.479 .464 1.24 .463 1.718-.001l.08-.081")
            addPathData("M2 12c.004 .086 .103 .178 .296 .246l8.845 2.632c.459 .163 1.259 .163 1.718 0l2.634-.784M20.903 12.484l.801-.238c.195-.07 .294-.156 .296-.243")
            addPathData("M12 2.12v19.76")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _octahedronPlus!!
    }

private var _octahedronPlus: ImageVector? = null
