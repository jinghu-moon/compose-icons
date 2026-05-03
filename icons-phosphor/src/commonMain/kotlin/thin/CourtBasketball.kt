package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CourtBasketball: ImageVector
    get() {
        if (_courtBasketball != null) return _courtBasketball!!
        _courtBasketball = phosphorThinIcon(
            name = "CourtBasketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 52.0f),
                    PathNode.LineTo(32.0f, 52.0f),
                    PathNode.CurveTo(25.372583f, 52.0f, 20.0f, 57.37258f, 20.0f, 64.0f),
                    PathNode.LineTo(20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 198.62741f, 25.372583f, 204.0f, 32.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(230.62741f, 204.0f, 236.0f, 198.62741f, 236.0f, 192.0f),
                    PathNode.LineTo(236.0f, 64.0f),
                    PathNode.CurveTo(236.0f, 57.37258f, 230.62741f, 52.0f, 224.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 164.0f),
                    PathNode.LineTo(216.0f, 164.0f),
                    PathNode.CurveTo(196.11777f, 164.0f, 180.0f, 147.88223f, 180.0f, 128.0f),
                    PathNode.CurveTo(180.0f, 108.11775f, 196.11777f, 92.0f, 216.0f, 92.0f),
                    PathNode.LineTo(228.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 92.0f),
                    PathNode.LineTo(40.0f, 92.0f),
                    PathNode.CurveTo(59.88225f, 92.0f, 76.0f, 108.11775f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 147.88223f, 59.88225f, 164.0f, 40.0f, 164.0f),
                    PathNode.LineTo(28.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 192.0f),
                    PathNode.LineTo(28.0f, 172.0f),
                    PathNode.LineTo(40.0f, 172.0f),
                    PathNode.CurveTo(64.30053f, 172.0f, 84.0f, 152.30052f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 103.69947f, 64.30053f, 84.0f, 40.0f, 84.0f),
                    PathNode.LineTo(28.0f, 84.0f),
                    PathNode.LineTo(28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 61.79086f, 29.790861f, 60.0f, 32.0f, 60.0f),
                    PathNode.LineTo(124.0f, 60.0f),
                    PathNode.LineTo(124.0f, 196.0f),
                    PathNode.LineTo(32.0f, 196.0f),
                    PathNode.CurveTo(29.790861f, 196.0f, 28.0f, 194.20914f, 28.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 196.0f),
                    PathNode.LineTo(132.0f, 196.0f),
                    PathNode.LineTo(132.0f, 60.0f),
                    PathNode.LineTo(224.0f, 60.0f),
                    PathNode.CurveTo(226.20914f, 60.0f, 228.0f, 61.79086f, 228.0f, 64.0f),
                    PathNode.LineTo(228.0f, 84.0f),
                    PathNode.LineTo(216.0f, 84.0f),
                    PathNode.CurveTo(191.69948f, 84.0f, 172.0f, 103.69947f, 172.0f, 128.0f),
                    PathNode.CurveTo(172.0f, 152.30052f, 191.69948f, 172.0f, 216.0f, 172.0f),
                    PathNode.LineTo(228.0f, 172.0f),
                    PathNode.LineTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 194.20914f, 226.20914f, 196.0f, 224.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _courtBasketball!!
    }

private var _courtBasketball: ImageVector? = null
