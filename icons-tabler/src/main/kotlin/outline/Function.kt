package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = tablerOutlineIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 6.667 C 4.000 5.194 5.194 4.000 6.667 4.000 L 17.333 4.000 C 18.806 4.000 20.000 5.194 20.000 6.667 L 20.000 17.333 C 20.000 18.806 18.806 20.000 17.333 20.000 L 6.667 20.000 C 5.194 20.000 4.000 18.806 4.000 17.333 L 4.000 6.667"),
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
                pathData = parseSvgPathData("M 9.000 15.500 L 9.000 15.750 C 9.000 16.440 9.560 17.000 10.250 17.000 C 10.960 17.000 11.554 16.462 11.624 15.756 L 12.376 8.244 C 12.446 7.538 13.040 7.000 13.750 7.000 C 14.440 7.000 15.000 7.560 15.000 8.250 L 15.000 8.500"),
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
                pathData = parseSvgPathData("M 9.000 12.000 L 15.000 12.000"),
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
        return _function!!
    }

private var _function: ImageVector? = null
