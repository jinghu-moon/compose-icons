package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Coin: ImageVector
    get() {
        if (_coin != null) return _coin!!
        _coin = phosphorBoldIcon(
            name = "Coin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(209.37f, 60.27f),
                    PathNode.CurveTo(188.08f, 49.62f, 160.0f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(96.0f, 44.0f, 67.92f, 49.62f, 46.63f, 60.27f),
                    PathNode.CurveTo(24.62f, 71.27f, 12.0f, 87.21f, 12.0f, 104.0f),
                    PathNode.LineTo(12.0f, 152.0f),
                    PathNode.CurveTo(12.0f, 168.79f, 24.62f, 184.73f, 46.63f, 195.73f),
                    PathNode.CurveTo(67.92f, 206.38f, 96.05f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(159.95f, 212.0f, 188.08f, 206.38f, 209.37f, 195.73f),
                    PathNode.CurveTo(231.37f, 184.73f, 244.0f, 168.79f, 244.0f, 152.0f),
                    PathNode.LineTo(244.0f, 104.0f),
                    PathNode.CurveTo(244.0f, 87.21f, 231.38f, 71.27f, 209.37f, 60.27f),
                    PathNode.Close,
                    PathNode.MoveTo(57.37f, 81.73f),
                    PathNode.CurveTo(75.08f, 72.88f, 100.16f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(155.84f, 68.0f, 180.92f, 72.88f, 198.63f, 81.73f),
                    PathNode.CurveTo(211.81f, 88.32f, 220.0f, 96.86f, 220.0f, 104.0f),
                    PathNode.CurveTo(220.0f, 111.14f, 211.81f, 119.68f, 198.63f, 126.27f),
                    PathNode.CurveTo(180.92f, 135.12f, 155.84f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(100.16f, 140.0f, 75.08f, 135.12f, 57.37f, 126.27f),
                    PathNode.CurveTo(44.19f, 119.68f, 36.0f, 111.14f, 36.0f, 104.0f),
                    PathNode.CurveTo(36.0f, 96.86f, 44.19f, 88.32f, 57.37f, 81.73f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 181.38f),
                    PathNode.CurveTo(166.94539f, 184.97467f, 153.52753f, 187.08798f, 140.0f, 187.68f),
                    PathNode.LineTo(140.0f, 163.68f),
                    PathNode.CurveTo(153.47916f, 163.12999f, 166.87416f, 161.28484f, 180.0f, 158.17f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 158.22f),
                    PathNode.CurveTo(89.12585f, 161.33484f, 102.52085f, 163.18f, 116.0f, 163.73f),
                    PathNode.LineTo(116.0f, 187.73f),
                    PathNode.CurveTo(102.47247f, 187.13799f, 89.05461f, 185.02467f, 76.0f, 181.43f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 152.0f),
                    PathNode.LineTo(36.0f, 141.54f),
                    PathNode.CurveTo(39.4052f, 143.83191f, 42.956047f, 145.89961f, 46.63f, 147.73f),
                    PathNode.CurveTo(48.37f, 148.6f, 50.17f, 149.43f, 52.0f, 150.23f),
                    PathNode.LineTo(52.0f, 171.3f),
                    PathNode.CurveTo(42.0f, 165.24f, 36.0f, 158.11f, 36.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 171.3f),
                    PathNode.LineTo(204.0f, 150.23f),
                    PathNode.CurveTo(205.83f, 149.43f, 207.63f, 148.6f, 209.37f, 147.73f),
                    PathNode.CurveTo(213.04395f, 145.89961f, 216.5948f, 143.83191f, 220.0f, 141.54f),
                    PathNode.LineTo(220.0f, 152.0f),
                    PathNode.CurveTo(220.0f, 158.11f, 214.0f, 165.24f, 204.0f, 171.3f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _coin!!
    }

private var _coin: ImageVector? = null
