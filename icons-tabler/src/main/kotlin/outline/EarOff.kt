package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EarOff: ImageVector
    get() {
        if (_earOff != null) return _earOff!!
        _earOff = tablerOutlineIcon(
            name = "EarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 10.000 C 6.000 8.854 6.277 7.755 6.780 6.781M 8.572 4.573 C 11.207 2.421 15.009 2.475 17.581 4.702 C 20.154 6.929 20.753 10.683 19.000 13.600 C 18.802 13.864 18.590 14.119 18.367 14.362M 16.322 16.322 C 15.759 17.003 15.312 17.773 15.000 18.600 C 14.372 19.787 13.246 20.632 11.930 20.903 C 10.614 21.174 9.246 20.843 8.200 20.000"),
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
                pathData = parseSvgPathData("M 11.420 7.414 C 12.604 6.680 14.137 6.857 15.122 7.842 C 16.107 8.827 16.285 10.360 15.551 11.544"),
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
        return _earOff!!
    }

private var _earOff: ImageVector? = null
