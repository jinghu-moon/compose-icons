package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LassoOff: ImageVector
    get() {
        if (_lassoOff != null) return _lassoOff!!
        _lassoOff = tablerOutlineIcon(
            name = "LassoOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.028 13.252 C 3.371 12.280 3.000 11.174 3.000 10.000 C 3.000 8.196 3.878 6.551 5.319 5.310M 7.809 3.804 C 9.141 3.267 10.564 2.994 12.000 3.000 C 16.970 3.000 21.000 6.134 21.000 10.000 C 21.000 11.799 20.127 13.440 18.693 14.680M 16.190 16.197 C 14.859 16.734 13.436 17.007 12.000 17.000 C 10.087 17.000 8.314 16.536 6.856 15.745"),
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
                pathData = parseSvgPathData("M 3.000 15.000 C 3.000 16.105 3.895 17.000 5.000 17.000 C 6.105 17.000 7.000 16.105 7.000 15.000 C 7.000 13.895 6.105 13.000 5.000 13.000 C 3.895 13.000 3.000 13.895 3.000 15.000"),
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
                pathData = parseSvgPathData("M 5.000 17.000 C 5.000 18.420 5.316 19.805 6.000 21.000"),
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
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _lassoOff!!
    }

private var _lassoOff: ImageVector? = null
