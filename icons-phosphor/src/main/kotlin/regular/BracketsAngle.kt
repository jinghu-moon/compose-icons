package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) return _bracketsAngle!!
        _bracketsAngle = phosphorRegularIcon(
            name = "BracketsAngle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(86.75f, 44.3f),
                    PathNode.LineTo(33.48f, 128.0f),
                    PathNode.LineTo(86.75f, 211.7f),
                    PathNode.CurveTo(87.8904f, 213.49118f, 88.271904f, 215.66226f, 87.81048f, 217.73491f),
                    PathNode.CurveTo(87.34905f, 219.80757f, 86.08255f, 221.61177f, 84.29f, 222.75f),
                    PathNode.CurveTo(83.00986f, 223.57031f, 81.52042f, 224.00429f, 80.0f, 224.0f),
                    PathNode.CurveTo(77.26002f, 224.00258f, 74.70931f, 222.6027f, 73.24f, 220.29f),
                    PathNode.LineTo(17.24f, 132.29f),
                    PathNode.CurveTo(15.572392f, 129.66946f, 15.572392f, 126.320526f, 17.24f, 123.7f),
                    PathNode.LineTo(73.24f, 35.7f),
                    PathNode.CurveTo(75.61206f, 31.972078f, 80.557076f, 30.872936f, 84.285f, 33.245f),
                    PathNode.CurveTo(88.012924f, 35.61706f, 89.11206f, 40.562077f, 86.74f, 44.29f),
                    PathNode.Close,
                    PathNode.MoveTo(238.75f, 123.71f),
                    PathNode.LineTo(182.75f, 35.71f),
                    PathNode.CurveTo(180.37793f, 31.982079f, 175.43292f, 30.882936f, 171.705f, 33.255f),
                    PathNode.CurveTo(167.97708f, 35.627064f, 166.87793f, 40.57208f, 169.25f, 44.3f),
                    PathNode.LineTo(222.52f, 128.0f),
                    PathNode.LineTo(169.25f, 211.7f),
                    PathNode.CurveTo(168.1096f, 213.49118f, 167.72809f, 215.66226f, 168.18951f, 217.73491f),
                    PathNode.CurveTo(168.65094f, 219.80757f, 169.91745f, 221.61177f, 171.71f, 222.75f),
                    PathNode.CurveTo(172.99014f, 223.57031f, 174.47958f, 224.00429f, 176.0f, 224.0f),
                    PathNode.CurveTo(178.73999f, 224.00258f, 181.29066f, 222.6027f, 182.76f, 220.29f),
                    PathNode.LineTo(238.76f, 132.29f),
                    PathNode.CurveTo(240.42032f, 129.66992f, 240.41643f, 126.32621f, 238.75f, 123.71f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
