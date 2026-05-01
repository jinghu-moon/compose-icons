package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SkipBack: ImageVector
    get() {
        if (_skipBack != null) return _skipBack!!
        _skipBack = phosphorFillIcon(
            name = "SkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 47.88f),
                    PathNode.LineTo(208.0f, 208.12f),
                    PathNode.CurveTo(207.93916f, 213.89557f, 204.77022f, 219.19002f, 199.70872f, 221.97249f),
                    PathNode.CurveTo(194.64723f, 224.75497f, 188.47897f, 224.59349f, 183.57f, 221.55f),
                    PathNode.LineTo(64.0f, 146.77f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.CurveTo(64.0f, 220.41827f, 60.418278f, 224.0f, 56.0f, 224.0f),
                    PathNode.CurveTo(51.581722f, 224.0f, 48.0f, 220.41827f, 48.0f, 216.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(48.0f, 35.581722f, 51.581722f, 32.0f, 56.0f, 32.0f),
                    PathNode.CurveTo(60.418278f, 32.0f, 64.0f, 35.581722f, 64.0f, 40.0f),
                    PathNode.LineTo(64.0f, 109.23f),
                    PathNode.LineTo(183.57f, 34.45f),
                    PathNode.CurveTo(188.47363f, 31.37174f, 194.6603f, 31.192472f, 199.73395f, 33.98163f),
                    PathNode.CurveTo(204.80759f, 36.770782f, 207.97137f, 42.090317f, 208.0f, 47.88f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
