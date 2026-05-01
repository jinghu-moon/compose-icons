package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = phosphorBoldIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.48f, 136.49f),
                    PathNode.LineTo(130.42f, 218.49f),
                    PathNode.CurveTo(106.98103f, 241.92068f, 68.98568f, 241.91397f, 45.555f, 218.475f),
                    PathNode.CurveTo(22.12432f, 195.03604f, 22.131035f, 157.04066f, 45.57f, 133.61f),
                    PathNode.LineTo(143.73f, 35.72f),
                    PathNode.CurveTo(159.3569f, 20.101389f, 184.68639f, 20.108105f, 200.305f, 35.735f),
                    PathNode.CurveTo(215.92361f, 51.361897f, 215.9169f, 76.69139f, 200.29f, 92.31f),
                    PathNode.LineTo(200.12f, 92.47f),
                    PathNode.LineTo(104.32f, 184.69f),
                    PathNode.CurveTo(99.54273f, 189.285f, 91.94501f, 189.13727f, 87.35f, 184.36f),
                    PathNode.CurveTo(82.75499f, 179.58273f, 82.90274f, 171.985f, 87.68f, 167.39f),
                    PathNode.LineTo(183.39f, 75.27f),
                    PathNode.CurveTo(189.61977f, 69.00157f, 189.58842f, 58.869774f, 183.32f, 52.64f),
                    PathNode.CurveTo(177.05157f, 46.41023f, 166.91977f, 46.441566f, 160.69f, 52.71f),
                    PathNode.LineTo(62.53f, 150.57f),
                    PathNode.CurveTo(48.471592f, 164.63393f, 48.47607f, 187.4316f, 62.54f, 201.49f),
                    PathNode.CurveTo(76.60393f, 215.5484f, 99.40159f, 215.54393f, 113.46f, 201.48f),
                    PathNode.LineTo(195.52f, 119.48f),
                    PathNode.CurveTo(200.21442f, 114.78558f, 207.82558f, 114.78558f, 212.52f, 119.48f),
                    PathNode.CurveTo(217.21442f, 124.17442f, 217.21442f, 131.78558f, 212.52f, 136.48f),
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
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
