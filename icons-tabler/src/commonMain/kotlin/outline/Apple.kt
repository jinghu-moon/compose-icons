package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Apple: ImageVector
    get() {
        if (_apple != null) return _apple!!
        _apple = tablerOutlineIcon(
            name = "Apple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 11.319f),
                    PathNode.CurveTo(4.0f, 14.421f, 4.444f, 16.638f, 6.222f, 19.297f),
                    PathNode.CurveTo(7.573f, 21.094f, 9.378f, 21.544f, 11.302f, 20.285f),
                    PathNode.CurveTo(11.728f, 20.017f, 12.272f, 20.017f, 12.699f, 20.285f),
                    PathNode.CurveTo(14.622f, 21.545f, 16.427f, 21.094f, 17.778f, 19.297f),
                    PathNode.CurveTo(19.556f, 16.637f, 20.0f, 14.421f, 20.0f, 11.32f),
                    PathNode.CurveTo(20.0f, 8.659f, 18.01f, 6.0f, 15.556f, 6.0f),
                    PathNode.CurveTo(14.289f, 6.0f, 13.146f, 6.693f, 12.336f, 7.44f),
                    PathNode.CurveTo(12.14539f, 7.612966f, 11.85461f, 7.612966f, 11.664f, 7.44f),
                    PathNode.CurveTo(10.855f, 6.694f, 9.711f, 6.0f, 8.444f, 6.0f),
                    PathNode.CurveTo(5.99f, 6.0f, 4.0f, 8.66f, 4.0f, 11.319f)
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
                    PathNode.MoveTo(7.0f, 12.0f),
                    PathNode.CurveTo(7.0f, 10.53f, 7.454f, 9.66f, 8.5f, 9.0f)
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(12.0f, 5.8f, 12.867f, 3.0f, 15.0f, 3.0f)
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
        return _apple!!
    }

private var _apple: ImageVector? = null
