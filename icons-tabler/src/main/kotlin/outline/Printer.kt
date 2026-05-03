package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Printer: ImageVector
    get() {
        if (_printer != null) return _printer!!
        _printer = tablerOutlineIcon(
            name = "Printer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 17.000 L 19.000 17.000 C 20.105 17.000 21.000 16.105 21.000 15.000 L 21.000 11.000 C 21.000 9.895 20.105 9.000 19.000 9.000 L 5.000 9.000 C 3.895 9.000 3.000 9.895 3.000 11.000 L 3.000 15.000 C 3.000 16.105 3.895 17.000 5.000 17.000 L 7.000 17.000"),
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
                pathData = parseSvgPathData("M 17.000 9.000 L 17.000 5.000 C 17.000 3.895 16.105 3.000 15.000 3.000 L 9.000 3.000 C 7.895 3.000 7.000 3.895 7.000 5.000 L 7.000 9.000"),
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
                pathData = parseSvgPathData("M 7.000 15.000 C 7.000 13.895 7.895 13.000 9.000 13.000 L 15.000 13.000 C 16.105 13.000 17.000 13.895 17.000 15.000 L 17.000 19.000 C 17.000 20.105 16.105 21.000 15.000 21.000 L 9.000 21.000 C 7.895 21.000 7.000 20.105 7.000 19.000 L 7.000 15.000"),
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
        return _printer!!
    }

private var _printer: ImageVector? = null
