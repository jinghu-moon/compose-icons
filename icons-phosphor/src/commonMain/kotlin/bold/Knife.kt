package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Knife: ImageVector
    get() {
        if (_knife != null) return _knife!!
        _knife = phosphorBoldIcon(
            name = "Knife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.7f, 29.3f),
                    PathNode.CurveTo(222.27126f, 16.87922f, 202.12874f, 16.87922f, 189.7f, 29.3f),
                    PathNode.LineTo(15.52f, 203.56f),
                    PathNode.CurveTo(12.428838f, 206.6431f, 11.25604f, 211.16179f, 12.457632f, 215.35904f),
                    PathNode.CurveTo(13.659225f, 219.5563f, 17.045593f, 222.76979f, 21.3f, 223.75f),
                    PathNode.CurveTo(33.472294f, 226.5688f, 45.92559f, 227.99463f, 58.42f, 228.0f),
                    PathNode.CurveTo(92.13f, 228.0f, 125.83f, 217.58f, 157.52f, 197.13f),
                    PathNode.CurveTo(189.84f, 176.27f, 208.68f, 152.43f, 209.46f, 151.43f),
                    PathNode.CurveTo(213.19437f, 146.64302f, 212.76505f, 139.82104f, 208.46f, 135.54f),
                    PathNode.LineTo(191.0f, 118.0f),
                    PathNode.LineTo(234.7f, 74.29f),
                    PathNode.CurveTo(247.09761f, 61.85558f, 247.09761f, 41.73442f, 234.7f, 29.3f),
                    PathNode.Close,
                    PathNode.MoveTo(143.87f, 177.36f),
                    PathNode.CurveTo(113.0f, 197.12f, 81.28f, 206.0f, 49.28f, 203.74f),
                    PathNode.LineTo(146.0f, 107.0f),
                    PathNode.LineTo(165.5f, 126.51f),
                    PathNode.LineTo(165.5f, 126.51f),
                    PathNode.LineTo(165.5f, 126.51f),
                    PathNode.LineTo(183.5f, 144.51f),
                    PathNode.CurveTo(171.64214f, 156.9957f, 158.33829f, 168.02348f, 143.87f, 177.36f),
                    PathNode.Close,
                    PathNode.MoveTo(217.73f, 57.36f),
                    PathNode.LineTo(174.0f, 101.0f),
                    PathNode.LineTo(163.0f, 90.0f),
                    PathNode.LineTo(206.7f, 46.28f),
                    PathNode.CurveTo(209.79382f, 43.61769f, 214.41698f, 43.790733f, 217.30312f, 46.676876f),
                    PathNode.CurveTo(220.18927f, 49.56302f, 220.3623f, 54.186176f, 217.7f, 57.28f),
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
        return _knife!!
    }

private var _knife: ImageVector? = null
