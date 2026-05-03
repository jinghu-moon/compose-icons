package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Exchange: ImageVector
    get() {
        if (_exchange != null) return _exchange!!
        _exchange = tablerOutlineIcon(
            name = "Exchange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 18.000 C 3.000 19.105 3.895 20.000 5.000 20.000 C 6.105 20.000 7.000 19.105 7.000 18.000 C 7.000 16.895 6.105 16.000 5.000 16.000 C 3.895 16.000 3.000 16.895 3.000 18.000"),
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
                pathData = parseSvgPathData("M 17.000 6.000 C 17.000 7.105 17.895 8.000 19.000 8.000 C 20.105 8.000 21.000 7.105 21.000 6.000 C 21.000 4.895 20.105 4.000 19.000 4.000 C 17.895 4.000 17.000 4.895 17.000 6.000"),
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
                pathData = parseSvgPathData("M 19.000 8.000 L 19.000 13.000 C 19.000 15.761 16.761 18.000 14.000 18.000 L 11.000 18.000 L 14.000 15.000M 14.000 21.000 L 11.000 18.000"),
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
                pathData = parseSvgPathData("M 5.000 16.000 L 5.000 11.000 C 5.000 8.239 7.239 6.000 10.000 6.000 L 13.000 6.000 L 10.000 3.000M 10.000 9.000 L 13.000 6.000"),
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
        return _exchange!!
    }

private var _exchange: ImageVector? = null
