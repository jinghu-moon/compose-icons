package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandHeadlessui: ImageVector
    get() {
        if (_brandHeadlessui != null) return _brandHeadlessui!!
        _brandHeadlessui = tablerOutlineIcon(
            name = "BrandHeadlessui",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.744 4.325 14.564 3.058c2.429-.393 4.717 1.257 5.111 3.686l1.267 7.82c.393 2.429-1.257 4.717-3.686 5.111L9.436 20.942C7.007 21.335 4.719 19.685 4.325 17.256L3.058 9.436C2.665 7.007 4.315 4.719 6.744 4.325")
            addPathData("M7.252 7.704 15.149 6.424c.262-.042 .53 .021 .745 .176 .215 .155 .36 .39 .402 .652l.36 2.223L7.094 12.985 6.424 8.851c-.042-.262 .021-.53 .176-.745 .155-.215 .39-.36 .652-.402")
        }
        return _brandHeadlessui!!
    }

private var _brandHeadlessui: ImageVector? = null
