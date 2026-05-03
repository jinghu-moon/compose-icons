package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Umbrella: ImageVector
    get() {
        if (_umbrella != null) return _umbrella!!
        _umbrella = phosphorFillIcon(
            name = "Umbrella",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 126.63f),
                    PathNode.CurveTo(235.0197f, 68.50785f, 186.33504f, 23.89619f, 128.0f, 24.0f),
                    PathNode.LineTo(128.0f, 24.0f),
                    PathNode.CurveTo(69.68415f, 23.922207f, 21.028706f, 68.527016f, 16.05f, 126.63f),
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
                    PathNode.CurveTo(35.64087f, 85.68195f, 66.61712f, 50.7666f, 108.2f, 42.11f),
                    PathNode.CurveTo(96.48f, 58.0f, 81.85f, 86.11f, 80.17f, 128.0f),
                    PathNode.LineTo(32.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(175.83f, 128.0f),
                    PathNode.CurveTo(174.15f, 86.11f, 159.52f, 58.0f, 147.83f, 42.06f),
                    PathNode.CurveTo(189.4315f, 50.70966f, 220.40924f, 85.6608f, 224.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
