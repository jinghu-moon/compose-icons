package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatCircleDots: ImageVector
    get() {
        if (_chatCircleDots != null) return _chatCircleDots!!
        _chatCircleDots = phosphorBoldIcon(
            name = "ChatCircleDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 136.83656f, 112.836555f, 144.0f, 104.0f, 144.0f),
                    PathNode.CurveTo(95.163445f, 144.0f, 88.0f, 136.83656f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 119.163445f, 95.163445f, 112.0f, 104.0f, 112.0f),
                    PathNode.CurveTo(112.836555f, 112.0f, 120.0f, 119.163445f, 120.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 112.0f),
                    PathNode.CurveTo(143.16344f, 112.0f, 136.0f, 119.163445f, 136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 136.83656f, 143.16344f, 144.0f, 152.0f, 144.0f),
                    PathNode.CurveTo(160.83656f, 144.0f, 168.0f, 136.83656f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 119.163445f, 160.83656f, 112.0f, 152.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 128.0f),
                    PathNode.CurveTo(236.008f, 165.62016f, 216.43904f, 200.53375f, 184.34433f, 220.16045f),
                    PathNode.CurveTo(152.24963f, 239.78716f, 112.2544f, 241.29852f, 78.77f, 224.15f),
                    PathNode.LineTo(46.34f, 235.0f),
                    PathNode.CurveTo(39.138653f, 237.427f, 31.184f, 235.56306f, 25.810467f, 230.18953f),
                    PathNode.CurveTo(20.436935f, 224.816f, 18.573006f, 216.86134f, 21.0f, 209.66f),
                    PathNode.LineTo(31.81f, 177.23f),
                    PathNode.CurveTo(11.481394f, 137.4104f, 17.789282f, 89.18185f, 47.675034f, 55.929867f),
                    PathNode.CurveTo(77.56078f, 22.677881f, 124.845215f, 11.277653f, 166.6006f, 27.257032f),
                    PathNode.CurveTo(208.35599f, 43.236412f, 235.94897f, 83.2915f, 236.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 128.0f),
                    PathNode.CurveTo(211.98651f, 92.686516f, 189.88794f, 61.15214f, 156.6995f, 49.086918f),
                    PathNode.CurveTo(123.51106f, 37.021687f, 86.32029f, 47.002186f, 63.631588f, 74.062584f),
                    PathNode.CurveTo(40.942883f, 101.12298f, 37.60152f, 139.4844f, 55.27f, 170.06f),
                    PathNode.CurveTo(56.993538f, 173.03568f, 57.357662f, 176.60777f, 56.27f, 179.87f),
                    PathNode.LineTo(46.34f, 209.66f),
                    PathNode.LineTo(76.13f, 199.73f),
                    PathNode.CurveTo(77.35545f, 199.32184f, 78.63836f, 199.11252f, 79.93f, 199.11f),
                    PathNode.CurveTo(82.03756f, 199.11374f, 84.10697f, 199.67249f, 85.93f, 200.73f),
                    PathNode.CurveTo(111.9215f, 215.76958f, 143.96451f, 215.79039f, 169.97552f, 200.78459f),
                    PathNode.CurveTo(195.98654f, 185.7788f, 212.0087f, 158.0291f, 212.0f, 128.0f),
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
        return _chatCircleDots!!
    }

private var _chatCircleDots: ImageVector? = null
