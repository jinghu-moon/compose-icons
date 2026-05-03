package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FastForward: ImageVector
    get() {
        if (_fastForward != null) return _fastForward!!
        _fastForward = phosphorRegularIcon(
            name = "FastForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.67f, 114.66f),
                    PathNode.LineTo(160.48f, 58.5f),
                    PathNode.CurveTo(155.59225f, 55.37503f, 149.391f, 55.1582f, 144.29695f, 57.934143f),
                    PathNode.CurveTo(139.20285f, 60.710083f, 136.02353f, 66.03871f, 136.0f, 71.84f),
                    PathNode.LineTo(136.0f, 109.14f),
                    PathNode.LineTo(56.48f, 58.5f),
                    PathNode.CurveTo(51.592247f, 55.37503f, 45.391014f, 55.1582f, 40.29693f, 57.934143f),
                    PathNode.CurveTo(35.202847f, 60.710083f, 32.023525f, 66.03871f, 32.0f, 71.84f),
                    PathNode.LineTo(32.0f, 184.16f),
                    PathNode.CurveTo(32.030125f, 189.9584f, 35.210487f, 195.28186f, 40.302063f, 198.05644f),
                    PathNode.CurveTo(45.393635f, 200.83102f, 51.5911f, 200.61786f, 56.48f, 197.5f),
                    PathNode.LineTo(136.0f, 146.86f),
                    PathNode.LineTo(136.0f, 184.16f),
                    PathNode.CurveTo(136.03012f, 189.9584f, 139.2105f, 195.28186f, 144.30206f, 198.05644f),
                    PathNode.CurveTo(149.39363f, 200.83102f, 155.5911f, 200.61786f, 160.48f, 197.5f),
                    PathNode.LineTo(248.67f, 141.34f),
                    PathNode.CurveTo(253.23663f, 138.44164f, 256.00333f, 133.40875f, 256.00333f, 128.0f),
                    PathNode.CurveTo(256.00333f, 122.591255f, 253.23663f, 117.55836f, 248.67f, 114.66f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 183.94f),
                    PathNode.LineTo(48.0f, 72.07f),
                    PathNode.LineTo(135.82f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 183.94f),
                    PathNode.LineTo(152.0f, 72.07f),
                    PathNode.LineTo(239.82f, 128.0f),
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
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
