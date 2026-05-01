package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = phosphorLightIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 122.0f),
                    PathNode.LineTo(238.0f, 122.0f),
                    PathNode.LineTo(238.0f, 88.0f),
                    PathNode.CurveTo(238.0f, 80.26801f, 231.73198f, 74.0f, 224.0f, 74.0f),
                    PathNode.LineTo(206.0f, 74.0f),
                    PathNode.LineTo(206.0f, 64.0f),
                    PathNode.CurveTo(206.0f, 56.268013f, 199.73198f, 50.0f, 192.0f, 50.0f),
                    PathNode.LineTo(168.0f, 50.0f),
                    PathNode.CurveTo(160.26802f, 50.0f, 154.0f, 56.268013f, 154.0f, 64.0f),
                    PathNode.LineTo(154.0f, 122.0f),
                    PathNode.LineTo(102.0f, 122.0f),
                    PathNode.LineTo(102.0f, 64.0f),
                    PathNode.CurveTo(102.0f, 56.268013f, 95.73199f, 50.0f, 88.0f, 50.0f),
                    PathNode.LineTo(64.0f, 50.0f),
                    PathNode.CurveTo(56.268013f, 50.0f, 50.0f, 56.268013f, 50.0f, 64.0f),
                    PathNode.LineTo(50.0f, 74.0f),
                    PathNode.LineTo(32.0f, 74.0f),
                    PathNode.CurveTo(24.268015f, 74.0f, 18.0f, 80.26801f, 18.0f, 88.0f),
                    PathNode.LineTo(18.0f, 122.0f),
                    PathNode.LineTo(8.0f, 122.0f),
                    PathNode.CurveTo(4.686292f, 122.0f, 2.0f, 124.686295f, 2.0f, 128.0f),
                    PathNode.CurveTo(2.0f, 131.3137f, 4.686292f, 134.0f, 8.0f, 134.0f),
                    PathNode.LineTo(18.0f, 134.0f),
                    PathNode.LineTo(18.0f, 168.0f),
                    PathNode.CurveTo(18.0f, 175.73198f, 24.268015f, 182.0f, 32.0f, 182.0f),
                    PathNode.LineTo(50.0f, 182.0f),
                    PathNode.LineTo(50.0f, 192.0f),
                    PathNode.CurveTo(50.0f, 199.73198f, 56.268013f, 206.0f, 64.0f, 206.0f),
                    PathNode.LineTo(88.0f, 206.0f),
                    PathNode.CurveTo(95.73199f, 206.0f, 102.0f, 199.73198f, 102.0f, 192.0f),
                    PathNode.LineTo(102.0f, 134.0f),
                    PathNode.LineTo(154.0f, 134.0f),
                    PathNode.LineTo(154.0f, 192.0f),
                    PathNode.CurveTo(154.0f, 199.73198f, 160.26802f, 206.0f, 168.0f, 206.0f),
                    PathNode.LineTo(192.0f, 206.0f),
                    PathNode.CurveTo(199.73198f, 206.0f, 206.0f, 199.73198f, 206.0f, 192.0f),
                    PathNode.LineTo(206.0f, 182.0f),
                    PathNode.LineTo(224.0f, 182.0f),
                    PathNode.CurveTo(231.73198f, 182.0f, 238.0f, 175.73198f, 238.0f, 168.0f),
                    PathNode.LineTo(238.0f, 134.0f),
                    PathNode.LineTo(248.0f, 134.0f),
                    PathNode.CurveTo(251.3137f, 134.0f, 254.0f, 131.3137f, 254.0f, 128.0f),
                    PathNode.CurveTo(254.0f, 124.686295f, 251.3137f, 122.0f, 248.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 170.0f),
                    PathNode.CurveTo(30.89543f, 170.0f, 30.0f, 169.10457f, 30.0f, 168.0f),
                    PathNode.LineTo(30.0f, 88.0f),
                    PathNode.CurveTo(30.0f, 86.89543f, 30.89543f, 86.0f, 32.0f, 86.0f),
                    PathNode.LineTo(50.0f, 86.0f),
                    PathNode.LineTo(50.0f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.0f, 192.0f),
                    PathNode.CurveTo(90.0f, 193.10457f, 89.10457f, 194.0f, 88.0f, 194.0f),
                    PathNode.LineTo(64.0f, 194.0f),
                    PathNode.CurveTo(62.89543f, 194.0f, 62.0f, 193.10457f, 62.0f, 192.0f),
                    PathNode.LineTo(62.0f, 64.0f),
                    PathNode.CurveTo(62.0f, 62.89543f, 62.89543f, 62.0f, 64.0f, 62.0f),
                    PathNode.LineTo(88.0f, 62.0f),
                    PathNode.CurveTo(89.10457f, 62.0f, 90.0f, 62.89543f, 90.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 192.0f),
                    PathNode.CurveTo(194.0f, 193.10457f, 193.10457f, 194.0f, 192.0f, 194.0f),
                    PathNode.LineTo(168.0f, 194.0f),
                    PathNode.CurveTo(166.89543f, 194.0f, 166.0f, 193.10457f, 166.0f, 192.0f),
                    PathNode.LineTo(166.0f, 64.0f),
                    PathNode.CurveTo(166.0f, 62.89543f, 166.89543f, 62.0f, 168.0f, 62.0f),
                    PathNode.LineTo(192.0f, 62.0f),
                    PathNode.CurveTo(193.10457f, 62.0f, 194.0f, 62.89543f, 194.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 168.0f),
                    PathNode.CurveTo(226.0f, 169.10457f, 225.10457f, 170.0f, 224.0f, 170.0f),
                    PathNode.LineTo(206.0f, 170.0f),
                    PathNode.LineTo(206.0f, 86.0f),
                    PathNode.LineTo(224.0f, 86.0f),
                    PathNode.CurveTo(225.10457f, 86.0f, 226.0f, 86.89543f, 226.0f, 88.0f),
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
        return _barbell!!
    }

private var _barbell: ImageVector? = null
