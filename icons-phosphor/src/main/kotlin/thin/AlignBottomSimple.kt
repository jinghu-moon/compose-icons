package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignBottomSimple: ImageVector
    get() {
        if (_alignBottomSimple != null) return _alignBottomSimple!!
        _alignBottomSimple = phosphorThinIcon(
            name = "AlignBottomSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 232.0f),
                    PathNode.CurveTo(204.0f, 234.20914f, 202.20914f, 236.0f, 200.0f, 236.0f),
                    PathNode.LineTo(56.0f, 236.0f),
                    PathNode.CurveTo(53.79086f, 236.0f, 52.0f, 234.20914f, 52.0f, 232.0f),
                    PathNode.CurveTo(52.0f, 229.79086f, 53.79086f, 228.0f, 56.0f, 228.0f),
                    PathNode.LineTo(200.0f, 228.0f),
                    PathNode.CurveTo(202.20914f, 228.0f, 204.0f, 229.79086f, 204.0f, 232.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 192.0f),
                    PathNode.LineTo(84.0f, 40.0f),
                    PathNode.CurveTo(84.0f, 33.37258f, 89.37258f, 28.0f, 96.0f, 28.0f),
                    PathNode.LineTo(160.0f, 28.0f),
                    PathNode.CurveTo(166.62741f, 28.0f, 172.0f, 33.37258f, 172.0f, 40.0f),
                    PathNode.LineTo(172.0f, 192.0f),
                    PathNode.CurveTo(172.0f, 198.62741f, 166.62741f, 204.0f, 160.0f, 204.0f),
                    PathNode.LineTo(96.0f, 204.0f),
                    PathNode.CurveTo(89.37258f, 204.0f, 84.0f, 198.62741f, 84.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 192.0f),
                    PathNode.CurveTo(92.0f, 194.20914f, 93.79086f, 196.0f, 96.0f, 196.0f),
                    PathNode.LineTo(160.0f, 196.0f),
                    PathNode.CurveTo(162.20914f, 196.0f, 164.0f, 194.20914f, 164.0f, 192.0f),
                    PathNode.LineTo(164.0f, 40.0f),
                    PathNode.CurveTo(164.0f, 37.79086f, 162.20914f, 36.0f, 160.0f, 36.0f),
                    PathNode.LineTo(96.0f, 36.0f),
                    PathNode.CurveTo(93.79086f, 36.0f, 92.0f, 37.79086f, 92.0f, 40.0f),
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
        return _alignBottomSimple!!
    }

private var _alignBottomSimple: ImageVector? = null
