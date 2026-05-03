package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.RelationOneToMany: ImageVector
    get() {
        if (_relationOneToMany != null) return _relationOneToMany!!
        _relationOneToMany = tablerFilledIcon(
            name = "RelationOneToMany",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 4.000 C 20.657 4.000 22.000 5.343 22.000 7.000 L 22.000 17.000 C 22.000 18.657 20.657 20.000 19.000 20.000 L 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 L 2.000 7.000 C 2.000 5.343 3.343 4.000 5.000 4.000 ZM 14.800 9.400 C 14.223 8.631 13.000 9.039 13.000 10.000 L 13.000 14.000 C 13.000 14.552 13.448 15.000 14.000 15.000 L 14.117 14.993 C 14.620 14.934 15.000 14.507 15.000 14.000 L 15.000 13.000 L 16.200 14.600 C 16.777 15.369 18.000 14.961 18.000 14.000 L 18.000 10.000 C 18.000 9.448 17.552 9.000 17.000 9.000 L 16.883 9.007 C 16.380 9.066 16.000 9.493 16.000 10.000 L 16.000 11.000 ZM 8.000 9.000 L 7.000 9.000 C 6.448 9.000 6.000 9.448 6.000 10.000 C 6.000 10.552 6.448 11.000 7.000 11.000 L 7.000 14.000 C 7.000 14.552 7.448 15.000 8.000 15.000 C 8.552 15.000 9.000 14.552 9.000 14.000 L 9.000 10.000 C 9.000 9.448 8.552 9.000 8.000 9.000M 11.000 12.500 C 10.448 12.500 10.000 12.948 10.000 13.500 L 10.000 13.510 C 10.000 14.062 10.448 14.510 11.000 14.510 C 11.552 14.510 12.000 14.062 12.000 13.510 L 12.000 13.500 C 12.000 12.948 11.552 12.500 11.000 12.500M 11.000 9.500 C 10.448 9.500 10.000 9.948 10.000 10.500 L 10.000 10.510 C 10.000 11.062 10.448 11.510 11.000 11.510 C 11.552 11.510 12.000 11.062 12.000 10.510 L 12.000 10.500 C 12.000 9.948 11.552 9.500 11.000 9.500"),
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
        return _relationOneToMany!!
    }

private var _relationOneToMany: ImageVector? = null
