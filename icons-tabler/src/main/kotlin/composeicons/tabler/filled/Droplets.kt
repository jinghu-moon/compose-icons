package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Droplets: ImageVector
    get() {
        if (_droplets != null) return _droplets!!
        _droplets = tablerFilledIcon(
            name = "Droplets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 12.003c.541 0 1.045 .273 1.342 .727l2.122 3.273c.972 1.681 .596 3.817-.892 5.065C7.085 22.316 4.915 22.315 3.429 21.066 1.942 19.818 1.565 17.684 2.562 15.956L4.66 12.73c.295-.453 .799-.727 1.34-.727")
            addPathData("M18 12.003c.541 0 1.045 .273 1.342 .727l2.122 3.273c.972 1.681 .596 3.817-.892 5.065-1.488 1.248-3.657 1.247-5.143-.002-1.487-1.248-1.864-3.382-.867-5.11l2.098-3.227c.295-.453 .799-.726 1.34-.726")
            addPathData("M12 2.003c.541 0 1.045 .273 1.342 .727l2.122 3.273c.972 1.681 .596 3.817-.892 5.065-1.488 1.248-3.657 1.247-5.143-.002C7.942 9.818 7.565 7.684 8.562 5.956L10.66 2.73c.295-.453 .799-.727 1.34-.727")
        }
        return _droplets!!
    }

private var _droplets: ImageVector? = null
