package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) return _bookBookmark!!
        _bookBookmark = phosphorDuotoneIcon(
            name = "BookBookmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(208.0f, 192.0f),
                    PathNode.LineTo(72.0f, 192.0f),
                    PathNode.CurveTo(58.745167f, 192.0f, 48.0f, 202.74516f, 48.0f, 216.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.CurveTo(48.0f, 42.745167f, 58.745167f, 32.0f, 72.0f, 32.0f),
                    PathNode.LineTo(112.0f, 32.0f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.LineTo(144.0f, 104.0f),
                    PathNode.LineTo(176.0f, 128.0f),
                    PathNode.LineTo(176.0f, 32.0f),
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
                    PathNode.MoveTo(208.0f, 24.0f),
                    PathNode.LineTo(72.0f, 24.0f),
                    PathNode.CurveTo(54.32689f, 24.0f, 40.0f, 38.32689f, 40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.CurveTo(40.0f, 228.41827f, 43.581722f, 232.0f, 48.0f, 232.0f),
                    PathNode.LineTo(192.0f, 232.0f),
                    PathNode.CurveTo(196.41827f, 232.0f, 200.0f, 228.41827f, 200.0f, 224.0f),
                    PathNode.CurveTo(200.0f, 219.58173f, 196.41827f, 216.0f, 192.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(56.0f, 207.16344f, 63.163445f, 200.0f, 72.0f, 200.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(212.41827f, 200.0f, 216.0f, 196.41827f, 216.0f, 192.0f),
                    PathNode.LineTo(216.0f, 32.0f),
                    PathNode.CurveTo(216.0f, 27.581722f, 212.41827f, 24.0f, 208.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 40.0f),
                    PathNode.LineTo(168.0f, 40.0f),
                    PathNode.LineTo(168.0f, 112.0f),
                    PathNode.LineTo(148.79f, 97.6f),
                    PathNode.CurveTo(145.94556f, 95.46667f, 142.03444f, 95.46667f, 139.19f, 97.6f),
                    PathNode.LineTo(120.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 184.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.CurveTo(66.381454f, 183.99234f, 60.86105f, 185.47249f, 56.0f, 188.29f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.CurveTo(56.0f, 47.163445f, 63.163445f, 40.0f, 72.0f, 40.0f),
                    PathNode.LineTo(104.0f, 40.0f),
                    PathNode.LineTo(104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 131.03018f, 105.71202f, 133.80028f, 108.422295f, 135.15541f),
                    PathNode.CurveTo(111.13256f, 136.51056f, 114.37586f, 136.21811f, 116.8f, 134.4f),
                    PathNode.LineTo(144.0f, 114.0f),
                    PathNode.LineTo(171.21f, 134.4f),
                    PathNode.CurveTo(172.59203f, 135.43652f, 174.27246f, 135.99783f, 176.0f, 136.0f),
                    PathNode.CurveTo(177.24194f, 135.99815f, 178.46684f, 135.71075f, 179.58f, 135.16f),
                    PathNode.CurveTo(182.29086f, 133.80348f, 184.00217f, 131.03131f, 184.0f, 128.0f),
                    PathNode.LineTo(184.0f, 40.0f),
                    PathNode.LineTo(200.0f, 40.0f),
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
        return _bookBookmark!!
    }

private var _bookBookmark: ImageVector? = null
