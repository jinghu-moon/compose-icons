package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = tablerOutlineIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.828 9.172 C 8.684 8.028 6.964 7.685 5.469 8.304 C 3.974 8.923 2.999 10.382 2.999 12.000 C 2.999 13.618 3.974 15.077 5.469 15.696 C 6.964 16.315 8.684 15.972 9.828 14.828 C 10.716 14.023 11.451 13.065 12.000 12.000 C 12.549 10.935 13.284 9.977 14.172 9.172 C 15.316 8.028 17.036 7.685 18.531 8.304 C 20.026 8.923 21.001 10.382 21.001 12.000 C 21.001 13.618 20.026 15.077 18.531 15.696 C 17.036 16.315 15.316 15.972 14.172 14.828 C 13.284 14.023 12.549 13.065 12.000 12.000 C 11.451 10.935 10.716 9.977 9.828 9.172"),
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
        return _infinity!!
    }

private var _infinity: ImageVector? = null
