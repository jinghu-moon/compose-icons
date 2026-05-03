package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GrillSpatula: ImageVector
    get() {
        if (_grillSpatula != null) return _grillSpatula!!
        _grillSpatula = tablerOutlineIcon(
            name = "GrillSpatula",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.200 10.200 L 16.500 16.500"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 19.347 16.575 L 20.427 17.654 C 21.192 18.420 21.192 19.661 20.427 20.427 C 19.661 21.192 18.419 21.192 17.654 20.426 L 16.574 19.347 C 15.809 18.581 15.809 17.340 16.574 16.574 C 17.340 15.809 18.582 15.809 19.347 16.575"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 3.000 7.000 L 6.050 10.150 C 7.190 11.236 8.988 11.214 10.101 10.101 C 11.214 8.988 11.236 7.190 10.150 6.050 L 7.000 3.000 L 3.000 7.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _grillSpatula!!
    }

private var _grillSpatula: ImageVector? = null
