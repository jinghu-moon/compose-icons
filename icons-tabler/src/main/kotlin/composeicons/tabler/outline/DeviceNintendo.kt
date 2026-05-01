package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceNintendo: ImageVector
    get() {
        if (_deviceNintendo != null) return _deviceNintendo!!
        _deviceNintendo = tablerOutlineIcon(
            name = "DeviceNintendo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 20.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.LineTo(7.0f, 4.0f),
                    PathNode.CurveTo(4.790861f, 4.0f, 3.0f, 5.790861f, 3.0f, 8.0f),
                    PathNode.LineTo(3.0f, 16.0f),
                    PathNode.CurveTo(3.0f, 18.209139f, 4.790861f, 20.0f, 7.0f, 20.0f),
                    PathNode.LineTo(10.0f, 20.0f)
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
                    PathNode.MoveTo(14.0f, 20.0f),
                    PathNode.LineTo(14.0f, 4.0f),
                    PathNode.LineTo(17.0f, 4.0f),
                    PathNode.CurveTo(19.209139f, 4.0f, 21.0f, 5.790861f, 21.0f, 8.0f),
                    PathNode.LineTo(21.0f, 16.0f),
                    PathNode.CurveTo(21.0f, 18.209139f, 19.209139f, 20.0f, 17.0f, 20.0f),
                    PathNode.LineTo(14.0f, 20.0f)
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
                    PathNode.MoveTo(16.5f, 15.5f),
                    PathNode.CurveTo(16.5f, 16.052284f, 16.947716f, 16.5f, 17.5f, 16.5f),
                    PathNode.CurveTo(18.052284f, 16.5f, 18.5f, 16.052284f, 18.5f, 15.5f),
                    PathNode.CurveTo(18.5f, 14.947715f, 18.052284f, 14.5f, 17.5f, 14.5f),
                    PathNode.CurveTo(16.947716f, 14.5f, 16.5f, 14.947715f, 16.5f, 15.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
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
                    PathNode.MoveTo(5.5f, 8.5f),
                    PathNode.CurveTo(5.5f, 9.052285f, 5.947716f, 9.5f, 6.5f, 9.5f),
                    PathNode.CurveTo(7.052285f, 9.5f, 7.5f, 9.052285f, 7.5f, 8.5f),
                    PathNode.CurveTo(7.5f, 7.947716f, 7.052285f, 7.5f, 6.5f, 7.5f),
                    PathNode.CurveTo(5.947716f, 7.5f, 5.5f, 7.947716f, 5.5f, 8.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _deviceNintendo!!
    }

private var _deviceNintendo: ImageVector? = null
