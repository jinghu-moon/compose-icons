package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Needle: ImageVector
    get() {
        if (_needle != null) return _needle!!
        _needle = phosphorBoldIcon(
            name = "Needle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(215.11f, 40.89f),
                    PathNode.CurveTo(197.92755f, 23.71053f, 170.07245f, 23.71053f, 152.89f, 40.89f),
                    PathNode.LineTo(128.89f, 64.89f),
                    PathNode.CurveTo(127.13059f, 66.63858f, 125.962654f, 68.89403f, 125.55f, 71.34f),
                    PathNode.CurveTo(118.4f, 113.0f, 55.31f, 183.7f, 31.55f, 207.48f),
                    PathNode.LineTo(31.55f, 207.48f),
                    PathNode.CurveTo(26.85558f, 212.17442f, 26.85558f, 219.78558f, 31.55f, 224.48f),
                    PathNode.CurveTo(36.24442f, 229.17442f, 43.85558f, 229.17442f, 48.55f, 224.48f),
                    PathNode.LineTo(48.55f, 224.48f),
                    PathNode.CurveTo(72.3f, 200.75f, 143.04f, 137.6f, 184.73f, 130.48f),
                    PathNode.CurveTo(187.17343f, 130.05971f, 189.42667f, 128.89291f, 191.18f, 127.14f),
                    PathNode.LineTo(215.18f, 103.14f),
                    PathNode.CurveTo(232.35947f, 85.95755f, 232.35947f, 58.10245f, 215.18f, 40.92f),
                    PathNode.Close,
                    PathNode.MoveTo(198.11f, 86.14f),
                    PathNode.LineTo(176.69f, 107.57f),
                    PathNode.CurveTo(161.84f, 110.88f, 144.29f, 118.98f, 124.22f, 131.75f),
                    PathNode.CurveTo(136.99f, 111.68f, 145.09f, 94.13f, 148.4f, 79.28f),
                    PathNode.LineTo(169.83f, 57.86f),
                    PathNode.CurveTo(174.85149f, 52.66087f, 182.28755f, 50.57575f, 189.28015f, 52.406055f),
                    PathNode.CurveTo(196.27274f, 54.236366f, 201.73363f, 59.697266f, 203.56395f, 66.68985f),
                    PathNode.CurveTo(205.39426f, 73.68244f, 203.30911f, 81.11851f, 198.11f, 86.14f),
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
        return _needle!!
    }

private var _needle: ImageVector? = null
