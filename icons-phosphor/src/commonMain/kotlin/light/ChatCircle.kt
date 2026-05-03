package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCircle: ImageVector
    get() {
        if (_chatCircle != null) return _chatCircle!!
        _chatCircle = phosphorLightIcon(
            name = "ChatCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(92.02767f, 25.992449f, 58.71108f, 44.93363f, 40.318844f, 75.84859f),
                    PathNode.CurveTo(21.92661f, 106.76354f, 21.178501f, 145.08069f, 38.35f, 176.69f),
                    PathNode.LineTo(26.73f, 211.56f),
                    PathNode.CurveTo(25.052174f, 216.59113f, 26.361296f, 222.1384f, 30.111448f, 225.88855f),
                    PathNode.CurveTo(33.861603f, 229.6387f, 39.40888f, 230.94783f, 44.44f, 229.27f),
                    PathNode.LineTo(79.31f, 217.65f),
                    PathNode.CurveTo(116.70558f, 237.94354f, 162.76965f, 232.89319f, 194.8799f, 204.97922f),
                    PathNode.CurveTo(226.99013f, 177.06525f, 238.40067f, 132.15195f, 223.50772f, 92.29649f),
                    PathNode.CurveTo(208.61476f, 52.44104f, 170.54712f, 26.016455f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(112.17933f, 218.00377f, 96.637184f, 213.83711f, 82.94f, 205.92f),
                    PathNode.CurveTo(82.02687f, 205.39513f, 80.99322f, 205.11604f, 79.94f, 205.11f),
                    PathNode.CurveTo(79.29438f, 205.11377f, 78.65333f, 205.21837f, 78.04f, 205.42f),
                    PathNode.LineTo(40.65f, 217.88f),
                    PathNode.CurveTo(39.931267f, 218.11969f, 39.1388f, 217.93268f, 38.603065f, 217.39694f),
                    PathNode.CurveTo(38.06733f, 216.8612f, 37.880314f, 216.06873f, 38.12f, 215.35f),
                    PathNode.LineTo(50.58f, 178.0f),
                    PathNode.CurveTo(51.125343f, 176.36739f, 50.943245f, 174.57918f, 50.08f, 173.09f),
                    PathNode.CurveTo(29.668556f, 137.83046f, 35.489113f, 93.25666f, 64.27029f, 64.42081f),
                    PathNode.CurveTo(93.05146f, 35.58496f, 137.61412f, 29.679825f, 172.91235f, 50.024315f),
                    PathNode.CurveTo(208.21057f, 70.36881f, 225.4396f, 111.88824f, 214.91608f, 151.24707f),
                    PathNode.CurveTo(204.39253f, 190.60588f, 168.74141f, 217.98654f, 128.0f, 218.0f),
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
        return _chatCircle!!
    }

private var _chatCircle: ImageVector? = null
