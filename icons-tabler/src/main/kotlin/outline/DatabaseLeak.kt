package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DatabaseLeak: ImageVector
    get() {
        if (_databaseLeak != null) return _databaseLeak!!
        _databaseLeak = tablerOutlineIcon(
            name = "DatabaseLeak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 6.000 C 4.000 7.657 7.582 9.000 12.000 9.000 C 16.418 9.000 20.000 7.657 20.000 6.000 C 20.000 4.343 16.418 3.000 12.000 3.000 C 7.582 3.000 4.000 4.343 4.000 6.000"),
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
                pathData = parseSvgPathData("M 4.000 6.000 L 4.000 18.000 C 4.000 19.657 7.582 21.000 12.000 21.000 C 16.418 21.000 20.000 19.657 20.000 18.000 L 20.000 6.000"),
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
                pathData = parseSvgPathData("M 4.000 15.000 C 4.791 15.017 5.539 14.643 6.000 14.000 C 6.461 13.357 7.209 12.983 8.000 13.000 C 8.791 12.983 9.539 13.357 10.000 14.000 C 10.461 14.643 11.209 15.017 12.000 15.000 C 12.791 15.017 13.539 14.643 14.000 14.000 C 14.461 13.357 15.209 12.983 16.000 13.000 C 16.791 12.983 17.539 13.357 18.000 14.000 C 18.461 14.643 19.209 15.017 20.000 15.000"),
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
        return _databaseLeak!!
    }

private var _databaseLeak: ImageVector? = null
