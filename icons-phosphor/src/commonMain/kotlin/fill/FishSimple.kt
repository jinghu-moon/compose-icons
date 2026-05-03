package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) return _fishSimple!!
        _fishSimple = phosphorFillIcon(
            name = "FishSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 76.0f),
                    PathNode.CurveTo(168.0f, 82.62742f, 162.62741f, 88.0f, 156.0f, 88.0f),
                    PathNode.CurveTo(149.37259f, 88.0f, 144.0f, 82.62742f, 144.0f, 76.0f),
                    PathNode.CurveTo(144.0f, 69.37258f, 149.37259f, 64.0f, 156.0f, 64.0f),
                    PathNode.CurveTo(162.62741f, 64.0f, 168.0f, 69.37258f, 168.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 155.08f),
                    PathNode.CurveTo(194.92f, 175.92f, 172.47f, 189.96f, 143.3f, 196.82f),
                    PathNode.CurveTo(123.22f, 201.54f, 99.76f, 202.82f, 73.18f, 200.75f),
                    PathNode.QuadTo(75.58f, 218.57f, 79.9f, 238.29f),
                    PathNode.CurveTo(80.84148f, 242.60281f, 78.11164f, 246.86313f, 73.8f, 247.81f),
                    PathNode.CurveTo(73.23547f, 247.93684f, 72.6586f, 248.00058f, 72.08f, 248.0f),
                    PathNode.CurveTo(68.32256f, 247.9976f, 65.07315f, 245.38058f, 64.27f, 241.71f),
                    PathNode.QuadTo(59.38f, 219.35f, 56.86f, 199.09f),
                    PathNode.QuadTo(36.64f, 196.58f, 14.28f, 191.68f),
                    PathNode.CurveTo(9.963895f, 190.73283f, 7.232832f, 186.46611f, 8.180001f, 182.15f),
                    PathNode.CurveTo(9.127169f, 177.8339f, 13.393895f, 175.10283f, 17.71f, 176.05f),
                    PathNode.QuadTo(37.41f, 180.37f, 55.21f, 182.78f),
                    PathNode.CurveTo(53.12f, 156.22f, 54.43f, 132.78f, 59.14f, 112.72f),
                    PathNode.CurveTo(66.0f, 83.55f, 80.05f, 61.1f, 100.88f, 46.0f),
                    PathNode.CurveTo(115.0f, 35.76f, 140.14f, 23.64f, 179.27f, 24.0f),
                    PathNode.CurveTo(200.46f, 24.21f, 220.1f, 28.33f, 223.08f, 30.08f),
                    PathNode.CurveTo(224.24788f, 30.768322f, 225.22168f, 31.742128f, 225.91f, 32.91f),
                    PathNode.CurveTo(227.66f, 35.91f, 231.78f, 55.5f, 231.99f, 76.69f),
                    PathNode.CurveTo(232.21f, 98.31f, 228.57f, 129.44f, 210.0f, 155.08f),
                    PathNode.Close,
                    PathNode.MoveTo(212.43f, 43.56f),
                    PathNode.CurveTo(199.52942f, 40.924534f, 186.37354f, 39.747143f, 173.21f, 40.05f),
                    PathNode.CurveTo(148.87f, 40.69f, 128.5f, 46.54f, 112.45f, 57.44f),
                    PathNode.CurveTo(116.948586f, 102.9948f, 152.98573f, 139.03612f, 198.54f, 143.54f),
                    PathNode.CurveTo(209.45f, 127.54f, 215.3f, 107.12f, 215.94f, 82.78f),
                    PathNode.CurveTo(216.24554f, 69.61685f, 215.07153f, 56.46104f, 212.44f, 43.56f),
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
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
