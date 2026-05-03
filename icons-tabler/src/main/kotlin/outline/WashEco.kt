package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashEco: ImageVector
    get() {
        if (_washEco != null) return _washEco!!
        _washEco = tablerOutlineIcon(
            name = "WashEco",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 6.000 L 4.721 16.329 C 4.882 17.293 5.716 18.000 6.694 18.000 L 12.000 18.000M 20.162 11.028 L 21.000 6.000"),
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
                pathData = parseSvgPathData("M 3.486 8.965 C 3.654 8.985 3.826 8.998 4.000 9.000 C 4.790 9.009 5.539 8.822 6.000 8.500 C 6.461 8.180 7.210 7.993 8.000 8.000 C 8.790 7.993 9.539 8.180 10.000 8.500 C 10.461 8.822 11.210 9.009 12.000 9.000 C 12.790 9.009 13.539 8.822 14.000 8.500 C 14.461 8.180 15.210 7.993 16.000 8.000 C 16.790 7.993 17.539 8.180 18.000 8.500 C 18.461 8.822 19.210 9.009 20.000 9.000 C 20.170 9.000 20.339 8.986 20.503 8.966"),
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
                pathData = parseSvgPathData("M 16.000 22.000 C 16.000 22.000 16.000 20.000 19.000 18.000"),
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
                pathData = parseSvgPathData("M 19.000 21.000 C 17.343 21.000 16.000 19.657 16.000 18.000 C 16.000 16.343 17.343 15.000 19.000 15.000 L 22.000 15.000 L 22.000 18.000 C 22.000 19.657 20.657 21.000 19.000 21.000"),
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
        return _washEco!!
    }

private var _washEco: ImageVector? = null
