package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RewindBackward20: ImageVector
    get() {
        if (_rewindBackward20 != null) return _rewindBackward20!!
        _rewindBackward20 = tablerOutlineIcon(
            name = "RewindBackward20",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.007 16.466 C 20.857 14.806 21.492 12.176 20.604 9.855 C 19.715 7.533 17.486 6.000 15.000 6.000 L 4.000 6.000"),
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
        pathData = parseSvgPathData("M 7.000 9.000 L 4.000 6.000 L 7.000 3.000"),
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
        pathData = parseSvgPathData("M 12.000 15.500 L 12.000 18.500 C 12.000 19.328 12.672 20.000 13.500 20.000 C 14.328 20.000 15.000 19.328 15.000 18.500 L 15.000 15.500 C 15.000 14.672 14.328 14.000 13.500 14.000 C 12.672 14.000 12.000 14.672 12.000 15.500"),
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
        pathData = parseSvgPathData("M 6.000 14.000 L 8.000 14.000 C 8.552 14.000 9.000 14.448 9.000 15.000 L 9.000 16.000 C 9.000 16.552 8.552 17.000 8.000 17.000 L 7.000 17.000 C 6.448 17.000 6.000 17.448 6.000 18.000 L 6.000 19.000 C 6.000 19.552 6.448 20.000 7.000 20.000 L 9.000 20.000"),
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
        return _rewindBackward20!!
    }

private var _rewindBackward20: ImageVector? = null
