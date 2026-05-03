package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonalPyramidOff: ImageVector
    get() {
        if (_hexagonalPyramidOff != null) return _hexagonalPyramidOff!!
        _hexagonalPyramidOff = tablerOutlineIcon(
            name = "HexagonalPyramidOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.877 7.880 L 3.317 15.410 C 2.809 16.197 2.920 17.232 3.583 17.894 L 6.110 20.417 C 6.484 20.790 6.990 21.000 7.518 21.000 L 16.482 21.000 C 17.010 21.000 17.516 20.790 17.890 20.417 L 19.154 19.154M 20.946 16.949 C 21.072 16.422 20.977 15.866 20.684 15.411 L 12.838 2.457 C 12.655 2.172 12.339 1.999 12.000 1.999 C 11.661 1.999 11.345 2.172 11.162 2.457 L 9.390 5.383"),
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
                pathData = parseSvgPathData("M 12.000 2.000 L 10.746 6.742M 9.905 9.919 L 7.000 20.900"),
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
                pathData = parseSvgPathData("M 12.000 2.000 L 14.153 10.140M 15.597 15.597 L 17.000 20.900"),
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
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _hexagonalPyramidOff!!
    }

private var _hexagonalPyramidOff: ImageVector? = null
