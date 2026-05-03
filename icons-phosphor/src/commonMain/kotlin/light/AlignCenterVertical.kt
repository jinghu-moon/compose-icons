package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignCenterVertical: ImageVector
    get() {
        if (_alignCenterVertical != null) return _alignCenterVertical!!
        _alignCenterVertical = phosphorLightIcon(
            name = "AlignCenterVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 122.0f),
                    PathNode.LineTo(206.0f, 122.0f),
                    PathNode.LineTo(206.0f, 72.0f),
                    PathNode.CurveTo(206.0f, 64.26801f, 199.73198f, 58.0f, 192.0f, 58.0f),
                    PathNode.LineTo(152.0f, 58.0f),
                    PathNode.CurveTo(144.26802f, 58.0f, 138.0f, 64.26801f, 138.0f, 72.0f),
                    PathNode.LineTo(138.0f, 122.0f),
                    PathNode.LineTo(118.0f, 122.0f),
                    PathNode.LineTo(118.0f, 48.0f),
                    PathNode.CurveTo(118.0f, 40.268013f, 111.73199f, 34.0f, 104.0f, 34.0f),
                    PathNode.LineTo(64.0f, 34.0f),
                    PathNode.CurveTo(56.268013f, 34.0f, 50.0f, 40.268013f, 50.0f, 48.0f),
                    PathNode.LineTo(50.0f, 122.0f),
                    PathNode.LineTo(32.0f, 122.0f),
                    PathNode.CurveTo(28.68629f, 122.0f, 26.0f, 124.686295f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 131.3137f, 28.68629f, 134.0f, 32.0f, 134.0f),
                    PathNode.LineTo(50.0f, 134.0f),
                    PathNode.LineTo(50.0f, 208.0f),
                    PathNode.CurveTo(50.0f, 215.73198f, 56.268013f, 222.0f, 64.0f, 222.0f),
                    PathNode.LineTo(104.0f, 222.0f),
                    PathNode.CurveTo(111.73199f, 222.0f, 118.0f, 215.73198f, 118.0f, 208.0f),
                    PathNode.LineTo(118.0f, 134.0f),
                    PathNode.LineTo(138.0f, 134.0f),
                    PathNode.LineTo(138.0f, 184.0f),
                    PathNode.CurveTo(138.0f, 191.73198f, 144.26802f, 198.0f, 152.0f, 198.0f),
                    PathNode.LineTo(192.0f, 198.0f),
                    PathNode.CurveTo(199.73198f, 198.0f, 206.0f, 191.73198f, 206.0f, 184.0f),
                    PathNode.LineTo(206.0f, 134.0f),
                    PathNode.LineTo(224.0f, 134.0f),
                    PathNode.CurveTo(227.3137f, 134.0f, 230.0f, 131.3137f, 230.0f, 128.0f),
                    PathNode.CurveTo(230.0f, 124.686295f, 227.3137f, 122.0f, 224.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(106.0f, 208.0f),
                    PathNode.CurveTo(106.0f, 209.10457f, 105.10457f, 210.0f, 104.0f, 210.0f),
                    PathNode.LineTo(64.0f, 210.0f),
                    PathNode.CurveTo(62.89543f, 210.0f, 62.0f, 209.10457f, 62.0f, 208.0f),
                    PathNode.LineTo(62.0f, 48.0f),
                    PathNode.CurveTo(62.0f, 46.89543f, 62.89543f, 46.0f, 64.0f, 46.0f),
                    PathNode.LineTo(104.0f, 46.0f),
                    PathNode.CurveTo(105.10457f, 46.0f, 106.0f, 46.89543f, 106.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 184.0f),
                    PathNode.CurveTo(194.0f, 185.10457f, 193.10457f, 186.0f, 192.0f, 186.0f),
                    PathNode.LineTo(152.0f, 186.0f),
                    PathNode.CurveTo(150.89543f, 186.0f, 150.0f, 185.10457f, 150.0f, 184.0f),
                    PathNode.LineTo(150.0f, 72.0f),
                    PathNode.CurveTo(150.0f, 70.89543f, 150.89543f, 70.0f, 152.0f, 70.0f),
                    PathNode.LineTo(192.0f, 70.0f),
                    PathNode.CurveTo(193.10457f, 70.0f, 194.0f, 70.89543f, 194.0f, 72.0f),
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
        return _alignCenterVertical!!
    }

private var _alignCenterVertical: ImageVector? = null
