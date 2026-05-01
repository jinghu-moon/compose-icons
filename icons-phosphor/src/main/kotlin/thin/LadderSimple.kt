package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LadderSimple: ImageVector
    get() {
        if (_ladderSimple != null) return _ladderSimple!!
        _ladderSimple = phosphorThinIcon(
            name = "LadderSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 28.0f),
                    PathNode.CurveTo(189.79086f, 28.0f, 188.0f, 29.790861f, 188.0f, 32.0f),
                    PathNode.LineTo(188.0f, 68.0f),
                    PathNode.LineTo(68.0f, 68.0f),
                    PathNode.LineTo(68.0f, 32.0f),
                    PathNode.CurveTo(68.0f, 29.790861f, 66.20914f, 28.0f, 64.0f, 28.0f),
                    PathNode.CurveTo(61.79086f, 28.0f, 60.0f, 29.790861f, 60.0f, 32.0f),
                    PathNode.LineTo(60.0f, 224.0f),
                    PathNode.CurveTo(60.0f, 226.20914f, 61.79086f, 228.0f, 64.0f, 228.0f),
                    PathNode.CurveTo(66.20914f, 228.0f, 68.0f, 226.20914f, 68.0f, 224.0f),
                    PathNode.LineTo(68.0f, 188.0f),
                    PathNode.LineTo(188.0f, 188.0f),
                    PathNode.LineTo(188.0f, 224.0f),
                    PathNode.CurveTo(188.0f, 226.20914f, 189.79086f, 228.0f, 192.0f, 228.0f),
                    PathNode.CurveTo(194.20914f, 228.0f, 196.0f, 226.20914f, 196.0f, 224.0f),
                    PathNode.LineTo(196.0f, 32.0f),
                    PathNode.CurveTo(196.0f, 29.790861f, 194.20914f, 28.0f, 192.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 76.0f),
                    PathNode.LineTo(188.0f, 124.0f),
                    PathNode.LineTo(68.0f, 124.0f),
                    PathNode.LineTo(68.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 180.0f),
                    PathNode.LineTo(68.0f, 132.0f),
                    PathNode.LineTo(188.0f, 132.0f),
                    PathNode.LineTo(188.0f, 180.0f),
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
        return _ladderSimple!!
    }

private var _ladderSimple: ImageVector? = null
