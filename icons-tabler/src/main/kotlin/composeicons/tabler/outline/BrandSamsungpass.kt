package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSamsungpass: ImageVector
    get() {
        if (_brandSamsungpass != null) return _brandSamsungpass!!
        _brandSamsungpass = tablerOutlineIcon(
            name = "BrandSamsungpass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12c0-1.105 .895-2 2-2h12c1.105 0 2 .895 2 2v7c0 1.105-.895 2-2 2h-12C4.895 21 4 20.105 4 19v-7")
            addPathData("M7 10v-1.862C7 5.3 9.239 3 12 3c2.761 0 5 2.3 5 5.138v1.862")
            addPathData("M10.485 17.577c.337 .29 .7 .423 1.515 .423h.413c.323 0 .633-.133 .862-.368 .229-.238 .357-.556 .356-.886 0-.332-.128-.65-.356-.886-.226-.234-.537-.367-.862-.368h-.826c-.325-.001-.636-.133-.861-.367-.229-.238-.357-.556-.356-.886 0-.332 .128-.651 .356-.886 .225-.234 .536-.367 .861-.368h.413c.816 0 1.178 .133 1.515 .423")
        }
        return _brandSamsungpass!!
    }

private var _brandSamsungpass: ImageVector? = null
