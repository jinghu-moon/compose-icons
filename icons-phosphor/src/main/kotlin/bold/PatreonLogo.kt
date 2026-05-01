package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) return _patreonLogo!!
        _patreonLogo = phosphorBoldIcon(
            name = "PatreonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.88f, 28.29f),
                    PathNode.CurveTo(169.41f, 20.29f, 146.29f, 18.0f, 123.77f, 21.75f),
                    PathNode.CurveTo(99.49f, 25.75f, 78.44f, 36.28f, 62.89f, 52.09f),
                    PathNode.CurveTo(25.47f, 90.15f, 33.05f, 167.56f, 50.0f, 207.88f),
                    PathNode.CurveTo(56.87f, 224.36f, 69.0f, 244.0f, 87.51f, 244.0f),
                    PathNode.CurveTo(112.89f, 244.0f, 124.23f, 221.86f, 134.24f, 202.32f),
                    PathNode.CurveTo(140.97f, 189.18f, 147.93f, 175.58f, 158.47f, 168.43f),
                    PathNode.LineTo(158.47f, 168.43f),
                    PathNode.CurveTo(163.96f, 164.71f, 171.69f, 161.73f, 179.88f, 158.57f),
                    PathNode.CurveTo(203.57f, 149.44f, 236.0f, 136.93f, 236.0f, 93.17f),
                    PathNode.CurveTo(236.0f, 64.19f, 218.82f, 40.54f, 188.88f, 28.29f),
                    PathNode.Close,
                    PathNode.MoveTo(171.24f, 136.18f),
                    PathNode.CurveTo(162.16f, 139.68f, 152.76f, 143.31f, 145.0f, 148.57f),
                    PathNode.CurveTo(129.37f, 159.17f, 120.61f, 176.28f, 112.87f, 191.38f),
                    PathNode.CurveTo(103.79f, 209.13f, 97.7f, 220.0f, 87.51f, 220.0f),
                    PathNode.CurveTo(86.23f, 220.0f, 79.51f, 216.19f, 72.1f, 198.6f),
                    PathNode.CurveTo(57.48f, 163.75f, 51.89f, 97.51f, 80.0f, 68.91f),
                    PathNode.CurveTo(91.79f, 56.91f, 108.73f, 48.57f, 127.69f, 45.42f),
                    PathNode.CurveTo(133.30925f, 44.49363f, 138.9949f, 44.028744f, 144.69f, 44.03f),
                    PathNode.CurveTo(156.68912f, 43.927834f, 168.59682f, 46.12404f, 179.77f, 50.5f),
                    PathNode.CurveTo(191.77f, 55.42f, 211.98f, 67.5f, 211.98f, 93.17f),
                    PathNode.CurveTo(212.0f, 119.14f, 196.51f, 126.43f, 171.24f, 136.18f),
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
        return _patreonLogo!!
    }

private var _patreonLogo: ImageVector? = null
