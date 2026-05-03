package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TrianglePlus2: ImageVector
    get() {
        if (_trianglePlus2 != null) return _trianglePlus2!!
        _trianglePlus2 = tablerOutlineIcon(
            name = "TrianglePlus2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.69f, 12.027f),
                    PathNode.LineTo(13.636f, 3.59f),
                    PathNode.CurveTo(13.289142f, 3.017486f, 12.668389f, 2.66778f, 11.999f, 2.66778f),
                    PathNode.CurveTo(11.32961f, 2.66778f, 10.708858f, 3.017486f, 10.362f, 3.59f),
                    PathNode.LineTo(2.257f, 17.125f),
                    PathNode.CurveTo(1.916961f, 17.713865f, 1.914885f, 18.43893f, 2.251546f, 19.029734f),
                    PathNode.CurveTo(2.588207f, 19.620537f, 3.213051f, 19.988361f, 3.893f, 19.996f),
                    PathNode.LineTo(12.0f, 19.996f)
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
                    PathNode.MoveTo(16.0f, 19.0f),
                    PathNode.LineTo(22.0f, 19.0f)
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
                    PathNode.MoveTo(19.0f, 16.0f),
                    PathNode.LineTo(19.0f, 22.0f)
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
        return _trianglePlus2!!
    }

private var _trianglePlus2: ImageVector? = null
