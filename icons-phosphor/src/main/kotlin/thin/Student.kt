package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Student: ImageVector
    get() {
        if (_student != null) return _student!!
        _student = phosphorThinIcon(
            name = "Student",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.27f, 60.21f),
                    PathNode.LineTo(129.27f, 28.21f),
                    PathNode.CurveTo(128.44582f, 27.934044f, 127.554184f, 27.934044f, 126.73f, 28.21f),
                    PathNode.LineTo(30.73f, 60.21f),
                    PathNode.CurveTo(29.100294f, 60.755665f, 28.001303f, 62.28137f, 28.0f, 64.0f),
                    PathNode.LineTo(28.0f, 144.0f),
                    PathNode.CurveTo(28.0f, 146.20914f, 29.790861f, 148.0f, 32.0f, 148.0f),
                    PathNode.CurveTo(34.20914f, 148.0f, 36.0f, 146.20914f, 36.0f, 144.0f),
                    PathNode.LineTo(36.0f, 69.55f),
                    PathNode.LineTo(79.88f, 84.18f),
                    PathNode.CurveTo(68.90321f, 98.92374f, 65.2902f, 117.88548f, 70.07609f, 135.63268f),
                    PathNode.CurveTo(74.861984f, 153.37987f, 87.51867f, 167.95416f, 104.42f, 175.18f),
                    PathNode.CurveTo(83.56f, 180.92f, 65.42f, 194.31f, 52.65f, 213.83f),
                    PathNode.CurveTo(51.550903f, 215.67493f, 52.104755f, 218.05853f, 53.9047f, 219.22984f),
                    PathNode.CurveTo(55.704647f, 220.40115f, 58.10832f, 219.94214f, 59.35f, 218.19f),
                    PathNode.CurveTo(75.17f, 193.92f, 100.2f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(155.8f, 180.0f, 180.83f, 193.92f, 196.65f, 218.18f),
                    PathNode.CurveTo(197.89168f, 219.93214f, 200.29535f, 220.39113f, 202.0953f, 219.21985f),
                    PathNode.CurveTo(203.89525f, 218.04854f, 204.4491f, 215.66493f, 203.35f, 213.82f),
                    PathNode.CurveTo(190.63f, 194.3f, 172.44f, 180.91f, 151.58f, 175.17f),
                    PathNode.CurveTo(168.48132f, 167.94418f, 181.13802f, 153.36987f, 185.9239f, 135.62268f),
                    PathNode.CurveTo(190.70981f, 117.87548f, 187.09679f, 98.913734f, 176.12f, 84.17f),
                    PathNode.LineTo(225.27f, 67.78f),
                    PathNode.CurveTo(226.89615f, 67.231224f, 227.99098f, 65.706245f, 227.99098f, 63.99f),
                    PathNode.CurveTo(227.99098f, 62.273754f, 226.89615f, 60.74878f, 225.27f, 60.2f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 120.0f),
                    PathNode.CurveTo(180.0009f, 142.92941f, 164.983f, 163.15312f, 143.03262f, 169.78177f),
                    PathNode.CurveTo(121.08223f, 176.4104f, 97.38086f, 167.87924f, 84.69039f, 148.78186f),
                    PathNode.CurveTo(71.99992f, 129.68446f, 73.316f, 104.528885f, 87.93f, 86.86f),
                    PathNode.LineTo(126.73f, 99.79f),
                    PathNode.CurveTo(127.55357f, 100.06964f, 128.44643f, 100.06964f, 129.27f, 99.79f),
                    PathNode.LineTo(168.07f, 86.86f),
                    PathNode.CurveTo(175.79181f, 96.17619f, 180.01213f, 107.89969f, 180.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 91.78f),
                    PathNode.LineTo(44.65f, 64.0f),
                    PathNode.LineTo(128.0f, 36.22f),
                    PathNode.LineTo(211.35f, 64.0f),
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
        return _student!!
    }

private var _student: ImageVector? = null
