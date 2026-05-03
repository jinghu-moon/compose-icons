package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.RelationOneToOne: ImageVector
    get() {
        if (_relationOneToOne != null) return _relationOneToOne!!
        _relationOneToOne = tablerFilledIcon(
            name = "RelationOneToOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 4.000 C 20.657 4.000 22.000 5.343 22.000 7.000 L 22.000 17.000 C 22.000 18.657 20.657 20.000 19.000 20.000 L 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 L 2.000 7.000 C 2.000 5.343 3.343 4.000 5.000 4.000 ZM 9.000 9.000 L 8.000 9.000 C 7.448 9.000 7.000 9.448 7.000 10.000 C 7.000 10.552 7.448 11.000 8.000 11.000 L 8.000 14.000 C 8.000 14.552 8.448 15.000 9.000 15.000 C 9.552 15.000 10.000 14.552 10.000 14.000 L 10.000 10.000 C 10.000 9.448 9.552 9.000 9.000 9.000M 16.000 9.000 L 15.000 9.000 C 14.448 9.000 14.000 9.448 14.000 10.000 C 14.000 10.552 14.448 11.000 15.000 11.000 L 15.000 14.000 C 15.000 14.552 15.448 15.000 16.000 15.000 C 16.552 15.000 17.000 14.552 17.000 14.000 L 17.000 10.000 C 17.000 9.448 16.552 9.000 16.000 9.000M 12.000 12.500 C 11.448 12.500 11.000 12.948 11.000 13.500 L 11.000 13.510 C 11.000 14.062 11.448 14.510 12.000 14.510 C 12.552 14.510 13.000 14.062 13.000 13.510 L 13.000 13.500 C 13.000 12.948 12.552 12.500 12.000 12.500M 12.000 9.500 C 11.448 9.500 11.000 9.948 11.000 10.500 L 11.000 10.510 C 11.000 11.062 11.448 11.510 12.000 11.510 C 12.552 11.510 13.000 11.062 13.000 10.510 L 13.000 10.500 C 13.000 9.948 12.552 9.500 12.000 9.500"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _relationOneToOne!!
    }

private var _relationOneToOne: ImageVector? = null
