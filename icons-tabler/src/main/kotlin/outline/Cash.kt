package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cash: ImageVector
    get() {
        if (_cash != null) return _cash!!
        _cash = tablerOutlineIcon(
            name = "Cash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 15.000 L 4.000 15.000 C 3.448 15.000 3.000 14.552 3.000 14.000 L 3.000 6.000 C 3.000 5.448 3.448 5.000 4.000 5.000 L 16.000 5.000 C 16.552 5.000 17.000 5.448 17.000 6.000 L 17.000 9.000"),
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
                pathData = parseSvgPathData("M 7.000 10.000 C 7.000 9.448 7.448 9.000 8.000 9.000 L 20.000 9.000 C 20.552 9.000 21.000 9.448 21.000 10.000 L 21.000 18.000 C 21.000 18.552 20.552 19.000 20.000 19.000 L 8.000 19.000 C 7.448 19.000 7.000 18.552 7.000 18.000 L 7.000 10.000"),
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
                pathData = parseSvgPathData("M 12.000 14.000 C 12.000 15.105 12.895 16.000 14.000 16.000 C 15.105 16.000 16.000 15.105 16.000 14.000 C 16.000 12.895 15.105 12.000 14.000 12.000 C 12.895 12.000 12.000 12.895 12.000 14.000"),
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
        return _cash!!
    }

private var _cash: ImageVector? = null
