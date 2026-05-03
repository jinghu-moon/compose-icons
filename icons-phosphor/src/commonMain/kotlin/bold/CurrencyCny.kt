package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyCny: ImageVector
    get() {
        if (_currencyCny != null) return _currencyCny!!
        _currencyCny = phosphorBoldIcon(
            name = "CurrencyCny",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(52.0f, 56.0f),
                    PathNode.CurveTo(52.0f, 49.37258f, 57.37258f, 44.0f, 64.0f, 44.0f),
                    PathNode.LineTo(192.0f, 44.0f),
                    PathNode.CurveTo(198.62741f, 44.0f, 204.0f, 49.37258f, 204.0f, 56.0f),
                    PathNode.CurveTo(204.0f, 62.62742f, 198.62741f, 68.0f, 192.0f, 68.0f),
                    PathNode.LineTo(64.0f, 68.0f),
                    PathNode.CurveTo(57.37258f, 68.0f, 52.0f, 62.62742f, 52.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 156.0f),
                    PathNode.CurveTo(209.37259f, 156.0f, 204.0f, 161.37259f, 204.0f, 168.0f),
                    PathNode.LineTo(204.0f, 180.0f),
                    PathNode.LineTo(176.0f, 180.0f),
                    PathNode.CurveTo(169.37259f, 180.0f, 164.0f, 174.62741f, 164.0f, 168.0f),
                    PathNode.LineTo(164.0f, 124.0f),
                    PathNode.LineTo(208.0f, 124.0f),
                    PathNode.CurveTo(214.62741f, 124.0f, 220.0f, 118.62742f, 220.0f, 112.0f),
                    PathNode.CurveTo(220.0f, 105.37258f, 214.62741f, 100.0f, 208.0f, 100.0f),
                    PathNode.LineTo(48.0f, 100.0f),
                    PathNode.CurveTo(41.37258f, 100.0f, 36.0f, 105.37258f, 36.0f, 112.0f),
                    PathNode.CurveTo(36.0f, 118.62742f, 41.37258f, 124.0f, 48.0f, 124.0f),
                    PathNode.LineTo(92.0f, 124.0f),
                    PathNode.LineTo(92.0f, 128.0f),
                    PathNode.CurveTo(91.966934f, 156.7051f, 68.7051f, 179.96693f, 40.0f, 180.0f),
                    PathNode.CurveTo(33.37258f, 180.0f, 28.0f, 185.37259f, 28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 198.62741f, 33.37258f, 204.0f, 40.0f, 204.0f),
                    PathNode.CurveTo(81.95536f, 203.9559f, 115.95591f, 169.95538f, 116.0f, 128.0f),
                    PathNode.LineTo(116.0f, 124.0f),
                    PathNode.LineTo(140.0f, 124.0f),
                    PathNode.LineTo(140.0f, 168.0f),
                    PathNode.CurveTo(140.0f, 187.88223f, 156.11777f, 204.0f, 176.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(222.62741f, 204.0f, 228.0f, 198.62741f, 228.0f, 192.0f),
                    PathNode.LineTo(228.0f, 168.0f),
                    PathNode.CurveTo(228.0f, 161.37259f, 222.62741f, 156.0f, 216.0f, 156.0f),
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
        return _currencyCny!!
    }

private var _currencyCny: ImageVector? = null
