package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VideoOff: ImageVector
    get() {
        if (_videoOff != null) return _videoOff!!
        _videoOff = tablerOutlineIcon(
            name = "VideoOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
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
    addPath(
        pathData = parseSvgPathData("M 15.000 11.000 L 15.000 10.000 L 19.553 7.724 C 19.863 7.569 20.231 7.586 20.526 7.768 C 20.820 7.950 21.000 8.272 21.000 8.618 L 21.000 15.382 C 21.000 15.809 20.729 16.189 20.325 16.328"),
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
        pathData = parseSvgPathData("M 10.000 6.000 L 13.000 6.000 C 14.105 6.000 15.000 6.895 15.000 8.000 L 15.000 11.000M 15.000 15.000 L 15.000 16.000 C 15.000 17.105 14.105 18.000 13.000 18.000 L 5.000 18.000 C 3.895 18.000 3.000 17.105 3.000 16.000 L 3.000 8.000 C 3.000 6.895 3.895 6.000 5.000 6.000 L 6.000 6.000"),
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
        return _videoOff!!
    }

private var _videoOff: ImageVector? = null
