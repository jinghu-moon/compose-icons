package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bulb: ImageVector
    get() {
        if (_bulb != null) return _bulb!!
        _bulb = tablerOutlineIcon(
            name = "Bulb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 12.000 L 4.000 12.000M 12.000 3.000 L 12.000 4.000M 20.000 12.000 L 21.000 12.000M 5.600 5.600 L 6.300 6.300M 18.400 5.600 L 17.700 6.300"),
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
                pathData = parseSvgPathData("M 9.000 16.000 C 7.278 14.709 6.576 12.461 7.257 10.419 C 7.937 8.377 9.848 7.000 12.000 7.000 C 14.152 7.000 16.063 8.377 16.743 10.419 C 17.424 12.461 16.722 14.709 15.000 16.000 C 14.208 16.784 13.837 17.898 14.000 19.000 C 14.000 20.105 13.105 21.000 12.000 21.000 C 10.895 21.000 10.000 20.105 10.000 19.000 C 10.163 17.898 9.792 16.784 9.000 16.000"),
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
                pathData = parseSvgPathData("M 9.700 17.000 L 14.300 17.000"),
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
        return _bulb!!
    }

private var _bulb: ImageVector? = null
