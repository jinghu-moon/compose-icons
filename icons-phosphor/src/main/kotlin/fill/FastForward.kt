package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FastForward: ImageVector
    get() {
        if (_fastForward != null) return _fastForward!!
        _fastForward = phosphorFillIcon(
            name = "FastForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(256.0f, 128.0f),
                    PathNode.CurveTo(256.00827f, 133.41003f, 253.24103f, 138.44618f, 248.67f, 141.34f),
                    PathNode.LineTo(160.48f, 197.5f),
                    PathNode.CurveTo(155.59225f, 200.62497f, 149.391f, 200.8418f, 144.29695f, 198.06586f),
                    PathNode.CurveTo(139.20285f, 195.28992f, 136.02353f, 189.96129f, 136.0f, 184.16f),
                    PathNode.LineTo(136.0f, 146.86f),
                    PathNode.LineTo(56.48f, 197.5f),
                    PathNode.CurveTo(51.592247f, 200.62497f, 45.391014f, 200.8418f, 40.29693f, 198.06586f),
                    PathNode.CurveTo(35.202847f, 195.28992f, 32.023525f, 189.96129f, 32.0f, 184.16f),
                    PathNode.LineTo(32.0f, 71.84f),
                    PathNode.CurveTo(32.023525f, 66.03871f, 35.202847f, 60.710083f, 40.29693f, 57.934143f),
                    PathNode.CurveTo(45.391014f, 55.1582f, 51.592247f, 55.37503f, 56.48f, 58.5f),
                    PathNode.LineTo(136.0f, 109.14f),
                    PathNode.LineTo(136.0f, 71.84f),
                    PathNode.CurveTo(136.02353f, 66.03871f, 139.20285f, 60.710083f, 144.29695f, 57.934143f),
                    PathNode.CurveTo(149.391f, 55.1582f, 155.59225f, 55.37503f, 160.48f, 58.5f),
                    PathNode.LineTo(248.67f, 114.66f),
                    PathNode.CurveTo(253.24103f, 117.55382f, 256.00827f, 122.589966f, 256.0f, 128.0f),
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
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
