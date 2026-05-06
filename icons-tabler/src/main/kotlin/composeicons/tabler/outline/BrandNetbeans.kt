package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNetbeans: ImageVector
    get() {
        if (_brandNetbeans != null) return _brandNetbeans!!
        _brandNetbeans = tablerOutlineIcon(
            name = "BrandNetbeans",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.875 6.27c.7 .398 1.13 1.143 1.125 1.948v7.284c0 .809-.443 1.555-1.158 1.948l-6.75 4.27c-.68 .373-1.504 .373-2.184 0L4.158 17.45C3.445 17.061 3.002 16.314 3 15.502v-7.285C3 7.408 3.443 6.663 4.158 6.27L10.908 2.29c.7-.386 1.55-.386 2.25 0l6.75 3.98h-.033")
            addPathData("M15.5 9.43c.312 .18 .503 .514 .5 .874v3.268c-0 .363-.197 .698-.515 .874l-3 1.917c-.302 .167-.668 .167-.97 0l-3-1.917C8.198 14.27 8.001 13.936 8 13.573v-3.269c-0-.363 .197-.698 .514-.874l3-1.786c.311-.173 .69-.173 1 0l3 1.787h-.014v-.001")
            addPathData("M12 21v-9L4.5 7.5")
            addPathData("M12 12 19.5 7.5")
            addPathData("M12 3v4.5")
            addPathData("M19.5 16 16 14")
            addPathData("M8 14 4.5 16")
        }
        return _brandNetbeans!!
    }

private var _brandNetbeans: ImageVector? = null
