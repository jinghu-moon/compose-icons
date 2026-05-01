package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Trolley: ImageVector
    get() {
        if (_trolley != null) return _trolley!!
        _trolley = phosphorLightIcon(
            name = "Trolley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(86.0f, 224.0f),
                    PathNode.CurveTo(86.0f, 231.73198f, 79.73199f, 238.0f, 72.0f, 238.0f),
                    PathNode.CurveTo(64.26801f, 238.0f, 58.0f, 231.73198f, 58.0f, 224.0f),
                    PathNode.CurveTo(58.0f, 216.26802f, 64.26801f, 210.0f, 72.0f, 210.0f),
                    PathNode.CurveTo(79.73199f, 210.0f, 86.0f, 216.26802f, 86.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 210.0f),
                    PathNode.CurveTo(208.26802f, 210.0f, 202.0f, 216.26802f, 202.0f, 224.0f),
                    PathNode.CurveTo(202.0f, 231.73198f, 208.26802f, 238.0f, 216.0f, 238.0f),
                    PathNode.CurveTo(223.73198f, 238.0f, 230.0f, 231.73198f, 230.0f, 224.0f),
                    PathNode.CurveTo(230.0f, 216.26802f, 223.73198f, 210.0f, 216.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 178.0f),
                    PathNode.LineTo(54.0f, 178.0f),
                    PathNode.LineTo(54.0f, 75.31f),
                    PathNode.CurveTo(54.006893f, 71.59555f, 52.531063f, 68.03196f, 49.9f, 65.41f),
                    PathNode.LineTo(28.24f, 43.76f),
                    PathNode.CurveTo(26.744236f, 42.154774f, 24.491556f, 41.494007f, 22.365688f, 42.036915f),
                    PathNode.CurveTo(20.239822f, 42.579826f, 18.579824f, 44.239822f, 18.036915f, 46.36569f),
                    PathNode.CurveTo(17.494007f, 48.491554f, 18.154774f, 50.744236f, 19.76f, 52.24f),
                    PathNode.LineTo(41.41f, 73.9f),
                    PathNode.CurveTo(41.785587f, 74.27335f, 41.99777f, 74.780426f, 42.0f, 75.31f),
                    PathNode.LineTo(42.0f, 178.0f),
                    PathNode.LineTo(32.0f, 178.0f),
                    PathNode.CurveTo(28.68629f, 178.0f, 26.0f, 180.6863f, 26.0f, 184.0f),
                    PathNode.CurveTo(26.0f, 187.3137f, 28.68629f, 190.0f, 32.0f, 190.0f),
                    PathNode.LineTo(240.0f, 190.0f),
                    PathNode.CurveTo(243.3137f, 190.0f, 246.0f, 187.3137f, 246.0f, 184.0f),
                    PathNode.CurveTo(246.0f, 180.6863f, 243.3137f, 178.0f, 240.0f, 178.0f),
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
        return _trolley!!
    }

private var _trolley: ImageVector? = null
