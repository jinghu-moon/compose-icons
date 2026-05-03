package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Swatches: ImageVector
    get() {
        if (_swatches != null) return _swatches!!
        _swatches = phosphorLightIcon(
            name = "Swatches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(86.0f, 180.0f),
                    PathNode.CurveTo(86.0f, 185.52284f, 81.52285f, 190.0f, 76.0f, 190.0f),
                    PathNode.CurveTo(70.47715f, 190.0f, 66.0f, 185.52284f, 66.0f, 180.0f),
                    PathNode.CurveTo(66.0f, 174.47716f, 70.47715f, 170.0f, 76.0f, 170.0f),
                    PathNode.CurveTo(81.52285f, 170.0f, 86.0f, 174.47716f, 86.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(238.0f, 156.19f),
                    PathNode.LineTo(238.0f, 208.0f),
                    PathNode.CurveTo(238.0f, 215.73198f, 231.73198f, 222.0f, 224.0f, 222.0f),
                    PathNode.LineTo(76.0f, 222.0f),
                    PathNode.CurveTo(73.45934f, 222.0017f, 70.92328f, 221.78421f, 68.42f, 221.35f),
                    PathNode.CurveTo(45.688557f, 217.19804f, 30.580738f, 195.46352f, 34.61f, 172.71f),
                    PathNode.LineTo(59.61f, 29.58f),
                    PathNode.CurveTo(60.239037f, 25.916817f, 62.304928f, 22.656525f, 65.3487f, 20.523441f),
                    PathNode.CurveTo(68.39248f, 18.390358f, 72.16206f, 17.561136f, 75.82f, 18.22f),
                    PathNode.LineTo(130.49f, 27.94f),
                    PathNode.CurveTo(138.0778f, 29.309717f, 143.12979f, 36.55686f, 141.79f, 44.15f),
                    PathNode.LineTo(129.12f, 116.59f),
                    PathNode.LineTo(200.12f, 90.84f),
                    PathNode.CurveTo(207.35643f, 88.22625f, 215.34602f, 91.94192f, 218.01f, 99.16f),
                    PathNode.LineTo(237.1f, 151.38f),
                    PathNode.CurveTo(237.6502f, 152.92627f, 237.9539f, 154.54941f, 238.0f, 156.19f),
                    PathNode.Close,
                    PathNode.MoveTo(104.93f, 185.19f),
                    PathNode.LineTo(130.0f, 42.08f),
                    PathNode.CurveTo(130.19557f, 41.004887f, 129.49202f, 39.971836f, 128.42f, 39.76f),
                    PathNode.LineTo(73.72f, 30.0f),
                    PathNode.LineTo(73.38f, 30.0f),
                    PathNode.CurveTo(72.99553f, 30.00201f, 72.62134f, 30.124407f, 72.31f, 30.35f),
                    PathNode.CurveTo(71.87443f, 30.656815f, 71.57927f, 31.124743f, 71.49f, 31.65f),
                    PathNode.LineTo(46.49f, 174.78f),
                    PathNode.CurveTo(43.598892f, 191.01895f, 54.359715f, 206.54597f, 70.58f, 209.54f),
                    PathNode.CurveTo(78.27212f, 210.91399f, 86.1942f, 209.15312f, 92.58f, 204.65f),
                    PathNode.CurveTo(99.1272f, 200.08237f, 103.56879f, 193.07957f, 104.91f, 185.21f),
                    PathNode.Close,
                    PathNode.MoveTo(113.18f, 198.36f),
                    PathNode.LineTo(224.71f, 158.0f),
                    PathNode.CurveTo(225.19528f, 157.82257f, 225.59306f, 157.4642f, 225.82f, 157.0f),
                    PathNode.CurveTo(226.03833f, 156.5419f, 226.06001f, 156.01448f, 225.88f, 155.54f),
                    PathNode.LineTo(206.79f, 103.33f),
                    PathNode.CurveTo(206.40208f, 102.31976f, 205.28099f, 101.80131f, 204.26f, 102.16f),
                    PathNode.LineTo(126.73f, 130.25f),
                    PathNode.LineTo(116.73f, 187.32f),
                    PathNode.CurveTo(116.0659f, 191.15361f, 114.87109f, 194.87604f, 113.18f, 198.38f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 170.27f),
                    PathNode.LineTo(116.35f, 210.0f),
                    PathNode.LineTo(224.0f, 210.0f),
                    PathNode.CurveTo(225.10457f, 210.0f, 226.0f, 209.10457f, 226.0f, 208.0f),
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
        return _swatches!!
    }

private var _swatches: ImageVector? = null
