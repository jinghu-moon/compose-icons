package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PyramidOff: ImageVector
    get() {
        if (_pyramidOff != null) return _pyramidOff!!
        _pyramidOff = tablerOutlineIcon(
            name = "PyramidOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.384 17.373 C 21.595 17.039 21.590 16.611 21.371 16.282 L 12.831 2.446 C 12.646 2.167 12.334 2.000 11.999 2.000 C 11.664 2.000 11.352 2.167 11.167 2.446 L 9.367 5.363M 7.836 7.843 L 2.627 16.282 C 2.469 16.521 2.420 16.817 2.494 17.095 C 2.568 17.372 2.757 17.605 3.013 17.734 L 11.105 21.788 C 11.668 22.071 12.331 22.071 12.894 21.788 L 18.797 18.830"),
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
                pathData = parseSvgPathData("M 12.000 2.000 L 12.000 8.000M 12.000 12.000 L 12.000 22.000"),
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
        return _pyramidOff!!
    }

private var _pyramidOff: ImageVector? = null
