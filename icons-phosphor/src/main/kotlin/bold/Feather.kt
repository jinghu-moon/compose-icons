package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = phosphorBoldIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.11f, 31.92f),
                    PathNode.CurveTo(197.57463f, 5.388191f, 154.56297f, 5.365814f, 128.0f, 31.87f),
                    PathNode.LineTo(57.88f, 101.17f),
                    PathNode.CurveTo(54.113255f, 104.91093f, 51.996487f, 110.00124f, 52.0f, 115.31f),
                    PathNode.LineTo(52.0f, 187.0f),
                    PathNode.LineTo(23.52f, 215.51f),
                    PathNode.CurveTo(18.825579f, 220.20442f, 18.825579f, 227.81558f, 23.52f, 232.51f),
                    PathNode.CurveTo(28.21442f, 237.20442f, 35.82558f, 237.20442f, 40.52f, 232.51f),
                    PathNode.LineTo(69.0f, 204.0f),
                    PathNode.LineTo(140.7f, 204.0f),
                    PathNode.CurveTo(146.01021f, 204.01593f, 151.10587f, 201.90562f, 154.85f, 198.14f),
                    PathNode.LineTo(154.9f, 198.14f),
                    PathNode.LineTo(224.11f, 128.14f),
                    PathNode.CurveTo(250.66817f, 101.56451f, 250.66817f, 58.49549f, 224.11f, 31.92f),
                    PathNode.Close,
                    PathNode.MoveTo(144.9f, 48.92f),
                    PathNode.CurveTo(161.48062f, 32.21878f, 188.26764f, 31.521309f, 205.69492f, 47.33704f),
                    PathNode.CurveTo(223.12221f, 63.15277f, 225.01907f, 89.881645f, 210.0f, 108.0f),
                    PathNode.LineTo(165.0f, 108.0f),
                    PathNode.LineTo(192.52f, 80.49f),
                    PathNode.CurveTo(197.21442f, 75.79558f, 197.21442f, 68.18442f, 192.52f, 63.49f),
                    PathNode.CurveTo(187.82558f, 58.79558f, 180.21442f, 58.79558f, 175.52f, 63.49f),
                    PathNode.LineTo(124.0f, 115.0f),
                    PathNode.LineTo(124.0f, 69.54f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 117.0f),
                    PathNode.LineTo(100.0f, 93.28f),
                    PathNode.LineTo(100.0f, 139.0f),
                    PathNode.LineTo(76.0f, 163.0f),
                    PathNode.Close,
                    PathNode.MoveTo(139.0f, 180.0f),
                    PathNode.LineTo(93.0f, 180.0f),
                    PathNode.LineTo(141.0f, 132.0f),
                    PathNode.LineTo(186.5f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _feather!!
    }

private var _feather: ImageVector? = null
