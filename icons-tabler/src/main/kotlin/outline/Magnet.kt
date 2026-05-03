package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = tablerOutlineIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 13.000 L 4.000 5.000 C 4.000 3.895 4.895 3.000 6.000 3.000 L 7.000 3.000 C 8.105 3.000 9.000 3.895 9.000 5.000 L 9.000 13.000 C 9.000 14.657 10.343 16.000 12.000 16.000 C 13.657 16.000 15.000 14.657 15.000 13.000 L 15.000 5.000 C 15.000 3.895 15.895 3.000 17.000 3.000 L 18.000 3.000 C 19.105 3.000 20.000 3.895 20.000 5.000 L 20.000 13.000 C 20.000 17.418 16.418 21.000 12.000 21.000 C 7.582 21.000 4.000 17.418 4.000 13.000"),
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
                pathData = parseSvgPathData("M 4.000 8.000 L 9.000 8.000"),
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
                pathData = parseSvgPathData("M 15.000 8.000 L 19.000 8.000"),
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
        return _magnet!!
    }

private var _magnet: ImageVector? = null
