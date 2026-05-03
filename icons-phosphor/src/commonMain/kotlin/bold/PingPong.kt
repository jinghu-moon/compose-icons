package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PingPong: ImageVector
    get() {
        if (_pingPong != null) return _pingPong!!
        _pingPong = phosphorBoldIcon(
            name = "PingPong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.93f, 195.71f),
                    PathNode.CurveTo(243.45847f, 189.98009f, 240.5439f, 184.73021f, 235.93f, 181.3f),
                    PathNode.LineTo(203.0f, 155.17f),
                    PathNode.LineTo(215.1f, 143.07f),
                    PathNode.CurveTo(225.47234f, 132.7887f, 230.01714f, 118.002144f, 227.21f, 103.67f),
                    PathNode.CurveTo(222.3752f, 79.90085f, 209.34735f, 58.58416f, 190.4f, 43.44f),
                    PathNode.CurveTo(171.18207f, 27.980724f, 147.18219f, 19.693201f, 122.52f, 20.0f),
                    PathNode.CurveTo(66.29644f, 20.946392f, 20.946392f, 66.29644f, 20.0f, 122.52f),
                    PathNode.CurveTo(19.69569f, 147.17097f, 27.979424f, 171.15952f, 43.43f, 190.37f),
                    PathNode.CurveTo(58.57416f, 209.31737f, 79.89085f, 222.3452f, 103.66f, 227.18f),
                    PathNode.CurveTo(117.98912f, 229.98729f, 132.77277f, 225.44223f, 143.05f, 215.07f),
                    PathNode.LineTo(155.17f, 203.0f),
                    PathNode.LineTo(181.3f, 235.95f),
                    PathNode.CurveTo(184.73021f, 240.56389f, 189.98009f, 243.47847f, 195.71f, 243.95f),
                    PathNode.CurveTo(196.26f, 243.95f, 196.81f, 244.02f, 197.37f, 244.02f),
                    PathNode.CurveTo(202.67043f, 244.01622f, 207.7526f, 241.90854f, 211.5f, 238.16f),
                    PathNode.LineTo(238.14f, 211.52f),
                    PathNode.CurveTo(242.3094f, 207.36322f, 244.42868f, 201.57635f, 243.93f, 195.71f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 122.86f),
                    PathNode.CurveTo(44.6f, 80.0f, 80.0f, 44.6f, 122.86f, 44.0f),
                    PathNode.CurveTo(148.22032f, 43.68329f, 172.29723f, 55.130894f, 188.06f, 75.0f),
                    PathNode.LineTo(75.0f, 188.06f),
                    PathNode.CurveTo(55.130894f, 172.29723f, 43.68329f, 148.22032f, 44.0f, 122.86f),
                    PathNode.Close,
                    PathNode.MoveTo(197.71f, 218.0f),
                    PathNode.LineTo(165.61f, 177.51f),
                    PathNode.CurveTo(163.48166f, 174.8346f, 160.31322f, 173.19398f, 156.9f, 173.0f),
                    PathNode.LineTo(156.21f, 173.0f),
                    PathNode.CurveTo(153.02644f, 172.9975f, 149.97237f, 174.26013f, 147.72f, 176.51f),
                    PathNode.LineTo(126.09f, 198.1f),
                    PathNode.LineTo(126.09f, 198.1f),
                    PathNode.CurveTo(121.46996f, 202.79532f, 114.81059f, 204.8738f, 108.34f, 203.64f),
                    PathNode.CurveTo(104.36435f, 202.84221f, 100.45863f, 201.72868f, 96.66f, 200.31f),
                    PathNode.LineTo(200.31f, 96.66f),
                    PathNode.CurveTo(201.72868f, 100.45863f, 202.84221f, 104.36435f, 203.64f, 108.34f),
                    PathNode.CurveTo(204.8738f, 114.81059f, 202.79532f, 121.46996f, 198.1f, 126.09f),
                    PathNode.LineTo(176.47f, 147.72f),
                    PathNode.CurveTo(174.04593f, 150.13599f, 172.7688f, 153.47206f, 172.95981f, 156.88918f),
                    PathNode.CurveTo(173.15082f, 160.30626f, 174.79178f, 163.47922f, 177.47f, 165.61f),
                    PathNode.LineTo(218.0f, 197.71f),
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
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null
