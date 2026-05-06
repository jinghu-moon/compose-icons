package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPlanetscale: ImageVector
    get() {
        if (_brandPlanetscale != null) return _brandPlanetscale!!
        _brandPlanetscale = tablerOutlineIcon(
            name = "BrandPlanetscale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.993 11.63c.103 2.513-.85 4.955-2.628 6.734-1.779 1.779-4.22 2.732-6.734 2.628l9.362-9.362")
            addPathData("M12 3c3.504-.001 6.69 2.032 8.166 5.211L8.211 20.166C4.377 18.39 2.296 14.186 3.206 10.06 4.117 5.934 7.775 2.998 12 3")
            addPathData("M12 12 6 18")
        }
        return _brandPlanetscale!!
    }

private var _brandPlanetscale: ImageVector? = null
