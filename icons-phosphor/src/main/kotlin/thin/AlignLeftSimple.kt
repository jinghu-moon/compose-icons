package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignLeftSimple: ImageVector
    get() {
        if (_alignLeftSimple != null) return _alignLeftSimple!!
        _alignLeftSimple = phosphorThinIcon(
            name = "AlignLeftSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 202.20914f, 34.20914f, 204.0f, 32.0f, 204.0f),
                    PathNode.CurveTo(29.790861f, 204.0f, 28.0f, 202.20914f, 28.0f, 200.0f),
                    PathNode.LineTo(28.0f, 56.0f),
                    PathNode.CurveTo(28.0f, 53.79086f, 29.790861f, 52.0f, 32.0f, 52.0f),
                    PathNode.CurveTo(34.20914f, 52.0f, 36.0f, 53.79086f, 36.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 96.0f),
                    PathNode.LineTo(236.0f, 160.0f),
                    PathNode.CurveTo(236.0f, 166.62741f, 230.62741f, 172.0f, 224.0f, 172.0f),
                    PathNode.LineTo(72.0f, 172.0f),
                    PathNode.CurveTo(65.37258f, 172.0f, 60.0f, 166.62741f, 60.0f, 160.0f),
                    PathNode.LineTo(60.0f, 96.0f),
                    PathNode.CurveTo(60.0f, 89.37258f, 65.37258f, 84.0f, 72.0f, 84.0f),
                    PathNode.LineTo(224.0f, 84.0f),
                    PathNode.CurveTo(230.62741f, 84.0f, 236.0f, 89.37258f, 236.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 96.0f),
                    PathNode.CurveTo(228.0f, 93.79086f, 226.20914f, 92.0f, 224.0f, 92.0f),
                    PathNode.LineTo(72.0f, 92.0f),
                    PathNode.CurveTo(69.79086f, 92.0f, 68.0f, 93.79086f, 68.0f, 96.0f),
                    PathNode.LineTo(68.0f, 160.0f),
                    PathNode.CurveTo(68.0f, 162.20914f, 69.79086f, 164.0f, 72.0f, 164.0f),
                    PathNode.LineTo(224.0f, 164.0f),
                    PathNode.CurveTo(226.20914f, 164.0f, 228.0f, 162.20914f, 228.0f, 160.0f),
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
        return _alignLeftSimple!!
    }

private var _alignLeftSimple: ImageVector? = null
