package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.KeyframeAlignHorizontal: ImageVector
    get() {
        if (_keyframeAlignHorizontal != null) return _keyframeAlignHorizontal!!
        _keyframeAlignHorizontal = tablerOutlineIcon(
            name = "KeyframeAlignHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.816f, 16.58f),
                    PathNode.CurveTo(12.609f, 16.847f, 12.312f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(11.688f, 17.0f, 11.39f, 16.847f, 11.184f, 16.58f),
                    PathNode.LineTo(8.276f, 12.832f),
                    PathNode.CurveTo(7.90733f, 12.338594f, 7.90733f, 11.661406f, 8.276f, 11.168f),
                    PathNode.LineTo(11.184f, 7.42f),
                    PathNode.CurveTo(11.391f, 7.153f, 11.688f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(12.312f, 7.0f, 12.61f, 7.153f, 12.816f, 7.42f),
                    PathNode.LineTo(15.724f, 11.168f),
                    PathNode.CurveTo(16.09267f, 11.661406f, 16.09267f, 12.338594f, 15.724f, 12.832f),
                    PathNode.LineTo(12.816f, 16.58f)
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
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.LineTo(5.0f, 12.0f)
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
                    PathNode.MoveTo(19.0f, 12.0f),
                    PathNode.LineTo(21.0f, 12.0f)
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
        return _keyframeAlignHorizontal!!
    }

private var _keyframeAlignHorizontal: ImageVector? = null
