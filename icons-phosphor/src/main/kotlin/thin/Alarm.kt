package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Alarm: ImageVector
    get() {
        if (_alarm != null) return _alarm!!
        _alarm = phosphorThinIcon(
            name = "Alarm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 44.0f),
                    PathNode.CurveTo(77.18981f, 44.0f, 36.0f, 85.18981f, 36.0f, 136.0f),
                    PathNode.CurveTo(36.0f, 186.8102f, 77.18981f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(178.8102f, 228.0f, 220.0f, 186.8102f, 220.0f, 136.0f),
                    PathNode.CurveTo(219.94489f, 85.21265f, 178.78735f, 44.055115f, 128.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(81.60808f, 220.0f, 44.0f, 182.39192f, 44.0f, 136.0f),
                    PathNode.CurveTo(44.0f, 89.60808f, 81.60808f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(174.39192f, 52.0f, 212.0f, 89.60808f, 212.0f, 136.0f),
                    PathNode.CurveTo(211.9504f, 182.37135f, 174.37135f, 219.9504f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(58.83f, 34.83f),
                    PathNode.LineTo(26.83f, 66.83f),
                    PathNode.CurveTo(25.267035f, 68.39297f, 22.732965f, 68.39297f, 21.17f, 66.83f),
                    PathNode.CurveTo(19.607035f, 65.26704f, 19.607035f, 62.732967f, 21.17f, 61.17f),
                    PathNode.LineTo(53.17f, 29.17f),
                    PathNode.CurveTo(54.732967f, 27.607035f, 57.267033f, 27.607035f, 58.83f, 29.17f),
                    PathNode.CurveTo(60.392967f, 30.732965f, 60.392967f, 33.267033f, 58.83f, 34.83f),
                    PathNode.Close,
                    PathNode.MoveTo(234.83f, 66.83f),
                    PathNode.CurveTo(234.07973f, 67.581116f, 233.06163f, 68.00314f, 232.0f, 68.00314f),
                    PathNode.CurveTo(230.93837f, 68.00314f, 229.92027f, 67.581116f, 229.17f, 66.83f),
                    PathNode.LineTo(197.17f, 34.83f),
                    PathNode.CurveTo(195.60704f, 33.267033f, 195.60704f, 30.732965f, 197.17f, 29.17f),
                    PathNode.CurveTo(198.73297f, 27.607035f, 201.26703f, 27.607035f, 202.83f, 29.17f),
                    PathNode.LineTo(234.83f, 61.17f),
                    PathNode.CurveTo(235.58112f, 61.920273f, 236.00314f, 62.938362f, 236.00314f, 64.0f),
                    PathNode.CurveTo(236.00314f, 65.06164f, 235.58112f, 66.07973f, 234.83f, 66.83f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 136.0f),
                    PathNode.CurveTo(188.0f, 138.20914f, 186.20914f, 140.0f, 184.0f, 140.0f),
                    PathNode.LineTo(128.0f, 140.0f),
                    PathNode.CurveTo(125.79086f, 140.0f, 124.0f, 138.20914f, 124.0f, 136.0f),
                    PathNode.LineTo(124.0f, 80.0f),
                    PathNode.CurveTo(124.0f, 77.79086f, 125.79086f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(130.20914f, 76.0f, 132.0f, 77.79086f, 132.0f, 80.0f),
                    PathNode.LineTo(132.0f, 132.0f),
                    PathNode.LineTo(184.0f, 132.0f),
                    PathNode.CurveTo(186.20914f, 132.0f, 188.0f, 133.79086f, 188.0f, 136.0f),
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
        return _alarm!!
    }

private var _alarm: ImageVector? = null
