package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CarouselHorizontal: ImageVector
    get() {
        if (_carouselHorizontal != null) return _carouselHorizontal!!
        _carouselHorizontal = tablerFilledIcon(
            name = "CarouselHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 4h-8C6.895 4 6 4.895 6 6v12c0 1.105 .895 2 2 2h8c1.105 0 2-.895 2-2v-12C18 4.895 17.105 4 16 4Z")
            addPathData("M22 6c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L22 8h-1v8h1c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L22 18h-1c-1.047 0-1.917-.806-1.995-1.85L19 16v-8c-0-1.047 .806-1.917 1.85-1.995L21 6h1Z")
            addPathData("M3 6c1.047-0 1.917 .806 1.995 1.85L5 8v8c0 1.047-.806 1.917-1.85 1.995L3 18h-1c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L2 16h1v-8h-1C1.471 7.999 1.034 7.587 1.003 7.059 .972 6.53 1.358 6.069 1.883 6.007L2 6h1Z")
        }
        return _carouselHorizontal!!
    }

private var _carouselHorizontal: ImageVector? = null
