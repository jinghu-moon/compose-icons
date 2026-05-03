package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = phosphorLightIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.45f, 40.19f),
                    PathNode.CurveTo(221.27255f, 37.15164f, 218.84836f, 34.727436f, 215.81f, 34.55f),
                    PathNode.CurveTo(140.43f, 30.11f, 80.14f, 52.71f, 54.53f, 95.0f),
                    PathNode.CurveTo(37.09f, 123.79f, 37.77f, 157.8f, 56.32f, 191.2f),
                    PathNode.LineTo(35.76f, 211.76f),
                    PathNode.CurveTo(34.154774f, 213.25575f, 33.494007f, 215.50844f, 34.036915f, 217.63431f),
                    PathNode.CurveTo(34.579826f, 219.76018f, 36.239822f, 221.42018f, 38.36569f, 221.96309f),
                    PathNode.CurveTo(40.491554f, 222.506f, 42.744236f, 221.84523f, 44.24f, 220.24f),
                    PathNode.LineTo(64.8f, 199.68f),
                    PathNode.CurveTo(82.07f, 209.27f, 99.5f, 214.09f, 116.29f, 214.09f),
                    PathNode.CurveTo(132.07332f, 214.09674f, 147.5496f, 209.72835f, 161.0f, 201.47f),
                    PathNode.CurveTo(203.29f, 175.86f, 225.88f, 115.57f, 221.45f, 40.19f),
                    PathNode.Close,
                    PathNode.MoveTo(154.79f, 191.19f),
                    PathNode.CurveTo(130.71f, 205.77f, 102.15f, 205.56f, 73.66f, 190.8f),
                    PathNode.LineTo(164.25f, 100.21f),
                    PathNode.CurveTo(166.45287f, 97.845924f, 166.38788f, 94.16192f, 164.10298f, 91.87703f),
                    PathNode.CurveTo(161.81808f, 89.59213f, 158.13408f, 89.52713f, 155.77f, 91.73f),
                    PathNode.LineTo(65.18f, 182.34f),
                    PathNode.CurveTo(50.42f, 153.85f, 50.18f, 125.34f, 64.79f, 101.21f),
                    PathNode.CurveTo(87.47f, 63.78f, 141.42f, 43.41f, 209.79f, 46.26f),
                    PathNode.CurveTo(212.59f, 114.58f, 192.22f, 168.54f, 154.79f, 191.21f),
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
        return _leaf!!
    }

private var _leaf: ImageVector? = null
