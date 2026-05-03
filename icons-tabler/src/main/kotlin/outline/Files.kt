package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Files: ImageVector
    get() {
        if (_files != null) return _files!!
        _files = tablerOutlineIcon(
            name = "Files",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 3.000 L 15.000 7.000 C 15.000 7.552 15.448 8.000 16.000 8.000 L 20.000 8.000"),
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
                pathData = parseSvgPathData("M 18.000 17.000 L 11.000 17.000 C 9.895 17.000 9.000 16.105 9.000 15.000 L 9.000 5.000 C 9.000 3.895 9.895 3.000 11.000 3.000 L 15.000 3.000 L 20.000 8.000 L 20.000 15.000 C 20.000 16.105 19.105 17.000 18.000 17.000"),
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
                pathData = parseSvgPathData("M 16.000 17.000 L 16.000 19.000 C 16.000 20.105 15.105 21.000 14.000 21.000 L 7.000 21.000 C 5.895 21.000 5.000 20.105 5.000 19.000 L 5.000 9.000 C 5.000 7.895 5.895 7.000 7.000 7.000 L 9.000 7.000"),
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
        return _files!!
    }

private var _files: ImageVector? = null
