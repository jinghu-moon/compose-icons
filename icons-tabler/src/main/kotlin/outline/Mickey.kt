package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Mickey: ImageVector
    get() {
        if (_mickey != null) return _mickey!!
        _mickey = tablerOutlineIcon(
            name = "Mickey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.500 3.000 C 6.661 3.000 7.747 3.576 8.399 4.538 C 9.050 5.499 9.181 6.722 8.750 7.800 C 7.791 8.303 6.961 9.022 6.326 9.900 C 5.013 10.221 3.633 9.757 2.780 8.709 C 1.927 7.660 1.754 6.215 2.336 4.995 C 2.917 3.775 4.149 2.998 5.500 3.000"),
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
                pathData = parseSvgPathData("M 18.500 3.000 C 19.849 3.001 21.078 3.778 21.657 4.997 C 22.237 6.216 22.064 7.659 21.213 8.706 C 20.363 9.754 18.986 10.219 17.674 9.902 C 17.039 9.023 16.210 8.303 15.250 7.799 C 14.819 6.721 14.951 5.499 15.602 4.537 C 16.253 3.576 17.339 3.000 18.500 3.000"),
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
                pathData = parseSvgPathData("M 5.000 14.000 C 5.000 17.866 8.134 21.000 12.000 21.000 C 15.866 21.000 19.000 17.866 19.000 14.000 C 19.000 10.134 15.866 7.000 12.000 7.000 C 8.134 7.000 5.000 10.134 5.000 14.000"),
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
        return _mickey!!
    }

private var _mickey: ImageVector? = null
