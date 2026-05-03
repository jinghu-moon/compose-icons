package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.StrokeCurved: ImageVector
    get() {
        if (_strokeCurved != null) return _strokeCurved!!
        _strokeCurved = tablerOutlineIcon(
            name = "StrokeCurved",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 19.0f),
                    PathNode.LineTo(5.341f, 19.0f),
                    PathNode.CurveTo(8.641818f, 19.00021f, 11.494243f, 16.694519f, 12.186f, 13.467f),
                    PathNode.LineTo(12.814f, 10.533f),
                    PathNode.CurveTo(13.505836f, 7.305115f, 16.358807f, 4.999318f, 19.66f, 5.0f),
                    PathNode.LineTo(21.0f, 5.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _strokeCurved!!
    }

private var _strokeCurved: ImageVector? = null
