package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BaseballCap: ImageVector
    get() {
        if (_baseballCap != null) return _baseballCap!!
        _baseballCap = phosphorBoldIcon(
            name = "BaseballCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.38066f, 20.066133f, 20.066133f, 68.38066f, 20.0f, 128.0f),
                    PathNode.LineTo(20.0f, 184.0f),
                    PathNode.CurveTo(19.969019f, 194.52542f, 25.872465f, 204.16978f, 35.26f, 208.93f),
                    PathNode.CurveTo(44.67857f, 213.74287f, 56.005367f, 212.83766f, 64.54f, 206.59f),
                    PathNode.CurveTo(76.2f, 198.11f, 96.68f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(159.32f, 188.0f, 179.8f, 198.1f, 191.46f, 206.58f),
                    PathNode.CurveTo(199.96861f, 212.80911f, 211.25537f, 213.72958f, 220.66084f, 208.96138f),
                    PathNode.CurveTo(230.06631f, 204.19319f, 235.99524f, 194.54507f, 236.0f, 184.0f),
                    PathNode.LineTo(236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 128.0f),
                    PathNode.LineTo(212.0f, 129.87f),
                    PathNode.CurveTo(201.44441f, 123.93108f, 190.28438f, 119.137184f, 178.71f, 115.57f),
                    PathNode.CurveTo(175.67143f, 91.84094f, 167.68227f, 69.01477f, 155.26f, 48.57f),
                    PathNode.CurveTo(189.16838f, 60.24874f, 211.9473f, 92.13681f, 212.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(153.54f, 109.88f),
                    PathNode.CurveTo(136.60559f, 107.37331f, 119.39441f, 107.37331f, 102.46f, 109.88f),
                    PathNode.CurveTo(106.61738f, 88.61958f, 115.330475f, 68.51192f, 128.0f, 50.94f),
                    PathNode.CurveTo(140.66759f, 68.513016f, 149.3805f, 88.62024f, 153.54f, 109.88f),
                    PathNode.Close,
                    PathNode.MoveTo(100.74f, 48.57f),
                    PathNode.CurveTo(88.31773f, 69.01477f, 80.328575f, 91.84094f, 77.29f, 115.57f),
                    PathNode.CurveTo(65.715614f, 119.137184f, 54.555584f, 123.93108f, 44.0f, 129.87f),
                    PathNode.LineTo(44.0f, 128.0f),
                    PathNode.CurveTo(44.052708f, 92.13681f, 66.83162f, 60.24874f, 100.74f, 48.57f),
                    PathNode.Close,
                    PathNode.MoveTo(209.85f, 187.57f),
                    PathNode.CurveTo(208.47443f, 188.29109f, 206.80579f, 188.15074f, 205.57f, 187.21f),
                    PathNode.CurveTo(191.0f, 176.61f, 165.77f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(90.23f, 164.0f, 65.0f, 176.61f, 50.43f, 187.18f),
                    PathNode.CurveTo(49.194214f, 188.12074f, 47.525566f, 188.2611f, 46.15f, 187.54f),
                    PathNode.CurveTo(44.789448f, 186.89662f, 43.943607f, 185.50395f, 44.0f, 184.0f),
                    PathNode.LineTo(44.0f, 158.14f),
                    PathNode.CurveTo(94.57382f, 123.27649f, 161.42618f, 123.27649f, 212.0f, 158.14f),
                    PathNode.LineTo(212.0f, 184.0f),
                    PathNode.CurveTo(212.0564f, 185.50395f, 211.21056f, 186.89662f, 209.85f, 187.54f),
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
        return _baseballCap!!
    }

private var _baseballCap: ImageVector? = null
