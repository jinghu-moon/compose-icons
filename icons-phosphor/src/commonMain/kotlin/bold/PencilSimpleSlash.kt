package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PencilSimpleSlash: ImageVector
    get() {
        if (_pencilSimpleSlash != null) return _pencilSimpleSlash!!
        _pencilSimpleSlash = phosphorBoldIcon(
            name = "PencilSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.88f, 31.93f),
                    PathNode.CurveTo(54.012154f, 28.697262f, 49.6276f, 27.25621f, 45.401115f, 28.157282f),
                    PathNode.CurveTo(41.174625f, 29.058353f, 37.759064f, 32.16236f, 36.459072f, 36.283665f),
                    PathNode.CurveTo(35.15908f, 40.404972f, 36.175465f, 44.906956f, 39.12f, 48.07f),
                    PathNode.LineTo(84.76f, 98.27f),
                    PathNode.LineTo(33.86f, 149.17f),
                    PathNode.CurveTo(30.095879f, 152.91106f, 27.98563f, 158.00302f, 28.0f, 163.31f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(92.69f, 228.0f),
                    PathNode.CurveTo(97.99719f, 228.01549f, 103.08957f, 225.90506f, 106.83f, 222.14f),
                    PathNode.LineTo(154.26f, 174.72f),
                    PathNode.LineTo(199.13f, 224.07f),
                    PathNode.CurveTo(201.99785f, 227.30273f, 206.3824f, 228.74379f, 210.60889f, 227.84271f),
                    PathNode.CurveTo(214.83537f, 226.94165f, 218.25093f, 223.83765f, 219.55093f, 219.71634f),
                    PathNode.CurveTo(220.85092f, 215.59502f, 219.83453f, 211.09306f, 216.89f, 207.93f),
                    PathNode.Close,
                    PathNode.MoveTo(91.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 165.0f),
                    PathNode.LineTo(100.92f, 116.08f),
                    PathNode.LineTo(138.1f, 156.97f),
                    PathNode.Close,
                    PathNode.MoveTo(230.15f, 70.54f),
                    PathNode.LineTo(185.46f, 25.86f),
                    PathNode.CurveTo(177.65001f, 18.05236f, 164.98999f, 18.05236f, 157.18f, 25.86f),
                    PathNode.LineTo(121.18f, 61.86f),
                    PathNode.CurveTo(116.951866f, 66.135544f, 116.54096f, 72.880325f, 120.21881f, 77.63751f),
                    PathNode.CurveTo(123.89665f, 82.3947f, 130.52759f, 83.69534f, 135.73f, 80.68f),
                    PathNode.LineTo(175.0f, 120.0f),
                    PathNode.LineTo(174.46f, 120.53f),
                    PathNode.CurveTo(169.76558f, 125.22442f, 169.76558f, 132.83559f, 174.46f, 137.53f),
                    PathNode.CurveTo(179.15442f, 142.22443f, 186.76558f, 142.22443f, 191.46f, 137.53f),
                    PathNode.LineTo(230.13f, 98.86f),
                    PathNode.CurveTo(233.89432f, 95.11049f, 236.01201f, 90.01724f, 236.01575f, 84.70415f),
                    PathNode.CurveTo(236.0195f, 79.39105f, 233.90901f, 74.29482f, 230.15f, 70.54f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 103.0f),
                    PathNode.LineTo(153.0f, 64.0f),
                    PathNode.LineTo(171.34f, 45.66f),
                    PathNode.LineTo(210.34f, 84.66f),
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
        return _pencilSimpleSlash!!
    }

private var _pencilSimpleSlash: ImageVector? = null
