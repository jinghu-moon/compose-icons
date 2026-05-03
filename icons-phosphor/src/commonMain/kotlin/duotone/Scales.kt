package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Scales: ImageVector
    get() {
        if (_scales != null) return _scales!!
        _scales = phosphorDuotoneIcon(
            name = "Scales",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.0f, 88.0f),
                    PathNode.LineTo(88.0f, 168.0f),
                    PathNode.CurveTo(88.0f, 185.67f, 68.0f, 192.0f, 56.0f, 192.0f),
                    PathNode.CurveTo(44.0f, 192.0f, 24.0f, 185.67f, 24.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 56.0f),
                    PathNode.LineTo(168.0f, 136.0f),
                    PathNode.CurveTo(168.0f, 153.67f, 188.0f, 160.0f, 200.0f, 160.0f),
                    PathNode.CurveTo(212.0f, 160.0f, 232.0f, 153.67f, 232.0f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.43f, 133.0f),
                    PathNode.LineTo(207.43f, 53.0f),
                    PathNode.LineTo(207.43f, 53.0f),
                    PathNode.CurveTo(205.97467f, 49.360504f, 202.09673f, 47.311462f, 198.27f, 48.16f),
                    PathNode.LineTo(136.0f, 62.0f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.CurveTo(136.0f, 35.581722f, 132.41827f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(123.58172f, 32.0f, 120.0f, 35.581722f, 120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 65.58f),
                    PathNode.LineTo(54.26f, 80.19f),
                    PathNode.CurveTo(51.686905f, 80.75837f, 49.55873f, 82.5574f, 48.57f, 85.0f),
                    PathNode.LineTo(48.57f, 85.0f),
                    PathNode.LineTo(48.57f, 85.06f),
                    PathNode.LineTo(16.57f, 165.0f),
                    PathNode.CurveTo(16.187191f, 165.95355f, 15.993593f, 166.97249f, 16.0f, 168.0f),
                    PathNode.CurveTo(16.0f, 191.31f, 40.54f, 200.0f, 56.0f, 200.0f),
                    PathNode.CurveTo(71.46f, 200.0f, 96.0f, 191.31f, 96.0f, 168.0f),
                    PathNode.CurveTo(96.00641f, 166.97249f, 95.812805f, 165.95355f, 95.43f, 165.0f),
                    PathNode.LineTo(66.92f, 93.77f),
                    PathNode.LineTo(120.0f, 82.0f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.LineTo(104.0f, 208.0f),
                    PathNode.CurveTo(99.58172f, 208.0f, 96.0f, 211.58173f, 96.0f, 216.0f),
                    PathNode.CurveTo(96.0f, 220.41827f, 99.58172f, 224.0f, 104.0f, 224.0f),
                    PathNode.LineTo(152.0f, 224.0f),
                    PathNode.CurveTo(156.41827f, 224.0f, 160.0f, 220.41827f, 160.0f, 216.0f),
                    PathNode.CurveTo(160.0f, 211.58173f, 156.41827f, 208.0f, 152.0f, 208.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.LineTo(136.0f, 78.42f),
                    PathNode.LineTo(187.0f, 67.1f),
                    PathNode.LineTo(160.57f, 133.0f),
                    PathNode.CurveTo(160.1872f, 133.95355f, 159.99359f, 134.97249f, 160.0f, 136.0f),
                    PathNode.CurveTo(160.0f, 159.31f, 184.54f, 168.0f, 200.0f, 168.0f),
                    PathNode.CurveTo(215.46f, 168.0f, 240.0f, 159.31f, 240.0f, 136.0f),
                    PathNode.CurveTo(240.00641f, 134.97249f, 239.8128f, 133.95355f, 239.43f, 133.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 184.0f),
                    PathNode.CurveTo(48.47f, 184.0f, 33.24f, 180.39f, 32.07f, 169.36f),
                    PathNode.LineTo(56.0f, 109.54f),
                    PathNode.LineTo(79.93f, 169.36f),
                    PathNode.CurveTo(78.76f, 180.39f, 63.53f, 184.0f, 56.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 152.0f),
                    PathNode.CurveTo(192.47f, 152.0f, 177.24f, 148.39f, 176.07f, 137.36f),
                    PathNode.LineTo(200.0f, 77.54f),
                    PathNode.LineTo(223.93f, 137.36f),
                    PathNode.CurveTo(222.76f, 148.39f, 207.53f, 152.0f, 200.0f, 152.0f),
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
        return _scales!!
    }

private var _scales: ImageVector? = null
