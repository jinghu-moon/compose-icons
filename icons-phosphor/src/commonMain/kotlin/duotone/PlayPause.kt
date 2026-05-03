package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PlayPause: ImageVector
    get() {
        if (_playPause != null) return _playPause!!
        _playPause = phosphorDuotoneIcon(
            name = "PlayPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.37f, 134.59f),
                    PathNode.LineTo(44.18f, 190.74f),
                    PathNode.CurveTo(41.755924f, 192.29468f, 38.678448f, 192.4091f, 36.14562f, 191.03871f),
                    PathNode.CurveTo(33.61279f, 189.66832f, 32.024857f, 187.02968f, 32.0f, 184.15f),
                    PathNode.LineTo(32.0f, 71.85f),
                    PathNode.CurveTo(32.024857f, 68.970314f, 33.61279f, 66.33167f, 36.14562f, 64.96129f),
                    PathNode.CurveTo(38.678448f, 63.590897f, 41.755924f, 63.705315f, 44.18f, 65.26f),
                    PathNode.LineTo(132.37f, 121.41f),
                    PathNode.CurveTo(134.62842f, 122.84001f, 135.99724f, 125.32692f, 135.99724f, 128.0f),
                    PathNode.CurveTo(135.99724f, 130.67308f, 134.62842f, 133.15999f, 132.37f, 134.59f),
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
                    PathNode.MoveTo(184.0f, 64.0f),
                    PathNode.LineTo(184.0f, 192.0f),
                    PathNode.CurveTo(184.0f, 196.41827f, 180.41827f, 200.0f, 176.0f, 200.0f),
                    PathNode.CurveTo(171.58173f, 200.0f, 168.0f, 196.41827f, 168.0f, 192.0f),
                    PathNode.LineTo(168.0f, 64.0f),
                    PathNode.CurveTo(168.0f, 59.581722f, 171.58173f, 56.0f, 176.0f, 56.0f),
                    PathNode.CurveTo(180.41827f, 56.0f, 184.0f, 59.581722f, 184.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 56.0f),
                    PathNode.CurveTo(219.58173f, 56.0f, 216.0f, 59.581722f, 216.0f, 64.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.CurveTo(216.0f, 196.41827f, 219.58173f, 200.0f, 224.0f, 200.0f),
                    PathNode.CurveTo(228.41827f, 200.0f, 232.0f, 196.41827f, 232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.CurveTo(232.0f, 59.581722f, 228.41827f, 56.0f, 224.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 128.0f),
                    PathNode.CurveTo(144.00827f, 133.41003f, 141.24103f, 138.44618f, 136.67f, 141.34f),
                    PathNode.LineTo(48.48f, 197.49f),
                    PathNode.CurveTo(43.592247f, 200.61497f, 37.391014f, 200.8318f, 32.29693f, 198.05586f),
                    PathNode.CurveTo(27.202847f, 195.27992f, 24.023523f, 189.9513f, 24.0f, 184.15f),
                    PathNode.LineTo(24.0f, 71.85f),
                    PathNode.CurveTo(24.023523f, 66.048706f, 27.202847f, 60.720085f, 32.29693f, 57.94414f),
                    PathNode.CurveTo(37.391014f, 55.1682f, 43.592247f, 55.385033f, 48.48f, 58.51f),
                    PathNode.LineTo(136.67f, 114.66f),
                    PathNode.CurveTo(141.24103f, 117.55382f, 144.00827f, 122.589966f, 144.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(127.82f, 128.0f),
                    PathNode.LineTo(40.0f, 72.08f),
                    PathNode.LineTo(40.0f, 183.93f),
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
        return _playPause!!
    }

private var _playPause: ImageVector? = null
