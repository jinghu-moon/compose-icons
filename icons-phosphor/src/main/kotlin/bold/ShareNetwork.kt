package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) return _shareNetwork!!
        _shareNetwork = phosphorBoldIcon(
            name = "ShareNetwork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 156.0f),
                    PathNode.CurveTo(165.28387f, 155.98288f, 154.93364f, 159.89668f, 146.91f, 167.0f),
                    PathNode.LineTo(106.1f, 140.8f),
                    PathNode.CurveTo(108.63308f, 132.45465f, 108.63308f, 123.54535f, 106.1f, 115.2f),
                    PathNode.LineTo(146.91f, 89.0f),
                    PathNode.CurveTo(163.33475f, 103.43465f, 187.88599f, 103.55546f, 204.452f, 89.28316f),
                    PathNode.CurveTo(221.018f, 75.01086f, 224.5306f, 50.7119f, 212.68463f, 32.33244f),
                    PathNode.CurveTo(200.83868f, 13.952977f, 177.25832f, 7.116015f, 157.41812f, 16.308296f),
                    PathNode.CurveTo(137.57793f, 25.50058f, 127.547806f, 47.909824f, 133.91f, 68.83f),
                    PathNode.LineTo(93.09f, 95.0f),
                    PathNode.CurveTo(75.408f, 79.37353f, 48.54709f, 80.47784f, 32.20747f, 97.50302f),
                    PathNode.CurveTo(15.867849f, 114.5282f, 15.867849f, 141.4118f, 32.20747f, 158.43698f),
                    PathNode.CurveTo(48.54709f, 175.46216f, 75.408f, 176.56648f, 93.09f, 160.94f),
                    PathNode.LineTo(133.9f, 187.2f),
                    PathNode.CurveTo(128.37717f, 205.36368f, 135.12715f, 225.02145f, 150.64326f, 235.9609f),
                    PathNode.CurveTo(166.15938f, 246.90034f, 186.9423f, 246.65428f, 202.19507f, 235.35057f),
                    PathNode.CurveTo(217.44785f, 224.04684f, 223.73055f, 204.23477f, 217.77922f, 186.20694f),
                    PathNode.CurveTo(211.82791f, 168.1791f, 194.98476f, 156.00128f, 176.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 36.0f),
                    PathNode.CurveTo(187.0457f, 36.0f, 196.0f, 44.954304f, 196.0f, 56.0f),
                    PathNode.CurveTo(196.0f, 67.04569f, 187.0457f, 76.0f, 176.0f, 76.0f),
                    PathNode.CurveTo(164.9543f, 76.0f, 156.0f, 67.04569f, 156.0f, 56.0f),
                    PathNode.CurveTo(156.0f, 44.954304f, 164.9543f, 36.0f, 176.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 148.0f),
                    PathNode.CurveTo(52.954304f, 148.0f, 44.0f, 139.0457f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 116.95431f, 52.954304f, 108.0f, 64.0f, 108.0f),
                    PathNode.CurveTo(75.04569f, 108.0f, 84.0f, 116.95431f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 139.0457f, 75.04569f, 148.0f, 64.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 220.0f),
                    PathNode.CurveTo(164.9543f, 220.0f, 156.0f, 211.0457f, 156.0f, 200.0f),
                    PathNode.CurveTo(156.0f, 188.9543f, 164.9543f, 180.0f, 176.0f, 180.0f),
                    PathNode.CurveTo(187.0457f, 180.0f, 196.0f, 188.9543f, 196.0f, 200.0f),
                    PathNode.CurveTo(196.0f, 211.0457f, 187.0457f, 220.0f, 176.0f, 220.0f),
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
        return _shareNetwork!!
    }

private var _shareNetwork: ImageVector? = null
