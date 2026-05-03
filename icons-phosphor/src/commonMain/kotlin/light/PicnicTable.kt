package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PicnicTable: ImageVector
    get() {
        if (_picnicTable != null) return _picnicTable!!
        _picnicTable = phosphorLightIcon(
            name = "PicnicTable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 130.0f),
                    PathNode.LineTo(199.71f, 130.0f),
                    PathNode.LineTo(169.71f, 70.0f),
                    PathNode.LineTo(192.0f, 70.0f),
                    PathNode.CurveTo(195.3137f, 70.0f, 198.0f, 67.313705f, 198.0f, 64.0f),
                    PathNode.CurveTo(198.0f, 60.68629f, 195.3137f, 58.0f, 192.0f, 58.0f),
                    PathNode.LineTo(64.0f, 58.0f),
                    PathNode.CurveTo(60.68629f, 58.0f, 58.0f, 60.68629f, 58.0f, 64.0f),
                    PathNode.CurveTo(58.0f, 67.313705f, 60.68629f, 70.0f, 64.0f, 70.0f),
                    PathNode.LineTo(86.29f, 70.0f),
                    PathNode.LineTo(56.29f, 130.0f),
                    PathNode.LineTo(8.0f, 130.0f),
                    PathNode.CurveTo(4.686292f, 130.0f, 2.0f, 132.6863f, 2.0f, 136.0f),
                    PathNode.CurveTo(2.0f, 139.3137f, 4.686292f, 142.0f, 8.0f, 142.0f),
                    PathNode.LineTo(50.29f, 142.0f),
                    PathNode.LineTo(26.63f, 189.32f),
                    PathNode.CurveTo(25.149878f, 192.28577f, 26.35423f, 195.88988f, 29.32f, 197.37f),
                    PathNode.CurveTo(32.28577f, 198.85013f, 35.889877f, 197.64577f, 37.37f, 194.68f),
                    PathNode.LineTo(63.71f, 142.0f),
                    PathNode.LineTo(192.29f, 142.0f),
                    PathNode.LineTo(218.63f, 194.68f),
                    PathNode.CurveTo(220.11012f, 197.64577f, 223.71423f, 198.85013f, 226.68f, 197.37f),
                    PathNode.CurveTo(229.64577f, 195.88988f, 230.85013f, 192.28577f, 229.37f, 189.32f),
                    PathNode.LineTo(205.71f, 142.0f),
                    PathNode.LineTo(248.0f, 142.0f),
                    PathNode.CurveTo(251.3137f, 142.0f, 254.0f, 139.3137f, 254.0f, 136.0f),
                    PathNode.CurveTo(254.0f, 132.6863f, 251.3137f, 130.0f, 248.0f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(69.71f, 130.0f),
                    PathNode.LineTo(99.71f, 70.0f),
                    PathNode.LineTo(156.29f, 70.0f),
                    PathNode.LineTo(186.29f, 130.0f),
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
        return _picnicTable!!
    }

private var _picnicTable: ImageVector? = null
