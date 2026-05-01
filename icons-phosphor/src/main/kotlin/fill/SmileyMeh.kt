package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SmileyMeh: ImageVector
    get() {
        if (_smileyMeh != null) return _smileyMeh!!
        _smileyMeh = phosphorFillIcon(
            name = "SmileyMeh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.92838f, 70.59208f, 185.40791f, 24.071625f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 96.0f),
                    PathNode.CurveTo(98.62742f, 96.0f, 104.0f, 101.37258f, 104.0f, 108.0f),
                    PathNode.CurveTo(104.0f, 114.62742f, 98.62742f, 120.0f, 92.0f, 120.0f),
                    PathNode.CurveTo(85.37258f, 120.0f, 80.0f, 114.62742f, 80.0f, 108.0f),
                    PathNode.CurveTo(80.0f, 101.37258f, 85.37258f, 96.0f, 92.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 168.0f),
                    PathNode.LineTo(88.0f, 168.0f),
                    PathNode.CurveTo(83.58172f, 168.0f, 80.0f, 164.41827f, 80.0f, 160.0f),
                    PathNode.CurveTo(80.0f, 155.58173f, 83.58172f, 152.0f, 88.0f, 152.0f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.CurveTo(172.41827f, 152.0f, 176.0f, 155.58173f, 176.0f, 160.0f),
                    PathNode.CurveTo(176.0f, 164.41827f, 172.41827f, 168.0f, 168.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 120.0f),
                    PathNode.CurveTo(157.37259f, 120.0f, 152.0f, 114.62742f, 152.0f, 108.0f),
                    PathNode.CurveTo(152.0f, 101.37258f, 157.37259f, 96.0f, 164.0f, 96.0f),
                    PathNode.CurveTo(170.62741f, 96.0f, 176.0f, 101.37258f, 176.0f, 108.0f),
                    PathNode.CurveTo(176.0f, 114.62742f, 170.62741f, 120.0f, 164.0f, 120.0f),
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
        return _smileyMeh!!
    }

private var _smileyMeh: ImageVector? = null
