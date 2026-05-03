package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BeachBall: ImageVector
    get() {
        if (_beachBall != null) return _beachBall!!
        _beachBall = phosphorBoldIcon(
            name = "BeachBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 128.0f),
                    PathNode.CurveTo(211.99316f, 132.94254f, 211.55145f, 137.8749f, 210.68f, 142.74f),
                    PathNode.CurveTo(205.4571f, 131.71257f, 199.25912f, 121.17398f, 192.16f, 111.25f),
                    PathNode.CurveTo(198.62044f, 112.76376f, 204.99051f, 114.640076f, 211.24f, 116.87f),
                    PathNode.CurveTo(211.73679f, 120.55936f, 211.99066f, 124.27736f, 212.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.39f, 89.06f),
                    PathNode.CurveTo(192.54027f, 86.49167f, 182.51233f, 84.66324f, 172.39f, 83.59f),
                    PathNode.CurveTo(171.31676f, 73.46767f, 169.48833f, 63.439728f, 166.92f, 53.59f),
                    PathNode.CurveTo(182.05992f, 61.552044f, 194.42796f, 73.92008f, 202.39f, 89.06f),
                    PathNode.Close,
                    PathNode.MoveTo(139.13f, 44.76f),
                    PathNode.CurveTo(141.35992f, 51.009487f, 143.23624f, 57.379566f, 144.75f, 63.84f),
                    PathNode.CurveTo(134.82602f, 56.74088f, 124.28744f, 50.54289f, 113.26f, 45.32f),
                    PathNode.CurveTo(121.80018f, 43.77356f, 130.5309f, 43.584568f, 139.13f, 44.76f),
                    PathNode.Close,
                    PathNode.MoveTo(81.07f, 58.36f),
                    PathNode.CurveTo(98.871704f, 64.07394f, 115.673546f, 72.52883f, 130.87f, 83.42f),
                    PathNode.CurveTo(100.73166f, 86.335045f, 71.61885f, 95.91634f, 45.64f, 111.47f),
                    PathNode.CurveTo(50.023277f, 89.80337f, 62.748383f, 70.72828f, 81.07f, 58.36f),
                    PathNode.Close,
                    PathNode.MoveTo(45.0f, 140.65f),
                    PathNode.CurveTo(75.45033f, 118.61012f, 112.031006f, 106.645004f, 149.62f, 106.43f),
                    PathNode.CurveTo(149.405f, 144.019f, 137.43988f, 180.59967f, 115.4f, 211.05f),
                    PathNode.CurveTo(79.089966f, 205.45053f, 50.599476f, 176.96004f, 45.0f, 140.65f),
                    PathNode.Close,
                    PathNode.MoveTo(144.58f, 210.36f),
                    PathNode.CurveTo(160.13365f, 184.38115f, 169.71495f, 155.26834f, 172.63f, 125.13f),
                    PathNode.CurveTo(183.52116f, 140.32646f, 191.97606f, 157.12828f, 197.69f, 174.93f),
                    PathNode.CurveTo(185.30994f, 193.26245f, 166.21497f, 205.98885f, 144.53f, 210.36f),
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
        return _beachBall!!
    }

private var _beachBall: ImageVector? = null
