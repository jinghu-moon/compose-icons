package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CodeBlock: ImageVector
    get() {
        if (_codeBlock != null) return _codeBlock!!
        _codeBlock = phosphorThinIcon(
            name = "CodeBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(61.17f, 98.83f),
                    PathNode.LineTo(29.17f, 66.83f),
                    PathNode.CurveTo(28.418892f, 66.07973f, 27.996853f, 65.06164f, 27.996853f, 64.0f),
                    PathNode.CurveTo(27.996853f, 62.938362f, 28.418892f, 61.920273f, 29.17f, 61.17f),
                    PathNode.LineTo(61.17f, 29.17f),
                    PathNode.CurveTo(62.732967f, 27.607035f, 65.26704f, 27.607035f, 66.83f, 29.17f),
                    PathNode.CurveTo(68.39297f, 30.732965f, 68.39297f, 33.267033f, 66.83f, 34.83f),
                    PathNode.LineTo(37.66f, 64.0f),
                    PathNode.LineTo(66.83f, 93.17f),
                    PathNode.CurveTo(68.39297f, 94.73296f, 68.39297f, 97.26704f, 66.83f, 98.83f),
                    PathNode.CurveTo(65.26704f, 100.39297f, 62.732967f, 100.39297f, 61.17f, 98.83f),
                    PathNode.Close,
                    PathNode.MoveTo(101.17f, 98.83f),
                    PathNode.CurveTo(101.92027f, 99.581116f, 102.93836f, 100.00314f, 104.0f, 100.00314f),
                    PathNode.CurveTo(105.06164f, 100.00314f, 106.07973f, 99.581116f, 106.83f, 98.83f),
                    PathNode.LineTo(138.83f, 66.83f),
                    PathNode.CurveTo(139.58112f, 66.07973f, 140.00314f, 65.06164f, 140.00314f, 64.0f),
                    PathNode.CurveTo(140.00314f, 62.938362f, 139.58112f, 61.920273f, 138.83f, 61.17f),
                    PathNode.LineTo(106.83f, 29.17f),
                    PathNode.CurveTo(105.26704f, 27.607035f, 102.73296f, 27.607035f, 101.17f, 29.17f),
                    PathNode.CurveTo(99.60703f, 30.732965f, 99.60703f, 33.267033f, 101.17f, 34.83f),
                    PathNode.LineTo(130.34f, 64.0f),
                    PathNode.LineTo(101.17f, 93.17f),
                    PathNode.CurveTo(100.418884f, 93.92027f, 99.99686f, 94.93836f, 99.99686f, 96.0f),
                    PathNode.CurveTo(99.99686f, 97.06164f, 100.418884f, 98.07973f, 101.17f, 98.83f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 44.0f),
                    PathNode.LineTo(176.0f, 44.0f),
                    PathNode.CurveTo(173.79086f, 44.0f, 172.0f, 45.79086f, 172.0f, 48.0f),
                    PathNode.CurveTo(172.0f, 50.20914f, 173.79086f, 52.0f, 176.0f, 52.0f),
                    PathNode.LineTo(200.0f, 52.0f),
                    PathNode.CurveTo(202.20914f, 52.0f, 204.0f, 53.79086f, 204.0f, 56.0f),
                    PathNode.LineTo(204.0f, 200.0f),
                    PathNode.CurveTo(204.0f, 202.20914f, 202.20914f, 204.0f, 200.0f, 204.0f),
                    PathNode.LineTo(56.0f, 204.0f),
                    PathNode.CurveTo(53.79086f, 204.0f, 52.0f, 202.20914f, 52.0f, 200.0f),
                    PathNode.LineTo(52.0f, 136.0f),
                    PathNode.CurveTo(52.0f, 133.79086f, 50.20914f, 132.0f, 48.0f, 132.0f),
                    PathNode.CurveTo(45.79086f, 132.0f, 44.0f, 133.79086f, 44.0f, 136.0f),
                    PathNode.LineTo(44.0f, 200.0f),
                    PathNode.CurveTo(44.0f, 206.62741f, 49.37258f, 212.0f, 56.0f, 212.0f),
                    PathNode.LineTo(200.0f, 212.0f),
                    PathNode.CurveTo(206.62741f, 212.0f, 212.0f, 206.62741f, 212.0f, 200.0f),
                    PathNode.LineTo(212.0f, 56.0f),
                    PathNode.CurveTo(212.0f, 49.37258f, 206.62741f, 44.0f, 200.0f, 44.0f),
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
        return _codeBlock!!
    }

private var _codeBlock: ImageVector? = null
