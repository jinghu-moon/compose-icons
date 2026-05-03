package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ship: ImageVector
    get() {
        if (_ship != null) return _ship!!
        _ship = tablerOutlineIcon(
            name = "Ship",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 20.000 C 2.461 20.643 3.209 21.017 4.000 21.000 C 4.791 21.017 5.539 20.643 6.000 20.000 C 6.461 19.357 7.209 18.983 8.000 19.000 C 8.791 18.983 9.539 19.357 10.000 20.000 C 10.461 20.643 11.209 21.017 12.000 21.000 C 12.791 21.017 13.539 20.643 14.000 20.000 C 14.461 19.357 15.209 18.983 16.000 19.000 C 16.791 18.983 17.539 19.357 18.000 20.000 C 18.461 20.643 19.209 21.017 20.000 21.000 C 20.791 21.017 21.539 20.643 22.000 20.000"),
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
                pathData = parseSvgPathData("M 4.000 18.000 L 3.000 13.000 L 21.000 13.000 L 19.000 17.000"),
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
                pathData = parseSvgPathData("M 5.000 13.000 L 5.000 7.000 L 13.000 7.000 L 17.000 13.000"),
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
                pathData = parseSvgPathData("M 7.000 7.000 L 7.000 3.000 L 6.000 3.000"),
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
        return _ship!!
    }

private var _ship: ImageVector? = null
