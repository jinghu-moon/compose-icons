package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartCandle: ImageVector
    get() {
        if (_chartCandle != null) return _chartCandle!!
        _chartCandle = tablerFilledIcon(
            name = "ChartCandle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 3c.507 0 .934 .38 .993 .883L7 4v1c1.047-0 1.917 .806 1.995 1.85L9 7v3c0 1.047-.806 1.917-1.85 1.995L7 12v8c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L5 20v-8C3.953 12 3.083 11.194 3.005 10.15L3 10v-3C3 5.953 3.806 5.083 4.85 5.005L5 5v-1C5 3.448 5.448 3 6 3Z")
            addPathData("M12 3c.507 0 .934 .38 .993 .883L13 4v9c1.047-0 1.917 .806 1.995 1.85L15 15v3c0 1.047-.806 1.917-1.85 1.995L13 20c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L11 20l-.15-.005C9.866 19.921 9.083 19.141 9.006 18.157L9 18v-3c-0-1.047 .806-1.917 1.85-1.995L11 13v-9c0-.552 .448-1 1-1Z")
            addPathData("M18 3c.507 0 .934 .38 .993 .883L19 4c1.047-0 1.917 .806 1.995 1.85L21 6v4c0 1.047-.806 1.917-1.85 1.995L19 12v8c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L17 20v-8c-1.047 0-1.917-.806-1.995-1.85L15 10v-4c-0-1.047 .806-1.917 1.85-1.995L17 4c0-.552 .448-1 1-1Z")
        }
        return _chartCandle!!
    }

private var _chartCandle: ImageVector? = null
