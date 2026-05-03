package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) return _shareNetwork!!
        _shareNetwork = phosphorRegularIcon(
            name = "ShareNetwork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 160.0f),
                    PathNode.CurveTo(165.21814f, 159.99655f, 154.89406f, 164.35776f, 147.38f, 172.09f),
                    PathNode.LineTo(101.28f, 142.46f),
                    PathNode.CurveTo(104.90627f, 133.16103f, 104.90627f, 122.838974f, 101.28f, 113.54f),
                    PathNode.LineTo(147.38f, 83.91f),
                    PathNode.CurveTo(161.72464f, 98.60399f, 184.86569f, 100.04892f, 200.92677f, 87.25346f),
                    PathNode.CurveTo(216.98787f, 74.45801f, 220.75089f, 51.579296f, 209.63417f, 34.31371f),
                    PathNode.CurveTo(198.51744f, 17.048122f, 176.13268f, 11.005089f, 157.83737f, 20.330547f),
                    PathNode.CurveTo(139.54208f, 29.656008f, 131.28021f, 51.320206f, 138.72f, 70.46f),
                    PathNode.LineTo(92.62f, 100.09f),
                    PathNode.CurveTo(81.26465f, 88.43208f, 63.978306f, 84.81608f, 48.902252f, 90.945f),
                    PathNode.CurveTo(33.8262f, 97.07392f, 23.966345f, 111.72575f, 23.966345f, 128.0f),
                    PathNode.CurveTo(23.966345f, 144.27425f, 33.8262f, 158.92609f, 48.902252f, 165.05501f),
                    PathNode.CurveTo(63.978306f, 171.18391f, 81.26465f, 167.56792f, 92.62f, 155.91f),
                    PathNode.LineTo(138.72f, 185.54f),
                    PathNode.CurveTo(132.38074f, 201.89006f, 137.43008f, 220.46275f, 151.17503f, 231.35254f),
                    PathNode.CurveTo(164.91998f, 242.24232f, 184.15524f, 242.90973f, 198.62192f, 232.99883f),
                    PathNode.CurveTo(213.0886f, 223.0879f, 219.41309f, 204.90987f, 214.22232f, 188.15973f),
                    PathNode.CurveTo(209.03156f, 171.4096f, 193.53598f, 159.99347f, 176.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 32.0f),
                    PathNode.CurveTo(189.25484f, 32.0f, 200.0f, 42.745167f, 200.0f, 56.0f),
                    PathNode.CurveTo(200.0f, 69.25484f, 189.25484f, 80.0f, 176.0f, 80.0f),
                    PathNode.CurveTo(162.74516f, 80.0f, 152.0f, 69.25484f, 152.0f, 56.0f),
                    PathNode.CurveTo(152.0f, 42.745167f, 162.74516f, 32.0f, 176.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 152.0f),
                    PathNode.CurveTo(50.745167f, 152.0f, 40.0f, 141.25484f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 114.74516f, 50.745167f, 104.0f, 64.0f, 104.0f),
                    PathNode.CurveTo(77.25484f, 104.0f, 88.0f, 114.74516f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 141.25484f, 77.25484f, 152.0f, 64.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 224.0f),
                    PathNode.CurveTo(162.74516f, 224.0f, 152.0f, 213.25484f, 152.0f, 200.0f),
                    PathNode.CurveTo(152.0f, 186.74516f, 162.74516f, 176.0f, 176.0f, 176.0f),
                    PathNode.CurveTo(189.25484f, 176.0f, 200.0f, 186.74516f, 200.0f, 200.0f),
                    PathNode.CurveTo(200.0f, 213.25484f, 189.25484f, 224.0f, 176.0f, 224.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shareNetwork!!
    }

private var _shareNetwork: ImageVector? = null
