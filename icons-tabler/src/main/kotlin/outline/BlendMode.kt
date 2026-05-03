package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BlendMode: ImageVector
    get() {
        if (_blendMode != null) return _blendMode!!
        _blendMode = tablerOutlineIcon(
            name = "BlendMode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 9.500 C 8.000 13.090 10.910 16.000 14.500 16.000 C 18.090 16.000 21.000 13.090 21.000 9.500 C 21.000 5.910 18.090 3.000 14.500 3.000 C 10.910 3.000 8.000 5.910 8.000 9.500"),
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
                pathData = parseSvgPathData("M 3.000 14.500 C 3.000 18.090 5.910 21.000 9.500 21.000 C 13.090 21.000 16.000 18.090 16.000 14.500 C 16.000 10.910 13.090 8.000 9.500 8.000 C 5.910 8.000 3.000 10.910 3.000 14.500"),
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
        return _blendMode!!
    }

private var _blendMode: ImageVector? = null
