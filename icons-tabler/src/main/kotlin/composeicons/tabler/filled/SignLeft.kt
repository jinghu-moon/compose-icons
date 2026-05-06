package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SignLeft: ImageVector
    get() {
        if (_signLeft != null) return _signLeft!!
        _signLeft = tablerFilledIcon(
            name = "SignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 2c.507 0 .934 .38 .993 .883L15 3v2h3c.507 0 .934 .38 .993 .883L19 6v5c-0 .507-.38 .934-.883 .993L18 12h-3v8h1c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L16 22h-4c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L12 20h1v-8h-5c-.259 0-.508-.1-.694-.28l-.087-.095-2-2.5C4.956 8.796 4.927 8.337 5.147 7.978l.072-.103 2-2.5c.162-.202 .395-.334 .652-.367L8 5h5v-2c0-.552 .448-1 1-1Z"),
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
        return _signLeft!!
    }

private var _signLeft: ImageVector? = null
