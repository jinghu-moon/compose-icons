package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SkipForward: ImageVector
    get() {
        if (_skipForward != null) return _skipForward!!
        _skipForward = phosphorDuotoneIcon(
            name = "SkipForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.3f, 134.65f),
                    PathNode.LineTo(68.19f, 214.77f),
                    PathNode.CurveTo(65.746605f, 216.27309f, 62.685444f, 216.35283f, 60.1671f, 214.979f),
                    PathNode.CurveTo(57.648754f, 213.60518f, 56.05879f, 210.9881f, 56.0f, 208.12f),
                    PathNode.LineTo(56.0f, 47.88f),
                    PathNode.CurveTo(56.05879f, 45.0119f, 57.648754f, 42.39483f, 60.1671f, 41.021f),
                    PathNode.CurveTo(62.685444f, 39.64717f, 65.746605f, 39.726913f, 68.19f, 41.23f),
                    PathNode.LineTo(196.3f, 121.35f),
                    PathNode.CurveTo(198.59866f, 122.778824f, 199.99643f, 125.29346f, 199.99643f, 128.0f),
                    PathNode.CurveTo(199.99643f, 130.70654f, 198.59866f, 133.22118f, 196.3f, 134.65f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 32.0f),
                    PathNode.CurveTo(195.58173f, 32.0f, 192.0f, 35.581722f, 192.0f, 40.0f),
                    PathNode.LineTo(192.0f, 109.23f),
                    PathNode.LineTo(72.43f, 34.45f),
                    PathNode.CurveTo(67.526375f, 31.37174f, 61.339703f, 31.192472f, 56.266056f, 33.98163f),
                    PathNode.CurveTo(51.19241f, 36.770782f, 48.028618f, 42.090317f, 48.0f, 47.88f),
                    PathNode.LineTo(48.0f, 208.12f),
                    PathNode.CurveTo(48.06084f, 213.89557f, 51.229782f, 219.19002f, 56.291275f, 221.97249f),
                    PathNode.CurveTo(61.35277f, 224.75497f, 67.52102f, 224.59349f, 72.43f, 221.55f),
                    PathNode.LineTo(192.0f, 146.77f),
                    PathNode.LineTo(192.0f, 216.0f),
                    PathNode.CurveTo(192.0f, 220.41827f, 195.58173f, 224.0f, 200.0f, 224.0f),
                    PathNode.CurveTo(204.41827f, 224.0f, 208.0f, 220.41827f, 208.0f, 216.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.0f, 35.581722f, 204.41827f, 32.0f, 200.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 207.93f),
                    PathNode.LineTo(64.0f, 48.05f),
                    PathNode.LineTo(191.84f, 128.05f),
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
        return _skipForward!!
    }

private var _skipForward: ImageVector? = null
