package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) return _umbrellaSimple!!
        _umbrellaSimple = phosphorBoldIcon(
            name = "UmbrellaSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.93f, 126.3f),
                    PathNode.CurveTo(240.07979f, 82.05801f, 211.39728f, 43.859234f, 169.98505f, 27.82163f),
                    PathNode.CurveTo(128.5728f, 11.784028f, 81.64392f, 20.700987f, 49.0f, 50.81f),
                    PathNode.CurveTo(27.617498f, 70.42893f, 14.407536f, 97.38084f, 12.0f, 126.3f),
                    PathNode.CurveTo(11.522902f, 131.89217f, 13.417472f, 137.42747f, 17.22115f, 141.55447f),
                    PathNode.CurveTo(21.024828f, 145.68146f, 26.387548f, 148.02031f, 32.0f, 148.0f),
                    PathNode.LineTo(116.0f, 148.0f),
                    PathNode.LineTo(116.0f, 200.0f),
                    PathNode.CurveTo(116.0f, 219.88223f, 132.11775f, 236.0f, 152.0f, 236.0f),
                    PathNode.CurveTo(171.88223f, 236.0f, 188.0f, 219.88223f, 188.0f, 200.0f),
                    PathNode.CurveTo(188.0f, 193.37259f, 182.62741f, 188.0f, 176.0f, 188.0f),
                    PathNode.CurveTo(169.37259f, 188.0f, 164.0f, 193.37259f, 164.0f, 200.0f),
                    PathNode.CurveTo(164.0f, 206.62741f, 158.62741f, 212.0f, 152.0f, 212.0f),
                    PathNode.CurveTo(145.37259f, 212.0f, 140.0f, 206.62741f, 140.0f, 200.0f),
                    PathNode.LineTo(140.0f, 148.0f),
                    PathNode.LineTo(224.0f, 148.0f),
                    PathNode.CurveTo(229.61246f, 148.02031f, 234.97517f, 145.68146f, 238.77885f, 141.55447f),
                    PathNode.CurveTo(242.58253f, 137.42747f, 244.4771f, 131.89217f, 244.0f, 126.3f),
                    PathNode.Close,
                    PathNode.MoveTo(36.44f, 124.0f),
                    PathNode.CurveTo(41.080055f, 89.86412f, 64.31526f, 61.139553f, 96.72797f, 49.46888f),
                    PathNode.CurveTo(129.14067f, 37.798203f, 165.35399f, 45.11745f, 190.69f, 68.46f),
                    PathNode.CurveTo(206.53935f, 83.00676f, 216.76036f, 102.669914f, 219.56f, 124.0f),
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
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
