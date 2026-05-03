package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandStorybook: ImageVector
    get() {
        if (_brandStorybook != null) return _brandStorybook!!
        _brandStorybook = tablerOutlineIcon(
            name = "BrandStorybook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 4.000 L 5.500 20.500 L 19.000 21.000 L 19.000 3.000 L 5.000 4.000"),
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
                pathData = parseSvgPathData("M 9.000 15.000 C 9.600 16.500 10.639 17.000 12.283 17.000 L 12.000 17.000 C 13.800 17.000 15.000 16.026 15.000 14.565 C 15.000 13.371 14.169 12.766 12.853 12.232 L 10.878 11.430 C 9.728 10.963 9.000 10.008 9.000 8.963 C 9.000 7.993 9.899 7.177 11.087 7.070 L 11.700 7.015 C 13.228 6.877 14.700 7.777 15.000 9.000"),
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
                pathData = parseSvgPathData("M 16.000 3.500 L 16.000 4.500"),
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
        return _brandStorybook!!
    }

private var _brandStorybook: ImageVector? = null
