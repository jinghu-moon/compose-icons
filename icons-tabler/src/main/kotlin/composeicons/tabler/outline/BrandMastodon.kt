package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMastodon: ImageVector
    get() {
        if (_brandMastodon != null) return _brandMastodon!!
        _brandMastodon = tablerOutlineIcon(
            name = "BrandMastodon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.648 15.254C16.832 17.017 12 16.88 12 16.88c-1.101 .014-2.202-.072-3.288-.256 1.127 1.985 4.12 2.81 8.982 2.475C15.749 21.112 4.096 24.356 4.026 11.463L4 10.309C4 7.273 4.023 6.194 5.352 4.676 7.023 2.766 12 3.01 12 3.01c0 0 4.977-.243 6.648 1.667C19.977 6.195 20 7.274 20 10.31c0 3.036-.456 4.074-1.352 4.944")
            addPathData("M12 11.204v-2.926C12 7.02 11.105 6 10 6 8.895 6 8 7.02 8 8.278v4.722M12 8.278C12 7.02 12.895 6 14 6c1.105 0 2 1.02 2 2.278v4.722")
        }
        return _brandMastodon!!
    }

private var _brandMastodon: ImageVector? = null
