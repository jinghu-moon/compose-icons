package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Sun: ImageVector
    get() {
        if (_sun != null) return _sun!!
        _sun = tablerFilledIcon(
            name = "Sun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 19c.507 0 .934 .38 .993 .883L13 20v1c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L11 21v-1c0-.552 .448-1 1-1Z")
            addPathData("M18.313 16.91l.094 .083 .7 .7c.372 .373 .39 .972 .042 1.367-.349 .395-.945 .452-1.362 .13l-.094-.083-.7-.7c-.357-.356-.393-.923-.083-1.321 .31-.398 .868-.504 1.301-.246l.102 .07Z")
            addPathData("M7.007 16.993c.356 .356 .392 .922 .083 1.32l-.083 .094-.7 .7c-.373 .372-.972 .39-1.367 .042-.395-.349-.452-.945-.13-1.362l.083-.094 .7-.7c.391-.39 1.024-.39 1.414 0Z")
            addPathData("M4 11c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L4 13h-1c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L3 11h1Z")
            addPathData("M21 11c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L21 13h-1c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L20 11h1Z")
            addPathData("M6.213 4.81l.094 .083 .7 .7c.372 .373 .39 .972 .042 1.367-.349 .395-.945 .452-1.362 .13L5.593 7.007 4.893 6.307C4.537 5.95 4.502 5.385 4.811 4.987c.309-.398 .865-.504 1.299-.247l.102 .07Z")
            addPathData("M19.107 4.893c.356 .356 .392 .922 .083 1.32l-.083 .094-.7 .7c-.373 .372-.972 .39-1.367 .042-.395-.349-.452-.945-.13-1.362l.083-.094 .7-.7c.39-.39 1.023-.39 1.414 0Z")
            addPathData("M12 2c.507 0 .934 .38 .993 .883L13 3v1c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L11 4v-1c0-.552 .448-1 1-1Z")
            addPathData("M12 7c2.733-0 4.96 2.194 5 4.927 .04 2.733-2.123 4.991-4.855 5.07C9.413 17.077 7.124 14.948 7.005 12.217L7 12l.005-.217C7.121 9.109 9.323 7 12 7Z")
        }
        return _sun!!
    }

private var _sun: ImageVector? = null
