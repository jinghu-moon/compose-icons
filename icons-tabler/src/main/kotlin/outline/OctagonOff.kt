package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.OctagonOff: ImageVector
    get() {
        if (_octagonOff != null) return _octagonOff!!
        _octagonOff = tablerOutlineIcon(
            name = "OctagonOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.027 19.002 C 18.841 19.191 18.621 19.342 18.377 19.446 L 12.802 21.836 C 12.290 22.055 11.710 22.055 11.198 21.836 L 5.623 19.446 C 5.142 19.240 4.759 18.857 4.553 18.376 L 2.165 12.802 C 1.946 12.290 1.946 11.710 2.165 11.198 L 4.554 5.623 C 4.657 5.383 4.804 5.166 4.987 4.984M 7.676 3.674 L 11.198 2.164 C 11.710 1.945 12.290 1.945 12.802 2.164 L 18.377 4.554 C 18.857 4.760 19.240 5.143 19.447 5.624 L 21.835 11.198 C 22.055 11.710 22.055 12.290 21.835 12.802 L 20.326 16.324"),
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
        return _octagonOff!!
    }

private var _octagonOff: ImageVector? = null
