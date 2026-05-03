package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathIntegrals: ImageVector
    get() {
        if (_mathIntegrals != null) return _mathIntegrals!!
        _mathIntegrals = tablerOutlineIcon(
            name = "MathIntegrals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 19.000 C 3.000 20.105 3.895 21.000 5.000 21.000 C 7.000 21.000 7.000 17.000 8.000 12.000 C 9.000 7.000 9.000 3.000 11.000 3.000 C 12.105 3.000 13.000 3.895 13.000 5.000"),
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
                pathData = parseSvgPathData("M 11.000 19.000 C 11.000 20.105 11.895 21.000 13.000 21.000 C 15.000 21.000 15.000 17.000 16.000 12.000 C 17.000 7.000 17.000 3.000 19.000 3.000 C 20.105 3.000 21.000 3.895 21.000 5.000"),
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
        return _mathIntegrals!!
    }

private var _mathIntegrals: ImageVector? = null
