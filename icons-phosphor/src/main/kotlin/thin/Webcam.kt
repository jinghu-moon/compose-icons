package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Webcam: ImageVector
    get() {
        if (_webcam != null) return _webcam!!
        _webcam = phosphorThinIcon(
            name = "Webcam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 104.0f),
                    PathNode.CurveTo(164.0f, 84.11775f, 147.88223f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(108.11775f, 68.0f, 92.0f, 84.11775f, 92.0f, 104.0f),
                    PathNode.CurveTo(92.0f, 123.88225f, 108.11775f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(147.88223f, 140.0f, 164.0f, 123.88225f, 164.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 104.0f),
                    PathNode.CurveTo(100.0f, 88.536026f, 112.536026f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(143.46397f, 76.0f, 156.0f, 88.536026f, 156.0f, 104.0f),
                    PathNode.CurveTo(156.0f, 119.463974f, 143.46397f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(112.536026f, 132.0f, 100.0f, 119.463974f, 100.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 204.0f),
                    PathNode.LineTo(132.0f, 204.0f),
                    PathNode.LineTo(132.0f, 179.89f),
                    PathNode.CurveTo(173.13725f, 177.72188f, 205.0581f, 143.17471f, 203.97366f, 101.99465f),
                    PathNode.CurveTo(202.88922f, 60.814575f, 169.19435f, 27.995337f, 128.0f, 27.995337f),
                    PathNode.CurveTo(86.80566f, 27.995337f, 53.110775f, 60.814575f, 52.02634f, 101.99465f),
                    PathNode.CurveTo(50.941902f, 143.17471f, 82.86275f, 177.72188f, 124.0f, 179.89f),
                    PathNode.LineTo(124.0f, 204.0f),
                    PathNode.LineTo(32.0f, 204.0f),
                    PathNode.CurveTo(29.790861f, 204.0f, 28.0f, 205.79086f, 28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 210.20914f, 29.790861f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(226.20914f, 212.0f, 228.0f, 210.20914f, 228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 205.79086f, 226.20914f, 204.0f, 224.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 104.0f),
                    PathNode.CurveTo(60.0f, 66.44463f, 90.44463f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(165.55536f, 36.0f, 196.0f, 66.44463f, 196.0f, 104.0f),
                    PathNode.CurveTo(196.0f, 141.55536f, 165.55536f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(90.46063f, 171.96141f, 60.038586f, 141.53935f, 60.0f, 104.0f),
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
        return _webcam!!
    }

private var _webcam: ImageVector? = null
