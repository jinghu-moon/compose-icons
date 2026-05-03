package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandOnlyfans: ImageVector
    get() {
        if (_brandOnlyfans != null) return _brandOnlyfans!!
        _brandOnlyfans = tablerOutlineIcon(
            name = "BrandOnlyfans",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.500 6.000 C 4.910 6.000 2.000 8.910 2.000 12.500 C 2.000 16.090 4.910 19.000 8.500 19.000 C 12.090 19.000 15.000 16.090 15.000 12.500 C 15.000 8.910 12.090 6.000 8.500 6.000"),
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
                pathData = parseSvgPathData("M 8.500 15.000 C 7.119 15.000 6.000 13.881 6.000 12.500 C 6.000 11.119 7.119 10.000 8.500 10.000 C 9.881 10.000 11.000 11.119 11.000 12.500 C 11.000 13.881 9.881 15.000 8.500 15.000"),
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
                pathData = parseSvgPathData("M 14.000 16.000 C 16.500 16.000 20.420 14.533 21.000 12.000 L 15.000 12.000 C 18.000 11.000 21.440 8.467 22.000 6.000 L 18.000 6.000 C 14.970 6.000 14.236 5.804 13.000 7.500"),
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
        return _brandOnlyfans!!
    }

private var _brandOnlyfans: ImageVector? = null
