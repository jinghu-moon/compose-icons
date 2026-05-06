package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Transform: ImageVector
    get() {
        if (_transform != null) return _transform!!
        _transform = tablerFilledIcon(
            name = "Transform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 14c2.183 0 3.963 1.75 3.999 3.933 .036 2.183-1.684 3.992-3.866 4.064-2.182 .073-4.019-1.617-4.128-3.798L14 18l.005-.2C14.112 15.671 15.869 14 18 14Z")
            addPathData("M16.707 2.293c.356 .356 .392 .922 .083 1.32l-.083 .094L15.414 5h3.586c1.589-0 2.902 1.238 2.995 2.824L22 8v3c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L20 11v-3c-0-.507-.38-.934-.883-.993L19 7h-3.585l1.292 1.293c.372 .373 .39 .972 .042 1.367-.349 .395-.945 .452-1.362 .13l-.094-.083-3-3c-.232-.226-.337-.553-.28-.872l.036-.146 .04-.104c.058-.126 .14-.24 .245-.334L15.293 2.293c.391-.39 1.023-.39 1.414 0Z")
            addPathData("M3 12c.507 0 .934 .38 .993 .883L4 13v3c0 .507 .38 .934 .883 .993L5 17h3.585L7.293 15.707c-.356-.356-.392-.922-.083-1.32l.083-.094c.356-.356 .922-.392 1.32-.083l.094 .083 3 3c.232 .226 .337 .553 .28 .872l-.036 .146-.04 .104c-.058 .127-.141 .241-.245 .334L8.707 21.707c-.373 .372-.972 .39-1.367 .042-.395-.349-.452-.945-.13-1.362l.083-.094L8.584 19h-3.584C3.411 19 2.098 17.762 2.005 16.176L2 16v-3c0-.552 .448-1 1-1Z")
            addPathData("M6 2c2.183 0 3.963 1.75 3.999 3.933C10.036 8.116 8.315 9.925 6.133 9.998 3.951 10.071 2.114 8.38 2.005 6.2L2 6l.005-.2C2.112 3.671 3.869 2 6 2Z")
        }
        return _transform!!
    }

private var _transform: ImageVector? = null
