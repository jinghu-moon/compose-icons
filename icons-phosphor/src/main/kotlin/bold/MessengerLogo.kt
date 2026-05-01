package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MessengerLogo: ImageVector
    get() {
        if (_messengerLogo != null) return _messengerLogo!!
        _messengerLogo = phosphorBoldIcon(
            name = "MessengerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.49f, 120.49f),
                    PathNode.LineTo(152.49f, 152.49f),
                    PathNode.CurveTo(150.23837f, 154.74945f, 147.17982f, 156.01947f, 143.99f, 156.01947f),
                    PathNode.CurveTo(140.80019f, 156.01947f, 137.74162f, 154.74945f, 135.49f, 152.49f),
                    PathNode.LineTo(112.0f, 129.0f),
                    PathNode.LineTo(88.49f, 152.49f),
                    PathNode.CurveTo(83.79558f, 157.18442f, 76.18442f, 157.18442f, 71.49f, 152.49f),
                    PathNode.CurveTo(66.79558f, 147.79558f, 66.79558f, 140.18442f, 71.49f, 135.49f),
                    PathNode.LineTo(103.49f, 103.49f),
                    PathNode.CurveTo(105.74162f, 101.230545f, 108.80018f, 99.96054f, 111.99f, 99.96054f),
                    PathNode.CurveTo(115.17982f, 99.96054f, 118.23838f, 101.230545f, 120.49f, 103.49f),
                    PathNode.LineTo(144.0f, 127.0f),
                    PathNode.LineTo(167.51f, 103.48f),
                    PathNode.CurveTo(172.20442f, 98.78558f, 179.81558f, 98.78558f, 184.51f, 103.48f),
                    PathNode.CurveTo(189.20442f, 108.17442f, 189.20442f, 115.785576f, 184.51f, 120.48f),
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
                    PathNode.CurveTo(211.99072f, 92.685295f, 189.8944f, 61.14747f, 156.70576f, 49.079185f),
                    PathNode.CurveTo(123.517136f, 37.010906f, 86.32429f, 46.98959f, 63.633724f, 74.050026f),
                    PathNode.CurveTo(40.94316f, 101.11046f, 37.600906f, 139.47334f, 55.27f, 170.05f),
                    PathNode.CurveTo(56.99649f, 173.02835f, 57.360687f, 176.60477f, 56.27f, 179.87f),
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
        return _messengerLogo!!
    }

private var _messengerLogo: ImageVector? = null
