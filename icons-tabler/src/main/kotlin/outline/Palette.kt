package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Palette: ImageVector
    get() {
        if (_palette != null) return _palette!!
        _palette = tablerOutlineIcon(
            name = "Palette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 21.000 C 7.029 21.000 3.000 16.971 3.000 12.000 C 3.000 7.029 7.029 3.000 12.000 3.000 C 16.970 3.000 21.000 6.582 21.000 11.000 C 21.000 12.060 20.526 13.078 19.682 13.828 C 18.838 14.578 17.693 15.000 16.500 15.000 L 14.000 15.000 C 13.082 14.985 12.272 15.597 12.035 16.484 C 11.799 17.372 12.197 18.306 13.000 18.750 C 13.409 19.128 13.533 19.724 13.306 20.233 C 13.080 20.742 12.555 21.051 12.000 21.000"),
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
                pathData = parseSvgPathData("M 7.500 10.500 C 7.500 11.052 7.948 11.500 8.500 11.500 C 9.052 11.500 9.500 11.052 9.500 10.500 C 9.500 9.948 9.052 9.500 8.500 9.500 C 7.948 9.500 7.500 9.948 7.500 10.500"),
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
                pathData = parseSvgPathData("M 11.500 7.500 C 11.500 8.052 11.948 8.500 12.500 8.500 C 13.052 8.500 13.500 8.052 13.500 7.500 C 13.500 6.948 13.052 6.500 12.500 6.500 C 11.948 6.500 11.500 6.948 11.500 7.500"),
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
                pathData = parseSvgPathData("M 15.500 10.500 C 15.500 11.052 15.948 11.500 16.500 11.500 C 17.052 11.500 17.500 11.052 17.500 10.500 C 17.500 9.948 17.052 9.500 16.500 9.500 C 15.948 9.500 15.500 9.948 15.500 10.500"),
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
        return _palette!!
    }

private var _palette: ImageVector? = null
