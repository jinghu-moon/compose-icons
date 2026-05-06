package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTorchain: ImageVector
    get() {
        if (_brandTorchain != null) return _brandTorchain!!
        _brandTorchain = tablerOutlineIcon(
            name = "BrandTorchain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.588 15.537 12.035 12 4.293 20.18c-.791 .85 .153 2.18 1.238 1.73l9.616-4.096c.428-.182 .738-.565 .826-1.021 .088-.457-.056-.927-.386-1.256")
            addPathData("M8.412 8.464 11.965 12 19.707 3.82c.791-.85-.153-2.18-1.238-1.73L8.853 6.188c-.428 .182-.738 .565-.826 1.021-.088 .457 .056 .927 .386 1.256L8.412 8.464")
        }
        return _brandTorchain!!
    }

private var _brandTorchain: ImageVector? = null
