package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tram: ImageVector
    get() {
        if (_tram != null) return _tram!!
        _tram = phosphorLightIcon(
            name = "Tram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 50.0f),
                    PathNode.LineTo(134.0f, 50.0f),
                    PathNode.LineTo(134.0f, 22.0f),
                    PathNode.LineTo(168.0f, 22.0f),
                    PathNode.CurveTo(171.3137f, 22.0f, 174.0f, 19.31371f, 174.0f, 16.0f),
                    PathNode.CurveTo(174.0f, 12.686292f, 171.3137f, 10.0f, 168.0f, 10.0f),
                    PathNode.LineTo(88.0f, 10.0f),
                    PathNode.CurveTo(84.686295f, 10.0f, 82.0f, 12.686292f, 82.0f, 16.0f),
                    PathNode.CurveTo(82.0f, 19.31371f, 84.686295f, 22.0f, 88.0f, 22.0f),
                    PathNode.LineTo(122.0f, 22.0f),
                    PathNode.LineTo(122.0f, 50.0f),
                    PathNode.LineTo(72.0f, 50.0f),
                    PathNode.CurveTo(55.431458f, 50.0f, 42.0f, 63.431458f, 42.0f, 80.0f),
                    PathNode.LineTo(42.0f, 184.0f),
                    PathNode.CurveTo(42.0f, 200.56854f, 55.431458f, 214.0f, 72.0f, 214.0f),
                    PathNode.LineTo(84.0f, 214.0f),
                    PathNode.LineTo(67.2f, 236.4f),
                    PathNode.CurveTo(65.21178f, 239.05096f, 65.74903f, 242.81177f, 68.4f, 244.8f),
                    PathNode.CurveTo(71.050964f, 246.78822f, 74.811775f, 246.25096f, 76.8f, 243.6f),
                    PathNode.LineTo(99.0f, 214.0f),
                    PathNode.LineTo(157.0f, 214.0f),
                    PathNode.LineTo(179.2f, 243.6f),
                    PathNode.CurveTo(181.18823f, 246.25096f, 184.94904f, 246.78822f, 187.6f, 244.8f),
                    PathNode.CurveTo(190.25096f, 242.81177f, 190.78822f, 239.05096f, 188.8f, 236.4f),
                    PathNode.LineTo(172.0f, 214.0f),
                    PathNode.LineTo(184.0f, 214.0f),
                    PathNode.CurveTo(200.56854f, 214.0f, 214.0f, 200.56854f, 214.0f, 184.0f),
                    PathNode.LineTo(214.0f, 80.0f),
                    PathNode.CurveTo(214.0f, 63.431458f, 200.56854f, 50.0f, 184.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 62.0f),
                    PathNode.LineTo(184.0f, 62.0f),
                    PathNode.CurveTo(193.94113f, 62.0f, 202.0f, 70.05888f, 202.0f, 80.0f),
                    PathNode.LineTo(202.0f, 122.0f),
                    PathNode.LineTo(54.0f, 122.0f),
                    PathNode.LineTo(54.0f, 80.0f),
                    PathNode.CurveTo(54.0f, 70.05888f, 62.058876f, 62.0f, 72.0f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 202.0f),
                    PathNode.LineTo(72.0f, 202.0f),
                    PathNode.CurveTo(62.058876f, 202.0f, 54.0f, 193.94113f, 54.0f, 184.0f),
                    PathNode.LineTo(54.0f, 134.0f),
                    PathNode.LineTo(202.0f, 134.0f),
                    PathNode.LineTo(202.0f, 184.0f),
                    PathNode.CurveTo(202.0f, 193.94113f, 193.94113f, 202.0f, 184.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 172.0f),
                    PathNode.CurveTo(94.0f, 177.52284f, 89.52285f, 182.0f, 84.0f, 182.0f),
                    PathNode.CurveTo(78.47715f, 182.0f, 74.0f, 177.52284f, 74.0f, 172.0f),
                    PathNode.CurveTo(74.0f, 166.47716f, 78.47715f, 162.0f, 84.0f, 162.0f),
                    PathNode.CurveTo(89.52285f, 162.0f, 94.0f, 166.47716f, 94.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.0f, 172.0f),
                    PathNode.CurveTo(182.0f, 177.52284f, 177.52284f, 182.0f, 172.0f, 182.0f),
                    PathNode.CurveTo(166.47716f, 182.0f, 162.0f, 177.52284f, 162.0f, 172.0f),
                    PathNode.CurveTo(162.0f, 166.47716f, 166.47716f, 162.0f, 172.0f, 162.0f),
                    PathNode.CurveTo(177.52284f, 162.0f, 182.0f, 166.47716f, 182.0f, 172.0f),
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
        return _tram!!
    }

private var _tram: ImageVector? = null
