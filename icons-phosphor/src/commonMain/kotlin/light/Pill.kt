package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = phosphorLightIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(215.0f, 41.0f),
                    PathNode.CurveTo(194.9763f, 20.987825f, 162.5237f, 20.987825f, 142.5f, 41.0f),
                    PathNode.LineTo(41.0f, 142.5f),
                    PathNode.CurveTo(20.979677f, 162.51756f, 20.97744f, 194.97467f, 40.995f, 214.995f),
                    PathNode.CurveTo(61.01256f, 235.0153f, 93.46968f, 235.01756f, 113.49f, 215.0f),
                    PathNode.LineTo(215.0f, 113.5f),
                    PathNode.CurveTo(234.99564f, 93.46946f, 234.99564f, 61.03054f, 215.0f, 41.0f),
                    PathNode.Close,
                    PathNode.MoveTo(105.0f, 206.5f),
                    PathNode.CurveTo(89.58472f, 221.29198f, 65.17116f, 221.04231f, 50.061596f, 205.9382f),
                    PathNode.CurveTo(34.95203f, 190.83408f, 34.693584f, 166.42061f, 49.48f, 151.0f),
                    PathNode.LineTo(96.0f, 104.49f),
                    PathNode.LineTo(151.52f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.52f, 105.0f),
                    PathNode.LineTo(160.0f, 151.51f),
                    PathNode.LineTo(104.48f, 96.0f),
                    PathNode.LineTo(151.0f, 49.5f),
                    PathNode.CurveTo(166.41528f, 34.70803f, 190.82884f, 34.957684f, 205.9384f, 50.0618f),
                    PathNode.CurveTo(221.04796f, 65.165924f, 221.30641f, 89.57939f, 206.52f, 105.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.26f, 83.76f),
                    PathNode.CurveTo(190.59962f, 86.10254f, 190.59962f, 89.89746f, 188.26f, 92.24f),
                    PathNode.LineTo(164.26f, 116.24f),
                    PathNode.CurveTo(161.91281f, 118.552086f, 158.14037f, 118.53899f, 155.8093f, 116.21066f),
                    PathNode.CurveTo(153.47823f, 113.882324f, 153.46068f, 110.10991f, 155.77f, 107.76f),
                    PathNode.LineTo(179.77f, 83.76f),
                    PathNode.CurveTo(180.89543f, 82.63334f, 182.42255f, 82.00028f, 184.015f, 82.00028f),
                    PathNode.CurveTo(185.60745f, 82.00028f, 187.1346f, 82.63334f, 188.26f, 83.76f),
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
        return _pill!!
    }

private var _pill: ImageVector? = null
