package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ReportOff: ImageVector
    get() {
        if (_reportOff != null) return _reportOff!!
        _reportOff = tablerOutlineIcon(
            name = "ReportOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.576 5.595 C 5.207 5.969 5.000 6.474 5.000 7.000 L 5.000 19.000 C 5.000 20.105 5.895 21.000 7.000 21.000 L 17.000 21.000 C 18.105 21.000 19.000 20.105 19.000 19.000M 19.000 15.000 L 19.000 7.000 C 19.000 5.895 18.105 5.000 17.000 5.000 L 15.000 5.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 9.000 5.000 C 9.000 3.895 9.895 3.000 11.000 3.000 L 13.000 3.000 C 14.105 3.000 15.000 3.895 15.000 5.000 C 15.000 6.105 14.105 7.000 13.000 7.000 L 11.000 7.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _reportOff!!
    }

private var _reportOff: ImageVector? = null
