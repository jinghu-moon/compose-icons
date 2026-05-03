package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CoinVertical: ImageVector
    get() {
        if (_coinVertical != null) return _coinVertical!!
        _coinVertical = phosphorThinIcon(
            name = "CoinVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(195.05f, 58.1f),
                    PathNode.CurveTo(183.73f, 38.69f, 168.44f, 28.0f, 152.0f, 28.0f),
                    PathNode.LineTo(104.0f, 28.0f),
                    PathNode.CurveTo(87.56f, 28.0f, 72.27f, 38.69f, 61.0f, 58.1f),
                    PathNode.CurveTo(50.0f, 76.84f, 44.0f, 101.66f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 154.34f, 50.0f, 179.16f, 61.0f, 197.9f),
                    PathNode.CurveTo(72.27f, 217.31f, 87.56f, 228.0f, 104.0f, 228.0f),
                    PathNode.LineTo(152.0f, 228.0f),
                    PathNode.CurveTo(168.44f, 228.0f, 183.73f, 217.31f, 195.05f, 197.9f),
                    PathNode.CurveTo(206.0f, 179.16f, 212.0f, 154.34f, 212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 101.66f, 206.0f, 76.84f, 195.05f, 58.1f),
                    PathNode.Close,
                    PathNode.MoveTo(191.27f, 188.0f),
                    PathNode.LineTo(152.1f, 188.0f),
                    PathNode.CurveTo(159.34f, 171.86f, 163.47f, 152.47f, 163.94f, 132.0f),
                    PathNode.LineTo(203.94f, 132.0f),
                    PathNode.CurveTo(203.44f, 152.77f, 199.0f, 172.28f, 191.27f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(163.94f, 124.0f),
                    PathNode.CurveTo(163.47f, 103.53f, 159.34f, 84.14f, 152.1f, 68.0f),
                    PathNode.LineTo(191.27f, 68.0f),
                    PathNode.CurveTo(199.01f, 83.72f, 203.44f, 103.23f, 203.94f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 36.0f),
                    PathNode.CurveTo(164.89f, 36.0f, 177.19f, 44.51f, 186.84f, 60.0f),
                    PathNode.LineTo(148.11f, 60.0f),
                    PathNode.CurveTo(147.76f, 59.37f, 147.41f, 58.72f, 147.05f, 58.1f),
                    PathNode.CurveTo(141.47f, 48.54f, 134.93f, 41.1f, 127.76f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(67.86f, 193.87f),
                    PathNode.CurveTo(57.63f, 176.34f, 52.0f, 153.0f, 52.0f, 128.0f),
                    PathNode.CurveTo(52.0f, 103.0f, 57.63f, 79.66f, 67.86f, 62.13f),
                    PathNode.CurveTo(77.69f, 45.28f, 90.52f, 36.0f, 104.0f, 36.0f),
                    PathNode.CurveTo(117.48f, 36.0f, 130.31f, 45.28f, 140.14f, 62.13f),
                    PathNode.CurveTo(150.37f, 79.66f, 156.0f, 103.05f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 152.95f, 150.37f, 176.34f, 140.14f, 193.87f),
                    PathNode.CurveTo(130.31f, 210.72f, 117.48f, 220.0f, 104.0f, 220.0f),
                    PathNode.CurveTo(90.52f, 220.0f, 77.69f, 210.72f, 67.86f, 193.87f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 220.0f),
                    PathNode.LineTo(127.76f, 220.0f),
                    PathNode.CurveTo(134.93f, 214.91f, 141.47f, 207.46f, 147.05f, 197.9f),
                    PathNode.CurveTo(147.41f, 197.28f, 147.76f, 196.63f, 148.11f, 196.0f),
                    PathNode.LineTo(186.84f, 196.0f),
                    PathNode.CurveTo(177.19f, 211.49f, 164.89f, 220.0f, 152.0f, 220.0f),
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
        return _coinVertical!!
    }

private var _coinVertical: ImageVector? = null
