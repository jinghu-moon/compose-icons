package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HardHat: ImageVector
    get() {
        if (_hardHat != null) return _hardHat!!
        _hardHat = phosphorLightIcon(
            name = "HardHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 154.0f),
                    PathNode.LineTo(222.0f, 154.0f),
                    PathNode.LineTo(222.0f, 136.0f),
                    PathNode.CurveTo(221.89328f, 95.67692f, 196.17813f, 59.876614f, 158.0f, 46.9f),
                    PathNode.LineTo(158.0f, 40.0f),
                    PathNode.CurveTo(158.0f, 32.268013f, 151.73198f, 26.0f, 144.0f, 26.0f),
                    PathNode.LineTo(112.0f, 26.0f),
                    PathNode.CurveTo(104.26801f, 26.0f, 98.0f, 32.268013f, 98.0f, 40.0f),
                    PathNode.LineTo(98.0f, 46.9f),
                    PathNode.CurveTo(59.821865f, 59.876614f, 34.10672f, 95.67692f, 34.0f, 136.0f),
                    PathNode.LineTo(34.0f, 154.0f),
                    PathNode.LineTo(32.0f, 154.0f),
                    PathNode.CurveTo(24.268015f, 154.0f, 18.0f, 160.26802f, 18.0f, 168.0f),
                    PathNode.LineTo(18.0f, 192.0f),
                    PathNode.CurveTo(18.0f, 199.73198f, 24.268015f, 206.0f, 32.0f, 206.0f),
                    PathNode.LineTo(224.0f, 206.0f),
                    PathNode.CurveTo(231.73198f, 206.0f, 238.0f, 199.73198f, 238.0f, 192.0f),
                    PathNode.LineTo(238.0f, 168.0f),
                    PathNode.CurveTo(238.0f, 160.26802f, 231.73198f, 154.0f, 224.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 136.0f),
                    PathNode.LineTo(210.0f, 154.0f),
                    PathNode.LineTo(158.0f, 154.0f),
                    PathNode.LineTo(158.0f, 59.68f),
                    PathNode.CurveTo(189.31305f, 72.08813f, 209.91008f, 102.318245f, 210.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 38.0f),
                    PathNode.LineTo(144.0f, 38.0f),
                    PathNode.CurveTo(145.10457f, 38.0f, 146.0f, 38.89543f, 146.0f, 40.0f),
                    PathNode.LineTo(146.0f, 154.0f),
                    PathNode.LineTo(110.0f, 154.0f),
                    PathNode.LineTo(110.0f, 40.0f),
                    PathNode.CurveTo(110.0f, 38.89543f, 110.89543f, 38.0f, 112.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 136.0f),
                    PathNode.CurveTo(46.089912f, 102.318245f, 66.68695f, 72.08813f, 98.0f, 59.68f),
                    PathNode.LineTo(98.0f, 154.0f),
                    PathNode.LineTo(46.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 192.0f),
                    PathNode.CurveTo(226.0f, 193.10457f, 225.10457f, 194.0f, 224.0f, 194.0f),
                    PathNode.LineTo(32.0f, 194.0f),
                    PathNode.CurveTo(30.89543f, 194.0f, 30.0f, 193.10457f, 30.0f, 192.0f),
                    PathNode.LineTo(30.0f, 168.0f),
                    PathNode.CurveTo(30.0f, 166.89543f, 30.89543f, 166.0f, 32.0f, 166.0f),
                    PathNode.LineTo(224.0f, 166.0f),
                    PathNode.CurveTo(225.10457f, 166.0f, 226.0f, 166.89543f, 226.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
