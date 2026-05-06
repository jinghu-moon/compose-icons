package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Replace: ImageVector
    get() {
        if (_replace != null) return _replace!!
        _replace = tablerFilledIcon(
            name = "Replace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 2h-4C2.895 2 2 2.895 2 4v4c0 1.105 .895 2 2 2h4c1.105 0 2-.895 2-2v-4C10 2.895 9.105 2 8 2Z")
            addPathData("M20 14h-4c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2h4c1.105 0 2-.895 2-2v-4c0-1.105-.895-2-2-2Z")
            addPathData("M16.707 2.293c.356 .356 .392 .922 .083 1.32l-.083 .094L15.414 5h3.586c1.589-0 2.902 1.238 2.995 2.824L22 8v3c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L20 11v-3c-0-.507-.38-.934-.883-.993L19 7h-3.585l1.292 1.293c.372 .373 .39 .972 .042 1.367-.349 .395-.945 .452-1.362 .13l-.094-.083-3-3c-.232-.226-.337-.553-.28-.872l.036-.146 .04-.104c.058-.126 .14-.24 .245-.334L15.293 2.293c.391-.39 1.023-.39 1.414 0Z")
            addPathData("M3 12c.507 0 .934 .38 .993 .883L4 13v3c0 .507 .38 .934 .883 .993L5 17h3.585L7.293 15.707c-.356-.356-.392-.922-.083-1.32l.083-.094c.356-.356 .922-.392 1.32-.083l.094 .083 3 3c.232 .226 .337 .553 .28 .872l-.036 .146-.04 .104c-.058 .127-.141 .241-.245 .334L8.707 21.707c-.373 .372-.972 .39-1.367 .042-.395-.349-.452-.945-.13-1.362l.083-.094L8.584 19h-3.584C3.411 19 2.098 17.762 2.005 16.176L2 16v-3c0-.552 .448-1 1-1Z")
        }
        return _replace!!
    }

private var _replace: ImageVector? = null
