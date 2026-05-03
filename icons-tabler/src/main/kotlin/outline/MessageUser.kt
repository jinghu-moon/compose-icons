package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageUser: ImageVector
    get() {
        if (_messageUser != null) return _messageUser!!
        _messageUser = tablerOutlineIcon(
            name = "MessageUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 18.000 L 8.000 21.000 L 8.000 18.000 L 6.000 18.000 C 4.343 18.000 3.000 16.657 3.000 15.000 L 3.000 7.000 C 3.000 5.343 4.343 4.000 6.000 4.000 L 18.000 4.000 C 19.657 4.000 21.000 5.343 21.000 7.000 L 21.000 11.500"),
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
        pathData = parseSvgPathData("M 17.000 17.000 C 17.000 18.105 17.895 19.000 19.000 19.000 C 20.105 19.000 21.000 18.105 21.000 17.000 C 21.000 15.895 20.105 15.000 19.000 15.000 C 17.895 15.000 17.000 15.895 17.000 17.000"),
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
        pathData = parseSvgPathData("M 22.000 22.000 C 22.000 20.895 21.105 20.000 20.000 20.000 L 18.000 20.000 C 16.895 20.000 16.000 20.895 16.000 22.000"),
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
        return _messageUser!!
    }

private var _messageUser: ImageVector? = null
