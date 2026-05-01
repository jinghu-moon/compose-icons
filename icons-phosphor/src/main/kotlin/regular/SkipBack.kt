package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SkipBack: ImageVector
    get() {
        if (_skipBack != null) return _skipBack!!
        _skipBack = phosphorRegularIcon(
            name = "SkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
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
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
