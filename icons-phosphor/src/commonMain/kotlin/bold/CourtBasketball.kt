package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CourtBasketball: ImageVector
    get() {
        if (_courtBasketball != null) return _courtBasketball!!
        _courtBasketball = phosphorBoldIcon(
            name = "CourtBasketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 44.0f),
                    PathNode.LineTo(32.0f, 44.0f),
                    PathNode.CurveTo(20.954306f, 44.0f, 12.0f, 52.954304f, 12.0f, 64.0f),
                    PathNode.LineTo(12.0f, 192.0f),
                    PathNode.CurveTo(12.0f, 203.0457f, 20.954306f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(235.0457f, 212.0f, 244.0f, 203.0457f, 244.0f, 192.0f),
                    PathNode.LineTo(244.0f, 64.0f),
                    PathNode.CurveTo(244.0f, 52.954304f, 235.0457f, 44.0f, 224.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 156.0f),
                    PathNode.LineTo(216.0f, 156.0f),
                    PathNode.CurveTo(200.53603f, 156.0f, 188.0f, 143.46397f, 188.0f, 128.0f),
                    PathNode.CurveTo(188.0f, 112.536026f, 200.53603f, 100.0f, 216.0f, 100.0f),
                    PathNode.LineTo(220.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 100.0f),
                    PathNode.LineTo(40.0f, 100.0f),
                    PathNode.CurveTo(55.46397f, 100.0f, 68.0f, 112.536026f, 68.0f, 128.0f),
                    PathNode.CurveTo(68.0f, 143.46397f, 55.46397f, 156.0f, 40.0f, 156.0f),
                    PathNode.LineTo(36.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 180.0f),
                    PathNode.LineTo(40.0f, 180.0f),
                    PathNode.CurveTo(68.7188f, 180.0f, 92.0f, 156.71881f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 99.2812f, 68.7188f, 76.0f, 40.0f, 76.0f),
                    PathNode.LineTo(36.0f, 76.0f),
                    PathNode.LineTo(36.0f, 68.0f),
                    PathNode.LineTo(116.0f, 68.0f),
                    PathNode.LineTo(116.0f, 188.0f),
                    PathNode.LineTo(36.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 188.0f),
                    PathNode.LineTo(140.0f, 68.0f),
                    PathNode.LineTo(220.0f, 68.0f),
                    PathNode.LineTo(220.0f, 76.0f),
                    PathNode.LineTo(216.0f, 76.0f),
                    PathNode.CurveTo(187.28119f, 76.0f, 164.0f, 99.2812f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 156.71881f, 187.28119f, 180.0f, 216.0f, 180.0f),
                    PathNode.LineTo(220.0f, 180.0f),
                    PathNode.LineTo(220.0f, 188.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _courtBasketball!!
    }

private var _courtBasketball: ImageVector? = null
