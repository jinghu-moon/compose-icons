package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.View360Off: ImageVector
    get() {
        if (_view360Off != null) return _view360Off!!
        _view360Off = tablerOutlineIcon(
            name = "View360Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.335f, 8.388f),
                    PathNode.CurveTo(8.108392f, 9.57856f, 7.996214f, 10.788072f, 8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 16.97f, 9.79f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(13.622f, 21.0f, 15.018f, 18.828f, 15.646f, 15.706f),
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.CurveTo(16.0f, 7.03f, 14.21f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(10.965f, 3.0f, 10.021f, 3.885f, 9.311f, 5.337f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.65f, 5.623f),
                    PathNode.CurveTo(3.342816f, 7.887204f, 2.427147f, 11.214833f, 3.251151f, 14.340651f),
                    PathNode.CurveTo(4.075156f, 17.466469f, 6.512245f, 19.910269f, 9.635785f, 20.742867f),
                    PathNode.CurveTo(12.759325f, 21.575464f, 16.08946f, 20.66895f, 18.36f, 18.368f),
                    PathNode.MoveTo(20.044f, 16.04f),
                    PathNode.CurveTo(21.789566f, 12.570361f, 21.112402f, 8.37233f, 18.364414f, 5.627524f),
                    PathNode.CurveTo(15.616427f, 2.882718f, 11.417615f, 2.210417f, 7.95f, 3.96f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.32f, 8.349f),
                    PathNode.CurveTo(5.184f, 8.974f, 3.0f, 10.374f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 14.21f, 7.03f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(13.286f, 16.0f, 14.51f, 15.88f, 15.616f, 15.664f),
                    PathNode.MoveTo(18.675f, 14.684f),
                    PathNode.CurveTo(20.12f, 13.973f, 21.0f, 13.031f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 9.79f, 16.97f, 8.0f, 12.0f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
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
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _view360Off!!
    }

private var _view360Off: ImageVector? = null
