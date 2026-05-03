package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Peace: ImageVector
    get() {
        if (_peace != null) return _peace!!
        _peace = phosphorFillIcon(
            name = "Peace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 143.37f),
                    PathNode.LineTo(182.0f, 175.57f),
                    PathNode.CurveTo(170.19061f, 189.0195f, 153.78714f, 197.57784f, 136.0f, 199.57f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 128.0f),
                    PathNode.CurveTo(55.988483f, 140.05156f, 59.018723f, 151.91112f, 64.81f, 162.48f),
                    PathNode.LineTo(120.0f, 123.84f),
                    PathNode.LineTo(120.0f, 56.46f),
                    PathNode.CurveTo(83.58154f, 60.56829f, 56.043575f, 91.35058f, 56.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 199.54f),
                    PathNode.LineTo(120.0f, 143.37f),
                    PathNode.LineTo(74.0f, 175.57f),
                    PathNode.CurveTo(85.81429f, 189.00836f, 102.217155f, 197.55568f, 120.0f, 199.54f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 56.46f),
                    PathNode.LineTo(136.0f, 123.84f),
                    PathNode.LineTo(191.19f, 162.48f),
                    PathNode.CurveTo(202.67036f, 141.42561f, 202.91466f, 116.03731f, 191.84157f, 94.76591f),
                    PathNode.CurveTo(180.76848f, 73.49451f, 159.83159f, 59.132324f, 136.0f, 56.46f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 185.4376f, 185.4376f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(70.562386f, 232.0f, 24.0f, 185.4376f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 70.562386f, 70.562386f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(185.41248f, 24.060629f, 231.93938f, 70.58752f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 79.39894f, 176.60106f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(79.39894f, 40.0f, 40.0f, 79.39894f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 176.60106f, 79.39894f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(176.57822f, 215.94489f, 215.94489f, 176.57822f, 216.0f, 128.0f),
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
        return _peace!!
    }

private var _peace: ImageVector? = null
