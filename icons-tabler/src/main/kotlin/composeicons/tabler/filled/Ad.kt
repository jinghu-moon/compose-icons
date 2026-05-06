package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ad: ImageVector
    get() {
        if (_ad != null) return _ad!!
        _ad = tablerFilledIcon(
            name = "Ad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4h-14C3.343 4 2 5.343 2 7v10c0 1.657 1.343 3 3 3h14c1.657 0 3-1.343 3-3v-10C22 5.343 20.657 4 19 4ZM9 8c1.589-0 2.902 1.238 2.995 2.824L12 11v4c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L10 15v-1h-2v1c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L6 15v-4C6 9.343 7.343 8 9 8ZM9 10c-.507 0-.934 .38-.993 .883L8 11v1h2v-1c0-.552-.448-1-1-1ZM17 8c.507 0 .934 .38 .993 .883L18 9v6c-0 .507-.38 .934-.883 .993L17 16h-1.5c-.932-.001-1.785-.52-2.215-1.346-.43-.826-.365-1.823 .169-2.587 .534-.763 1.448-1.166 2.372-1.046l.174 .029v-2.05c0-.507 .38-.934 .883-.993L17 8ZM15.59 13.008 15.5 13c-.259-0-.475 .197-.499 .455-.023 .258 .154 .491 .409 .537l.09 .008h.5v-.5l-.008-.09c-.032-.174-.153-.318-.318-.379l-.084-.023Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _ad!!
    }

private var _ad: ImageVector? = null
