package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ticket: ImageVector
    get() {
        if (_ticket != null) return _ticket!!
        _ticket = phosphorLightIcon(
            name = "Ticket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 102.0f),
                    PathNode.CurveTo(235.3137f, 102.0f, 238.0f, 99.313705f, 238.0f, 96.0f),
                    PathNode.LineTo(238.0f, 64.0f),
                    PathNode.CurveTo(238.0f, 56.268013f, 231.73198f, 50.0f, 224.0f, 50.0f),
                    PathNode.LineTo(32.0f, 50.0f),
                    PathNode.CurveTo(24.268015f, 50.0f, 18.0f, 56.268013f, 18.0f, 64.0f),
                    PathNode.LineTo(18.0f, 96.0f),
                    PathNode.CurveTo(18.0f, 99.313705f, 20.68629f, 102.0f, 24.0f, 102.0f),
                    PathNode.CurveTo(38.3594f, 102.0f, 50.0f, 113.640594f, 50.0f, 128.0f),
                    PathNode.CurveTo(50.0f, 142.3594f, 38.3594f, 154.0f, 24.0f, 154.0f),
                    PathNode.CurveTo(20.68629f, 154.0f, 18.0f, 156.6863f, 18.0f, 160.0f),
                    PathNode.LineTo(18.0f, 192.0f),
                    PathNode.CurveTo(18.0f, 199.73198f, 24.268015f, 206.0f, 32.0f, 206.0f),
                    PathNode.LineTo(224.0f, 206.0f),
                    PathNode.CurveTo(231.73198f, 206.0f, 238.0f, 199.73198f, 238.0f, 192.0f),
                    PathNode.LineTo(238.0f, 160.0f),
                    PathNode.CurveTo(238.0f, 156.6863f, 235.3137f, 154.0f, 232.0f, 154.0f),
                    PathNode.CurveTo(217.6406f, 154.0f, 206.0f, 142.3594f, 206.0f, 128.0f),
                    PathNode.CurveTo(206.0f, 113.640594f, 217.6406f, 102.0f, 232.0f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(30.0f, 192.0f),
                    PathNode.LineTo(30.0f, 165.53f),
                    PathNode.CurveTo(48.455578f, 162.60007f, 62.04189f, 146.6867f, 62.04189f, 128.0f),
                    PathNode.CurveTo(62.04189f, 109.31329f, 48.455578f, 93.39993f, 30.0f, 90.47f),
                    PathNode.LineTo(30.0f, 64.0f),
                    PathNode.CurveTo(30.0f, 62.89543f, 30.89543f, 62.0f, 32.0f, 62.0f),
                    PathNode.LineTo(90.0f, 62.0f),
                    PathNode.LineTo(90.0f, 194.0f),
                    PathNode.LineTo(32.0f, 194.0f),
                    PathNode.CurveTo(30.89543f, 194.0f, 30.0f, 193.10457f, 30.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 165.53f),
                    PathNode.LineTo(226.0f, 192.0f),
                    PathNode.CurveTo(226.0f, 193.10457f, 225.10457f, 194.0f, 224.0f, 194.0f),
                    PathNode.LineTo(102.0f, 194.0f),
                    PathNode.LineTo(102.0f, 62.0f),
                    PathNode.LineTo(224.0f, 62.0f),
                    PathNode.CurveTo(225.10457f, 62.0f, 226.0f, 62.89543f, 226.0f, 64.0f),
                    PathNode.LineTo(226.0f, 90.47f),
                    PathNode.CurveTo(207.54442f, 93.39993f, 193.95811f, 109.31329f, 193.95811f, 128.0f),
                    PathNode.CurveTo(193.95811f, 146.6867f, 207.54442f, 162.60007f, 226.0f, 165.53f),
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
        return _ticket!!
    }

private var _ticket: ImageVector? = null
