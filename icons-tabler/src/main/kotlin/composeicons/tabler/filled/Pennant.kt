package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pennant: ImageVector
    get() {
        if (_pennant != null) return _pennant!!
        _pennant = tablerFilledIcon(
            name = "Pennant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 2c.507 0 .934 .38 .993 .883L11 3v.35l8.406 3.736c.752 .335 .79 1.365 .113 1.77l-.113 .058L11 12.649v7.351h1c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L12 22h-4c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L8 20h1v-17C9 2.448 9.448 2 10 2Z"),
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
        return _pennant!!
    }

private var _pennant: ImageVector? = null
