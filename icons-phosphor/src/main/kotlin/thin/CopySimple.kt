package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CopySimple: ImageVector
    get() {
        if (_copySimple != null) return _copySimple!!
        _copySimple = phosphorThinIcon(
            name = "CopySimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 68.0f),
                    PathNode.LineTo(40.0f, 68.0f),
                    PathNode.CurveTo(37.79086f, 68.0f, 36.0f, 69.79086f, 36.0f, 72.0f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 218.20914f, 37.79086f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(184.0f, 220.0f),
                    PathNode.CurveTo(186.20914f, 220.0f, 188.0f, 218.20914f, 188.0f, 216.0f),
                    PathNode.LineTo(188.0f, 72.0f),
                    PathNode.CurveTo(188.0f, 69.79086f, 186.20914f, 68.0f, 184.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 212.0f),
                    PathNode.LineTo(44.0f, 212.0f),
                    PathNode.LineTo(44.0f, 76.0f),
                    PathNode.LineTo(180.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 40.0f),
                    PathNode.LineTo(220.0f, 184.0f),
                    PathNode.CurveTo(220.0f, 186.20914f, 218.20914f, 188.0f, 216.0f, 188.0f),
                    PathNode.CurveTo(213.79086f, 188.0f, 212.0f, 186.20914f, 212.0f, 184.0f),
                    PathNode.LineTo(212.0f, 44.0f),
                    PathNode.LineTo(72.0f, 44.0f),
                    PathNode.CurveTo(69.79086f, 44.0f, 68.0f, 42.20914f, 68.0f, 40.0f),
                    PathNode.CurveTo(68.0f, 37.79086f, 69.79086f, 36.0f, 72.0f, 36.0f),
                    PathNode.LineTo(216.0f, 36.0f),
                    PathNode.CurveTo(218.20914f, 36.0f, 220.0f, 37.79086f, 220.0f, 40.0f),
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
        return _copySimple!!
    }

private var _copySimple: ImageVector? = null
