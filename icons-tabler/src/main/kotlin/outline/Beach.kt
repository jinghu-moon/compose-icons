package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Beach: ImageVector
    get() {
        if (_beach != null) return _beach!!
        _beach = tablerOutlineIcon(
            name = "Beach",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.553 16.750 C 14.624 13.821 9.876 13.821 6.947 16.750"),
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
                pathData = parseSvgPathData("M 18.000 3.804 C 15.130 2.147 11.461 3.130 9.804 6.000 L 20.196 12.000 C 21.853 9.130 20.870 5.461 18.000 3.804"),
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
                pathData = parseSvgPathData("M 16.732 10.000 C 18.390 7.130 18.957 4.356 18.000 3.804 C 17.043 3.252 14.925 5.130 13.268 8.000"),
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
                pathData = parseSvgPathData("M 15.000 9.000 L 12.000 14.196"),
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
                pathData = parseSvgPathData("M 3.000 19.250 C 3.311 19.095 3.652 19.010 4.000 19.000 C 4.791 18.983 5.539 19.357 6.000 20.000 C 6.461 20.643 7.209 21.017 8.000 21.000 C 8.791 21.017 9.539 20.643 10.000 20.000 C 10.461 19.357 11.209 18.983 12.000 19.000 C 12.791 18.983 13.539 19.357 14.000 20.000 C 14.461 20.643 15.209 21.017 16.000 21.000 C 16.791 21.017 17.539 20.643 18.000 20.000 C 18.461 19.357 19.209 18.983 20.000 19.000 C 20.348 19.010 20.689 19.095 21.000 19.250"),
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
        return _beach!!
    }

private var _beach: ImageVector? = null
