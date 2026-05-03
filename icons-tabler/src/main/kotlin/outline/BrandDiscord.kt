package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDiscord: ImageVector
    get() {
        if (_brandDiscord != null) return _brandDiscord!!
        _brandDiscord = tablerOutlineIcon(
            name = "BrandDiscord",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 12.000 C 8.000 12.552 8.448 13.000 9.000 13.000 C 9.552 13.000 10.000 12.552 10.000 12.000 C 10.000 11.448 9.552 11.000 9.000 11.000 C 8.448 11.000 8.000 11.448 8.000 12.000"),
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
                pathData = parseSvgPathData("M 14.000 12.000 C 14.000 12.552 14.448 13.000 15.000 13.000 C 15.552 13.000 16.000 12.552 16.000 12.000 C 16.000 11.448 15.552 11.000 15.000 11.000 C 14.448 11.000 14.000 11.448 14.000 12.000"),
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
                pathData = parseSvgPathData("M 15.500 17.000 C 15.500 18.000 17.000 20.000 17.500 20.000 C 19.000 20.000 20.333 18.333 21.000 17.000 C 21.667 15.333 21.500 11.167 19.500 5.500 C 18.043 4.485 16.500 4.160 15.000 4.000 L 14.028 5.923 C 12.687 5.691 11.316 5.691 9.975 5.923 L 9.000 4.000 C 7.500 4.160 5.957 4.485 4.500 5.500 C 2.500 11.167 2.333 15.333 3.000 17.000 C 3.667 18.333 5.000 20.000 6.500 20.000 C 7.000 20.000 8.500 18.000 8.500 17.000"),
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
                pathData = parseSvgPathData("M 7.000 16.500 C 10.500 17.500 13.500 17.500 17.000 16.500"),
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
        return _brandDiscord!!
    }

private var _brandDiscord: ImageVector? = null
