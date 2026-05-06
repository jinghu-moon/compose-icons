package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandZoom: ImageVector
    get() {
        if (_brandZoom != null) return _brandZoom!!
        _brandZoom = tablerOutlineIcon(
            name = "BrandZoom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.011 9.385v5.128L21 18v-12L17.011 9.385")
            addPathData("M3.887 6h10.08C15.435 6 17 7.203 17 8.803v8.196c.005 .545-.43 .991-.975 1h-10.373C3.985 17.999 3 16.499 3 14.999L3.01 6.999c-.038-.256 .038-.515 .208-.71 .168-.193 .415-.298 .67-.287L3.887 6")
        }
        return _brandZoom!!
    }

private var _brandZoom: ImageVector? = null
