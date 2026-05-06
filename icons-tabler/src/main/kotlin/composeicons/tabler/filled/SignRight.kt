package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SignRight: ImageVector
    get() {
        if (_signRight != null) return _signRight!!
        _signRight = tablerFilledIcon(
            name = "SignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 2c.507 0 .934 .38 .993 .883L11 3v2h5c.259-0 .508 .1 .694 .28l.087 .095 2 2.5c.263 .329 .292 .788 .072 1.147l-.072 .103-2 2.5c-.162 .202-.395 .334-.652 .367L16 12h-5v8h1c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L12 22h-4c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L8 20h1v-8h-3c-.507-0-.934-.38-.993-.883L5 11v-5c0-.507 .38-.934 .883-.993L6 5h3v-2C9 2.448 9.448 2 10 2Z"),
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
        return _signRight!!
    }

private var _signRight: ImageVector? = null
