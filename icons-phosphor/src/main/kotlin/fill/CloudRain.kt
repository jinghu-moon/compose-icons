package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) return _cloudRain!!
        _cloudRain = phosphorFillIcon(
            name = "CloudRain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(158.66f, 196.44f),
                    PathNode.LineTo(126.66f, 244.44f),
                    PathNode.CurveTo(124.207855f, 248.11821f, 119.23822f, 249.11214f, 115.56f, 246.66f),
                    PathNode.CurveTo(111.88178f, 244.20786f, 110.887856f, 239.23822f, 113.34f, 235.56f),
                    PathNode.LineTo(145.34f, 187.56f),
                    PathNode.CurveTo(147.79214f, 183.88179f, 152.76178f, 182.88786f, 156.44f, 185.34f),
                    PathNode.CurveTo(160.11821f, 187.79214f, 161.11214f, 192.76178f, 158.66f, 196.44f),
                    PathNode.Close,
                    PathNode.MoveTo(231.87f, 87.55f),
                    PathNode.CurveTo(229.51231f, 47.227207f, 196.02525f, 15.792768f, 155.63405f, 15.987033f),
                    PathNode.CurveTo(115.24286f, 16.181297f, 82.05971f, 47.936394f, 80.09f, 88.28f),
                    PathNode.CurveTo(79.847855f, 92.58258f, 76.30921f, 95.9594f, 72.0f, 96.0f),
                    PathNode.LineTo(71.4f, 96.0f),
                    PathNode.CurveTo(67.008675f, 95.6076f, 63.72794f, 91.79042f, 64.0f, 87.39f),
                    PathNode.CurveTo(64.27796f, 81.827736f, 65.05779f, 76.30195f, 66.33f, 70.88f),
                    PathNode.CurveTo(66.664024f, 69.49454f, 66.23567f, 68.035995f, 65.20552f, 67.05117f),
                    PathNode.CurveTo(64.17537f, 66.06635f, 62.699043f, 65.70401f, 61.33f, 66.1f),
                    PathNode.CurveTo(39.083782f, 72.672554f, 23.864332f, 93.163574f, 24.0f, 116.36f),
                    PathNode.CurveTo(24.2f, 145.07f, 48.12f, 168.0f, 76.84f, 168.0f),
                    PathNode.LineTo(113.05f, 168.0f),
                    PathNode.LineTo(89.34f, 203.56f),
                    PathNode.CurveTo(86.887856f, 207.23822f, 87.88178f, 212.20786f, 91.56f, 214.66f),
                    PathNode.CurveTo(95.23822f, 217.11214f, 100.207855f, 216.11821f, 102.66f, 212.44f),
                    PathNode.LineTo(132.28f, 168.0f),
                    PathNode.LineTo(156.0f, 168.0f),
                    PathNode.CurveTo(176.92166f, 167.97679f, 196.91046f, 159.33893f, 211.26472f, 144.11815f),
                    PathNode.CurveTo(225.61899f, 128.89737f, 233.07175f, 108.43713f, 231.87f, 87.55f),
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
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
