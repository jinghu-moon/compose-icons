package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrightnessHalf: ImageVector
    get() {
        if (_brightnessHalf != null) return _brightnessHalf!!
        _brightnessHalf = tablerOutlineIcon(
            name = "BrightnessHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 9.000 C 10.343 9.000 9.000 10.343 9.000 12.000 C 9.000 13.657 10.343 15.000 12.000 15.000 L 12.000 9.000"),
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
                pathData = parseSvgPathData("M 6.000 6.000 L 9.500 6.000 L 12.000 3.500 L 14.500 6.000 L 18.000 6.000 L 18.000 9.500 L 20.500 12.000 L 18.000 14.500 L 18.000 18.000 L 14.500 18.000 L 12.000 20.500 L 9.500 18.000 L 6.000 18.000 L 6.000 14.500 L 3.500 12.000 L 6.000 9.500 L 6.000 6.000"),
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
        return _brightnessHalf!!
    }

private var _brightnessHalf: ImageVector? = null
