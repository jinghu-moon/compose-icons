package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSpacehey: ImageVector
    get() {
        if (_brandSpacehey != null) return _brandSpacehey!!
        _brandSpacehey = tablerOutlineIcon(
            name = "BrandSpacehey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 6.000 C 15.000 7.105 15.895 8.000 17.000 8.000 C 18.105 8.000 19.000 7.105 19.000 6.000 C 19.000 4.895 18.105 4.000 17.000 4.000 C 15.895 4.000 15.000 4.895 15.000 6.000"),
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
                pathData = parseSvgPathData("M 14.000 20.000 L 20.000 20.000 L 20.000 14.000 C 20.000 12.343 18.657 11.000 17.000 11.000 C 15.343 11.000 14.000 12.343 14.000 14.000 L 14.000 20.000"),
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
                pathData = parseSvgPathData("M 11.000 8.000 L 11.000 10.500 C 11.000 12.433 9.433 14.000 7.500 14.000 L 7.000 14.000 C 5.343 14.000 4.000 12.657 4.000 11.000 C 4.000 9.343 5.343 8.000 7.000 8.000 L 11.000 8.000"),
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
        return _brandSpacehey!!
    }

private var _brandSpacehey: ImageVector? = null
