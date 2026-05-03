package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RewindForward30: ImageVector
    get() {
        if (_rewindForward30 != null) return _rewindForward30!!
        _rewindForward30 = tablerOutlineIcon(
            name = "RewindForward30",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.007 16.478 C 3.149 14.821 2.507 12.189 3.394 9.863 C 4.280 7.537 6.511 6.000 9.000 6.000 L 20.000 6.000"),
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
        pathData = parseSvgPathData("M 15.000 15.500 L 15.000 18.500 C 15.000 19.328 15.672 20.000 16.500 20.000 C 17.328 20.000 18.000 19.328 18.000 18.500 L 18.000 15.500 C 18.000 14.672 17.328 14.000 16.500 14.000 C 15.672 14.000 15.000 14.672 15.000 15.500"),
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
        pathData = parseSvgPathData("M 17.000 9.000 L 20.000 6.000 L 17.000 3.000"),
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
        pathData = parseSvgPathData("M 9.000 14.000 L 10.500 14.000 C 11.328 14.000 12.000 14.672 12.000 15.500 C 12.000 16.328 11.328 17.000 10.500 17.000 L 10.000 17.000 L 10.500 17.000 C 11.328 17.000 12.000 17.672 12.000 18.500 C 12.000 19.328 11.328 20.000 10.500 20.000 L 9.000 20.000"),
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
        return _rewindForward30!!
    }

private var _rewindForward30: ImageVector? = null
