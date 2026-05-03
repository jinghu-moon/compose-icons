package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Chisel: ImageVector
    get() {
        if (_chisel != null) return _chisel!!
        _chisel = tablerOutlineIcon(
            name = "Chisel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 14.000 L 15.500 15.500"),
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
                pathData = parseSvgPathData("M 18.347 15.575 L 20.427 17.654 C 21.192 18.420 21.192 19.661 20.427 20.427 C 19.661 21.192 18.419 21.192 17.654 20.426 L 15.574 18.347 C 14.809 17.581 14.809 16.340 15.575 15.575 C 16.340 14.809 17.582 14.809 18.347 15.575"),
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
                pathData = parseSvgPathData("M 3.000 6.000 L 6.000 3.000 L 13.414 10.414 C 13.789 10.789 14.000 11.298 14.000 11.828 L 14.000 14.000 L 11.828 14.000 C 11.298 14.000 10.789 13.789 10.414 13.414 L 3.000 6.000"),
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
        return _chisel!!
    }

private var _chisel: ImageVector? = null
