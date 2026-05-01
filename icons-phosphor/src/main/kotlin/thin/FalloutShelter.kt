package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FalloutShelter: ImageVector
    get() {
        if (_falloutShelter != null) return _falloutShelter!!
        _falloutShelter = phosphorThinIcon(
            name = "FalloutShelter",
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
                    PathNode.MoveTo(195.53f, 126.11f),
                    PathNode.CurveTo(194.83267f, 124.80932f, 193.47581f, 123.998276f, 192.0f, 124.0f),
                    PathNode.LineTo(135.47f, 124.0f),
                    PathNode.LineTo(163.33f, 82.22f),
                    PathNode.CurveTo(164.14912f, 80.99226f, 164.22563f, 79.41322f, 163.52902f, 78.11206f),
                    PathNode.CurveTo(162.83241f, 76.81089f, 161.4759f, 75.99904f, 160.0f, 76.0f),
                    PathNode.LineTo(96.0f, 76.0f),
                    PathNode.CurveTo(94.52409f, 75.99904f, 93.16758f, 76.81089f, 92.47098f, 78.11206f),
                    PathNode.CurveTo(91.77437f, 79.41322f, 91.85087f, 80.99226f, 92.67f, 82.22f),
                    PathNode.LineTo(120.53f, 124.0f),
                    PathNode.LineTo(64.0f, 124.0f),
                    PathNode.CurveTo(62.524094f, 123.99904f, 61.167583f, 124.81089f, 60.47097f, 126.11206f),
                    PathNode.CurveTo(59.77437f, 127.41322f, 59.850872f, 128.99226f, 60.67f, 130.22f),
                    PathNode.LineTo(92.67f, 178.22f),
                    PathNode.CurveTo(93.4116f, 179.33435f, 94.66144f, 180.0039f, 96.0f, 180.0039f),
                    PathNode.CurveTo(97.33856f, 180.0039f, 98.5884f, 179.33435f, 99.33f, 178.22f),
                    PathNode.LineTo(128.0f, 135.22f),
                    PathNode.LineTo(156.67f, 178.22f),
                    PathNode.CurveTo(157.41159f, 179.33435f, 158.66144f, 180.0039f, 160.0f, 180.0039f),
                    PathNode.CurveTo(161.33856f, 180.0039f, 162.58841f, 179.33435f, 163.33f, 178.22f),
                    PathNode.LineTo(195.33f, 130.22f),
                    PathNode.CurveTo(196.15025f, 128.99196f, 196.22714f, 127.41188f, 195.53f, 126.11f),
                    PathNode.Close,
                    PathNode.MoveTo(152.53f, 84.0f),
                    PathNode.LineTo(128.0f, 120.79f),
                    PathNode.LineTo(103.47f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 168.79f),
                    PathNode.LineTo(71.47f, 132.0f),
                    PathNode.LineTo(120.53f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 168.79f),
                    PathNode.LineTo(135.47f, 132.0f),
                    PathNode.LineTo(184.53f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _falloutShelter!!
    }

private var _falloutShelter: ImageVector? = null
