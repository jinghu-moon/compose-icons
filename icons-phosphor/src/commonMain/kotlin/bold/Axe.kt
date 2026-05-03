package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Axe: ImageVector
    get() {
        if (_axe != null) return _axe!!
        _axe = phosphorBoldIcon(
            name = "Axe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(254.93f, 96.43f),
                    PathNode.CurveTo(252.48495f, 89.19509f, 246.13322f, 83.9841f, 238.56f, 83.0f),
                    PathNode.CurveTo(224.65594f, 81.16853f, 211.17175f, 76.95346f, 198.7f, 70.54f),
                    PathNode.LineTo(202.62f, 66.62f),
                    PathNode.CurveTo(215.11821f, 54.121796f, 215.11821f, 33.858204f, 202.62f, 21.36f),
                    PathNode.CurveTo(190.1218f, 8.861796f, 169.85822f, 8.861796f, 157.36f, 21.36f),
                    PathNode.LineTo(150.67f, 28.05f),
                    PathNode.CurveTo(147.20184f, 23.39962f, 141.88536f, 20.484257f, 136.09966f, 20.060163f),
                    PathNode.CurveTo(130.31396f, 19.63607f, 124.62919f, 21.74504f, 120.52f, 25.84f),
                    PathNode.LineTo(81.84f, 64.52f),
                    PathNode.CurveTo(77.7415f, 68.62942f, 75.630264f, 74.31655f, 76.05441f, 80.10491f),
                    PathNode.CurveTo(76.47855f, 85.89327f, 79.39625f, 91.211914f, 84.05f, 94.68f),
                    PathNode.LineTo(9.36f, 169.38f),
                    PathNode.CurveTo(-3.138204f, 181.87544f, -3.140442f, 202.1368f, 9.355f, 214.635f),
                    PathNode.CurveTo(21.850443f, 227.13321f, 42.111797f, 227.13544f, 54.61f, 214.64f),
                    PathNode.LineTo(126.53f, 142.71f),
                    PathNode.CurveTo(132.94693f, 155.18112f, 137.16539f, 168.66533f, 139.0f, 182.57f),
                    PathNode.CurveTo(139.97012f, 190.14075f, 145.16467f, 196.49924f, 152.38976f, 198.96002f),
                    PathNode.CurveTo(159.61484f, 201.4208f, 167.61058f, 199.55475f, 173.0f, 194.15f),
                    PathNode.LineTo(250.13f, 117.0f),
                    PathNode.CurveTo(255.54596f, 111.63322f, 257.41125f, 103.639595f, 254.93f, 96.43f),
                    PathNode.Close,
                    PathNode.MoveTo(174.33f, 38.33f),
                    PathNode.CurveTo(177.45593f, 35.204067f, 182.52406f, 35.204067f, 185.65f, 38.33f),
                    PathNode.CurveTo(188.77592f, 41.455933f, 188.77592f, 46.524067f, 185.65f, 49.65f),
                    PathNode.LineTo(178.07f, 57.22f),
                    PathNode.CurveTo(173.88309f, 53.898323f, 169.89613f, 50.332104f, 166.13f, 46.54f),
                    PathNode.Close,
                    PathNode.MoveTo(37.64f, 197.67f),
                    PathNode.CurveTo(34.51407f, 200.79317f, 29.44817f, 200.79092f, 26.325f, 197.665f),
                    PathNode.CurveTo(23.20183f, 194.53906f, 23.20407f, 189.47318f, 26.33f, 186.35f),
                    PathNode.LineTo(102.54f, 110.14f),
                    PathNode.CurveTo(106.33211f, 113.906136f, 109.89832f, 117.89308f, 113.22f, 122.08f),
                    PathNode.Close,
                    PathNode.MoveTo(161.52f, 171.67f),
                    PathNode.CurveTo(152.52f, 123.17f, 122.25f, 93.23f, 102.14f, 78.2f),
                    PathNode.LineTo(134.14f, 46.2f),
                    PathNode.CurveTo(149.14f, 66.31f, 179.14f, 96.54f, 227.59f, 105.58f),
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
        return _axe!!
    }

private var _axe: ImageVector? = null
