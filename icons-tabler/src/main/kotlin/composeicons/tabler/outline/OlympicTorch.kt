package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.OlympicTorch: ImageVector
    get() {
        if (_olympicTorch != null) return _olympicTorch!!
        _olympicTorch = tablerOutlineIcon(
            name = "OlympicTorch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 9.0f),
                    PathNode.LineTo(16.0f, 9.0f)
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
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.CurveTo(10.0f, 13.364f, 10.0f, 16.636f, 10.0f, 21.0f),
                    PathNode.LineTo(14.0f, 21.0f),
                    PathNode.CurveTo(14.0f, 16.636f, 14.0f, 13.364f, 15.0f, 9.0f)
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
                    PathNode.MoveTo(11.0f, 3.0f),
                    PathNode.CurveTo(11.0f, 5.5f, 10.0f, 5.66f, 10.0f, 7.0f),
                    PathNode.CurveTo(9.970807f, 7.538853f, 10.17213f, 8.064699f, 10.553715f, 8.446285f),
                    PathNode.CurveTo(10.935301f, 8.82787f, 11.461147f, 9.029193f, 12.0f, 9.0f),
                    PathNode.CurveTo(12.541491f, 9.039156f, 13.073268f, 8.841051f, 13.45716f, 8.45716f),
                    PathNode.CurveTo(13.841051f, 8.073268f, 14.039156f, 7.541491f, 14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 5.59f, 13.0f, 4.0f, 11.0f, 3.0f)
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
        return _olympicTorch!!
    }

private var _olympicTorch: ImageVector? = null
