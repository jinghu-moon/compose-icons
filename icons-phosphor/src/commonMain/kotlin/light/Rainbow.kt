package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Rainbow: ImageVector
    get() {
        if (_rainbow != null) return _rainbow!!
        _rainbow = phosphorLightIcon(
            name = "Rainbow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(182.0f, 168.0f),
                    PathNode.LineTo(182.0f, 184.0f),
                    PathNode.CurveTo(182.0f, 187.3137f, 179.3137f, 190.0f, 176.0f, 190.0f),
                    PathNode.CurveTo(172.6863f, 190.0f, 170.0f, 187.3137f, 170.0f, 184.0f),
                    PathNode.LineTo(170.0f, 168.0f),
                    PathNode.CurveTo(170.0f, 144.80405f, 151.19595f, 126.0f, 128.0f, 126.0f),
                    PathNode.CurveTo(104.80404f, 126.0f, 86.0f, 144.80405f, 86.0f, 168.0f),
                    PathNode.LineTo(86.0f, 184.0f),
                    PathNode.CurveTo(86.0f, 187.3137f, 83.313705f, 190.0f, 80.0f, 190.0f),
                    PathNode.CurveTo(76.686295f, 190.0f, 74.0f, 187.3137f, 74.0f, 184.0f),
                    PathNode.LineTo(74.0f, 168.0f),
                    PathNode.CurveTo(74.0f, 138.17662f, 98.17662f, 114.0f, 128.0f, 114.0f),
                    PathNode.CurveTo(157.82338f, 114.0f, 182.0f, 138.17662f, 182.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 82.0f),
                    PathNode.CurveTo(80.52636f, 82.05511f, 42.055107f, 120.52636f, 42.0f, 168.0f),
                    PathNode.LineTo(42.0f, 184.0f),
                    PathNode.CurveTo(42.0f, 187.3137f, 44.68629f, 190.0f, 48.0f, 190.0f),
                    PathNode.CurveTo(51.31371f, 190.0f, 54.0f, 187.3137f, 54.0f, 184.0f),
                    PathNode.LineTo(54.0f, 168.0f),
                    PathNode.CurveTo(54.0f, 127.13093f, 87.13093f, 94.0f, 128.0f, 94.0f),
                    PathNode.CurveTo(168.86908f, 94.0f, 202.0f, 127.13093f, 202.0f, 168.0f),
                    PathNode.LineTo(202.0f, 184.0f),
                    PathNode.CurveTo(202.0f, 187.3137f, 204.6863f, 190.0f, 208.0f, 190.0f),
                    PathNode.CurveTo(211.3137f, 190.0f, 214.0f, 187.3137f, 214.0f, 184.0f),
                    PathNode.LineTo(214.0f, 168.0f),
                    PathNode.CurveTo(213.9449f, 120.52636f, 175.47365f, 82.05511f, 128.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 50.0f),
                    PathNode.CurveTo(62.8601f, 50.071648f, 10.071646f, 102.8601f, 10.0f, 168.0f),
                    PathNode.LineTo(10.0f, 184.0f),
                    PathNode.CurveTo(10.0f, 187.3137f, 12.686292f, 190.0f, 16.0f, 190.0f),
                    PathNode.CurveTo(19.31371f, 190.0f, 22.0f, 187.3137f, 22.0f, 184.0f),
                    PathNode.LineTo(22.0f, 168.0f),
                    PathNode.CurveTo(22.0f, 109.45782f, 69.45782f, 62.0f, 128.0f, 62.0f),
                    PathNode.CurveTo(186.54219f, 62.0f, 234.0f, 109.45782f, 234.0f, 168.0f),
                    PathNode.LineTo(234.0f, 184.0f),
                    PathNode.CurveTo(234.0f, 187.3137f, 236.6863f, 190.0f, 240.0f, 190.0f),
                    PathNode.CurveTo(243.3137f, 190.0f, 246.0f, 187.3137f, 246.0f, 184.0f),
                    PathNode.LineTo(246.0f, 168.0f),
                    PathNode.CurveTo(245.92834f, 102.8601f, 193.13991f, 50.071648f, 128.0f, 50.0f),
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
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
