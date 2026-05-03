package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BorderCornerIos: ImageVector
    get() {
        if (_borderCornerIos != null) return _borderCornerIos!!
        _borderCornerIos = tablerOutlineIcon(
            name = "BorderCornerIos",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 20.000 C 4.000 13.441 4.000 10.162 5.628 7.838 C 6.230 6.978 6.978 6.230 7.838 5.628 C 10.162 4.000 13.440 4.000 20.000 4.000"),
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
        return _borderCornerIos!!
    }

private var _borderCornerIos: ImageVector? = null
