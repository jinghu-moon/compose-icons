package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PepperOff: ImageVector
    get() {
        if (_pepperOff != null) return _pepperOff!!
        _pepperOff = tablerOutlineIcon(
            name = "PepperOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.59f, 12.59f),
                    PathNode.CurveTo(11.82f, 14.008f, 10.055f, 15.0f, 8.0f, 15.0f),
                    PathNode.CurveTo(5.239f, 15.0f, 3.0f, 13.21f, 3.0f, 11.0f),
                    PathNode.CurveTo(3.000273f, 14.232014f, 4.945278f, 17.146378f, 7.929807f, 18.386742f),
                    PathNode.CurveTo(10.914335f, 19.627104f, 14.352037f, 18.949781f, 16.643f, 16.67f),
                    PathNode.MoveTo(18.283f, 14.313f),
                    PathNode.CurveTo(18.756792f, 13.272854f, 19.001322f, 12.14297f, 19.0f, 11.0f),
                    PathNode.CurveTo(19.00072f, 9.66102f, 18.114021f, 8.483673f, 16.826912f, 8.114601f),
                    PathNode.CurveTo(15.539801f, 7.745529f, 14.163939f, 8.274099f, 13.455f, 9.41f)
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
                    PathNode.MoveTo(16.0f, 8.0f),
                    PathNode.CurveTo(16.0f, 6.0f, 18.0f, 4.0f, 20.0f, 4.0f)
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
        return _pepperOff!!
    }

private var _pepperOff: ImageVector? = null
