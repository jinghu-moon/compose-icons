package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignCenterVerticalSimple: ImageVector
    get() {
        if (_alignCenterVerticalSimple != null) return _alignCenterVerticalSimple!!
        _alignCenterVerticalSimple = phosphorThinIcon(
            name = "AlignCenterVerticalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 124.0f),
                    PathNode.LineTo(172.0f, 124.0f),
                    PathNode.LineTo(172.0f, 48.0f),
                    PathNode.CurveTo(172.0f, 41.37258f, 166.62741f, 36.0f, 160.0f, 36.0f),
                    PathNode.LineTo(96.0f, 36.0f),
                    PathNode.CurveTo(89.37258f, 36.0f, 84.0f, 41.37258f, 84.0f, 48.0f),
                    PathNode.LineTo(84.0f, 124.0f),
                    PathNode.LineTo(48.0f, 124.0f),
                    PathNode.CurveTo(45.79086f, 124.0f, 44.0f, 125.79086f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 130.20914f, 45.79086f, 132.0f, 48.0f, 132.0f),
                    PathNode.LineTo(84.0f, 132.0f),
                    PathNode.LineTo(84.0f, 208.0f),
                    PathNode.CurveTo(84.0f, 214.62741f, 89.37258f, 220.0f, 96.0f, 220.0f),
                    PathNode.LineTo(160.0f, 220.0f),
                    PathNode.CurveTo(166.62741f, 220.0f, 172.0f, 214.62741f, 172.0f, 208.0f),
                    PathNode.LineTo(172.0f, 132.0f),
                    PathNode.LineTo(208.0f, 132.0f),
                    PathNode.CurveTo(210.20914f, 132.0f, 212.0f, 130.20914f, 212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 125.79086f, 210.20914f, 124.0f, 208.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 208.0f),
                    PathNode.CurveTo(164.0f, 210.20914f, 162.20914f, 212.0f, 160.0f, 212.0f),
                    PathNode.LineTo(96.0f, 212.0f),
                    PathNode.CurveTo(93.79086f, 212.0f, 92.0f, 210.20914f, 92.0f, 208.0f),
                    PathNode.LineTo(92.0f, 48.0f),
                    PathNode.CurveTo(92.0f, 45.79086f, 93.79086f, 44.0f, 96.0f, 44.0f),
                    PathNode.LineTo(160.0f, 44.0f),
                    PathNode.CurveTo(162.20914f, 44.0f, 164.0f, 45.79086f, 164.0f, 48.0f),
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
        return _alignCenterVerticalSimple!!
    }

private var _alignCenterVerticalSimple: ImageVector? = null
