package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Csv: ImageVector
    get() {
        if (_csv != null) return _csv!!
        _csv = tablerOutlineIcon(
            name = "Csv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 15.000 C 10.000 15.552 10.448 16.000 11.000 16.000 L 13.000 16.000 C 13.552 16.000 14.000 15.552 14.000 15.000 L 14.000 13.000 C 14.000 12.448 13.552 12.000 13.000 12.000 L 11.000 12.000 C 10.448 12.000 10.000 11.552 10.000 11.000 L 10.000 9.000 C 10.000 8.448 10.448 8.000 11.000 8.000 L 13.000 8.000 C 13.552 8.000 14.000 8.448 14.000 9.000"),
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
                pathData = parseSvgPathData("M 17.000 8.000 L 19.000 16.000 L 21.000 8.000"),
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
                pathData = parseSvgPathData("M 7.000 10.000 C 7.000 8.895 6.105 8.000 5.000 8.000 C 3.895 8.000 3.000 8.895 3.000 10.000 L 3.000 14.000 C 3.000 15.105 3.895 16.000 5.000 16.000 C 6.105 16.000 7.000 15.105 7.000 14.000"),
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
        return _csv!!
    }

private var _csv: ImageVector? = null
