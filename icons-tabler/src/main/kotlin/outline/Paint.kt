package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Paint: ImageVector
    get() {
        if (_paint != null) return _paint!!
        _paint = tablerOutlineIcon(
            name = "Paint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 5.000 C 5.000 3.895 5.895 3.000 7.000 3.000 L 17.000 3.000 C 18.105 3.000 19.000 3.895 19.000 5.000 L 19.000 7.000 C 19.000 8.105 18.105 9.000 17.000 9.000 L 7.000 9.000 C 5.895 9.000 5.000 8.105 5.000 7.000 L 5.000 5.000"),
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
                pathData = parseSvgPathData("M 19.000 6.000 L 20.000 6.000 C 21.105 6.000 22.000 6.895 22.000 8.000 C 22.000 10.761 19.761 13.000 17.000 13.000 L 12.000 13.000 L 12.000 15.000"),
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
                pathData = parseSvgPathData("M 10.000 16.000 C 10.000 15.448 10.448 15.000 11.000 15.000 L 13.000 15.000 C 13.552 15.000 14.000 15.448 14.000 16.000 L 14.000 20.000 C 14.000 20.552 13.552 21.000 13.000 21.000 L 11.000 21.000 C 10.448 21.000 10.000 20.552 10.000 20.000 L 10.000 16.000"),
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
        return _paint!!
    }

private var _paint: ImageVector? = null
