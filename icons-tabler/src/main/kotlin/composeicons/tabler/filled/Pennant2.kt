package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pennant2: ImageVector
    get() {
        if (_pennant2 != null) return _pennant2!!
        _pennant2 = tablerFilledIcon(
            name = "Pennant2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 2c.507 0 .934 .38 .993 .883L15 3v17h1c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L16 22h-4c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L12 20h1v-7.351L4.594 8.914C3.842 8.579 3.804 7.549 4.481 7.144l.113-.058L13 3.35v-.35c0-.552 .448-1 1-1Z"),
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
        return _pennant2!!
    }

private var _pennant2: ImageVector? = null
