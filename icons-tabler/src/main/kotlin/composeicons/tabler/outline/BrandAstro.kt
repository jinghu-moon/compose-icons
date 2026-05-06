package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAstro: ImageVector
    get() {
        if (_brandAstro != null) return _brandAstro!!
        _brandAstro = tablerOutlineIcon(
            name = "BrandAstro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.972 3.483c.163 .196 .247 .46 .413 .987L19.025 16c-1.372-.686-2.839-1.165-4.352-1.42L12.303 6.857c-.042-.128-.162-.214-.296-.213-.134-0-.253 .086-.295 .214L9.37 14.576C7.851 14.83 6.378 15.309 5 15.998L8.657 4.468c.168-.527 .251-.79 .415-.986 .144-.172 .331-.306 .544-.388C9.858 3 10.143 3 10.715 3h2.612c.572 0 .858 0 1.1 .094 .213 .082 .4 .217 .545 .39")
            addPathData("M9 18c0 1.5 2 3 3 4 1-1 3-3 3-4q-3 1.5-6 0")
        }
        return _brandAstro!!
    }

private var _brandAstro: ImageVector? = null
