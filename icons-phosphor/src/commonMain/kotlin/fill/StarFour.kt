package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StarFour: ImageVector
    get() {
        if (_starFour != null) return _starFour!!
        _starFour = phosphorFillIcon(
            name = "StarFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 128.0f),
                    PathNode.CurveTo(240.05211f, 134.72604f, 235.83762f, 140.74677f, 229.5f, 143.0f),
                    PathNode.LineTo(166.06f, 166.07f),
                    PathNode.LineTo(143.0f, 229.5f),
                    PathNode.CurveTo(140.67229f, 235.77106f, 134.68913f, 239.93224f, 128.0f, 239.93224f),
                    PathNode.CurveTo(121.310875f, 239.93224f, 115.32772f, 235.77106f, 113.0f, 229.5f),
                    PathNode.LineTo(89.94f, 166.06f),
                    PathNode.LineTo(26.5f, 143.0f),
                    PathNode.CurveTo(20.228943f, 140.67229f, 16.067764f, 134.68913f, 16.067764f, 128.0f),
                    PathNode.CurveTo(16.067764f, 121.310875f, 20.228943f, 115.32772f, 26.5f, 113.0f),
                    PathNode.LineTo(89.94f, 89.94f),
                    PathNode.LineTo(113.0f, 26.5f),
                    PathNode.CurveTo(115.32772f, 20.228943f, 121.310875f, 16.067764f, 128.0f, 16.067764f),
                    PathNode.CurveTo(134.68913f, 16.067764f, 140.67229f, 20.228943f, 143.0f, 26.5f),
                    PathNode.LineTo(166.07f, 89.94f),
                    PathNode.LineTo(229.5f, 113.0f),
                    PathNode.CurveTo(235.83762f, 115.25324f, 240.05211f, 121.27396f, 240.0f, 128.0f),
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
        return _starFour!!
    }

private var _starFour: ImageVector? = null
