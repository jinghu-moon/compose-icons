package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpeakerHifi: ImageVector
    get() {
        if (_speakerHifi != null) return _speakerHifi!!
        _speakerHifi = phosphorThinIcon(
            name = "SpeakerHifi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 28.0f),
                    PathNode.LineTo(64.0f, 28.0f),
                    PathNode.CurveTo(57.37258f, 28.0f, 52.0f, 33.37258f, 52.0f, 40.0f),
                    PathNode.LineTo(52.0f, 216.0f),
                    PathNode.CurveTo(52.0f, 222.62741f, 57.37258f, 228.0f, 64.0f, 228.0f),
                    PathNode.LineTo(192.0f, 228.0f),
                    PathNode.CurveTo(198.62741f, 228.0f, 204.0f, 222.62741f, 204.0f, 216.0f),
                    PathNode.LineTo(204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 33.37258f, 198.62741f, 28.0f, 192.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 216.0f),
                    PathNode.CurveTo(196.0f, 218.20914f, 194.20914f, 220.0f, 192.0f, 220.0f),
                    PathNode.LineTo(64.0f, 220.0f),
                    PathNode.CurveTo(61.79086f, 220.0f, 60.0f, 218.20914f, 60.0f, 216.0f),
                    PathNode.LineTo(60.0f, 40.0f),
                    PathNode.CurveTo(60.0f, 37.79086f, 61.79086f, 36.0f, 64.0f, 36.0f),
                    PathNode.LineTo(192.0f, 36.0f),
                    PathNode.CurveTo(194.20914f, 36.0f, 196.0f, 37.79086f, 196.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 76.0f),
                    PathNode.CurveTo(120.0f, 71.58172f, 123.58172f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(132.41827f, 68.0f, 136.0f, 71.58172f, 136.0f, 76.0f),
                    PathNode.CurveTo(136.0f, 80.41828f, 132.41827f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(123.58172f, 84.0f, 120.0f, 80.41828f, 120.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 116.0f),
                    PathNode.CurveTo(108.11775f, 116.0f, 92.0f, 132.11775f, 92.0f, 152.0f),
                    PathNode.CurveTo(92.0f, 171.88223f, 108.11775f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(147.88223f, 188.0f, 164.0f, 171.88223f, 164.0f, 152.0f),
                    PathNode.CurveTo(164.0f, 132.11775f, 147.88223f, 116.0f, 128.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 180.0f),
                    PathNode.CurveTo(112.536026f, 180.0f, 100.0f, 167.46397f, 100.0f, 152.0f),
                    PathNode.CurveTo(100.0f, 136.53603f, 112.536026f, 124.0f, 128.0f, 124.0f),
                    PathNode.CurveTo(143.46397f, 124.0f, 156.0f, 136.53603f, 156.0f, 152.0f),
                    PathNode.CurveTo(156.0f, 167.46397f, 143.46397f, 180.0f, 128.0f, 180.0f),
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
        return _speakerHifi!!
    }

private var _speakerHifi: ImageVector? = null
