package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandRevolut: ImageVector
    get() {
        if (_brandRevolut != null) return _brandRevolut!!
        _brandRevolut = tablerOutlineIcon(
            name = "BrandRevolut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 10.000 L 8.000 10.000 L 8.000 20.000 L 5.000 20.000 L 5.000 10.000"),
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
                pathData = parseSvgPathData("M 14.500 4.000 L 5.000 4.000 L 5.000 7.000 L 14.400 7.000 C 15.228 7.000 15.900 7.672 15.900 8.500 C 15.900 9.328 15.228 10.000 14.400 10.000 L 11.000 10.000 L 11.000 14.000 L 15.000 20.000 L 19.000 20.000 L 14.000 13.000 L 14.500 13.000 C 16.985 13.000 19.000 10.985 19.000 8.500 C 19.000 6.015 16.985 4.000 14.500 4.000"),
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
        return _brandRevolut!!
    }

private var _brandRevolut: ImageVector? = null
