package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Coins: ImageVector
    get() {
        if (_coins != null) return _coins!!
        _coins = tablerOutlineIcon(
            name = "Coins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 14.000 C 9.000 15.657 11.686 17.000 15.000 17.000 C 18.314 17.000 21.000 15.657 21.000 14.000 C 21.000 12.343 18.314 11.000 15.000 11.000 C 11.686 11.000 9.000 12.343 9.000 14.000"),
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
                pathData = parseSvgPathData("M 9.000 14.000 L 9.000 18.000 C 9.000 19.656 11.686 21.000 15.000 21.000 C 18.314 21.000 21.000 19.656 21.000 18.000 L 21.000 14.000"),
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
                pathData = parseSvgPathData("M 3.000 6.000 C 3.000 7.072 4.144 8.062 6.000 8.598 C 7.856 9.134 10.144 9.134 12.000 8.598 C 13.856 8.062 15.000 7.072 15.000 6.000 C 15.000 4.928 13.856 3.938 12.000 3.402 C 10.144 2.866 7.856 2.866 6.000 3.402 C 4.144 3.938 3.000 4.928 3.000 6.000"),
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
                pathData = parseSvgPathData("M 3.000 6.000 L 3.000 16.000 C 3.000 16.888 3.772 17.450 5.000 18.000"),
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
                pathData = parseSvgPathData("M 3.000 11.000 C 3.000 11.888 3.772 12.450 5.000 13.000"),
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
        return _coins!!
    }

private var _coins: ImageVector? = null
