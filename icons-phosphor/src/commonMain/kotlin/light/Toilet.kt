package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = phosphorLightIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(118.0f, 64.0f),
                    PathNode.CurveTo(118.0f, 67.313705f, 115.313705f, 70.0f, 112.0f, 70.0f),
                    PathNode.LineTo(96.0f, 70.0f),
                    PathNode.CurveTo(92.686295f, 70.0f, 90.0f, 67.313705f, 90.0f, 64.0f),
                    PathNode.CurveTo(90.0f, 60.68629f, 92.686295f, 58.0f, 96.0f, 58.0f),
                    PathNode.LineTo(112.0f, 58.0f),
                    PathNode.CurveTo(115.313705f, 58.0f, 118.0f, 60.68629f, 118.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.14f, 196.0f),
                    PathNode.LineTo(173.86f, 222.0f),
                    PathNode.CurveTo(174.44038f, 226.02098f, 173.24545f, 230.09578f, 170.58542f, 233.16649f),
                    PathNode.CurveTo(167.92538f, 236.23724f, 164.06265f, 238.00104f, 160.0f, 238.0f),
                    PathNode.LineTo(96.0f, 238.0f),
                    PathNode.CurveTo(91.93735f, 238.00104f, 88.0746f, 236.23724f, 85.41457f, 233.16649f),
                    PathNode.CurveTo(82.754555f, 230.09578f, 81.55962f, 226.02098f, 82.14f, 222.0f),
                    PathNode.LineTo(85.86f, 196.0f),
                    PathNode.CurveTo(54.09478f, 180.04314f, 34.032803f, 147.54785f, 34.0f, 112.0f),
                    PathNode.CurveTo(34.0f, 108.686295f, 36.68629f, 106.0f, 40.0f, 106.0f),
                    PathNode.LineTo(58.0f, 106.0f),
                    PathNode.LineTo(58.0f, 40.0f),
                    PathNode.CurveTo(58.0f, 32.268013f, 64.26801f, 26.0f, 72.0f, 26.0f),
                    PathNode.LineTo(184.0f, 26.0f),
                    PathNode.CurveTo(191.73198f, 26.0f, 198.0f, 32.268013f, 198.0f, 40.0f),
                    PathNode.LineTo(198.0f, 106.0f),
                    PathNode.LineTo(216.0f, 106.0f),
                    PathNode.CurveTo(219.3137f, 106.0f, 222.0f, 108.686295f, 222.0f, 112.0f),
                    PathNode.CurveTo(221.9672f, 147.54785f, 201.90521f, 180.04314f, 170.14f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 106.0f),
                    PathNode.LineTo(186.0f, 106.0f),
                    PathNode.LineTo(186.0f, 40.0f),
                    PathNode.CurveTo(186.0f, 38.89543f, 185.10457f, 38.0f, 184.0f, 38.0f),
                    PathNode.LineTo(72.0f, 38.0f),
                    PathNode.CurveTo(70.89543f, 38.0f, 70.0f, 38.89543f, 70.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.71f, 200.84f),
                    PathNode.CurveTo(138.81422f, 207.71738f, 117.185776f, 207.71738f, 97.29f, 200.84f),
                    PathNode.LineTo(94.0f, 223.72f),
                    PathNode.CurveTo(93.91926f, 224.29303f, 94.090675f, 224.87296f, 94.47f, 225.31f),
                    PathNode.CurveTo(94.85415f, 225.75322f, 95.4135f, 226.00548f, 96.0f, 226.0f),
                    PathNode.LineTo(160.0f, 226.0f),
                    PathNode.CurveTo(160.57953f, 225.99963f, 161.1304f, 225.74791f, 161.51f, 225.31f),
                    PathNode.CurveTo(161.88933f, 224.87296f, 162.06075f, 224.29303f, 161.98f, 223.72f),
                    PathNode.Close,
                    PathNode.MoveTo(209.78f, 118.0f),
                    PathNode.LineTo(46.22f, 118.0f),
                    PathNode.CurveTo(49.36468f, 160.84323f, 85.04151f, 193.99736f, 128.0f, 193.99736f),
                    PathNode.CurveTo(170.95848f, 193.99736f, 206.63531f, 160.84323f, 209.78f, 118.0f),
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
        return _toilet!!
    }

private var _toilet: ImageVector? = null
