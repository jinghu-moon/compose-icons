package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CompassTool: ImageVector
    get() {
        if (_compassTool != null) return _compassTool!!
        _compassTool = phosphorThinIcon(
            name = "CompassTool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(211.56f, 121.82f),
                    PathNode.CurveTo(212.26144f, 120.54264f, 212.2127f, 118.98487f, 211.43277f, 117.75386f),
                    PathNode.CurveTo(210.65283f, 116.52285f, 209.26514f, 115.813416f, 207.81055f, 115.902054f),
                    PathNode.CurveTo(206.35597f, 115.9907f, 205.06468f, 116.863396f, 204.44f, 118.18f),
                    PathNode.CurveTo(195.97685f, 134.44273f, 182.42853f, 147.49237f, 165.86f, 155.34f),
                    PathNode.LineTo(146.18f, 111.05f),
                    PathNode.CurveTo(159.54526f, 103.20583f, 166.39075f, 87.6887f, 163.1737f, 72.52915f),
                    PathNode.CurveTo(159.95667f, 57.36961f, 147.39914f, 45.970016f, 132.0f, 44.23f),
                    PathNode.LineTo(132.0f, 24.0f),
                    PathNode.CurveTo(132.0f, 21.790861f, 130.20914f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(125.79086f, 20.0f, 124.0f, 21.790861f, 124.0f, 24.0f),
                    PathNode.LineTo(124.0f, 44.23f),
                    PathNode.CurveTo(108.60086f, 45.970016f, 96.04333f, 57.36961f, 92.826294f, 72.52915f),
                    PathNode.CurveTo(89.60926f, 87.6887f, 96.454735f, 103.20583f, 109.82f, 111.05f),
                    PathNode.LineTo(60.35f, 222.37f),
                    PathNode.CurveTo(59.448784f, 224.38045f, 60.342987f, 226.74115f, 62.35f, 227.65f),
                    PathNode.CurveTo(62.86768f, 227.88625f, 63.43099f, 228.00574f, 64.0f, 228.0f),
                    PathNode.CurveTo(65.58355f, 228.00108f, 67.01866f, 227.06787f, 67.66f, 225.62f),
                    PathNode.LineTo(94.32f, 165.62f),
                    PathNode.CurveTo(105.04383f, 169.85172f, 116.471436f, 172.01645f, 128.0f, 172.0f),
                    PathNode.CurveTo(139.53389f, 171.98805f, 150.96962f, 169.88048f, 161.75f, 165.78f),
                    PathNode.LineTo(188.34f, 225.62f),
                    PathNode.CurveTo(188.98134f, 227.06787f, 190.41644f, 228.00108f, 192.0f, 228.0f),
                    PathNode.CurveTo(192.5589f, 228.00137f, 193.11151f, 227.88199f, 193.62f, 227.65f),
                    PathNode.CurveTo(195.62701f, 226.74115f, 196.52121f, 224.38045f, 195.62f, 222.37f),
                    PathNode.LineTo(169.08f, 162.64f),
                    PathNode.CurveTo(187.3316f, 154.05753f, 202.2572f, 139.71518f, 211.56f, 121.82f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 80.0f),
                    PathNode.CurveTo(100.0f, 64.536026f, 112.536026f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(143.46397f, 52.0f, 156.0f, 64.536026f, 156.0f, 80.0f),
                    PathNode.CurveTo(156.0f, 95.463974f, 143.46397f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(112.536026f, 108.0f, 100.0f, 95.463974f, 100.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(117.59116f, 164.0215f, 107.2702f, 162.095f, 97.57f, 158.32f),
                    PathNode.LineTo(117.13f, 114.32f),
                    PathNode.CurveTo(124.20351f, 116.56037f, 131.7965f, 116.56037f, 138.87f, 114.32f),
                    PathNode.LineTo(158.5f, 158.47f),
                    PathNode.CurveTo(148.7438f, 162.11504f, 138.41487f, 163.9878f, 128.0f, 164.0f),
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
        return _compassTool!!
    }

private var _compassTool: ImageVector? = null
