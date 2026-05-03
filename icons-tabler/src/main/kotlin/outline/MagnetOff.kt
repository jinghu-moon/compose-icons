package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MagnetOff: ImageVector
    get() {
        if (_magnetOff != null) return _magnetOff!!
        _magnetOff = tablerOutlineIcon(
            name = "MagnetOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 3.000 C 8.105 3.000 9.000 3.895 9.000 5.000M 9.000 9.000 L 9.000 13.000 C 9.000 14.341 9.890 15.520 11.180 15.887 C 12.470 16.253 13.847 15.719 14.552 14.578M 15.000 11.000 L 15.000 5.000 C 15.000 3.895 15.895 3.000 17.000 3.000 L 18.000 3.000 C 19.105 3.000 20.000 3.895 20.000 5.000 L 20.000 13.000 C 20.001 13.876 19.858 14.747 19.576 15.577M 18.113 18.161 C 15.946 20.728 12.407 21.667 9.252 20.514 C 6.098 19.360 4.000 16.359 4.000 13.000 L 4.000 5.000 C 4.000 4.703 4.065 4.420 4.181 4.167"),
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
                pathData = parseSvgPathData("M 4.000 8.000 L 8.000 8.000"),
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
                pathData = parseSvgPathData("M 15.000 8.000 L 19.000 8.000"),
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
        return _magnetOff!!
    }

private var _magnetOff: ImageVector? = null
