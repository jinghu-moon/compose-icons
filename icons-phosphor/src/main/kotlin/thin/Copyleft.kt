package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Copyleft: ImageVector
    get() {
        if (_copyleft != null) return _copyleft!!
        _copyleft = phosphorThinIcon(
            name = "Copyleft",
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
                    PathNode.MoveTo(172.0f, 128.0f),
                    PathNode.CurveTo(172.0043f, 146.94078f, 159.88689f, 163.75885f, 141.91876f, 169.7505f),
                    PathNode.CurveTo(123.950645f, 175.74213f, 104.16447f, 169.56262f, 92.8f, 154.41f),
                    PathNode.CurveTo(91.47175f, 152.64268f, 91.82769f, 150.13322f, 93.595f, 148.805f),
                    PathNode.CurveTo(95.36231f, 147.47676f, 97.87176f, 147.83269f, 99.2f, 149.6f),
                    PathNode.CurveTo(108.4973f, 161.9964f, 124.68388f, 167.0527f, 139.3842f, 162.1526f),
                    PathNode.CurveTo(154.08452f, 157.25249f, 164.0f, 143.4955f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 112.50451f, 154.08452f, 98.747505f, 139.3842f, 93.847404f),
                    PathNode.CurveTo(124.68388f, 88.947296f, 108.4973f, 94.0036f, 99.2f, 106.4f),
                    PathNode.CurveTo(97.87176f, 108.16731f, 95.36231f, 108.52325f, 93.595f, 107.195f),
                    PathNode.CurveTo(91.82769f, 105.86675f, 91.47175f, 103.35731f, 92.8f, 101.59f),
                    PathNode.CurveTo(104.16447f, 86.43738f, 123.950645f, 80.25787f, 141.91876f, 86.24951f),
                    PathNode.CurveTo(159.88689f, 92.24116f, 172.0043f, 109.05922f, 172.0f, 128.0f),
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
        return _copyleft!!
    }

private var _copyleft: ImageVector? = null
