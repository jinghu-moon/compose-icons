package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CardsThree: ImageVector
    get() {
        if (_cardsThree != null) return _cardsThree!!
        _cardsThree = phosphorFillIcon(
            name = "CardsThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 104.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(224.0f, 208.83656f, 216.83656f, 216.0f, 208.0f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(39.163445f, 216.0f, 32.0f, 208.83656f, 32.0f, 200.0f),
                    PathNode.LineTo(32.0f, 104.0f),
                    PathNode.CurveTo(32.0f, 95.163445f, 39.163445f, 88.0f, 48.0f, 88.0f),
                    PathNode.LineTo(208.0f, 88.0f),
                    PathNode.CurveTo(216.83656f, 88.0f, 224.0f, 95.163445f, 224.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 72.0f),
                    PathNode.LineTo(200.0f, 72.0f),
                    PathNode.CurveTo(204.41827f, 72.0f, 208.0f, 68.41828f, 208.0f, 64.0f),
                    PathNode.CurveTo(208.0f, 59.581722f, 204.41827f, 56.0f, 200.0f, 56.0f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.CurveTo(51.581722f, 56.0f, 48.0f, 59.581722f, 48.0f, 64.0f),
                    PathNode.CurveTo(48.0f, 68.41828f, 51.581722f, 72.0f, 56.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 40.0f),
                    PathNode.LineTo(184.0f, 40.0f),
                    PathNode.CurveTo(188.41827f, 40.0f, 192.0f, 36.418278f, 192.0f, 32.0f),
                    PathNode.CurveTo(192.0f, 27.581722f, 188.41827f, 24.0f, 184.0f, 24.0f),
                    PathNode.LineTo(72.0f, 24.0f),
                    PathNode.CurveTo(67.58172f, 24.0f, 64.0f, 27.581722f, 64.0f, 32.0f),
                    PathNode.CurveTo(64.0f, 36.418278f, 67.58172f, 40.0f, 72.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _cardsThree!!
    }

private var _cardsThree: ImageVector? = null
