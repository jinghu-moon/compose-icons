package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Fountain: ImageVector
    get() {
        if (_fountain != null) return _fountain!!
        _fountain = tablerFilledIcon(
            name = "Fountain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 2c2.209 0 4 1.791 4 4-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L17 6C17.005 4.921 16.153 4.033 15.075 3.992c-1.078-.04-1.994 .781-2.07 1.858L13 6v9h1v-4C14 9.343 15.343 8 17 8c1.657 0 3 1.343 3 3-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L18 11c-.001-.529-.413-.966-.941-.997-.528-.031-.989 .355-1.052 .88L16 11v4h5c.507 0 .934 .38 .993 .883L22 16v2c0 2.131-1.671 3.888-3.8 3.995L18 22h-12C3.869 22 2.112 20.329 2.005 18.2L2 18v-2c0-.507 .38-.934 .883-.993L3 15h5v-4c-.001-.529-.413-.966-.941-.997-.528-.031-.989 .355-1.052 .88L6 11c0 .552-.448 1-1 1C4.448 12 4 11.552 4 11 3.998 9.376 5.289 8.046 6.912 7.998c1.623-.048 2.989 1.205 3.083 2.826L10 11v4h1v-9C11 4.895 10.105 4 9 4 7.895 4 7 4.895 7 6 7 6.552 6.552 7 6 7 5.448 7 5 6.552 5 6 5 4.336 6.03 2.846 7.586 2.258c1.557-.588 3.315-.151 4.415 1.097C12.759 2.492 13.852 1.998 15 2Z"),
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
        return _fountain!!
    }

private var _fountain: ImageVector? = null
