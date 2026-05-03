package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Coin: ImageVector
    get() {
        if (_coin != null) return _coin!!
        _coin = phosphorRegularIcon(
            name = "Coin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(207.58f, 63.84f),
                    PathNode.CurveTo(186.85f, 53.48f, 159.33f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(96.67f, 48.0f, 69.15f, 53.48f, 48.42f, 63.84f),
                    PathNode.CurveTo(27.69f, 74.2f, 16.0f, 88.78f, 16.0f, 104.0f),
                    PathNode.LineTo(16.0f, 152.0f),
                    PathNode.CurveTo(16.0f, 167.22f, 27.82f, 181.85f, 48.42f, 192.16f),
                    PathNode.CurveTo(69.02f, 202.47f, 96.67f, 208.0f, 128.0f, 208.0f),
                    PathNode.CurveTo(159.33f, 208.0f, 186.85f, 202.52f, 207.58f, 192.16f),
                    PathNode.CurveTo(228.31f, 181.8f, 240.0f, 167.22f, 240.0f, 152.0f),
                    PathNode.LineTo(240.0f, 104.0f),
                    PathNode.CurveTo(240.0f, 88.78f, 228.18f, 74.15f, 207.58f, 63.84f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 64.0f),
                    PathNode.CurveTo(190.64f, 64.0f, 224.0f, 87.23f, 224.0f, 104.0f),
                    PathNode.CurveTo(224.0f, 120.77f, 190.64f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(65.36f, 144.0f, 32.0f, 120.77f, 32.0f, 104.0f),
                    PathNode.CurveTo(32.0f, 87.23f, 65.36f, 64.0f, 128.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 159.86f),
                    PathNode.LineTo(120.0f, 191.86f),
                    PathNode.CurveTo(101.0f, 191.24f, 85.0f, 188.44f, 72.0f, 184.37f),
                    PathNode.LineTo(72.0f, 153.05f),
                    PathNode.CurveTo(87.67134f, 157.22523f, 103.78574f, 159.51146f, 120.0f, 159.86f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 159.86f),
                    PathNode.CurveTo(152.21425f, 159.51146f, 168.32866f, 157.22523f, 184.0f, 153.05f),
                    PathNode.LineTo(184.0f, 184.36f),
                    PathNode.CurveTo(171.0f, 188.43f, 155.0f, 191.23f, 136.0f, 191.85f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 152.0f),
                    PathNode.LineTo(32.0f, 133.53f),
                    PathNode.CurveTo(37.03455f, 137.70906f, 42.546257f, 141.27724f, 48.42f, 144.16f),
                    PathNode.CurveTo(50.85f, 145.37f, 53.42f, 146.51f, 56.0f, 147.59f),
                    PathNode.LineTo(56.0f, 178.0f),
                    PathNode.CurveTo(40.17f, 170.16f, 32.0f, 160.29f, 32.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 178.0f),
                    PathNode.LineTo(200.0f, 147.59f),
                    PathNode.CurveTo(202.61f, 146.51f, 205.15f, 145.37f, 207.58f, 144.16f),
                    PathNode.CurveTo(213.45374f, 141.27724f, 218.96545f, 137.70906f, 224.0f, 133.53f),
                    PathNode.LineTo(224.0f, 152.0f),
                    PathNode.CurveTo(224.0f, 160.29f, 215.83f, 170.16f, 200.0f, 178.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _coin!!
    }

private var _coin: ImageVector? = null
