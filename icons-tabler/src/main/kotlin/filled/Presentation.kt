package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Presentation: ImageVector
    get() {
        if (_presentation != null) return _presentation!!
        _presentation = tablerFilledIcon(
            name = "Presentation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 C 22.000 4.552 21.552 5.000 21.000 5.000 L 21.000 14.000 C 21.000 15.657 19.657 17.000 18.000 17.000 L 13.000 17.000 L 13.000 19.000 L 15.000 19.000 C 15.552 19.000 16.000 19.448 16.000 20.000 C 16.000 20.552 15.552 21.000 15.000 21.000 L 9.000 21.000 C 8.448 21.000 8.000 20.552 8.000 20.000 C 8.000 19.448 8.448 19.000 9.000 19.000 L 11.000 19.000 L 11.000 17.000 L 6.000 17.000 C 4.343 17.000 3.000 15.657 3.000 14.000 L 3.000 5.000 C 2.448 5.000 2.000 4.552 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 ZM 16.707 7.293 C 16.316 6.903 15.684 6.903 15.293 7.293 L 13.000 9.585 L 11.707 8.293 C 11.316 7.903 10.684 7.903 10.293 8.293 L 7.293 11.293 C 6.903 11.684 6.903 12.316 7.293 12.707 L 7.387 12.790 C 7.785 13.099 8.351 13.063 8.707 12.707 L 11.000 10.415 L 12.293 11.707 C 12.684 12.097 13.316 12.097 13.707 11.707 L 16.707 8.707 C 17.097 8.316 17.097 7.683 16.707 7.293"),
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
        return _presentation!!
    }

private var _presentation: ImageVector? = null
