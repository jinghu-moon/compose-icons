package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.RelationManyToMany: ImageVector
    get() {
        if (_relationManyToMany != null) return _relationManyToMany!!
        _relationManyToMany = tablerFilledIcon(
            name = "RelationManyToMany",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 4.000 C 20.657 4.000 22.000 5.343 22.000 7.000 L 22.000 17.000 C 22.000 18.657 20.657 20.000 19.000 20.000 L 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 L 2.000 7.000 C 2.000 5.343 3.343 4.000 5.000 4.000 ZM 15.800 9.400 C 15.223 8.631 14.000 9.039 14.000 10.000 L 14.000 14.000 C 14.000 14.552 14.448 15.000 15.000 15.000 L 15.117 14.993 C 15.620 14.934 16.000 14.507 16.000 14.000 L 16.000 13.000 L 17.200 14.600 C 17.777 15.369 19.000 14.961 19.000 14.000 L 19.000 10.000 C 19.000 9.448 18.552 9.000 18.000 9.000 L 17.883 9.007 C 17.380 9.066 17.000 9.493 17.000 10.000 L 17.000 11.000 ZM 6.800 9.400 C 6.223 8.631 5.000 9.039 5.000 10.000 L 5.000 14.000 C 5.000 14.552 5.448 15.000 6.000 15.000 L 6.117 14.993 C 6.620 14.934 7.000 14.507 7.000 14.000 L 7.000 13.000 L 8.200 14.600 C 8.777 15.369 10.000 14.961 10.000 14.000 L 10.000 10.000 C 10.000 9.448 9.552 9.000 9.000 9.000 L 8.883 9.007 C 8.380 9.066 8.000 9.493 8.000 10.000 L 8.000 11.000 ZM 12.000 12.500 C 11.448 12.500 11.000 12.948 11.000 13.500 L 11.000 13.510 C 11.000 14.062 11.448 14.510 12.000 14.510 C 12.552 14.510 13.000 14.062 13.000 13.510 L 13.000 13.500 C 13.000 12.948 12.552 12.500 12.000 12.500M 12.000 9.500 C 11.448 9.500 11.000 9.948 11.000 10.500 L 11.000 10.510 C 11.000 11.062 11.448 11.510 12.000 11.510 C 12.552 11.510 13.000 11.062 13.000 10.510 L 13.000 10.500 C 13.000 9.948 12.552 9.500 12.000 9.500"),
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
        return _relationManyToMany!!
    }

private var _relationManyToMany: ImageVector? = null
