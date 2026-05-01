package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZoomMoney: ImageVector
    get() {
        if (_zoomMoney != null) return _zoomMoney!!
        _zoomMoney = tablerOutlineIcon(
            name = "ZoomMoney",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 10.0f),
                    PathNode.CurveTo(3.0f, 13.865993f, 6.134007f, 17.0f, 10.0f, 17.0f),
                    PathNode.CurveTo(13.865993f, 17.0f, 17.0f, 13.865993f, 17.0f, 10.0f),
                    PathNode.CurveTo(17.0f, 6.134007f, 13.865993f, 3.0f, 10.0f, 3.0f),
                    PathNode.CurveTo(6.134007f, 3.0f, 3.0f, 6.134007f, 3.0f, 10.0f)
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
                    PathNode.MoveTo(21.0f, 21.0f),
                    PathNode.LineTo(15.0f, 15.0f)
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.LineTo(9.5f, 7.0f),
                    PathNode.CurveTo(8.671573f, 7.0f, 8.0f, 7.671573f, 8.0f, 8.5f),
                    PathNode.CurveTo(8.0f, 9.328427f, 8.671573f, 10.0f, 9.5f, 10.0f),
                    PathNode.LineTo(10.5f, 10.0f),
                    PathNode.CurveTo(11.328427f, 10.0f, 12.0f, 10.671573f, 12.0f, 11.5f),
                    PathNode.CurveTo(12.0f, 12.328427f, 11.328427f, 13.0f, 10.5f, 13.0f),
                    PathNode.LineTo(8.0f, 13.0f)
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
                    PathNode.MoveTo(10.0f, 13.0f),
                    PathNode.LineTo(10.0f, 14.0f),
                    PathNode.MoveTo(10.0f, 6.0f),
                    PathNode.LineTo(10.0f, 7.0f)
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
        return _zoomMoney!!
    }

private var _zoomMoney: ImageVector? = null
