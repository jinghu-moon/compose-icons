package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ThumbUpOff: ImageVector
    get() {
        if (_thumbUpOff != null) return _thumbUpOff!!
        _thumbUpOff = tablerOutlineIcon(
            name = "ThumbUpOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 11.000 L 7.000 19.000 C 7.000 19.552 6.552 20.000 6.000 20.000 L 4.000 20.000 C 3.448 20.000 3.000 19.552 3.000 19.000 L 3.000 12.000 C 3.000 11.448 3.448 11.000 4.000 11.000 L 7.000 11.000 C 8.061 11.001 9.079 10.579 9.828 9.828M 11.000 7.000 L 11.000 6.000 C 11.000 4.895 11.895 4.000 13.000 4.000 C 14.105 4.000 15.000 4.895 15.000 6.000 L 15.000 11.000 L 18.000 11.000 C 19.105 11.000 20.000 11.895 20.000 13.000 C 19.778 14.112 19.610 14.947 19.500 15.503M 18.742 18.747 C 18.350 19.570 17.698 20.059 17.000 20.000 L 10.000 20.000 C 8.343 20.000 7.000 18.657 7.000 17.000"),
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
        return _thumbUpOff!!
    }

private var _thumbUpOff: ImageVector? = null
