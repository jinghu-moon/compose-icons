package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Home2: ImageVector
    get() {
        if (_home2 != null) return _home2!!
        _home2 = tablerFilledIcon(
            name = "Home2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.707 2.293 L 21.707 11.293 C 22.337 11.923 21.891 13.000 21.000 13.000 L 20.000 13.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 13.000 L 3.000 13.000 C 2.110 13.000 1.663 11.923 2.293 11.293 L 11.293 2.293 C 11.684 1.903 12.316 1.903 12.707 2.293M 13.500 11.000 L 10.500 11.000 C 9.672 11.000 9.000 11.672 9.000 12.500 L 9.000 15.500 C 9.000 16.328 9.672 17.000 10.500 17.000 L 13.500 17.000 C 14.328 17.000 15.000 16.328 15.000 15.500 L 15.000 12.500 C 15.000 11.672 14.328 11.000 13.500 11.000"),
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
        return _home2!!
    }

private var _home2: ImageVector? = null
