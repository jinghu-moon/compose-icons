package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShieldPlus: ImageVector
    get() {
        if (_shieldPlus != null) return _shieldPlus!!
        _shieldPlus = phosphorFillIcon(
            name = "ShieldPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(39.163445f, 40.0f, 32.0f, 47.163445f, 32.0f, 56.0f),
                    PathNode.LineTo(32.0f, 112.0f),
                    PathNode.CurveTo(32.0f, 164.72f, 57.52f, 196.67f, 78.93f, 214.19f),
                    PathNode.CurveTo(101.99f, 233.05f, 124.93f, 239.46f, 125.93f, 239.72f),
                    PathNode.CurveTo(127.305016f, 240.09406f, 128.75499f, 240.09406f, 130.13f, 239.72f),
                    PathNode.CurveTo(131.13f, 239.46f, 154.04f, 233.05f, 177.13f, 214.19f),
                    PathNode.CurveTo(198.48f, 196.67f, 224.0f, 164.72f, 224.0f, 112.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(224.0f, 47.163445f, 216.83656f, 40.0f, 208.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 136.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.CurveTo(136.0f, 164.41827f, 132.41827f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(123.58172f, 168.0f, 120.0f, 164.41827f, 120.0f, 160.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.CurveTo(91.58172f, 136.0f, 88.0f, 132.41827f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 123.58172f, 91.58172f, 120.0f, 96.0f, 120.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.LineTo(120.0f, 96.0f),
                    PathNode.CurveTo(120.0f, 91.58172f, 123.58172f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(132.41827f, 88.0f, 136.0f, 91.58172f, 136.0f, 96.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.CurveTo(164.41827f, 120.0f, 168.0f, 123.58172f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 132.41827f, 164.41827f, 136.0f, 160.0f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _shieldPlus!!
    }

private var _shieldPlus: ImageVector? = null
