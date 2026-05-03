package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BracesOff: ImageVector
    get() {
        if (_bracesOff != null) return _bracesOff!!
        _bracesOff = tablerOutlineIcon(
            name = "BracesOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.176 5.177 C 5.063 5.428 5.000 5.707 5.000 6.000 L 5.000 9.000 C 5.000 10.657 4.105 12.000 3.000 12.000 C 4.105 12.000 5.000 13.343 5.000 15.000 L 5.000 18.000 C 5.000 19.105 5.895 20.000 7.000 20.000"),
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
                pathData = parseSvgPathData("M 17.000 4.000 C 18.105 4.000 19.000 4.895 19.000 6.000 L 19.000 9.000 C 19.000 10.657 19.895 12.000 21.000 12.000 C 19.895 12.000 19.000 13.343 19.000 15.000M 18.824 18.821 C 18.501 19.539 17.787 20.000 17.000 20.000"),
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
        return _bracesOff!!
    }

private var _bracesOff: ImageVector? = null
