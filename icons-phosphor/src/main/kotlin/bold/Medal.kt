package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Medal: ImageVector
    get() {
        if (_medal != null) return _medal!!
        _medal = phosphorBoldIcon(
            name = "Medal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 96.0f),
                    PathNode.CurveTo(220.0242f, 53.49751f, 190.93044f, 16.510708f, 149.61798f, 6.523563f),
                    PathNode.CurveTo(108.30552f, -3.463582f, 65.52909f, 16.148848f, 46.13559f, 53.968876f),
                    PathNode.CurveTo(26.74209f, 91.7889f, 35.780163f, 137.97098f, 68.0f, 165.69f),
                    PathNode.LineTo(68.0f, 240.0f),
                    PathNode.CurveTo(68.00049f, 244.15936f, 70.154816f, 248.02185f, 73.69346f, 250.20778f),
                    PathNode.CurveTo(77.2321f, 252.39372f, 81.650345f, 252.59131f, 85.37f, 250.73f),
                    PathNode.LineTo(128.0f, 229.42f),
                    PathNode.LineTo(170.64f, 250.73f),
                    PathNode.CurveTo(174.35881f, 252.58656f, 178.77353f, 252.38649f, 182.30917f, 250.20116f),
                    PathNode.CurveTo(185.8448f, 248.01582f, 187.99779f, 244.15648f, 188.0f, 240.0f),
                    PathNode.LineTo(188.0f, 165.69f),
                    PathNode.CurveTo(208.31659f, 148.23616f, 220.00345f, 122.78433f, 220.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 96.0f),
                    PathNode.CurveTo(60.0f, 58.444637f, 90.44463f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(165.55536f, 28.0f, 196.0f, 58.444637f, 196.0f, 96.0f),
                    PathNode.CurveTo(196.0f, 133.55536f, 165.55536f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(90.46063f, 163.96141f, 60.038586f, 133.53937f, 60.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 220.59f),
                    PathNode.LineTo(133.36f, 205.27f),
                    PathNode.CurveTo(129.9798f, 203.57854f, 126.000206f, 203.57854f, 122.62f, 205.27f),
                    PathNode.LineTo(92.0f, 220.58f),
                    PathNode.LineTo(92.0f, 180.66f),
                    PathNode.CurveTo(115.0034f, 190.44128f, 140.9966f, 190.44128f, 164.0f, 180.66f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 148.0f),
                    PathNode.CurveTo(156.71881f, 148.0f, 180.0f, 124.7188f, 180.0f, 96.0f),
                    PathNode.CurveTo(180.0f, 67.2812f, 156.71881f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(99.2812f, 44.0f, 76.0f, 67.2812f, 76.0f, 96.0f),
                    PathNode.CurveTo(76.033066f, 124.7051f, 99.2949f, 147.96693f, 128.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 68.0f),
                    PathNode.CurveTo(143.46397f, 68.0f, 156.0f, 80.536026f, 156.0f, 96.0f),
                    PathNode.CurveTo(156.0f, 111.463974f, 143.46397f, 124.0f, 128.0f, 124.0f),
                    PathNode.CurveTo(112.536026f, 124.0f, 100.0f, 111.463974f, 100.0f, 96.0f),
                    PathNode.CurveTo(100.0f, 80.536026f, 112.536026f, 68.0f, 128.0f, 68.0f),
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
        return _medal!!
    }

private var _medal: ImageVector? = null
