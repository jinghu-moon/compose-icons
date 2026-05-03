package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tray: ImageVector
    get() {
        if (_tray != null) return _tray!!
        _tray = phosphorLightIcon(
            name = "Tray",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 34.0f),
                    PathNode.LineTo(48.0f, 34.0f),
                    PathNode.CurveTo(40.268013f, 34.0f, 34.0f, 40.268013f, 34.0f, 48.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(215.73198f, 222.0f, 222.0f, 215.73198f, 222.0f, 208.0f),
                    PathNode.LineTo(222.0f, 48.0f),
                    PathNode.CurveTo(222.0f, 40.268013f, 215.73198f, 34.0f, 208.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
                    PathNode.LineTo(210.0f, 154.0f),
                    PathNode.LineTo(179.31f, 154.0f),
                    PathNode.CurveTo(175.59555f, 153.9931f, 172.03197f, 155.46893f, 169.41f, 158.1f),
                    PathNode.LineTo(150.1f, 177.41f),
                    PathNode.CurveTo(149.72665f, 177.78558f, 149.21957f, 177.99777f, 148.69f, 178.0f),
                    PathNode.LineTo(107.31f, 178.0f),
                    PathNode.CurveTo(106.78185f, 178.00043f, 106.27499f, 177.79192f, 105.9f, 177.42f),
                    PathNode.LineTo(86.59f, 158.1f),
                    PathNode.CurveTo(83.96804f, 155.46893f, 80.40445f, 153.9931f, 76.69f, 154.0f),
                    PathNode.LineTo(46.0f, 154.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 46.89543f, 46.89543f, 46.0f, 48.0f, 46.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 166.0f),
                    PathNode.LineTo(76.69f, 166.0f),
                    PathNode.CurveTo(77.21815f, 165.99957f, 77.72501f, 166.20808f, 78.1f, 166.58f),
                    PathNode.LineTo(97.41f, 185.9f),
                    PathNode.CurveTo(100.03196f, 188.53107f, 103.59555f, 190.0069f, 107.31f, 190.0f),
                    PathNode.LineTo(148.69f, 190.0f),
                    PathNode.CurveTo(152.40445f, 190.0069f, 155.96803f, 188.53107f, 158.59f, 185.9f),
                    PathNode.LineTo(177.9f, 166.59f),
                    PathNode.CurveTo(178.27335f, 166.21442f, 178.78043f, 166.00223f, 179.31f, 166.0f),
                    PathNode.LineTo(210.0f, 166.0f),
                    PathNode.LineTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
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
        return _tray!!
    }

private var _tray: ImageVector? = null
