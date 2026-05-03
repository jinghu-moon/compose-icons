package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Needle: ImageVector
    get() {
        if (_needle != null) return _needle!!
        _needle = phosphorLightIcon(
            name = "Needle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.24f, 67.76f),
                    PathNode.CurveTo(190.57962f, 70.10254f, 190.57962f, 73.89746f, 188.24f, 76.24f),
                    PathNode.LineTo(172.24f, 92.24f),
                    PathNode.CurveTo(169.87592f, 94.44287f, 166.19193f, 94.37787f, 163.90703f, 92.09297f),
                    PathNode.CurveTo(161.62213f, 89.808075f, 161.55713f, 86.12408f, 163.76f, 83.76f),
                    PathNode.LineTo(179.76f, 67.76f),
                    PathNode.CurveTo(182.10254f, 65.42037f, 185.89746f, 65.42037f, 188.24f, 67.76f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 72.0f),
                    PathNode.CurveTo(222.02876f, 82.08392f, 218.02078f, 91.75996f, 210.87f, 98.87f),
                    PathNode.LineTo(186.87f, 122.87f),
                    PathNode.CurveTo(185.99199f, 123.74737f, 184.86348f, 124.33083f, 183.64f, 124.54f),
                    PathNode.CurveTo(131.5f, 133.54f, 45.11f, 219.38f, 44.24f, 220.24f),
                    PathNode.CurveTo(43.718807f, 220.76917f, 43.10099f, 221.1935f, 42.42f, 221.49f),
                    PathNode.LineTo(42.42f, 221.49f),
                    PathNode.CurveTo(41.656445f, 221.82292f, 40.83297f, 221.99646f, 40.0f, 222.0f),
                    PathNode.CurveTo(37.574867f, 221.99785f, 35.389473f, 220.53604f, 34.461704f, 218.2954f),
                    PathNode.CurveTo(33.533936f, 216.05473f, 34.046234f, 213.47589f, 35.76f, 211.76f),
                    PathNode.LineTo(35.76f, 211.76f),
                    PathNode.CurveTo(37.16f, 210.35f, 122.54f, 124.32f, 131.45f, 72.37f),
                    PathNode.CurveTo(131.65916f, 71.146515f, 132.24263f, 70.018005f, 133.12f, 69.14f),
                    PathNode.LineTo(157.12f, 45.14f),
                    PathNode.CurveTo(167.9857f, 34.26626f, 184.33235f, 31.009977f, 198.5354f, 36.889977f),
                    PathNode.CurveTo(212.7385f, 42.769978f, 221.99995f, 56.627895f, 222.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 72.0f),
                    PathNode.CurveTo(209.99614f, 61.486946f, 203.66148f, 52.010796f, 193.94847f, 47.988148f),
                    PathNode.CurveTo(184.23547f, 43.9655f, 173.05579f, 46.18808f, 165.62f, 53.62f),
                    PathNode.LineTo(142.93f, 76.3f),
                    PathNode.CurveTo(138.79f, 97.09f, 124.31f, 123.91f, 99.8f, 156.2f),
                    PathNode.CurveTo(132.09f, 131.69f, 158.91f, 117.2f, 179.7f, 113.07f),
                    PathNode.LineTo(202.38f, 90.38f),
                    PathNode.CurveTo(207.27625f, 85.51922f, 210.02075f, 78.89928f, 210.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _needle!!
    }

private var _needle: ImageVector? = null
