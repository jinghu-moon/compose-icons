package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RewindForward10: ImageVector
    get() {
        if (_rewindForward10 != null) return _rewindForward10!!
        _rewindForward10 = tablerOutlineIcon(
            name = "RewindForward10",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 9.0f),
                    PathNode.LineTo(20.0f, 6.0f),
                    PathNode.LineTo(17.0f, 3.0f)
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
                    PathNode.MoveTo(8.0f, 17.918f),
                    PathNode.CurveTo(5.111762f, 17.431055f, 2.997824f, 14.928998f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 8.686292f, 5.686292f, 6.0f, 9.0f, 6.0f),
                    PathNode.LineTo(20.0f, 6.0f)
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
                    PathNode.MoveTo(12.0f, 14.0f),
                    PathNode.LineTo(12.0f, 20.0f)
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
                    PathNode.MoveTo(15.0f, 15.5f),
                    PathNode.LineTo(15.0f, 18.5f),
                    PathNode.CurveTo(15.0f, 19.328426f, 15.671573f, 20.0f, 16.5f, 20.0f),
                    PathNode.CurveTo(17.328426f, 20.0f, 18.0f, 19.328426f, 18.0f, 18.5f),
                    PathNode.LineTo(18.0f, 15.5f),
                    PathNode.CurveTo(18.0f, 14.671573f, 17.328426f, 14.0f, 16.5f, 14.0f),
                    PathNode.CurveTo(15.671573f, 14.0f, 15.0f, 14.671573f, 15.0f, 15.5f)
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
        return _rewindForward10!!
    }

private var _rewindForward10: ImageVector? = null
