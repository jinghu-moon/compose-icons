package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayersOff: ImageVector
    get() {
        if (_layersOff != null) return _layersOff!!
        _layersOff = tablerOutlineIcon(
            name = "LayersOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.590 4.581 C 8.952 4.222 9.450 4.000 10.000 4.000 L 18.000 4.000 C 19.105 4.000 20.000 4.895 20.000 6.000 L 20.000 14.000 C 20.000 14.556 19.773 15.060 19.406 15.422M 16.000 16.000 L 10.000 16.000 C 8.895 16.000 8.000 15.105 8.000 14.000 L 8.000 8.000"),
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
                pathData = parseSvgPathData("M 16.000 16.000 L 16.000 18.000 C 16.000 19.105 15.105 20.000 14.000 20.000 L 6.000 20.000 C 4.895 20.000 4.000 19.105 4.000 18.000 L 4.000 10.000 C 4.000 8.895 4.895 8.000 6.000 8.000 L 8.000 8.000"),
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
        return _layersOff!!
    }

private var _layersOff: ImageVector? = null
