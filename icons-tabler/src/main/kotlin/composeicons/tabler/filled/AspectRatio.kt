package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AspectRatio: ImageVector
    get() {
        if (_aspectRatio != null) return _aspectRatio!!
        _aspectRatio = tablerFilledIcon(
            name = "AspectRatio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4h-14C3.343 4 2 5.343 2 7v10c0 1.657 1.343 3 3 3h14c1.657 0 3-1.343 3-3v-10C22 5.343 20.657 4 19 4ZM9 7c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L9 9h-2v2c-0 .507-.38 .934-.883 .993L6 12c-.507-0-.934-.38-.993-.883L5 11v-3c0-.507 .38-.934 .883-.993L6 7h3ZM18 12c.507 0 .934 .38 .993 .883L19 13v3c-0 .507-.38 .934-.883 .993L18 17h-3c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L15 15h2v-2c0-.507 .38-.934 .883-.993L18 12Z"),
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
        return _aspectRatio!!
    }

private var _aspectRatio: ImageVector? = null
