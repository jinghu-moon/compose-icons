package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZodiacCapricorn: ImageVector
    get() {
        if (_zodiacCapricorn != null) return _zodiacCapricorn!!
        _zodiacCapricorn = tablerOutlineIcon(
            name = "ZodiacCapricorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 4.000 C 5.657 4.000 7.000 5.343 7.000 7.000 L 7.000 16.000"),
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
                pathData = parseSvgPathData("M 7.000 7.000 C 7.000 5.343 8.343 4.000 10.000 4.000 C 11.657 4.000 13.000 5.343 13.000 7.000 L 13.000 18.000 C 13.000 19.657 11.657 21.000 10.000 21.000"),
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
                pathData = parseSvgPathData("M 13.000 17.000 C 13.000 18.657 14.343 20.000 16.000 20.000 C 17.657 20.000 19.000 18.657 19.000 17.000 C 19.000 15.343 17.657 14.000 16.000 14.000 C 14.343 14.000 13.000 15.343 13.000 17.000"),
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
        return _zodiacCapricorn!!
    }

private var _zodiacCapricorn: ImageVector? = null
