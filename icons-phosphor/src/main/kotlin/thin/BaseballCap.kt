package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BaseballCap: ImageVector
    get() {
        if (_baseballCap != null) return _baseballCap!!
        _baseballCap = phosphorThinIcon(
            name = "BaseballCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.798935f, 28.066122f, 28.066122f, 72.798935f, 28.0f, 128.0f),
                    PathNode.LineTo(28.0f, 184.0f),
                    PathNode.CurveTo(27.999533f, 191.5398f, 32.23937f, 198.43907f, 38.966175f, 201.84473f),
                    PathNode.CurveTo(45.692978f, 205.25038f, 53.7634f, 204.58356f, 59.84f, 200.12f),
                    PathNode.CurveTo(72.46f, 191.0f, 94.53f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(161.47f, 180.0f, 183.54f, 190.94f, 196.16f, 200.12f),
                    PathNode.CurveTo(202.27582f, 204.61691f, 210.41032f, 205.2638f, 217.16f, 201.79f),
                    PathNode.CurveTo(223.84149f, 198.38133f, 228.0341f, 191.50067f, 228.0f, 184.0f),
                    PathNode.LineTo(228.0f, 128.0f),
                    PathNode.CurveTo(227.93388f, 72.798935f, 183.20107f, 28.066122f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.LineTo(220.0f, 144.23f),
                    PathNode.CurveTo(205.13423f, 134.0942f, 188.68661f, 126.50065f, 171.33f, 121.76f),
                    PathNode.CurveTo(168.38812f, 90.630806f, 156.53099f, 61.01055f, 137.18f, 36.45f),
                    PathNode.CurveTo(184.17601f, 41.21883f, 219.94905f, 80.76269f, 220.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(163.1f, 119.74f),
                    PathNode.CurveTo(139.96567f, 114.75342f, 116.03433f, 114.75342f, 92.9f, 119.74f),
                    PathNode.CurveTo(97.64f, 76.93f, 120.0f, 47.31f, 128.0f, 38.0f),
                    PathNode.CurveTo(136.0f, 47.32f, 158.36f, 76.93f, 163.1f, 119.75f),
                    PathNode.Close,
                    PathNode.MoveTo(118.82f, 36.46f),
                    PathNode.CurveTo(99.46901f, 61.02055f, 87.611885f, 90.64081f, 84.67f, 121.77f),
                    PathNode.CurveTo(67.313385f, 126.51064f, 50.865776f, 134.10419f, 36.0f, 144.24f),
                    PathNode.LineTo(36.0f, 128.0f),
                    PathNode.CurveTo(36.056076f, 80.76652f, 71.8278f, 41.22844f, 118.82f, 36.46f),
                    PathNode.Close,
                    PathNode.MoveTo(213.48f, 194.67f),
                    PathNode.CurveTo(209.43388f, 196.78822f, 204.5317f, 196.39946f, 200.87f, 193.67f),
                    PathNode.CurveTo(187.29f, 183.78f, 163.62f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(92.38f, 172.0f, 68.71f, 183.77f, 55.13f, 193.65f),
                    PathNode.CurveTo(51.468307f, 196.37947f, 46.566124f, 196.76822f, 42.52f, 194.65f),
                    PathNode.CurveTo(38.48403f, 192.64421f, 35.950985f, 188.50664f, 36.0f, 184.0f),
                    PathNode.LineTo(36.0f, 154.0f),
                    PathNode.CurveTo(90.80469f, 113.97884f, 165.19531f, 113.97884f, 220.0f, 154.0f),
                    PathNode.LineTo(220.0f, 184.0f),
                    PathNode.CurveTo(220.05673f, 188.51382f, 217.52252f, 192.66107f, 213.48f, 194.67f),
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
        return _baseballCap!!
    }

private var _baseballCap: ImageVector? = null
