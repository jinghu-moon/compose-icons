package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeCc: ImageVector
    get() {
        if (_badgeCc != null) return _badgeCc!!
        _badgeCc = tablerFilledIcon(
            name = "BadgeCc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 4.000 C 20.657 4.000 22.000 5.343 22.000 7.000 L 22.000 17.000 C 22.000 18.657 20.657 20.000 19.000 20.000 L 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 L 2.000 7.000 C 2.000 5.343 3.343 4.000 5.000 4.000 ZM 8.500 8.000 C 7.119 8.000 6.000 9.119 6.000 10.500 L 6.000 13.500 C 6.000 14.881 7.119 16.000 8.500 16.000 C 9.881 16.000 11.000 14.881 11.000 13.500 C 11.000 12.948 10.552 12.500 10.000 12.500 C 9.448 12.500 9.000 12.948 9.000 13.500 C 9.000 13.776 8.776 14.000 8.500 14.000 C 8.224 14.000 8.000 13.776 8.000 13.500 L 8.000 10.500 C 8.000 10.224 8.224 10.000 8.500 10.000 C 8.776 10.000 9.000 10.224 9.000 10.500 C 9.000 11.052 9.448 11.500 10.000 11.500 C 10.552 11.500 11.000 11.052 11.000 10.500 C 11.000 9.119 9.881 8.000 8.500 8.000M 15.500 8.000 C 14.119 8.000 13.000 9.119 13.000 10.500 L 13.000 13.500 C 13.000 14.881 14.119 16.000 15.500 16.000 C 16.881 16.000 18.000 14.881 18.000 13.500 C 18.000 12.948 17.552 12.500 17.000 12.500 C 16.448 12.500 16.000 12.948 16.000 13.500 C 16.000 13.776 15.776 14.000 15.500 14.000 C 15.224 14.000 15.000 13.776 15.000 13.500 L 15.000 10.500 C 15.000 10.224 15.224 10.000 15.500 10.000 C 15.776 10.000 16.000 10.224 16.000 10.500 C 16.000 11.052 16.448 11.500 17.000 11.500 C 17.552 11.500 18.000 11.052 18.000 10.500 C 18.000 9.119 16.881 8.000 15.500 8.000"),
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
        return _badgeCc!!
    }

private var _badgeCc: ImageVector? = null
