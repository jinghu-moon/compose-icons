package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Warning: ImageVector
    get() {
        if (_warning != null) return _warning!!
        _warning = phosphorFillIcon(
            name = "Warning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.8f, 188.09f),
                    PathNode.LineTo(149.35f, 36.22f),
                    PathNode.LineTo(149.35f, 36.22f),
                    PathNode.CurveTo(144.90347f, 28.649155f, 136.78006f, 23.999342f, 128.0f, 23.999342f),
                    PathNode.CurveTo(119.21994f, 23.999342f, 111.09653f, 28.649155f, 106.65f, 36.22f),
                    PathNode.LineTo(19.2f, 188.09f),
                    PathNode.CurveTo(14.919031f, 195.41719f, 14.919031f, 204.4828f, 19.2f, 211.81f),
                    PathNode.CurveTo(23.592388f, 219.43144f, 31.753912f, 224.09135f, 40.55f, 224.0f),
                    PathNode.LineTo(215.45f, 224.0f),
                    PathNode.CurveTo(224.23895f, 224.08409f, 232.39113f, 219.42517f, 236.78f, 211.81f),
                    PathNode.CurveTo(241.06715f, 204.48642f, 241.0748f, 195.4208f, 236.8f, 188.09f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 104.0f),
                    PathNode.CurveTo(120.0f, 99.58172f, 123.58172f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(132.41827f, 96.0f, 136.0f, 99.58172f, 136.0f, 104.0f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.CurveTo(136.0f, 148.41827f, 132.41827f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(123.58172f, 152.0f, 120.0f, 148.41827f, 120.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 192.0f),
                    PathNode.CurveTo(121.37258f, 192.0f, 116.0f, 186.62741f, 116.0f, 180.0f),
                    PathNode.CurveTo(116.0f, 173.37259f, 121.37258f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(134.62741f, 168.0f, 140.0f, 173.37259f, 140.0f, 180.0f),
                    PathNode.CurveTo(140.0f, 186.62741f, 134.62741f, 192.0f, 128.0f, 192.0f),
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
        return _warning!!
    }

private var _warning: ImageVector? = null
