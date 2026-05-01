package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = phosphorLightIcon(
            name = "Keyboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 50.0f),
                    PathNode.LineTo(32.0f, 50.0f),
                    PathNode.CurveTo(24.268015f, 50.0f, 18.0f, 56.268013f, 18.0f, 64.0f),
                    PathNode.LineTo(18.0f, 192.0f),
                    PathNode.CurveTo(18.0f, 199.73198f, 24.268015f, 206.0f, 32.0f, 206.0f),
                    PathNode.LineTo(224.0f, 206.0f),
                    PathNode.CurveTo(231.73198f, 206.0f, 238.0f, 199.73198f, 238.0f, 192.0f),
                    PathNode.LineTo(238.0f, 64.0f),
                    PathNode.CurveTo(238.0f, 56.268013f, 231.73198f, 50.0f, 224.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 192.0f),
                    PathNode.CurveTo(226.0f, 193.10457f, 225.10457f, 194.0f, 224.0f, 194.0f),
                    PathNode.LineTo(32.0f, 194.0f),
                    PathNode.CurveTo(30.89543f, 194.0f, 30.0f, 193.10457f, 30.0f, 192.0f),
                    PathNode.LineTo(30.0f, 64.0f),
                    PathNode.CurveTo(30.0f, 62.89543f, 30.89543f, 62.0f, 32.0f, 62.0f),
                    PathNode.LineTo(224.0f, 62.0f),
                    PathNode.CurveTo(225.10457f, 62.0f, 226.0f, 62.89543f, 226.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.0f, 128.0f),
                    PathNode.CurveTo(206.0f, 131.3137f, 203.3137f, 134.0f, 200.0f, 134.0f),
                    PathNode.LineTo(56.0f, 134.0f),
                    PathNode.CurveTo(52.68629f, 134.0f, 50.0f, 131.3137f, 50.0f, 128.0f),
                    PathNode.CurveTo(50.0f, 124.686295f, 52.68629f, 122.0f, 56.0f, 122.0f),
                    PathNode.LineTo(200.0f, 122.0f),
                    PathNode.CurveTo(203.3137f, 122.0f, 206.0f, 124.686295f, 206.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.0f, 96.0f),
                    PathNode.CurveTo(206.0f, 99.313705f, 203.3137f, 102.0f, 200.0f, 102.0f),
                    PathNode.LineTo(56.0f, 102.0f),
                    PathNode.CurveTo(52.68629f, 102.0f, 50.0f, 99.313705f, 50.0f, 96.0f),
                    PathNode.CurveTo(50.0f, 92.686295f, 52.68629f, 90.0f, 56.0f, 90.0f),
                    PathNode.LineTo(200.0f, 90.0f),
                    PathNode.CurveTo(203.3137f, 90.0f, 206.0f, 92.686295f, 206.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 160.0f),
                    PathNode.CurveTo(70.0f, 163.3137f, 67.313705f, 166.0f, 64.0f, 166.0f),
                    PathNode.LineTo(56.0f, 166.0f),
                    PathNode.CurveTo(52.68629f, 166.0f, 50.0f, 163.3137f, 50.0f, 160.0f),
                    PathNode.CurveTo(50.0f, 156.6863f, 52.68629f, 154.0f, 56.0f, 154.0f),
                    PathNode.LineTo(64.0f, 154.0f),
                    PathNode.CurveTo(67.313705f, 154.0f, 70.0f, 156.6863f, 70.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 160.0f),
                    PathNode.CurveTo(166.0f, 163.3137f, 163.3137f, 166.0f, 160.0f, 166.0f),
                    PathNode.LineTo(96.0f, 166.0f),
                    PathNode.CurveTo(92.686295f, 166.0f, 90.0f, 163.3137f, 90.0f, 160.0f),
                    PathNode.CurveTo(90.0f, 156.6863f, 92.686295f, 154.0f, 96.0f, 154.0f),
                    PathNode.LineTo(160.0f, 154.0f),
                    PathNode.CurveTo(163.3137f, 154.0f, 166.0f, 156.6863f, 166.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.0f, 160.0f),
                    PathNode.CurveTo(206.0f, 163.3137f, 203.3137f, 166.0f, 200.0f, 166.0f),
                    PathNode.LineTo(192.0f, 166.0f),
                    PathNode.CurveTo(188.6863f, 166.0f, 186.0f, 163.3137f, 186.0f, 160.0f),
                    PathNode.CurveTo(186.0f, 156.6863f, 188.6863f, 154.0f, 192.0f, 154.0f),
                    PathNode.LineTo(200.0f, 154.0f),
                    PathNode.CurveTo(203.3137f, 154.0f, 206.0f, 156.6863f, 206.0f, 160.0f),
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
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
