package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InfinityOff: ImageVector
    get() {
        if (_infinityOff != null) return _infinityOff!!
        _infinityOff = tablerOutlineIcon(
            name = "InfinityOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.165 8.174 C 6.953 7.805 5.637 8.032 4.618 8.786 C 3.600 9.540 2.999 10.733 2.999 12.000 C 2.999 13.618 3.974 15.077 5.469 15.696 C 6.963 16.315 8.684 15.972 9.828 14.828 C 10.716 14.023 11.451 13.065 12.000 12.000M 13.677 9.653 C 13.836 9.487 14.002 9.327 14.172 9.172 C 15.241 8.102 16.821 7.726 18.257 8.200 C 19.693 8.675 20.739 9.918 20.960 11.414 C 21.181 12.910 20.539 14.403 19.301 15.272M 15.780 15.809 C 15.174 15.615 14.622 15.278 14.172 14.828 C 13.284 14.023 12.549 13.065 12.000 12.000"),
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
        return _infinityOff!!
    }

private var _infinityOff: ImageVector? = null
