package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) return _umbrellaSimple!!
        _umbrellaSimple = phosphorRegularIcon(
            name = "UmbrellaSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 126.63f),
                    PathNode.CurveTo(236.27396f, 83.90818f, 208.57138f, 47.0258f, 168.57977f, 31.543262f),
                    PathNode.CurveTo(128.58818f, 16.060726f, 83.27207f, 24.674307f, 51.75f, 53.75f),
                    PathNode.CurveTo(31.122583f, 72.700066f, 18.378613f, 98.71633f, 16.05f, 126.63f),
                    PathNode.CurveTo(15.666128f, 131.0967f, 17.173847f, 135.51955f, 20.20607f, 138.82173f),
                    PathNode.CurveTo(23.238295f, 142.12392f, 27.516836f, 144.00246f, 32.0f, 144.0f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.CurveTo(120.0f, 217.67311f, 134.32689f, 232.0f, 152.0f, 232.0f),
                    PathNode.CurveTo(169.67311f, 232.0f, 184.0f, 217.67311f, 184.0f, 200.0f),
                    PathNode.CurveTo(184.0f, 195.58173f, 180.41827f, 192.0f, 176.0f, 192.0f),
                    PathNode.CurveTo(171.58173f, 192.0f, 168.0f, 195.58173f, 168.0f, 200.0f),
                    PathNode.CurveTo(168.0f, 208.83656f, 160.83656f, 216.0f, 152.0f, 216.0f),
                    PathNode.CurveTo(143.16344f, 216.0f, 136.0f, 208.83656f, 136.0f, 200.0f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.LineTo(224.0f, 144.0f),
                    PathNode.CurveTo(228.49185f, 144.0165f, 232.78375f, 142.14406f, 235.82704f, 138.8402f),
                    PathNode.CurveTo(238.87033f, 135.53635f, 240.38464f, 131.1054f, 240.0f, 126.63f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 128.0f),
                    PathNode.LineTo(32.0f, 128.0f),
                    PathNode.CurveTo(35.21659f, 91.38392f, 58.96984f, 59.781044f, 93.24815f, 46.51147f),
                    PathNode.CurveTo(127.52647f, 33.2419f, 166.36734f, 40.613785f, 193.4f, 65.52f),
                    PathNode.CurveTo(211.1075f, 81.74758f, 222.03609f, 104.06189f, 224.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
