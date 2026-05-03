package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SkipBack: ImageVector
    get() {
        if (_skipBack != null) return _skipBack!!
        _skipBack = phosphorDuotoneIcon(
            name = "SkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 47.88f),
                    PathNode.LineTo(200.0f, 208.12f),
                    PathNode.CurveTo(199.9412f, 210.9881f, 198.35124f, 213.60518f, 195.8329f, 214.979f),
                    PathNode.CurveTo(193.31456f, 216.35283f, 190.2534f, 216.27309f, 187.81f, 214.77f),
                    PathNode.LineTo(59.7f, 134.65f),
                    PathNode.CurveTo(57.401337f, 133.22118f, 56.00357f, 130.70654f, 56.00357f, 128.0f),
                    PathNode.CurveTo(56.00357f, 125.29346f, 57.401337f, 122.778824f, 59.7f, 121.35f),
                    PathNode.LineTo(187.81f, 41.23f),
                    PathNode.CurveTo(190.2534f, 39.726913f, 193.31456f, 39.64717f, 195.8329f, 41.021f),
                    PathNode.CurveTo(198.35124f, 42.39483f, 199.9412f, 45.0119f, 200.0f, 47.88f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(199.81f, 34.0f),
                    PathNode.CurveTo(194.7211f, 31.180042f, 188.50253f, 31.344698f, 183.57f, 34.43f),
                    PathNode.LineTo(64.0f, 109.23f),
                    PathNode.LineTo(64.0f, 40.0f),
                    PathNode.CurveTo(64.0f, 35.581722f, 60.418278f, 32.0f, 56.0f, 32.0f),
                    PathNode.CurveTo(51.581722f, 32.0f, 48.0f, 35.581722f, 48.0f, 40.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(48.0f, 220.41827f, 51.581722f, 224.0f, 56.0f, 224.0f),
                    PathNode.CurveTo(60.418278f, 224.0f, 64.0f, 220.41827f, 64.0f, 216.0f),
                    PathNode.LineTo(64.0f, 146.77f),
                    PathNode.LineTo(183.57f, 221.55f),
                    PathNode.CurveTo(188.47363f, 224.62827f, 194.6603f, 224.80753f, 199.73395f, 222.01837f),
                    PathNode.CurveTo(204.80759f, 219.22922f, 207.97137f, 213.90968f, 208.0f, 208.12f),
                    PathNode.LineTo(208.0f, 47.88f),
                    PathNode.CurveTo(207.99927f, 42.107674f, 204.86243f, 36.791534f, 199.81f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 208.0f),
                    PathNode.LineTo(64.16f, 128.0f),
                    PathNode.LineTo(192.0f, 48.07f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
