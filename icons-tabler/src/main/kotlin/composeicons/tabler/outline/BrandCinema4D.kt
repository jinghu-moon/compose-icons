package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCinema4D: ImageVector
    get() {
        if (_brandCinema4D != null) return _brandCinema4D!!
        _brandCinema4D = tablerOutlineIcon(
            name = "BrandCinema4D",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.65 6.956c-1.471 2.141-1.205 5.026 .631 6.863 1.836 1.837 4.722 2.102 6.863 .632")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M17.7 12.137c0 2.321-1.397 4.414-3.542 5.302-2.144 .888-4.612 .398-6.254-1.244C6.263 14.554 5.773 12.086 6.661 9.942 7.549 7.797 9.642 6.4 11.963 6.4")
            addPathData("M17.7 12.338v-1.175c0-.47 .171-.92 .476-1.253 .293-.327 .71-.516 1.149-.52 .827 0 1.523 .676 1.62 1.573 .037 .344 .055 .69 .055 1.037")
            addPathData("M11.662 6.4h1.175c.47 0 .92-.176 1.253-.49 .333-.314 .52-.74 .52-1.184 0-.852-.676-1.57-1.573-1.67C12.693 3.018 12.346 3 12 3")
        }
        return _brandCinema4D!!
    }

private var _brandCinema4D: ImageVector? = null
