package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleCircle: ImageVector
    get() {
        if (_personSimpleCircle != null) return _personSimpleCircle!!
        _personSimpleCircle = phosphorThinIcon(
            name = "PersonSimpleCircle",
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
                    PathNode.MoveTo(116.0f, 80.0f),
                    PathNode.CurveTo(116.0f, 73.37258f, 121.37258f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(134.62741f, 68.0f, 140.0f, 73.37258f, 140.0f, 80.0f),
                    PathNode.CurveTo(140.0f, 86.62742f, 134.62741f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(121.37258f, 92.0f, 116.0f, 86.62742f, 116.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 112.0f),
                    PathNode.CurveTo(180.0f, 114.20914f, 178.20914f, 116.0f, 176.0f, 116.0f),
                    PathNode.LineTo(132.0f, 116.0f),
                    PathNode.LineTo(132.0f, 134.79f),
                    PathNode.LineTo(163.33f, 181.79f),
                    PathNode.CurveTo(164.55608f, 183.6291f, 164.05911f, 186.11392f, 162.22f, 187.34f),
                    PathNode.CurveTo(160.38089f, 188.56607f, 157.89607f, 188.0691f, 156.67f, 186.23f),
                    PathNode.LineTo(128.0f, 143.23f),
                    PathNode.LineTo(99.33f, 186.23f),
                    PathNode.CurveTo(98.10393f, 188.0691f, 95.61911f, 188.56607f, 93.78f, 187.34f),
                    PathNode.CurveTo(91.940895f, 186.11392f, 91.44393f, 183.6291f, 92.67f, 181.79f),
                    PathNode.LineTo(124.0f, 134.79f),
                    PathNode.LineTo(124.0f, 116.0f),
                    PathNode.LineTo(80.0f, 116.0f),
                    PathNode.CurveTo(77.79086f, 116.0f, 76.0f, 114.20914f, 76.0f, 112.0f),
                    PathNode.CurveTo(76.0f, 109.79086f, 77.79086f, 108.0f, 80.0f, 108.0f),
                    PathNode.LineTo(176.0f, 108.0f),
                    PathNode.CurveTo(178.20914f, 108.0f, 180.0f, 109.79086f, 180.0f, 112.0f),
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
        return _personSimpleCircle!!
    }

private var _personSimpleCircle: ImageVector? = null
