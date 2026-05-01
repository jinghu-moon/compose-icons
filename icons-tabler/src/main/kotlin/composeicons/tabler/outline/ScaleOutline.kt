package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScaleOutline: ImageVector
    get() {
        if (_scaleOutline != null) return _scaleOutline!!
        _scaleOutline = tablerOutlineIcon(
            name = "ScaleOutline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 7.0f),
                    PathNode.CurveTo(3.0f, 4.790861f, 4.790861f, 3.0f, 7.0f, 3.0f),
                    PathNode.LineTo(17.0f, 3.0f),
                    PathNode.CurveTo(19.209139f, 3.0f, 21.0f, 4.790861f, 21.0f, 7.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.CurveTo(21.0f, 19.209139f, 19.209139f, 21.0f, 17.0f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(4.790861f, 21.0f, 3.0f, 19.209139f, 3.0f, 17.0f),
                    PathNode.LineTo(3.0f, 7.0f)
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
                    PathNode.CurveTo(13.956f, 7.0f, 15.724f, 7.802f, 17.0f, 9.095f),
                    PathNode.LineTo(14.044f, 11.999f),
                    PathNode.CurveTo(13.489552f, 11.48548f, 12.761722f, 11.200133f, 12.006f, 11.2f),
                    PathNode.CurveTo(11.250414f, 11.199862f, 10.5226f, 11.484844f, 9.968f, 11.998f),
                    PathNode.LineTo(7.012f, 9.095f),
                    PathNode.CurveTo(8.328265f, 7.751433f, 10.13112f, 6.996036f, 12.012f, 7.0f)
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
        return _scaleOutline!!
    }

private var _scaleOutline: ImageVector? = null
