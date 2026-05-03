package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayersLinked: ImageVector
    get() {
        if (_layersLinked != null) return _layersLinked!!
        _layersLinked = tablerOutlineIcon(
            name = "LayersLinked",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 8.268 C 19.619 8.625 20.000 9.285 20.000 10.000 L 20.000 18.000 C 20.000 19.105 19.105 20.000 18.000 20.000 L 10.000 20.000 C 8.895 20.000 8.000 19.105 8.000 18.000 L 8.000 10.000 C 8.000 8.895 8.895 8.000 10.000 8.000 L 13.000 8.000"),
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
                pathData = parseSvgPathData("M 5.000 15.734 C 4.381 15.376 3.999 14.715 4.000 14.000 L 4.000 6.000 C 4.000 4.895 4.895 4.000 6.000 4.000 L 14.000 4.000 C 15.105 4.000 16.000 4.895 16.000 6.000 L 16.000 14.000 C 16.000 15.105 15.105 16.000 14.000 16.000 L 11.000 16.000"),
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
        return _layersLinked!!
    }

private var _layersLinked: ImageVector? = null
