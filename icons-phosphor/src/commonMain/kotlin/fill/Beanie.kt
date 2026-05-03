package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Beanie: ImageVector
    get() {
        if (_beanie != null) return _beanie!!
        _beanie = phosphorFillIcon(
            name = "Beanie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 162.16f),
                    PathNode.LineTo(224.0f, 144.0f),
                    PathNode.CurveTo(223.91853f, 100.12979f, 194.16127f, 61.87399f, 151.66f, 51.0f),
                    PathNode.CurveTo(159.08002f, 39.275414f, 156.79419f, 23.885004f, 146.28691f, 14.823027f),
                    PathNode.CurveTo(135.77962f, 5.761049f, 120.22038f, 5.761049f, 109.7131f, 14.823027f),
                    PathNode.CurveTo(99.2058f, 23.885004f, 96.91998f, 39.275414f, 104.34f, 51.0f),
                    PathNode.CurveTo(61.83873f, 61.87399f, 32.08147f, 100.12979f, 32.0f, 144.0f),
                    PathNode.LineTo(32.0f, 162.16f),
                    PathNode.CurveTo(27.054655f, 165.0152f, 24.005857f, 170.28961f, 24.0f, 176.0f),
                    PathNode.LineTo(24.0f, 208.0f),
                    PathNode.CurveTo(24.0f, 216.83656f, 31.163445f, 224.0f, 40.0f, 224.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(224.83656f, 224.0f, 232.0f, 216.83656f, 232.0f, 208.0f),
                    PathNode.LineTo(232.0f, 176.0f),
                    PathNode.CurveTo(231.99414f, 170.28961f, 228.94534f, 165.0152f, 224.0f, 162.16f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 176.0f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.LineTo(80.0f, 208.0f),
                    PathNode.LineTo(80.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 176.0f),
                    PathNode.LineTo(176.0f, 176.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 36.0f),
                    PathNode.CurveTo(116.0f, 29.372583f, 121.37258f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(134.62741f, 24.0f, 140.0f, 29.372583f, 140.0f, 36.0f),
                    PathNode.CurveTo(140.0f, 42.62742f, 134.62741f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(121.37258f, 48.0f, 116.0f, 42.62742f, 116.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 176.0f),
                    PathNode.LineTo(64.0f, 176.0f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 208.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.LineTo(216.0f, 176.0f),
                    PathNode.LineTo(216.0f, 208.0f),
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
        return _beanie!!
    }

private var _beanie: ImageVector? = null
