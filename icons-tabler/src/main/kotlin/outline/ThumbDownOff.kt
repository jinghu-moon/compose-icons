package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ThumbDownOff: ImageVector
    get() {
        if (_thumbDownOff != null) return _thumbDownOff!!
        _thumbDownOff = tablerOutlineIcon(
            name = "ThumbDownOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 13.000 L 7.000 7.000M 4.000 4.000 C 3.448 4.000 3.000 4.448 3.000 5.000 L 3.000 12.000 C 3.000 12.552 3.448 13.000 4.000 13.000 L 7.000 13.000 C 9.209 13.000 11.000 14.791 11.000 17.000 L 11.000 18.000 C 11.000 19.105 11.895 20.000 13.000 20.000 C 14.105 20.000 15.000 19.105 15.000 18.000 L 15.000 15.000M 17.000 13.000 L 18.000 13.000 C 19.105 13.000 20.000 12.105 20.000 11.000 L 19.000 6.000 C 18.705 4.740 17.890 3.924 17.000 4.000 L 10.000 4.000 C 9.430 4.000 8.898 4.159 8.444 4.434"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _thumbDownOff!!
    }

private var _thumbDownOff: ImageVector? = null
