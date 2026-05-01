package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = phosphorThinIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.83f, 125.17f),
                    PathNode.CurveTo(207.58112f, 125.92027f, 208.00314f, 126.93836f, 208.00314f, 128.0f),
                    PathNode.CurveTo(208.00314f, 129.06163f, 207.58112f, 130.07973f, 206.83f, 130.83f),
                    PathNode.LineTo(124.77f, 212.83f),
                    PathNode.CurveTo(104.459724f, 233.13753f, 71.53251f, 233.13527f, 51.225002f, 212.825f),
                    PathNode.CurveTo(30.91749f, 192.51472f, 30.91973f, 159.58751f, 51.23f, 139.28f),
                    PathNode.LineTo(150.52f, 38.55f),
                    PathNode.CurveTo(164.57565f, 24.483307f, 187.3733f, 24.474352f, 201.44f, 38.53f),
                    PathNode.CurveTo(215.5067f, 52.585648f, 215.51566f, 75.38331f, 201.46f, 89.45f),
                    PathNode.LineTo(102.16f, 190.14f),
                    PathNode.CurveTo(94.353455f, 197.95483f, 81.68983f, 197.96155f, 73.875f, 190.155f),
                    PathNode.CurveTo(66.06017f, 182.34845f, 66.05345f, 169.68483f, 73.86f, 161.87f),
                    PathNode.LineTo(157.15f, 77.19f),
                    PathNode.CurveTo(158.14322f, 76.13046f, 159.63269f, 75.6925f, 161.04135f, 76.045784f),
                    PathNode.CurveTo(162.44998f, 76.39907f, 163.5565f, 77.4881f, 163.93214f, 78.890945f),
                    PathNode.CurveTo(164.30782f, 80.29379f, 163.8936f, 81.79005f, 162.85f, 82.8f),
                    PathNode.LineTo(79.54f, 167.5f),
                    PathNode.CurveTo(74.84558f, 172.18062f, 74.83439f, 179.78058f, 79.515f, 184.475f),
                    PathNode.CurveTo(84.19561f, 189.16942f, 91.79558f, 189.18062f, 96.49f, 184.5f),
                    PathNode.LineTo(195.78f, 83.81f),
                    PathNode.CurveTo(206.72353f, 72.88029f, 206.73471f, 55.14852f, 195.805f, 44.205f),
                    PathNode.CurveTo(184.87529f, 33.26148f, 167.14352f, 33.250286f, 156.2f, 44.18f),
                    PathNode.LineTo(56.91f, 144.87f),
                    PathNode.CurveTo(39.717377f, 162.04881f, 39.70618f, 189.91237f, 56.885f, 207.105f),
                    PathNode.CurveTo(74.06381f, 224.29762f, 101.927376f, 224.30882f, 119.12f, 207.13f),
                    PathNode.LineTo(201.12f, 125.13f),
                    PathNode.CurveTo(201.87756f, 124.368706f, 202.90942f, 123.94404f, 203.9834f, 123.95156f),
                    PathNode.CurveTo(205.05736f, 123.95908f, 206.08319f, 124.39817f, 206.83f, 125.17f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
