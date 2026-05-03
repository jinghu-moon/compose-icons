package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignCenterHorizontal: ImageVector
    get() {
        if (_alignCenterHorizontal != null) return _alignCenterHorizontal!!
        _alignCenterHorizontal = phosphorLightIcon(
            name = "AlignCenterHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 138.0f),
                    PathNode.LineTo(134.0f, 138.0f),
                    PathNode.LineTo(134.0f, 118.0f),
                    PathNode.LineTo(184.0f, 118.0f),
                    PathNode.CurveTo(191.73198f, 118.0f, 198.0f, 111.73199f, 198.0f, 104.0f),
                    PathNode.LineTo(198.0f, 64.0f),
                    PathNode.CurveTo(198.0f, 56.268013f, 191.73198f, 50.0f, 184.0f, 50.0f),
                    PathNode.LineTo(134.0f, 50.0f),
                    PathNode.LineTo(134.0f, 32.0f),
                    PathNode.CurveTo(134.0f, 28.68629f, 131.3137f, 26.0f, 128.0f, 26.0f),
                    PathNode.CurveTo(124.686295f, 26.0f, 122.0f, 28.68629f, 122.0f, 32.0f),
                    PathNode.LineTo(122.0f, 50.0f),
                    PathNode.LineTo(72.0f, 50.0f),
                    PathNode.CurveTo(64.26801f, 50.0f, 58.0f, 56.268013f, 58.0f, 64.0f),
                    PathNode.LineTo(58.0f, 104.0f),
                    PathNode.CurveTo(58.0f, 111.73199f, 64.26801f, 118.0f, 72.0f, 118.0f),
                    PathNode.LineTo(122.0f, 118.0f),
                    PathNode.LineTo(122.0f, 138.0f),
                    PathNode.LineTo(48.0f, 138.0f),
                    PathNode.CurveTo(40.268013f, 138.0f, 34.0f, 144.26802f, 34.0f, 152.0f),
                    PathNode.LineTo(34.0f, 192.0f),
                    PathNode.CurveTo(34.0f, 199.73198f, 40.268013f, 206.0f, 48.0f, 206.0f),
                    PathNode.LineTo(122.0f, 206.0f),
                    PathNode.LineTo(122.0f, 224.0f),
                    PathNode.CurveTo(122.0f, 227.3137f, 124.686295f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(131.3137f, 230.0f, 134.0f, 227.3137f, 134.0f, 224.0f),
                    PathNode.LineTo(134.0f, 206.0f),
                    PathNode.LineTo(208.0f, 206.0f),
                    PathNode.CurveTo(215.73198f, 206.0f, 222.0f, 199.73198f, 222.0f, 192.0f),
                    PathNode.LineTo(222.0f, 152.0f),
                    PathNode.CurveTo(222.0f, 144.26802f, 215.73198f, 138.0f, 208.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 104.0f),
                    PathNode.LineTo(70.0f, 64.0f),
                    PathNode.CurveTo(70.0f, 62.89543f, 70.89543f, 62.0f, 72.0f, 62.0f),
                    PathNode.LineTo(184.0f, 62.0f),
                    PathNode.CurveTo(185.10457f, 62.0f, 186.0f, 62.89543f, 186.0f, 64.0f),
                    PathNode.LineTo(186.0f, 104.0f),
                    PathNode.CurveTo(186.0f, 105.10457f, 185.10457f, 106.0f, 184.0f, 106.0f),
                    PathNode.LineTo(72.0f, 106.0f),
                    PathNode.CurveTo(70.89543f, 106.0f, 70.0f, 105.10457f, 70.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 192.0f),
                    PathNode.CurveTo(210.0f, 193.10457f, 209.10457f, 194.0f, 208.0f, 194.0f),
                    PathNode.LineTo(48.0f, 194.0f),
                    PathNode.CurveTo(46.89543f, 194.0f, 46.0f, 193.10457f, 46.0f, 192.0f),
                    PathNode.LineTo(46.0f, 152.0f),
                    PathNode.CurveTo(46.0f, 150.89543f, 46.89543f, 150.0f, 48.0f, 150.0f),
                    PathNode.LineTo(208.0f, 150.0f),
                    PathNode.CurveTo(209.10457f, 150.0f, 210.0f, 150.89543f, 210.0f, 152.0f),
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
        return _alignCenterHorizontal!!
    }

private var _alignCenterHorizontal: ImageVector? = null
