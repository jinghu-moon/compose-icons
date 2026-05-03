package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Home: ImageVector
    get() {
        if (_home != null) return _home!!
        _home = tablerFilledIcon(
            name = "Home",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.707 2.293 L 21.707 11.293 C 22.337 11.923 21.891 13.000 21.000 13.000 L 20.000 13.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 L 16.000 22.000 L 16.000 15.000 C 16.000 13.411 14.762 12.098 13.176 12.005 L 13.000 12.000 L 11.000 12.000 C 9.343 12.000 8.000 13.343 8.000 15.000 L 8.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 13.000 L 3.000 13.000 C 2.110 13.000 1.663 11.923 2.293 11.293 L 11.293 2.293 C 11.684 1.903 12.316 1.903 12.707 2.293M 13.000 14.000 C 13.552 14.000 14.000 14.448 14.000 15.000 L 14.000 22.000 L 10.000 22.000 L 10.000 15.000 C 10.000 14.493 10.380 14.066 10.883 14.007 L 11.000 14.000 Z"),
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
        return _home!!
    }

private var _home: ImageVector? = null
