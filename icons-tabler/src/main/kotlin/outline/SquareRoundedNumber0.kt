package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRoundedNumber0: ImageVector
    get() {
        if (_squareRoundedNumber0 != null) return _squareRoundedNumber0!!
        _squareRoundedNumber0 = tablerOutlineIcon(
            name = "SquareRoundedNumber0",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 10.000 L 10.000 14.000 C 10.000 15.105 10.895 16.000 12.000 16.000 C 13.105 16.000 14.000 15.105 14.000 14.000 L 14.000 10.000 C 14.000 8.895 13.105 8.000 12.000 8.000 C 10.895 8.000 10.000 8.895 10.000 10.000"),
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
                pathData = parseSvgPathData("M 12.000 3.000 C 19.200 3.000 21.000 4.800 21.000 12.000 C 21.000 19.200 19.200 21.000 12.000 21.000 C 4.800 21.000 3.000 19.200 3.000 12.000 C 3.000 4.800 4.800 3.000 12.000 3.000"),
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
        return _squareRoundedNumber0!!
    }

private var _squareRoundedNumber0: ImageVector? = null
