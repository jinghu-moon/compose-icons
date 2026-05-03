package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LockOpen2: ImageVector
    get() {
        if (_lockOpen2 != null) return _lockOpen2!!
        _lockOpen2 = tablerOutlineIcon(
            name = "LockOpen2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 13.000 C 3.000 11.895 3.895 11.000 5.000 11.000 L 15.000 11.000 C 16.105 11.000 17.000 11.895 17.000 13.000 L 17.000 19.000 C 17.000 20.105 16.105 21.000 15.000 21.000 L 5.000 21.000 C 3.895 21.000 3.000 20.105 3.000 19.000 L 3.000 13.000"),
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
        pathData = parseSvgPathData("M 9.000 16.000 C 9.000 16.552 9.448 17.000 10.000 17.000 C 10.552 17.000 11.000 16.552 11.000 16.000 C 11.000 15.448 10.552 15.000 10.000 15.000 C 9.448 15.000 9.000 15.448 9.000 16.000"),
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
        pathData = parseSvgPathData("M 13.000 11.000 L 13.000 7.000 C 13.000 4.791 14.791 3.000 17.000 3.000 C 19.209 3.000 21.000 4.791 21.000 7.000 L 21.000 11.000"),
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
        return _lockOpen2!!
    }

private var _lockOpen2: ImageVector? = null
