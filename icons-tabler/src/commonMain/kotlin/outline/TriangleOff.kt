package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TriangleOff: ImageVector
    get() {
        if (_triangleOff != null) return _triangleOff!!
        _triangleOff = tablerOutlineIcon(
            name = "TriangleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.825f, 7.83f),
                    PathNode.LineTo(2.257f, 17.125f),
                    PathNode.CurveTo(1.916961f, 17.713865f, 1.914885f, 18.43893f, 2.251546f, 19.029734f),
                    PathNode.CurveTo(2.588207f, 19.620537f, 3.213051f, 19.988361f, 3.893f, 19.996f),
                    PathNode.LineTo(20.0f, 19.996f),
                    PathNode.MoveTo(21.998f, 18.006f),
                    PathNode.CurveTo(21.985535f, 17.696342f, 21.898026f, 17.394348f, 21.743f, 17.126f),
                    PathNode.LineTo(13.637f, 3.59f),
                    PathNode.CurveTo(13.290141f, 3.017486f, 12.66939f, 2.66778f, 12.0f, 2.66778f),
                    PathNode.CurveTo(11.33061f, 2.66778f, 10.709859f, 3.017486f, 10.363f, 3.59f),
                    PathNode.LineTo(9.335f, 5.308f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _triangleOff!!
    }

private var _triangleOff: ImageVector? = null
