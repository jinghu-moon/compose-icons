package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Scales: ImageVector
    get() {
        if (_scales != null) return _scales!!
        _scales = phosphorFillIcon(
            name = "Scales",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.43f, 133.0f),
                    PathNode.LineTo(207.43f, 53.0f),
                    PathNode.CurveTo(206.20566f, 49.97333f, 203.26492f, 47.99437f, 200.0f, 48.0f),
                    PathNode.CurveTo(199.41754f, 48.008877f, 198.83766f, 48.079266f, 198.27f, 48.21f),
                    PathNode.LineTo(136.0f, 62.0f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.CurveTo(136.0f, 35.581722f, 132.41827f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(123.58172f, 32.0f, 120.0f, 35.581722f, 120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 65.58f),
                    PathNode.LineTo(54.27f, 80.21f),
                    PathNode.CurveTo(51.69751f, 80.77136f, 49.565964f, 82.56261f, 48.57f, 85.0f),
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
                    PathNode.MoveTo(79.43f, 168.0f),
                    PathNode.LineTo(32.62f, 168.0f),
                    PathNode.LineTo(56.0f, 109.54f),
                    PathNode.Close,
                    PathNode.MoveTo(176.67f, 136.0f),
                    PathNode.LineTo(200.0f, 77.54f),
                    PathNode.LineTo(223.38f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _scales!!
    }

private var _scales: ImageVector? = null
