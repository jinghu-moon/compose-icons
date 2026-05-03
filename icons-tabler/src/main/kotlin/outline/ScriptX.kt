package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScriptX: ImageVector
    get() {
        if (_scriptX != null) return _scriptX!!
        _scriptX = tablerOutlineIcon(
            name = "ScriptX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 20.000 L 6.000 20.000 C 4.343 20.000 3.000 18.657 3.000 17.000 C 3.000 15.343 4.343 14.000 6.000 14.000 L 17.000 14.000 C 15.343 14.000 14.000 15.343 14.000 17.000M 21.000 14.000 L 21.000 6.000 C 21.000 4.895 20.105 4.000 19.000 4.000 L 9.000 4.000 C 7.895 4.000 7.000 4.895 7.000 6.000 L 7.000 14.000"),
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
        pathData = parseSvgPathData("M 17.000 17.000 L 21.000 21.000M 21.000 17.000 L 17.000 21.000"),
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
        return _scriptX!!
    }

private var _scriptX: ImageVector? = null
