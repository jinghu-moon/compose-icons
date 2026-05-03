package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Coins: ImageVector
    get() {
        if (_coins != null) return _coins!!
        _coins = phosphorFillIcon(
            name = "Coins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 89.57f),
                    PathNode.LineTo(184.0f, 84.0f),
                    PathNode.CurveTo(184.0f, 58.92f, 146.17f, 40.0f, 96.0f, 40.0f),
                    PathNode.CurveTo(45.83f, 40.0f, 8.0f, 58.92f, 8.0f, 84.0f),
                    PathNode.LineTo(8.0f, 124.0f),
                    PathNode.CurveTo(8.0f, 144.89f, 34.25f, 161.49f, 72.0f, 166.46f),
                    PathNode.LineTo(72.0f, 172.0f),
                    PathNode.CurveTo(72.0f, 197.08f, 109.83f, 216.0f, 160.0f, 216.0f),
                    PathNode.CurveTo(210.17f, 216.0f, 248.0f, 197.08f, 248.0f, 172.0f),
                    PathNode.LineTo(248.0f, 132.0f),
                    PathNode.CurveTo(248.0f, 111.3f, 222.58f, 94.68f, 184.0f, 89.57f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 146.87f),
                    PathNode.CurveTo(36.41f, 141.4f, 24.0f, 132.39f, 24.0f, 124.0f),
                    PathNode.LineTo(24.0f, 109.93f),
                    PathNode.CurveTo(32.16f, 115.71f, 43.09f, 120.37f, 56.0f, 123.5f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 123.5f),
                    PathNode.CurveTo(148.91f, 120.37f, 159.84f, 115.71f, 168.0f, 109.93f),
                    PathNode.LineTo(168.0f, 124.0f),
                    PathNode.CurveTo(168.0f, 132.39f, 155.59f, 141.4f, 136.0f, 146.87f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 194.87f),
                    PathNode.CurveTo(100.41f, 189.4f, 88.0f, 180.39f, 88.0f, 172.0f),
                    PathNode.LineTo(88.0f, 167.83f),
                    PathNode.CurveTo(90.63f, 167.93f, 93.29f, 168.0f, 96.0f, 168.0f),
                    PathNode.CurveTo(99.88f, 168.0f, 103.67f, 167.87f, 107.39f, 167.65f),
                    PathNode.CurveTo(111.52258f, 169.12941f, 115.73205f, 170.38458f, 120.0f, 171.41f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 150.25f),
                    PathNode.CurveTo(112.05405f, 151.42386f, 104.03219f, 152.00879f, 96.0f, 152.0f),
                    PathNode.CurveTo(87.96781f, 152.00879f, 79.94595f, 151.42386f, 72.0f, 150.25f),
                    PathNode.LineTo(72.0f, 126.46f),
                    PathNode.CurveTo(79.95779f, 127.496895f, 87.97495f, 128.01134f, 96.0f, 128.0f),
                    PathNode.CurveTo(104.02505f, 128.01134f, 112.04221f, 127.496895f, 120.0f, 126.46f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 198.25f),
                    PathNode.CurveTo(168.08507f, 200.58328f, 151.91493f, 200.58328f, 136.0f, 198.25f),
                    PathNode.LineTo(136.0f, 174.4f),
                    PathNode.CurveTo(143.95522f, 175.4694f, 151.97322f, 176.00394f, 160.0f, 176.0f),
                    PathNode.CurveTo(168.02504f, 176.01134f, 176.04222f, 175.4969f, 184.0f, 174.46f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 172.0f),
                    PathNode.CurveTo(232.0f, 180.39f, 219.59f, 189.4f, 200.0f, 194.87f),
                    PathNode.LineTo(200.0f, 171.5f),
                    PathNode.CurveTo(212.91f, 168.37f, 223.84f, 163.71f, 232.0f, 157.93f),
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
        return _coins!!
    }

private var _coins: ImageVector? = null
