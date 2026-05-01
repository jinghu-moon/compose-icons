package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bell: ImageVector
    get() {
        if (_bell != null) return _bell!!
        _bell = phosphorBoldIcon(
            name = "Bell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.29f, 165.93f),
                    PathNode.CurveTo(216.61f, 151.0f, 212.0f, 129.57f, 212.0f, 104.0f),
                    PathNode.CurveTo(212.0f, 57.60808f, 174.39192f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(81.60808f, 20.0f, 44.0f, 57.60808f, 44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 129.58f, 39.41f, 151.0f, 30.73f, 165.93f),
                    PathNode.CurveTo(27.125216f, 172.12773f, 27.098536f, 179.77728f, 30.66f, 186.0f),
                    PathNode.CurveTo(34.200756f, 192.22934f, 40.83491f, 196.05525f, 48.0f, 196.0f),
                    PathNode.LineTo(84.18f, 196.0f),
                    PathNode.CurveTo(86.2366f, 218.6668f, 105.2401f, 236.02412f, 128.0f, 236.02412f),
                    PathNode.CurveTo(150.7599f, 236.02412f, 169.7634f, 218.6668f, 171.82f, 196.0f),
                    PathNode.LineTo(208.0f, 196.0f),
                    PathNode.CurveTo(215.15439f, 196.04436f, 221.77449f, 192.21991f, 225.31f, 186.0f),
                    PathNode.CurveTo(228.88692f, 179.7862f, 228.87927f, 172.13666f, 225.29f, 165.93f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(118.49463f, 212.00194f, 110.30107f, 205.31332f, 108.4f, 196.0f),
                    PathNode.LineTo(147.6f, 196.0f),
                    PathNode.CurveTo(145.69893f, 205.31332f, 137.50537f, 212.00194f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.66f, 172.0f),
                    PathNode.CurveTo(63.51f, 154.0f, 68.0f, 131.14f, 68.0f, 104.0f),
                    PathNode.CurveTo(68.0f, 70.862915f, 94.862915f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(161.13708f, 44.0f, 188.0f, 70.862915f, 188.0f, 104.0f),
                    PathNode.CurveTo(188.0f, 131.13f, 192.48f, 154.0f, 201.33f, 172.0f),
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
        return _bell!!
    }

private var _bell: ImageVector? = null
