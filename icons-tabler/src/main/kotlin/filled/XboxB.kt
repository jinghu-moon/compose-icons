package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.XboxB: ImageVector
    get() {
        if (_xboxB != null) return _xboxB!!
        _xboxB = tablerFilledIcon(
            name = "XboxB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000M 13.000 7.000 L 10.000 7.000 C 9.448 7.000 9.000 7.448 9.000 8.000 L 9.000 16.000 C 9.000 16.552 9.448 17.000 10.000 17.000 L 13.000 17.000 C 14.183 17.000 15.255 16.304 15.738 15.224 C 16.220 14.144 16.024 12.882 15.235 12.000 C 16.024 11.118 16.220 9.856 15.738 8.776 C 15.255 7.696 14.183 7.000 13.000 7.000M 13.000 13.000 C 13.552 13.000 14.000 13.448 14.000 14.000 L 13.993 14.117 C 13.934 14.620 13.507 15.000 13.000 15.000 L 11.000 15.000 L 11.000 13.000 ZM 13.000 9.000 C 13.552 9.000 14.000 9.448 14.000 10.000 C 14.000 10.552 13.552 11.000 13.000 11.000 L 11.000 11.000 L 11.000 9.000 Z"),
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
        return _xboxB!!
    }

private var _xboxB: ImageVector? = null
