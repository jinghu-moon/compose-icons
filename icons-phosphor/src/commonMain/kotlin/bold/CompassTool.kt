package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CompassTool: ImageVector
    get() {
        if (_compassTool != null) return _compassTool!!
        _compassTool = phosphorBoldIcon(
            name = "CompassTool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.68f, 125.46f),
                    PathNode.CurveTo(220.69008f, 121.63592f, 220.48944f, 117.02653f, 218.1547f, 113.39156f),
                    PathNode.CurveTo(215.81995f, 109.7566f, 211.71152f, 107.6572f, 207.39787f, 107.89487f),
                    PathNode.CurveTo(203.08423f, 108.13252f, 199.2313f, 110.67055f, 197.31f, 114.54f),
                    PathNode.CurveTo(190.9794f, 126.76738f, 181.41124f, 137.0205f, 169.65f, 144.18f),
                    PathNode.LineTo(156.15f, 113.79f),
                    PathNode.CurveTo(168.67456f, 103.3424f, 174.3924f, 86.82381f, 171.00691f, 70.86901f),
                    PathNode.CurveTo(167.62141f, 54.914215f, 155.68808f, 42.14108f, 140.0f, 37.68f),
                    PathNode.LineTo(140.0f, 24.0f),
                    PathNode.CurveTo(140.0f, 17.372583f, 134.62741f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(121.37258f, 12.0f, 116.0f, 17.372583f, 116.0f, 24.0f),
                    PathNode.LineTo(116.0f, 37.68f),
                    PathNode.CurveTo(100.31192f, 42.14108f, 88.378586f, 54.914215f, 84.993095f, 70.86901f),
                    PathNode.CurveTo(81.6076f, 86.82381f, 87.32543f, 103.3424f, 99.85f, 113.79f),
                    PathNode.LineTo(53.0f, 219.12f),
                    PathNode.CurveTo(51.696983f, 222.03749f, 51.61132f, 225.35417f, 52.761993f, 228.33502f),
                    PathNode.CurveTo(53.912666f, 231.31589f, 56.204643f, 233.71475f, 59.13f, 235.0f),
                    PathNode.CurveTo(60.66445f, 235.67366f, 62.32425f, 236.01448f, 64.0f, 236.0f),
                    PathNode.CurveTo(68.75555f, 236.01292f, 73.07005f, 233.21634f, 75.0f, 228.87f),
                    PathNode.LineTo(98.67f, 175.61f),
                    PathNode.CurveTo(108.17254f, 178.53001f, 118.058945f, 180.00977f, 128.0f, 180.0f),
                    PathNode.CurveTo(137.95415f, 179.99037f, 147.85413f, 178.53519f, 157.39f, 175.68f),
                    PathNode.LineTo(181.0f, 228.87f),
                    PathNode.CurveTo(182.92995f, 233.21634f, 187.24445f, 236.01292f, 192.0f, 236.0f),
                    PathNode.CurveTo(193.67241f, 236.01337f, 195.32872f, 235.67256f, 196.86f, 235.0f),
                    PathNode.CurveTo(199.78714f, 233.71661f, 202.08138f, 231.31854f, 203.234f, 228.3375f),
                    PathNode.CurveTo(204.38663f, 225.35643f, 204.3024f, 222.03873f, 203.0f, 219.12f),
                    PathNode.LineTo(179.49f, 166.22f),
                    PathNode.CurveTo(196.22415f, 156.7142f, 209.8385f, 142.55443f, 218.68f, 125.46f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 60.0f),
                    PathNode.CurveTo(139.0457f, 60.0f, 148.0f, 68.95431f, 148.0f, 80.0f),
                    PathNode.CurveTo(148.0f, 91.04569f, 139.0457f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(116.95431f, 100.0f, 108.0f, 91.04569f, 108.0f, 80.0f),
                    PathNode.CurveTo(108.0f, 68.95431f, 116.95431f, 60.0f, 128.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 156.0f),
                    PathNode.CurveTo(121.411026f, 156.00865f, 114.84905f, 155.15814f, 108.48f, 153.47f),
                    PathNode.LineTo(121.78f, 123.55f),
                    PathNode.CurveTo(125.90496f, 124.15003f, 130.09505f, 124.15003f, 134.22f, 123.55f),
                    PathNode.LineTo(147.55f, 153.55f),
                    PathNode.CurveTo(141.16089f, 155.17816f, 134.5933f, 156.0012f, 128.0f, 156.0f),
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
        return _compassTool!!
    }

private var _compassTool: ImageVector? = null
