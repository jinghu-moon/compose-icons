package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) return _dropHalf!!
        _dropHalf = phosphorDuotoneIcon(
            name = "DropHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 144.0f),
                    PathNode.CurveTo(208.0f, 188.18279f, 172.18279f, 224.0f, 128.0f, 224.0f),
                    PathNode.LineTo(128.0f, 16.0f),
                    PathNode.CurveTo(128.0f, 16.0f, 208.0f, 72.0f, 208.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.0f, 47.75f),
                    PathNode.CurveTo(161.6478f, 33.484356f, 147.74547f, 20.638535f, 132.55f, 9.45f),
                    PathNode.CurveTo(129.79443f, 7.519659f, 126.12557f, 7.519659f, 123.37f, 9.45f),
                    PathNode.CurveTo(108.202515f, 20.643194f, 94.327194f, 33.48885f, 82.0f, 47.75f),
                    PathNode.CurveTo(54.51f, 79.32f, 40.0f, 112.6f, 40.0f, 144.0f),
                    PathNode.CurveTo(40.0f, 192.60106f, 79.39894f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(176.60106f, 232.0f, 216.0f, 192.60106f, 216.0f, 144.0f),
                    PathNode.CurveTo(216.0f, 112.6f, 201.49f, 79.32f, 174.0f, 47.75f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 144.0f),
                    PathNode.CurveTo(56.0f, 94.0f, 98.26f, 51.29f, 120.0f, 32.6f),
                    PathNode.LineTo(120.0f, 215.54f),
                    PathNode.CurveTo(83.58154f, 211.4317f, 56.043575f, 180.64941f, 56.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 215.54f),
                    PathNode.LineTo(136.0f, 32.6f),
                    PathNode.CurveTo(157.74f, 51.29f, 200.0f, 94.0f, 200.0f, 144.0f),
                    PathNode.CurveTo(199.95642f, 180.64941f, 172.41846f, 211.4317f, 136.0f, 215.54f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
