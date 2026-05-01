package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = phosphorThinIcon(
            name = "Copyright",
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
                    PathNode.MoveTo(163.2f, 154.41f),
                    PathNode.CurveTo(151.83371f, 169.55608f, 132.05157f, 175.73093f, 114.08755f, 169.74008f),
                    PathNode.CurveTo(96.12353f, 163.74925f, 84.0075f, 146.93663f, 84.0075f, 128.0f),
                    PathNode.CurveTo(84.0075f, 109.06336f, 96.12353f, 92.250755f, 114.08755f, 86.25991f),
                    PathNode.CurveTo(132.05157f, 80.269066f, 151.83371f, 86.44392f, 163.2f, 101.59f),
                    PathNode.CurveTo(164.52824f, 103.35731f, 164.17232f, 105.86675f, 162.405f, 107.195f),
                    PathNode.CurveTo(160.6377f, 108.52325f, 158.12825f, 108.16731f, 156.8f, 106.4f),
                    PathNode.CurveTo(147.5027f, 94.0036f, 131.31612f, 88.947296f, 116.6158f, 93.847404f),
                    PathNode.CurveTo(101.91548f, 98.747505f, 92.0f, 112.50451f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 143.4955f, 101.91548f, 157.25249f, 116.6158f, 162.1526f),
                    PathNode.CurveTo(131.31612f, 167.0527f, 147.5027f, 161.9964f, 156.8f, 149.6f),
                    PathNode.CurveTo(158.12825f, 147.83269f, 160.6377f, 147.47676f, 162.405f, 148.805f),
                    PathNode.CurveTo(164.17232f, 150.13322f, 164.52824f, 152.64268f, 163.2f, 154.41f),
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
        return _copyright!!
    }

private var _copyright: ImageVector? = null
