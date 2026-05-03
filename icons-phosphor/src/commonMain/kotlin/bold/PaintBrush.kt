package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) return _paintBrush!!
        _paintBrush = phosphorBoldIcon(
            name = "PaintBrush",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 32.0f),
                    PathNode.CurveTo(236.0f, 25.372583f, 230.62741f, 20.0f, 224.0f, 20.0f),
                    PathNode.CurveTo(179.22f, 20.0f, 134.0f, 68.54f, 108.1f, 102.0f),
                    PathNode.CurveTo(88.92866f, 97.04999f, 68.545685f, 101.2522f, 52.895405f, 113.381165f),
                    PathNode.CurveTo(37.245125f, 125.51014f, 28.090017f, 144.19992f, 28.1f, 164.0f),
                    PathNode.CurveTo(28.1f, 176.0f, 25.0f, 186.71f, 18.87f, 195.76f),
                    PathNode.CurveTo(16.295969f, 199.68376f, 13.097008f, 203.15973f, 9.4f, 206.05f),
                    PathNode.CurveTo(4.972663f, 208.92398f, 2.972519f, 214.37448f, 4.49f, 219.43f),
                    PathNode.CurveTo(6.039365f, 224.54384f, 10.766695f, 228.03033f, 16.11f, 228.0f),
                    PathNode.LineTo(92.11f, 228.0f),
                    PathNode.CurveTo(111.890755f, 227.97598f, 130.54883f, 218.80656f, 142.65253f, 203.16113f),
                    PathNode.CurveTo(154.75623f, 187.5157f, 158.9452f, 167.15265f, 154.0f, 148.0f),
                    PathNode.CurveTo(187.49f, 122.05f, 236.0f, 76.8f, 236.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(209.62f, 46.39f),
                    PathNode.CurveTo(205.62f, 59.31f, 196.47f, 73.88f, 182.7f, 89.3f),
                    PathNode.CurveTo(179.7f, 92.69f, 176.54f, 96.0f, 173.35f, 99.19f),
                    PathNode.CurveTo(168.485f, 93.08669f, 162.95036f, 87.54869f, 156.85f, 82.68f),
                    PathNode.CurveTo(160.04f, 79.49f, 163.34f, 76.36f, 166.73f, 73.33f),
                    PathNode.CurveTo(182.15f, 59.55f, 196.71f, 50.43f, 209.62f, 46.39f),
                    PathNode.Close,
                    PathNode.MoveTo(92.07f, 204.0f),
                    PathNode.LineTo(42.0f, 204.0f),
                    PathNode.CurveTo(48.81236f, 191.77986f, 52.308163f, 177.9897f, 52.14f, 164.0f),
                    PathNode.CurveTo(52.14f, 141.90862f, 70.04861f, 124.0f, 92.14f, 124.0f),
                    PathNode.CurveTo(114.23139f, 124.0f, 132.14f, 141.90862f, 132.14f, 164.0f),
                    PathNode.CurveTo(132.14f, 186.09138f, 114.23139f, 204.0f, 92.14f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(130.25f, 112.68f),
                    PathNode.CurveTo(133.37f, 108.75f, 136.8f, 104.59f, 140.48f, 100.33f),
                    PathNode.CurveTo(146.21646f, 104.70479f, 151.33897f, 109.830666f, 155.71f, 115.57f),
                    PathNode.CurveTo(151.45f, 119.25f, 147.29f, 122.68f, 143.36f, 125.8f),
                    PathNode.CurveTo(139.64565f, 120.81727f, 135.2299f, 116.398155f, 130.25f, 112.68f),
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
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
