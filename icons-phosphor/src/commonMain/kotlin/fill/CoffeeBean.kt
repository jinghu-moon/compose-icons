package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) return _coffeeBean!!
        _coffeeBean = phosphorFillIcon(
            name = "CoffeeBean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(71.22f, 190.47f),
                    PathNode.CurveTo(60.508846f, 195.3312f, 49.08074f, 198.42464f, 37.38f, 199.63f),
                    PathNode.CurveTo(35.80138f, 199.79411f, 34.275055f, 199.00937f, 33.49f, 197.63f),
                    PathNode.CurveTo(24.82f, 182.35f, 21.97f, 163.34f, 25.49f, 142.48f),
                    PathNode.CurveTo(29.98f, 115.56f, 44.58f, 88.61f, 66.61f, 66.58f),
                    PathNode.CurveTo(88.64f, 44.55f, 115.61f, 29.95f, 142.51f, 25.46f),
                    PathNode.CurveTo(165.3f, 21.67f, 185.88f, 25.46f, 201.8f, 36.06f),
                    PathNode.CurveTo(203.13138f, 36.93438f, 203.8171f, 38.515335f, 203.54573f, 40.084877f),
                    PathNode.CurveTo(203.27437f, 41.65442f, 202.09767f, 42.91338f, 200.55f, 43.29f),
                    PathNode.CurveTo(193.05576f, 45.076344f, 185.74925f, 47.574352f, 178.73f, 50.75f),
                    PathNode.CurveTo(156.96f, 60.65f, 129.13f, 81.81f, 120.21f, 126.45f),
                    PathNode.CurveTo(114.1f, 156.73f, 97.63f, 178.27f, 71.22f, 190.47f),
                    PathNode.Close,
                    PathNode.MoveTo(222.51f, 58.38f),
                    PathNode.CurveTo(221.72647f, 57.004196f, 220.20517f, 56.220024f, 218.63f, 56.38f),
                    PathNode.CurveTo(206.92462f, 57.57767f, 195.492f, 60.6714f, 184.78f, 65.54f),
                    PathNode.CurveTo(158.37f, 77.74f, 141.9f, 99.28f, 135.84f, 129.54f),
                    PathNode.CurveTo(126.91f, 174.18f, 99.09f, 195.34f, 77.32f, 205.24f),
                    PathNode.CurveTo(70.30074f, 208.41565f, 62.99424f, 210.91365f, 55.5f, 212.7f),
                    PathNode.CurveTo(53.916283f, 213.05728f, 52.70561f, 214.33638f, 52.43586f, 215.93733f),
                    PathNode.CurveTo(52.166107f, 217.53828f, 52.890797f, 219.1435f, 54.27f, 220.0f),
                    PathNode.CurveTo(66.14f, 227.92f, 80.59f, 232.0f, 96.62f, 232.0f),
                    PathNode.CurveTo(102.289894f, 231.98355f, 107.948875f, 231.50194f, 113.54f, 230.56f),
                    PathNode.CurveTo(140.45f, 226.07f, 167.41f, 211.47f, 189.44f, 189.44f),
                    PathNode.CurveTo(211.47f, 167.41f, 226.07f, 140.44f, 230.56f, 113.54f),
                    PathNode.CurveTo(234.0f, 92.68f, 231.18f, 73.66f, 222.51f, 58.38f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _coffeeBean!!
    }

private var _coffeeBean: ImageVector? = null
