package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BellZ: ImageVector
    get() {
        if (_bellZ != null) return _bellZ!!
        _bellZ = tablerFilledIcon(
            name = "BellZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.235 19c.865 0 1.322 1.024 .745 1.668C14.222 21.516 13.138 22.001 12 22c-1.138 .001-2.222-.484-2.98-1.332-.552-.616-.158-1.579 .634-1.661l.11-.006h4.471Z")
            addPathData("M12 2c1.358 0 2.506 .903 2.875 2.141l.046 .171 .008 .043c2.236 1.262 3.732 3.518 4.024 6.069l.028 .287L19 11v2.931l.021 .136c.137 .737 .545 1.396 1.143 1.847l.167 .117 .162 .099c.86 .487 .56 1.766-.377 1.864L20 18h-16C2.972 18 2.613 16.636 3.507 16.13c.771-.436 1.31-1.192 1.472-2.063L5 13.924l.001-2.97C5.125 8.302 6.556 5.884 8.822 4.5l.248-.146 .01-.043C9.37 3.086 10.392 2.172 11.642 2.021l.182-.017L12 2ZM14 8h-4l-.117 .007C9.38 8.066 9 8.493 9 9l.007 .117c.059 .503 .486 .883 .993 .883h1.584L9.293 12.293l-.076 .084C8.703 13.014 9.147 14 10 14h4l.117-.007c.503-.059 .883-.486 .883-.993l-.007-.117C14.934 12.38 14.507 12 14 12h-1.586L14.707 9.707l.076-.084C15.297 8.986 14.853 8 14 8Z")
        }
        return _bellZ!!
    }

private var _bellZ: ImageVector? = null
