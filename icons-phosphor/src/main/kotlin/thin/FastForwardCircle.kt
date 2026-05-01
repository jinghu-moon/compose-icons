package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) return _fastForwardCircle!!
        _fastForwardCircle = phosphorThinIcon(
            name = "FastForwardCircle",
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
                    PathNode.MoveTo(190.4f, 124.8f),
                    PathNode.LineTo(142.4f, 88.8f),
                    PathNode.CurveTo(141.18793f, 87.890945f, 139.56628f, 87.74472f, 138.21115f, 88.422295f),
                    PathNode.CurveTo(136.856f, 89.09986f, 136.0f, 90.48491f, 136.0f, 92.0f),
                    PathNode.LineTo(136.0f, 164.0f),
                    PathNode.CurveTo(135.99892f, 165.51566f, 136.85457f, 166.90175f, 138.21f, 167.58f),
                    PathNode.CurveTo(138.76657f, 167.85538f, 139.37903f, 167.99908f, 140.0f, 168.0f),
                    PathNode.CurveTo(140.86548f, 168.0f, 141.70761f, 167.71928f, 142.4f, 167.2f),
                    PathNode.LineTo(190.4f, 131.2f),
                    PathNode.CurveTo(191.40723f, 130.44458f, 192.0f, 129.25903f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 126.740974f, 191.40723f, 125.55541f, 190.4f, 124.8f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 156.0f),
                    PathNode.LineTo(144.0f, 100.0f),
                    PathNode.LineTo(181.33f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.4f, 124.8f),
                    PathNode.LineTo(86.4f, 88.8f),
                    PathNode.CurveTo(85.18793f, 87.890945f, 83.56629f, 87.74472f, 82.21114f, 88.422295f),
                    PathNode.CurveTo(80.85601f, 89.09986f, 80.0f, 90.48491f, 80.0f, 92.0f),
                    PathNode.LineTo(80.0f, 164.0f),
                    PathNode.CurveTo(79.99892f, 165.51566f, 80.85457f, 166.90175f, 82.21f, 167.58f),
                    PathNode.CurveTo(82.76658f, 167.85538f, 83.37903f, 167.99908f, 84.0f, 168.0f),
                    PathNode.CurveTo(84.86548f, 168.0f, 85.70762f, 167.71928f, 86.4f, 167.2f),
                    PathNode.LineTo(134.4f, 131.2f),
                    PathNode.CurveTo(135.40723f, 130.44458f, 136.0f, 129.25903f, 136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 126.740974f, 135.40723f, 125.55541f, 134.4f, 124.8f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 156.0f),
                    PathNode.LineTo(88.0f, 100.0f),
                    PathNode.LineTo(125.33f, 128.0f),
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
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null
