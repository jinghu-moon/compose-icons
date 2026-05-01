package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) return _lifebuoy!!
        _lifebuoy = phosphorThinIcon(
            name = "Lifebuoy",
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
                    PathNode.MoveTo(195.79f, 190.13f),
                    PathNode.LineTo(161.79f, 156.13f),
                    PathNode.CurveTo(175.38864f, 139.83434f, 175.38864f, 116.145676f, 161.79f, 99.85f),
                    PathNode.LineTo(195.79f, 65.85f),
                    PathNode.CurveTo(228.06854f, 100.981346f, 228.06854f, 154.97865f, 195.79f, 190.11f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 108.11775f, 108.11775f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(147.88223f, 92.0f, 164.0f, 108.11775f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 147.88223f, 147.88223f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(108.11775f, 164.0f, 92.0f, 147.88223f, 92.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.13f, 60.21f),
                    PathNode.LineTo(156.13f, 94.21f),
                    PathNode.CurveTo(139.83434f, 80.61135f, 116.145676f, 80.61135f, 99.85f, 94.21f),
                    PathNode.LineTo(65.85f, 60.21f),
                    PathNode.CurveTo(100.981346f, 27.931456f, 154.97865f, 27.931456f, 190.11f, 60.21f),
                    PathNode.Close,
                    PathNode.MoveTo(60.21f, 65.87f),
                    PathNode.LineTo(94.21f, 99.87f),
                    PathNode.CurveTo(80.61135f, 116.16567f, 80.61135f, 139.85432f, 94.21f, 156.15f),
                    PathNode.LineTo(60.21f, 190.15f),
                    PathNode.CurveTo(27.931456f, 155.01866f, 27.931456f, 101.02135f, 60.21f, 65.89f),
                    PathNode.Close,
                    PathNode.MoveTo(65.87f, 195.79f),
                    PathNode.LineTo(99.87f, 161.79f),
                    PathNode.CurveTo(116.16567f, 175.38864f, 139.85432f, 175.38864f, 156.15f, 161.79f),
                    PathNode.LineTo(190.15f, 195.79f),
                    PathNode.CurveTo(155.01866f, 228.06854f, 101.02135f, 228.06854f, 65.89f, 195.79f),
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
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
