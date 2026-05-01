package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Coin: ImageVector
    get() {
        if (_coin != null) return _coin!!
        _coin = phosphorThinIcon(
            name = "Coin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.79f, 67.42f),
                    PathNode.CurveTo(185.9f, 57.48f, 158.27f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(97.73f, 52.0f, 70.1f, 57.48f, 50.21f, 67.42f),
                    PathNode.CurveTo(31.0f, 77.0f, 20.0f, 90.35f, 20.0f, 104.0f),
                    PathNode.LineTo(20.0f, 152.0f),
                    PathNode.CurveTo(20.0f, 165.65f, 31.0f, 179.0f, 50.21f, 188.58f),
                    PathNode.CurveTo(70.1f, 198.52f, 97.73f, 204.0f, 128.0f, 204.0f),
                    PathNode.CurveTo(158.27f, 204.0f, 185.9f, 198.52f, 205.79f, 188.58f),
                    PathNode.CurveTo(225.0f, 179.0f, 236.0f, 165.65f, 236.0f, 152.0f),
                    PathNode.LineTo(236.0f, 104.0f),
                    PathNode.CurveTo(236.0f, 90.35f, 225.0f, 77.0f, 205.79f, 67.42f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 60.0f),
                    PathNode.CurveTo(189.77f, 60.0f, 228.0f, 82.84f, 228.0f, 104.0f),
                    PathNode.CurveTo(228.0f, 125.16f, 189.77f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(66.23f, 148.0f, 28.0f, 125.16f, 28.0f, 104.0f),
                    PathNode.CurveTo(28.0f, 82.84f, 66.23f, 60.0f, 128.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 156.0f),
                    PathNode.LineTo(124.0f, 196.0f),
                    PathNode.CurveTo(102.0f, 195.65f, 83.06f, 192.35f, 68.0f, 187.29f),
                    PathNode.LineTo(68.0f, 147.65f),
                    PathNode.CurveTo(84.23f, 152.75f, 103.44f, 155.62f, 124.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 156.0f),
                    PathNode.CurveTo(152.56f, 155.67f, 171.77f, 152.8f, 188.0f, 147.7f),
                    PathNode.LineTo(188.0f, 187.29f),
                    PathNode.CurveTo(172.94f, 192.35f, 154.05f, 195.65f, 132.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 152.0f),
                    PathNode.LineTo(28.0f, 123.92f),
                    PathNode.CurveTo(33.15f, 130.11f, 40.67f, 135.81f, 50.21f, 140.58f),
                    PathNode.CurveTo(53.29f, 142.12f, 56.57f, 143.53f, 60.0f, 144.86f),
                    PathNode.LineTo(60.0f, 184.24f),
                    PathNode.CurveTo(39.49f, 175.67f, 28.0f, 163.59f, 28.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 152.0f),
                    PathNode.CurveTo(228.0f, 163.59f, 216.51f, 175.67f, 196.0f, 184.24f),
                    PathNode.LineTo(196.0f, 144.86f),
                    PathNode.CurveTo(199.43f, 143.53f, 202.71f, 142.12f, 205.79f, 140.58f),
                    PathNode.CurveTo(215.33f, 135.81f, 222.85f, 130.11f, 228.0f, 123.92f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _coin!!
    }

private var _coin: ImageVector? = null
