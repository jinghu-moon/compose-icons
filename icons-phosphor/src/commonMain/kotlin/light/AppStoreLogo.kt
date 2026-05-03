package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) return _appStoreLogo!!
        _appStoreLogo = phosphorLightIcon(
            name = "AppStoreLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(62.62f, 195.05f),
                    PathNode.LineTo(53.17f, 211.05f),
                    PathNode.CurveTo(51.408592f, 213.69627f, 47.888947f, 214.50946f, 45.145218f, 212.90408f),
                    PathNode.CurveTo(42.40148f, 211.29872f, 41.386036f, 207.832f, 42.83f, 205.0f),
                    PathNode.LineTo(52.29f, 189.0f),
                    PathNode.CurveTo(53.35242f, 187.09921f, 55.361286f, 185.92325f, 57.53883f, 185.9274f),
                    PathNode.CurveTo(59.716373f, 185.93155f, 61.72074f, 187.11516f, 62.775917f, 189.01997f),
                    PathNode.CurveTo(63.83109f, 190.92479f, 63.771416f, 193.25177f, 62.62f, 195.1f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 154.0f),
                    PathNode.LineTo(183.06f, 154.0f),
                    PathNode.LineTo(151.75f, 101.0f),
                    PathNode.CurveTo(150.06277f, 98.147446f, 146.38255f, 97.20277f, 143.53f, 98.89f),
                    PathNode.CurveTo(140.67744f, 100.57723f, 139.73277f, 104.25745f, 141.42f, 107.11f),
                    PathNode.LineTo(202.83f, 211.04f),
                    PathNode.CurveTo(204.51447f, 213.89531f, 208.19469f, 214.84447f, 211.05f, 213.16f),
                    PathNode.CurveTo(213.90532f, 211.47552f, 214.85446f, 207.79532f, 213.17f, 204.94f),
                    PathNode.LineTo(190.17f, 165.99f),
                    PathNode.LineTo(232.0f, 165.99f),
                    PathNode.CurveTo(235.3137f, 165.99f, 238.0f, 163.30371f, 238.0f, 159.99f),
                    PathNode.CurveTo(238.0f, 156.67628f, 235.3137f, 153.99f, 232.0f, 153.99f),
                    PathNode.Close,
                    PathNode.MoveTo(142.47f, 154.0f),
                    PathNode.LineTo(86.88f, 154.0f),
                    PathNode.LineTo(157.17f, 35.05f),
                    PathNode.CurveTo(158.61397f, 32.217995f, 157.59853f, 28.751284f, 154.85478f, 27.14591f),
                    PathNode.CurveTo(152.11105f, 25.540533f, 148.59142f, 26.353733f, 146.83f, 29.0f),
                    PathNode.LineTo(128.0f, 60.82f),
                    PathNode.LineTo(109.17f, 29.0f),
                    PathNode.CurveTo(107.485535f, 26.144688f, 103.80531f, 25.195532f, 100.95f, 26.88f),
                    PathNode.CurveTo(98.09469f, 28.564468f, 97.14553f, 32.244686f, 98.83f, 35.1f),
                    PathNode.LineTo(121.0f, 72.62f),
                    PathNode.LineTo(72.94f, 154.0f),
                    PathNode.LineTo(24.0f, 154.0f),
                    PathNode.CurveTo(20.68629f, 154.0f, 18.0f, 156.6863f, 18.0f, 160.0f),
                    PathNode.CurveTo(18.0f, 163.3137f, 20.68629f, 166.0f, 24.0f, 166.0f),
                    PathNode.LineTo(142.47f, 166.0f),
                    PathNode.CurveTo(145.7837f, 166.0f, 148.47f, 163.3137f, 148.47f, 160.0f),
                    PathNode.CurveTo(148.47f, 156.6863f, 145.7837f, 154.0f, 142.47f, 154.0f),
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
        return _appStoreLogo!!
    }

private var _appStoreLogo: ImageVector? = null
