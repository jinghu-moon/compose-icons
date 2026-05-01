package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = phosphorLightIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.28f, 97.87f),
                    PathNode.CurveTo(235.52632f, 92.32332f, 230.5628f, 88.410385f, 224.76f, 88.0f),
                    PathNode.LineTo(164.51f, 83.13f),
                    PathNode.LineTo(141.29f, 26.93f),
                    PathNode.CurveTo(139.07434f, 21.542473f, 133.82535f, 18.025602f, 128.0f, 18.025602f),
                    PathNode.CurveTo(122.17466f, 18.025602f, 116.92566f, 21.542473f, 114.71f, 26.93f),
                    PathNode.LineTo(91.49f, 83.11f),
                    PathNode.LineTo(31.24f, 88.0f),
                    PathNode.CurveTo(25.431923f, 88.41342f, 20.466919f, 92.33546f, 18.72f, 97.89f),
                    PathNode.CurveTo(16.900326f, 103.42573f, 18.588722f, 109.51263f, 23.0f, 113.32f),
                    PathNode.LineTo(69.0f, 152.93f),
                    PathNode.LineTo(55.0f, 212.18f),
                    PathNode.CurveTo(53.656544f, 217.8505f, 55.86318f, 223.7717f, 60.59f, 227.18f),
                    PathNode.CurveTo(65.26227f, 230.6415f, 71.58029f, 230.87976f, 76.5f, 227.78f),
                    PathNode.LineTo(128.0f, 196.12f),
                    PathNode.LineTo(179.58f, 227.83f),
                    PathNode.CurveTo(184.49971f, 230.92976f, 190.81773f, 230.6915f, 195.49f, 227.23f),
                    PathNode.CurveTo(200.21683f, 223.8217f, 202.42346f, 217.9005f, 201.08f, 212.23f),
                    PathNode.LineTo(187.08f, 152.98f),
                    PathNode.LineTo(233.0f, 113.32f),
                    PathNode.CurveTo(237.41945f, 109.50919f, 239.10861f, 103.41166f, 237.28f, 97.87f),
                    PathNode.Close,
                    PathNode.MoveTo(225.14f, 104.24f),
                    PathNode.LineTo(176.45f, 146.24f),
                    PathNode.CurveTo(174.75659f, 147.70122f, 174.01654f, 149.98305f, 174.53f, 152.16f),
                    PathNode.LineTo(189.41f, 214.95f),
                    PathNode.CurveTo(189.67717f, 215.92175f, 189.29498f, 216.95566f, 188.46f, 217.52f),
                    PathNode.CurveTo(187.7035f, 218.10486f, 186.65918f, 218.14502f, 185.86f, 217.62f),
                    PathNode.LineTo(131.14f, 184.0f),
                    PathNode.CurveTo(129.21379f, 182.81702f, 126.7862f, 182.81702f, 124.86f, 184.0f),
                    PathNode.LineTo(70.14f, 217.61f),
                    PathNode.CurveTo(69.34082f, 218.13503f, 68.296486f, 218.09486f, 67.54f, 217.51f),
                    PathNode.CurveTo(66.686226f, 216.95952f, 66.28282f, 215.92278f, 66.54f, 214.94f),
                    PathNode.LineTo(81.42f, 152.15f),
                    PathNode.CurveTo(81.93346f, 149.97305f, 81.193405f, 147.6912f, 79.5f, 146.23f),
                    PathNode.LineTo(30.81f, 104.23f),
                    PathNode.CurveTo(30.026964f, 103.592384f, 29.733934f, 102.52865f, 30.08f, 101.58f),
                    PathNode.CurveTo(30.347382f, 100.644745f, 31.178673f, 99.982124f, 32.15f, 99.93f),
                    PathNode.LineTo(96.07f, 94.77f),
                    PathNode.CurveTo(98.31571f, 94.58762f, 100.26995f, 93.1625f, 101.13f, 91.08f),
                    PathNode.LineTo(125.76f, 31.48f),
                    PathNode.CurveTo(126.11142f, 30.577015f, 126.98104f, 29.98229f, 127.95f, 29.98229f),
                    PathNode.CurveTo(128.91896f, 29.98229f, 129.78857f, 30.577015f, 130.14f, 31.48f),
                    PathNode.LineTo(154.77f, 91.08f),
                    PathNode.CurveTo(155.63005f, 93.1625f, 157.58429f, 94.58762f, 159.83f, 94.77f),
                    PathNode.LineTo(223.75f, 99.93f),
                    PathNode.CurveTo(224.72133f, 99.982124f, 225.55261f, 100.644745f, 225.82f, 101.58f),
                    PathNode.CurveTo(226.1823f, 102.52104f, 225.90947f, 103.58828f, 225.14f, 104.24f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _star!!
    }

private var _star: ImageVector? = null
