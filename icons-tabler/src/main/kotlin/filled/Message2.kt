package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Message2: ImageVector
    get() {
        if (_message2 != null) return _message2!!
        _message2 = tablerFilledIcon(
            name = "Message2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 3.000 C 20.209 3.000 22.000 4.791 22.000 7.000 L 22.000 15.000 C 22.000 17.209 20.209 19.000 18.000 19.000 L 15.414 19.000 L 12.707 21.707 C 12.351 22.063 11.785 22.099 11.387 21.790 L 11.293 21.707 L 8.585 19.000 L 6.000 19.000 C 3.869 19.000 2.112 17.329 2.005 15.200 L 2.000 15.000 L 2.000 7.000 C 2.000 4.791 3.791 3.000 6.000 3.000 ZM 14.000 12.000 L 8.000 12.000 C 7.448 12.000 7.000 12.448 7.000 13.000 C 7.000 13.552 7.448 14.000 8.000 14.000 L 14.000 14.000 C 14.552 14.000 15.000 13.552 15.000 13.000 C 15.000 12.448 14.552 12.000 14.000 12.000M 16.000 8.000 L 8.000 8.000 C 7.448 8.000 7.000 8.448 7.000 9.000 C 7.000 9.552 7.448 10.000 8.000 10.000 L 16.000 10.000 C 16.552 10.000 17.000 9.552 17.000 9.000 C 17.000 8.448 16.552 8.000 16.000 8.000"),
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
        return _message2!!
    }

private var _message2: ImageVector? = null
