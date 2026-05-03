package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BlendMode: ImageVector
    get() {
        if (_blendMode != null) return _blendMode!!
        _blendMode = tablerOutlineIcon(
            name = "BlendMode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 9.5f),
                    PathNode.CurveTo(8.0f, 13.08985f, 10.91015f, 16.0f, 14.5f, 16.0f),
                    PathNode.CurveTo(18.089851f, 16.0f, 21.0f, 13.08985f, 21.0f, 9.5f),
                    PathNode.CurveTo(21.0f, 5.910149f, 18.089851f, 3.0f, 14.5f, 3.0f),
                    PathNode.CurveTo(10.91015f, 3.0f, 8.0f, 5.910149f, 8.0f, 9.5f)
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
                    PathNode.MoveTo(3.0f, 14.5f),
                    PathNode.CurveTo(3.0f, 18.089851f, 5.910149f, 21.0f, 9.5f, 21.0f),
                    PathNode.CurveTo(13.08985f, 21.0f, 16.0f, 18.089851f, 16.0f, 14.5f),
                    PathNode.CurveTo(16.0f, 10.91015f, 13.08985f, 8.0f, 9.5f, 8.0f),
                    PathNode.CurveTo(5.910149f, 8.0f, 3.0f, 10.91015f, 3.0f, 14.5f)
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
        return _blendMode!!
    }

private var _blendMode: ImageVector? = null
