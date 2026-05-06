package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrightnessUp: ImageVector
    get() {
        if (_brightnessUp != null) return _brightnessUp!!
        _brightnessUp = tablerFilledIcon(
            name = "BrightnessUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8c2.183 0 3.963 1.75 3.999 3.933 .036 2.183-1.684 3.992-3.866 4.064C9.951 16.071 8.114 14.38 8.005 12.2L8 12l.005-.2C8.112 9.671 9.869 8 12 8Z")
            addPathData("M12 2c.507 0 .934 .38 .993 .883L13 3v2c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L11 5v-2c0-.552 .448-1 1-1Z")
            addPathData("M17.693 4.893c.373-.372 .972-.39 1.367-.042 .395 .349 .452 .945 .13 1.362l-.083 .094L17.707 7.707c-.373 .372-.972 .39-1.367 .042-.395-.349-.452-.945-.13-1.362l.083-.094L17.693 4.893Z")
            addPathData("M21 11c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L21 13h-2c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L19 11h2Z")
            addPathData("M16.293 16.293c.356-.356 .922-.392 1.32-.083l.094 .083 1.4 1.4c.372 .373 .39 .972 .042 1.367-.349 .395-.945 .452-1.362 .13l-.094-.083L16.293 17.707c-.39-.391-.39-1.024 0-1.414Z")
            addPathData("M12 18c.507 0 .934 .38 .993 .883L13 19v2c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L11 21v-2c0-.552 .448-1 1-1Z")
            addPathData("M6.293 16.293c.373-.372 .972-.39 1.367-.042 .395 .349 .452 .945 .13 1.362l-.083 .094L6.307 19.107c-.373 .372-.972 .39-1.367 .042-.395-.349-.452-.945-.13-1.362l.083-.094L6.293 16.293Z")
            addPathData("M6 11c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L6 13h-2c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L4 11h2Z")
            addPathData("M4.893 4.893c.356-.356 .922-.392 1.32-.083l.094 .083L7.707 6.293c.372 .373 .39 .972 .042 1.367-.349 .395-.945 .452-1.362 .13L6.293 7.707 4.893 6.307c-.39-.391-.39-1.024 0-1.414Z")
        }
        return _brightnessUp!!
    }

private var _brightnessUp: ImageVector? = null
