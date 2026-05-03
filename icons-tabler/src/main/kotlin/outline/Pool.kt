package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pool: ImageVector
    get() {
        if (_pool != null) return _pool!!
        _pool = tablerOutlineIcon(
            name = "Pool",
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
                pathData = parseSvgPathData("M 2.000 16.000 C 2.461 16.643 3.209 17.017 4.000 17.000 C 4.791 17.017 5.539 16.643 6.000 16.000 C 6.461 15.357 7.209 14.983 8.000 15.000 C 8.791 14.983 9.539 15.357 10.000 16.000 C 10.461 16.643 11.209 17.017 12.000 17.000 C 12.791 17.017 13.539 16.643 14.000 16.000 C 14.461 15.357 15.209 14.983 16.000 15.000 C 16.791 14.983 17.539 15.357 18.000 16.000 C 18.461 16.643 19.209 17.017 20.000 17.000 C 20.791 17.017 21.539 16.643 22.000 16.000"),
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
                pathData = parseSvgPathData("M 15.000 12.000 L 15.000 4.500 C 15.000 3.672 15.672 3.000 16.500 3.000 C 17.328 3.000 18.000 3.672 18.000 4.500"),
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
                pathData = parseSvgPathData("M 9.000 12.000 L 9.000 4.500 C 9.000 3.672 8.328 3.000 7.500 3.000 C 6.672 3.000 6.000 3.672 6.000 4.500"),
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
                pathData = parseSvgPathData("M 15.000 5.000 L 9.000 5.000"),
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
                pathData = parseSvgPathData("M 9.000 10.000 L 15.000 10.000"),
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
        return _pool!!
    }

private var _pool: ImageVector? = null
