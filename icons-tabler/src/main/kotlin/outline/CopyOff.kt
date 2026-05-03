package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CopyOff: ImageVector
    get() {
        if (_copyOff != null) return _copyOff!!
        _copyOff = tablerOutlineIcon(
            name = "CopyOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.414 19.415 C 19.039 19.790 18.530 20.000 18.000 20.000 L 10.000 20.000 C 8.895 20.000 8.000 19.105 8.000 18.000 L 8.000 10.000 C 8.000 9.446 8.225 8.945 8.589 8.583M 12.000 8.000 L 18.000 8.000 C 19.105 8.000 20.000 8.895 20.000 10.000 L 20.000 16.000"),
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
        pathData = parseSvgPathData("M 16.000 8.000 L 16.000 6.000 C 16.000 4.895 15.105 4.000 14.000 4.000 L 8.000 4.000M 4.582 4.590 C 4.222 4.950 4.000 5.450 4.000 6.000 L 4.000 14.000 C 4.000 15.105 4.895 16.000 6.000 16.000 L 8.000 16.000"),
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
        return _copyOff!!
    }

private var _copyOff: ImageVector? = null
