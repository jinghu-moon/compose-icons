package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Desk: ImageVector
    get() {
        if (_desk != null) return _desk!!
        _desk = phosphorLightIcon(
            name = "Desk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 66.0f),
                    PathNode.LineTo(8.0f, 66.0f),
                    PathNode.CurveTo(4.686292f, 66.0f, 2.0f, 68.686295f, 2.0f, 72.0f),
                    PathNode.CurveTo(2.0f, 75.313705f, 4.686292f, 78.0f, 8.0f, 78.0f),
                    PathNode.LineTo(18.0f, 78.0f),
                    PathNode.LineTo(18.0f, 192.0f),
                    PathNode.CurveTo(18.0f, 195.3137f, 20.68629f, 198.0f, 24.0f, 198.0f),
                    PathNode.CurveTo(27.31371f, 198.0f, 30.0f, 195.3137f, 30.0f, 192.0f),
                    PathNode.LineTo(30.0f, 142.0f),
                    PathNode.LineTo(226.0f, 142.0f),
                    PathNode.LineTo(226.0f, 192.0f),
                    PathNode.CurveTo(226.0f, 195.3137f, 228.6863f, 198.0f, 232.0f, 198.0f),
                    PathNode.CurveTo(235.3137f, 198.0f, 238.0f, 195.3137f, 238.0f, 192.0f),
                    PathNode.LineTo(238.0f, 78.0f),
                    PathNode.LineTo(248.0f, 78.0f),
                    PathNode.CurveTo(251.3137f, 78.0f, 254.0f, 75.313705f, 254.0f, 72.0f),
                    PathNode.CurveTo(254.0f, 68.686295f, 251.3137f, 66.0f, 248.0f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(30.0f, 78.0f),
                    PathNode.LineTo(122.0f, 78.0f),
                    PathNode.LineTo(122.0f, 130.0f),
                    PathNode.LineTo(30.0f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 130.0f),
                    PathNode.LineTo(134.0f, 130.0f),
                    PathNode.LineTo(134.0f, 78.0f),
                    PathNode.LineTo(226.0f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 104.0f),
                    PathNode.CurveTo(94.0f, 107.313705f, 91.313705f, 110.0f, 88.0f, 110.0f),
                    PathNode.LineTo(64.0f, 110.0f),
                    PathNode.CurveTo(60.68629f, 110.0f, 58.0f, 107.313705f, 58.0f, 104.0f),
                    PathNode.CurveTo(58.0f, 100.686295f, 60.68629f, 98.0f, 64.0f, 98.0f),
                    PathNode.LineTo(88.0f, 98.0f),
                    PathNode.CurveTo(91.313705f, 98.0f, 94.0f, 100.686295f, 94.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.0f, 104.0f),
                    PathNode.CurveTo(162.0f, 100.686295f, 164.6863f, 98.0f, 168.0f, 98.0f),
                    PathNode.LineTo(192.0f, 98.0f),
                    PathNode.CurveTo(195.3137f, 98.0f, 198.0f, 100.686295f, 198.0f, 104.0f),
                    PathNode.CurveTo(198.0f, 107.313705f, 195.3137f, 110.0f, 192.0f, 110.0f),
                    PathNode.LineTo(168.0f, 110.0f),
                    PathNode.CurveTo(164.6863f, 110.0f, 162.0f, 107.313705f, 162.0f, 104.0f),
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
        return _desk!!
    }

private var _desk: ImageVector? = null
