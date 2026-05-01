package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Laptop: ImageVector
    get() {
        if (_laptop != null) return _laptop!!
        _laptop = phosphorLightIcon(
            name = "Laptop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 170.0f),
                    PathNode.LineTo(222.0f, 170.0f),
                    PathNode.LineTo(222.0f, 72.0f),
                    PathNode.CurveTo(222.0f, 59.849735f, 212.15027f, 50.0f, 200.0f, 50.0f),
                    PathNode.LineTo(56.0f, 50.0f),
                    PathNode.CurveTo(43.849735f, 50.0f, 34.0f, 59.849735f, 34.0f, 72.0f),
                    PathNode.LineTo(34.0f, 170.0f),
                    PathNode.LineTo(24.0f, 170.0f),
                    PathNode.CurveTo(20.68629f, 170.0f, 18.0f, 172.6863f, 18.0f, 176.0f),
                    PathNode.LineTo(18.0f, 192.0f),
                    PathNode.CurveTo(18.0f, 204.15027f, 27.849735f, 214.0f, 40.0f, 214.0f),
                    PathNode.LineTo(216.0f, 214.0f),
                    PathNode.CurveTo(228.15027f, 214.0f, 238.0f, 204.15027f, 238.0f, 192.0f),
                    PathNode.LineTo(238.0f, 176.0f),
                    PathNode.CurveTo(238.0f, 172.6863f, 235.3137f, 170.0f, 232.0f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 72.0f),
                    PathNode.CurveTo(46.0f, 66.47715f, 50.477154f, 62.0f, 56.0f, 62.0f),
                    PathNode.LineTo(200.0f, 62.0f),
                    PathNode.CurveTo(205.52284f, 62.0f, 210.0f, 66.47715f, 210.0f, 72.0f),
                    PathNode.LineTo(210.0f, 170.0f),
                    PathNode.LineTo(46.0f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 192.0f),
                    PathNode.CurveTo(226.0f, 197.52284f, 221.52284f, 202.0f, 216.0f, 202.0f),
                    PathNode.LineTo(40.0f, 202.0f),
                    PathNode.CurveTo(34.477154f, 202.0f, 30.0f, 197.52284f, 30.0f, 192.0f),
                    PathNode.LineTo(30.0f, 182.0f),
                    PathNode.LineTo(226.0f, 182.0f),
                    PathNode.Close,
                    PathNode.MoveTo(150.0f, 88.0f),
                    PathNode.CurveTo(150.0f, 91.313705f, 147.3137f, 94.0f, 144.0f, 94.0f),
                    PathNode.LineTo(112.0f, 94.0f),
                    PathNode.CurveTo(108.686295f, 94.0f, 106.0f, 91.313705f, 106.0f, 88.0f),
                    PathNode.CurveTo(106.0f, 84.686295f, 108.686295f, 82.0f, 112.0f, 82.0f),
                    PathNode.LineTo(144.0f, 82.0f),
                    PathNode.CurveTo(147.3137f, 82.0f, 150.0f, 84.686295f, 150.0f, 88.0f),
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
        return _laptop!!
    }

private var _laptop: ImageVector? = null
