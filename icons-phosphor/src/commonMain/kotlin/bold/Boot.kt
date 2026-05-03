package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Boot: ImageVector
    get() {
        if (_boot != null) return _boot!!
        _boot = phosphorBoldIcon(
            name = "Boot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 104.0f),
                    PathNode.LineTo(164.0f, 104.0f),
                    PathNode.LineTo(164.0f, 56.0f),
                    PathNode.CurveTo(164.0f, 44.954304f, 155.0457f, 36.0f, 144.0f, 36.0f),
                    PathNode.LineTo(32.0f, 36.0f),
                    PathNode.CurveTo(28.04844f, 36.001026f, 24.350676f, 37.947395f, 22.112852f, 41.204227f),
                    PathNode.CurveTo(19.875027f, 44.461063f, 19.384024f, 48.610847f, 20.8f, 52.3f),
                    PathNode.CurveTo(31.68f, 80.69f, 29.1f, 130.66f, 20.47f, 160.68f),
                    PathNode.CurveTo(20.158728f, 161.75922f, 20.000517f, 162.87679f, 20.0f, 164.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 211.0457f, 28.954306f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(66.11f, 220.0f),
                    PathNode.CurveTo(69.23293f, 220.00325f, 72.31392f, 219.28093f, 75.11f, 217.89f),
                    PathNode.LineTo(86.83f, 212.0f),
                    PathNode.LineTo(101.17f, 212.0f),
                    PathNode.LineTo(112.94f, 217.89f),
                    PathNode.CurveTo(115.73608f, 219.28093f, 118.81707f, 220.00325f, 121.94f, 220.0f),
                    PathNode.LineTo(150.16f, 220.0f),
                    PathNode.CurveTo(153.26604f, 219.99551f, 156.32904f, 219.2734f, 159.11f, 217.89f),
                    PathNode.LineTo(170.83f, 212.0f),
                    PathNode.LineTo(185.17f, 212.0f),
                    PathNode.LineTo(196.94f, 217.89f),
                    PathNode.CurveTo(199.72096f, 219.2734f, 202.78395f, 219.99551f, 205.89f, 220.0f),
                    PathNode.LineTo(232.0f, 220.0f),
                    PathNode.CurveTo(243.0457f, 220.0f, 252.0f, 211.0457f, 252.0f, 200.0f),
                    PathNode.LineTo(252.0f, 164.0f),
                    PathNode.CurveTo(251.96143f, 130.8789f, 225.1211f, 104.038574f, 192.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 60.0f),
                    PathNode.LineTo(140.0f, 60.0f),
                    PathNode.LineTo(140.0f, 104.0f),
                    PathNode.LineTo(116.0f, 104.0f),
                    PathNode.CurveTo(109.37258f, 104.0f, 104.0f, 109.37258f, 104.0f, 116.0f),
                    PathNode.CurveTo(104.0f, 122.62742f, 109.37258f, 128.0f, 116.0f, 128.0f),
                    PathNode.LineTo(192.0f, 128.0f),
                    PathNode.CurveTo(207.24911f, 128.0214f, 220.83723f, 137.62996f, 225.94f, 152.0f),
                    PathNode.LineTo(47.21f, 152.0f),
                    PathNode.CurveTo(52.75f, 124.08f, 54.23f, 88.41f, 48.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 196.0f),
                    PathNode.LineTo(206.83f, 196.0f),
                    PathNode.LineTo(195.06f, 190.11f),
                    PathNode.CurveTo(192.27904f, 188.7266f, 189.21605f, 188.00449f, 186.11f, 188.0f),
                    PathNode.LineTo(169.89f, 188.0f),
                    PathNode.CurveTo(166.78395f, 188.00449f, 163.72096f, 188.7266f, 160.94f, 190.11f),
                    PathNode.LineTo(149.17f, 196.0f),
                    PathNode.LineTo(122.83f, 196.0f),
                    PathNode.LineTo(111.06f, 190.11f),
                    PathNode.CurveTo(108.26392f, 188.71907f, 105.18293f, 187.99675f, 102.06f, 188.0f),
                    PathNode.LineTo(85.89f, 188.0f),
                    PathNode.CurveTo(82.76707f, 187.99675f, 79.68608f, 188.71907f, 76.89f, 190.11f),
                    PathNode.LineTo(65.17f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(44.0f, 176.0f),
                    PathNode.LineTo(228.0f, 176.0f),
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
        return _boot!!
    }

private var _boot: ImageVector? = null
