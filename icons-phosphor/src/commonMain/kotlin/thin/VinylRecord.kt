package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.VinylRecord: ImageVector
    get() {
        if (_vinylRecord != null) return _vinylRecord!!
        _vinylRecord = phosphorThinIcon(
            name = "VinylRecord",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(77.18981f, 220.0f, 36.0f, 178.8102f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 77.18981f, 77.18981f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(178.8102f, 36.0f, 220.0f, 77.18981f, 220.0f, 128.0f),
                    PathNode.CurveTo(219.94489f, 178.78735f, 178.78735f, 219.94489f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 68.0f),
                    PathNode.CurveTo(94.87891f, 68.038574f, 68.038574f, 94.87891f, 68.0f, 128.0f),
                    PathNode.CurveTo(68.0f, 130.20914f, 66.20914f, 132.0f, 64.0f, 132.0f),
                    PathNode.CurveTo(61.79086f, 132.0f, 60.0f, 130.20914f, 60.0f, 128.0f),
                    PathNode.CurveTo(60.038586f, 90.46063f, 90.46063f, 60.038586f, 128.0f, 60.0f),
                    PathNode.CurveTo(130.20914f, 60.0f, 132.0f, 61.79086f, 132.0f, 64.0f),
                    PathNode.CurveTo(132.0f, 66.20914f, 130.20914f, 68.0f, 128.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 128.0f),
                    PathNode.CurveTo(195.96141f, 165.53935f, 165.53935f, 195.96141f, 128.0f, 196.0f),
                    PathNode.CurveTo(125.79086f, 196.0f, 124.0f, 194.20914f, 124.0f, 192.0f),
                    PathNode.CurveTo(124.0f, 189.79086f, 125.79086f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(161.1211f, 187.96143f, 187.96143f, 161.1211f, 188.0f, 128.0f),
                    PathNode.CurveTo(188.0f, 125.79086f, 189.79086f, 124.0f, 192.0f, 124.0f),
                    PathNode.CurveTo(194.20914f, 124.0f, 196.0f, 125.79086f, 196.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 112.536026f, 143.46397f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(112.536026f, 100.0f, 100.0f, 112.536026f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 143.46397f, 112.536026f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(143.46397f, 156.0f, 156.0f, 143.46397f, 156.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 116.95431f, 116.95431f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(139.0457f, 108.0f, 148.0f, 116.95431f, 148.0f, 128.0f),
                    PathNode.CurveTo(148.0f, 139.0457f, 139.0457f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(116.95431f, 148.0f, 108.0f, 139.0457f, 108.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _vinylRecord!!
    }

private var _vinylRecord: ImageVector? = null
