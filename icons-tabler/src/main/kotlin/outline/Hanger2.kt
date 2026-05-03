package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hanger2: ImageVector
    get() {
        if (_hanger2 != null) return _hanger2!!
        _hanger2 = tablerOutlineIcon(
            name = "Hanger2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 9.000 L 4.029 13.428 C 3.394 13.781 3.000 14.450 3.000 15.177 L 3.000 16.000 C 3.000 17.105 3.895 18.000 5.000 18.000 L 6.000 18.000"),
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
                pathData = parseSvgPathData("M 18.000 18.000 L 19.000 18.000 C 20.105 18.000 21.000 17.105 21.000 16.000 L 21.000 15.177 C 21.000 14.450 20.606 13.781 19.971 13.428 L 12.000 9.000 C 10.543 8.190 10.007 6.667 10.000 5.000 C 10.000 3.895 10.895 3.000 12.000 3.000 C 13.105 3.000 14.000 3.895 14.000 5.000"),
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
                pathData = parseSvgPathData("M 6.000 18.000 C 6.000 16.895 6.895 16.000 8.000 16.000 L 16.000 16.000 C 17.105 16.000 18.000 16.895 18.000 18.000 L 18.000 19.000 C 18.000 20.105 17.105 21.000 16.000 21.000 L 8.000 21.000 C 6.895 21.000 6.000 20.105 6.000 19.000 L 6.000 18.000"),
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
        return _hanger2!!
    }

private var _hanger2: ImageVector? = null
