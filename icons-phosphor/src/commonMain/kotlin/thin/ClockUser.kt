package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ClockUser: ImageVector
    get() {
        if (_clockUser != null) return _clockUser!!
        _clockUser = phosphorThinIcon(
            name = "ClockUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.0f, 72.0f),
                    PathNode.LineTo(132.0f, 121.53f),
                    PathNode.LineTo(174.21f, 100.42f),
                    PathNode.CurveTo(176.18718f, 99.43141f, 178.59142f, 100.23282f, 179.58f, 102.21f),
                    PathNode.CurveTo(180.56859f, 104.18718f, 179.76718f, 106.59141f, 177.79f, 107.58f),
                    PathNode.LineTo(129.79f, 131.58f),
                    PathNode.CurveTo(129.23343f, 131.85538f, 128.62097f, 131.99908f, 128.0f, 132.0f),
                    PathNode.CurveTo(125.79086f, 132.0f, 124.0f, 130.20914f, 124.0f, 128.0f),
                    PathNode.LineTo(124.0f, 72.0f),
                    PathNode.CurveTo(124.0f, 69.79086f, 125.79086f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(130.20914f, 68.0f, 132.0f, 69.79086f, 132.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(77.18981f, 220.0f, 36.0f, 178.8102f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 77.18981f, 77.18981f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(178.8102f, 36.0f, 220.0f, 77.18981f, 220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 130.20914f, 221.79086f, 132.0f, 224.0f, 132.0f),
                    PathNode.CurveTo(226.20914f, 132.0f, 228.0f, 130.20914f, 228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 72.77152f, 183.22847f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(130.20914f, 228.0f, 132.0f, 226.20914f, 132.0f, 224.0f),
                    PathNode.CurveTo(132.0f, 221.79086f, 130.20914f, 220.0f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(227.86f, 223.0f),
                    PathNode.CurveTo(228.26976f, 224.39532f, 227.88995f, 225.9031f, 226.86807f, 226.9378f),
                    PathNode.CurveTo(225.84619f, 227.97249f, 224.34326f, 228.37108f, 222.94295f, 227.97874f),
                    PathNode.CurveTo(221.54262f, 227.58643f, 220.46555f, 226.46501f, 220.13f, 225.05f),
                    PathNode.CurveTo(216.84f, 212.68f, 205.27f, 204.05f, 192.0f, 204.05f),
                    PathNode.CurveTo(178.73f, 204.05f, 167.16f, 212.7f, 163.86f, 225.05f),
                    PathNode.CurveTo(163.40521f, 226.8114f, 161.81915f, 228.0441f, 160.0f, 228.05f),
                    PathNode.CurveTo(159.66183f, 228.04926f, 159.32536f, 228.00215f, 159.0f, 227.91f),
                    PathNode.CurveTo(156.86592f, 227.34325f, 155.59473f, 225.15446f, 156.16f, 223.02f),
                    PathNode.CurveTo(159.0081f, 212.44638f, 166.48453f, 203.72757f, 176.5f, 199.3f),
                    PathNode.CurveTo(166.21848f, 192.46577f, 161.62636f, 179.70416f, 165.19592f, 167.88577f),
                    PathNode.CurveTo(168.7655f, 156.06737f, 179.6543f, 147.98155f, 192.0f, 147.98155f),
                    PathNode.CurveTo(204.3457f, 147.98155f, 215.2345f, 156.06737f, 218.80408f, 167.88577f),
                    PathNode.CurveTo(222.37364f, 179.70416f, 217.78152f, 192.46577f, 207.5f, 199.3f),
                    PathNode.CurveTo(217.5221f, 203.71376f, 225.00746f, 212.4271f, 227.86f, 223.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 196.0f),
                    PathNode.CurveTo(203.0457f, 196.0f, 212.0f, 187.0457f, 212.0f, 176.0f),
                    PathNode.CurveTo(212.0f, 164.9543f, 203.0457f, 156.0f, 192.0f, 156.0f),
                    PathNode.CurveTo(180.9543f, 156.0f, 172.0f, 164.9543f, 172.0f, 176.0f),
                    PathNode.CurveTo(172.0f, 187.0457f, 180.9543f, 196.0f, 192.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _clockUser!!
    }

private var _clockUser: ImageVector? = null
