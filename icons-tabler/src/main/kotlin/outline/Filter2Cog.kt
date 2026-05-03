package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Cog: ImageVector
    get() {
        if (_filter2Cog != null) return _filter2Cog!!
        _filter2Cog = tablerOutlineIcon(
            name = "Filter2Cog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 6.000 L 20.000 6.000"),
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
        pathData = parseSvgPathData("M 6.000 12.000 L 18.000 12.000"),
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
        pathData = parseSvgPathData("M 9.000 18.000 L 12.000 18.000"),
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
        pathData = parseSvgPathData("M 19.001 21.000 C 18.471 21.000 17.962 20.789 17.587 20.414 C 17.212 20.039 17.001 19.530 17.001 19.000 C 17.001 18.470 17.212 17.961 17.587 17.586 C 17.962 17.211 18.471 17.000 19.001 17.000M 19.001 21.000 C 19.531 21.000 20.040 20.789 20.415 20.414 C 20.790 20.039 21.001 19.530 21.001 19.000 C 21.001 18.470 20.790 17.961 20.415 17.586 C 20.040 17.211 19.531 17.000 19.001 17.000M 19.001 21.000 L 19.001 22.500M 19.001 17.000 L 19.001 15.500M 22.032 17.250 L 20.733 18.000M 17.270 20.000 L 15.970 20.750M 15.970 17.250 L 17.270 18.000M 20.733 20.000 L 22.033 20.750"),
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
        return _filter2Cog!!
    }

private var _filter2Cog: ImageVector? = null
