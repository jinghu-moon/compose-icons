package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CarouselVertical: ImageVector
    get() {
        if (_carouselVertical != null) return _carouselVertical!!
        _carouselVertical = tablerFilledIcon(
            name = "CarouselVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 6h-12C4.895 6 4 6.895 4 8v8c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-8C20 6.895 19.105 6 18 6Z")
            addPathData("M16 19c1.047-0 1.917 .806 1.995 1.85L18 21v1c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L16 22v-1h-8v1c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L6 22v-1c-0-1.047 .806-1.917 1.85-1.995L8 19h8Z")
            addPathData("M17 1c.507 0 .934 .38 .993 .883L18 2v1c0 1.047-.806 1.917-1.85 1.995L16 5h-8C6.953 5 6.083 4.194 6.005 3.15L6 3v-1c.001-.529 .413-.966 .941-.997 .528-.031 .989 .355 1.052 .88L8 2v1h8v-1c0-.552 .448-1 1-1Z")
        }
        return _carouselVertical!!
    }

private var _carouselVertical: ImageVector? = null
