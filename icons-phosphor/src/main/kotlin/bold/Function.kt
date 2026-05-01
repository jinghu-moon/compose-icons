package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = phosphorBoldIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 40.0f),
                    PathNode.CurveTo(212.0f, 46.62742f, 206.62741f, 52.0f, 200.0f, 52.0f),
                    PathNode.LineTo(170.71f, 52.0f),
                    PathNode.CurveTo(161.0327f, 51.984024f, 152.73222f, 58.898987f, 151.0f, 68.42f),
                    PathNode.LineTo(142.38f, 116.0f),
                    PathNode.LineTo(184.0f, 116.0f),
                    PathNode.CurveTo(190.62741f, 116.0f, 196.0f, 121.37258f, 196.0f, 128.0f),
                    PathNode.CurveTo(196.0f, 134.62741f, 190.62741f, 140.0f, 184.0f, 140.0f),
                    PathNode.LineTo(138.0f, 140.0f),
                    PathNode.LineTo(128.56f, 191.87f),
                    PathNode.CurveTo(124.75785f, 212.78445f, 106.54725f, 227.99011f, 85.29f, 228.0f),
                    PathNode.LineTo(56.0f, 228.0f),
                    PathNode.CurveTo(49.37258f, 228.0f, 44.0f, 222.62741f, 44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 209.37259f, 49.37258f, 204.0f, 56.0f, 204.0f),
                    PathNode.LineTo(85.29f, 204.0f),
                    PathNode.CurveTo(94.96729f, 204.01596f, 103.26778f, 197.10101f, 105.0f, 187.58f),
                    PathNode.LineTo(113.62f, 140.0f),
                    PathNode.LineTo(72.0f, 140.0f),
                    PathNode.CurveTo(65.37258f, 140.0f, 60.0f, 134.62741f, 60.0f, 128.0f),
                    PathNode.CurveTo(60.0f, 121.37258f, 65.37258f, 116.0f, 72.0f, 116.0f),
                    PathNode.LineTo(118.0f, 116.0f),
                    PathNode.LineTo(127.44f, 64.13f),
                    PathNode.CurveTo(131.24214f, 43.21555f, 149.45276f, 28.00988f, 170.71f, 28.0f),
                    PathNode.LineTo(200.0f, 28.0f),
                    PathNode.CurveTo(206.62741f, 28.0f, 212.0f, 33.37258f, 212.0f, 40.0f),
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
        return _function!!
    }

private var _function: ImageVector? = null
