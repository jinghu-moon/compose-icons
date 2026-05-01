package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Horse: ImageVector
    get() {
        if (_horse != null) return _horse!!
        _horse = phosphorFillIcon(
            name = "Horse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(202.05f, 55.0f),
                    PathNode.CurveTo(182.55937f, 35.10024f, 155.8546f, 23.920664f, 128.0f, 24.0f),
                    PathNode.LineTo(120.0f, 24.0f),
                    PathNode.CurveTo(115.58172f, 24.0f, 112.0f, 27.581722f, 112.0f, 32.0f),
                    PathNode.LineTo(112.0f, 59.53f),
                    PathNode.LineTo(11.81f, 121.19f),
                    PathNode.CurveTo(9.995916f, 122.30722f, 8.702407f, 124.1019f, 8.216215f, 126.17619f),
                    PathNode.CurveTo(7.730024f, 128.25049f, 8.091316f, 130.43303f, 9.22f, 132.24f),
                    PathNode.LineTo(23.0f, 154.24f),
                    PathNode.LineTo(23.3f, 154.67f),
                    PathNode.CurveTo(30.417673f, 164.60814f, 42.59661f, 169.59396f, 54.64f, 167.5f),
                    PathNode.CurveTo(68.57f, 165.14f, 93.26f, 160.96f, 116.04f, 170.79f),
                    PathNode.LineTo(89.44f, 207.36f),
                    PathNode.CurveTo(82.13668f, 203.88882f, 75.368f, 199.38986f, 69.34f, 194.0f),
                    PathNode.CurveTo(66.02629f, 191.05356f, 60.95144f, 191.35127f, 58.005f, 194.665f),
                    PathNode.CurveTo(55.05856f, 197.97871f, 55.356293f, 203.05356f, 58.67f, 206.0f),
                    PathNode.CurveTo(77.7562f, 222.91818f, 102.42557f, 232.17899f, 127.93f, 232.0f),
                    PathNode.LineTo(130.1f, 232.0f),
                    PathNode.CurveTo(171.64949f, 231.17912f, 208.7216f, 205.70192f, 224.38043f, 167.20729f),
                    PathNode.CurveTo(240.03926f, 128.71268f, 231.27835f, 84.59152f, 202.1f, 55.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 112.0f),
                    PathNode.CurveTo(117.37258f, 112.0f, 112.0f, 106.62742f, 112.0f, 100.0f),
                    PathNode.CurveTo(112.0f, 93.37258f, 117.37258f, 88.0f, 124.0f, 88.0f),
                    PathNode.CurveTo(130.62741f, 88.0f, 136.0f, 93.37258f, 136.0f, 100.0f),
                    PathNode.CurveTo(136.0f, 106.62742f, 130.62741f, 112.0f, 124.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _horse!!
    }

private var _horse: ImageVector? = null
