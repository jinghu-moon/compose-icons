package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Toolbox: ImageVector
    get() {
        if (_toolbox != null) return _toolbox!!
        _toolbox = phosphorLightIcon(
            name = "Toolbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 66.0f),
                    PathNode.LineTo(174.0f, 66.0f),
                    PathNode.LineTo(174.0f, 56.0f),
                    PathNode.CurveTo(174.0f, 43.849735f, 164.15027f, 34.0f, 152.0f, 34.0f),
                    PathNode.LineTo(104.0f, 34.0f),
                    PathNode.CurveTo(91.84974f, 34.0f, 82.0f, 43.849735f, 82.0f, 56.0f),
                    PathNode.LineTo(82.0f, 66.0f),
                    PathNode.LineTo(32.0f, 66.0f),
                    PathNode.CurveTo(24.268015f, 66.0f, 18.0f, 72.26801f, 18.0f, 80.0f),
                    PathNode.LineTo(18.0f, 192.0f),
                    PathNode.CurveTo(18.0f, 199.73198f, 24.268015f, 206.0f, 32.0f, 206.0f),
                    PathNode.LineTo(224.0f, 206.0f),
                    PathNode.CurveTo(231.73198f, 206.0f, 238.0f, 199.73198f, 238.0f, 192.0f),
                    PathNode.LineTo(238.0f, 80.0f),
                    PathNode.CurveTo(238.0f, 72.26801f, 231.73198f, 66.0f, 224.0f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 56.0f),
                    PathNode.CurveTo(94.0f, 50.477154f, 98.47715f, 46.0f, 104.0f, 46.0f),
                    PathNode.LineTo(152.0f, 46.0f),
                    PathNode.CurveTo(157.52284f, 46.0f, 162.0f, 50.477154f, 162.0f, 56.0f),
                    PathNode.LineTo(162.0f, 66.0f),
                    PathNode.LineTo(94.0f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 78.0f),
                    PathNode.LineTo(224.0f, 78.0f),
                    PathNode.CurveTo(225.10457f, 78.0f, 226.0f, 78.89543f, 226.0f, 80.0f),
                    PathNode.LineTo(226.0f, 114.0f),
                    PathNode.LineTo(190.0f, 114.0f),
                    PathNode.LineTo(190.0f, 104.0f),
                    PathNode.CurveTo(190.0f, 100.686295f, 187.3137f, 98.0f, 184.0f, 98.0f),
                    PathNode.CurveTo(180.6863f, 98.0f, 178.0f, 100.686295f, 178.0f, 104.0f),
                    PathNode.LineTo(178.0f, 114.0f),
                    PathNode.LineTo(78.0f, 114.0f),
                    PathNode.LineTo(78.0f, 104.0f),
                    PathNode.CurveTo(78.0f, 100.686295f, 75.313705f, 98.0f, 72.0f, 98.0f),
                    PathNode.CurveTo(68.686295f, 98.0f, 66.0f, 100.686295f, 66.0f, 104.0f),
                    PathNode.LineTo(66.0f, 114.0f),
                    PathNode.LineTo(30.0f, 114.0f),
                    PathNode.LineTo(30.0f, 80.0f),
                    PathNode.CurveTo(30.0f, 78.89543f, 30.89543f, 78.0f, 32.0f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 194.0f),
                    PathNode.LineTo(32.0f, 194.0f),
                    PathNode.CurveTo(30.89543f, 194.0f, 30.0f, 193.10457f, 30.0f, 192.0f),
                    PathNode.LineTo(30.0f, 126.0f),
                    PathNode.LineTo(66.0f, 126.0f),
                    PathNode.LineTo(66.0f, 136.0f),
                    PathNode.CurveTo(66.0f, 139.3137f, 68.686295f, 142.0f, 72.0f, 142.0f),
                    PathNode.CurveTo(75.313705f, 142.0f, 78.0f, 139.3137f, 78.0f, 136.0f),
                    PathNode.LineTo(78.0f, 126.0f),
                    PathNode.LineTo(178.0f, 126.0f),
                    PathNode.LineTo(178.0f, 136.0f),
                    PathNode.CurveTo(178.0f, 139.3137f, 180.6863f, 142.0f, 184.0f, 142.0f),
                    PathNode.CurveTo(187.3137f, 142.0f, 190.0f, 139.3137f, 190.0f, 136.0f),
                    PathNode.LineTo(190.0f, 126.0f),
                    PathNode.LineTo(226.0f, 126.0f),
                    PathNode.LineTo(226.0f, 192.0f),
                    PathNode.CurveTo(226.0f, 193.10457f, 225.10457f, 194.0f, 224.0f, 194.0f),
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
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
