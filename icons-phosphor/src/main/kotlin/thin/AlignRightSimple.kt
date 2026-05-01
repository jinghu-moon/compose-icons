package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignRightSimple: ImageVector
    get() {
        if (_alignRightSimple != null) return _alignRightSimple!!
        _alignRightSimple = phosphorThinIcon(
            name = "AlignRightSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 56.0f),
                    PathNode.LineTo(228.0f, 200.0f),
                    PathNode.CurveTo(228.0f, 202.20914f, 226.20914f, 204.0f, 224.0f, 204.0f),
                    PathNode.CurveTo(221.79086f, 204.0f, 220.0f, 202.20914f, 220.0f, 200.0f),
                    PathNode.LineTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 53.79086f, 221.79086f, 52.0f, 224.0f, 52.0f),
                    PathNode.CurveTo(226.20914f, 52.0f, 228.0f, 53.79086f, 228.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 96.0f),
                    PathNode.LineTo(196.0f, 160.0f),
                    PathNode.CurveTo(196.0f, 166.62741f, 190.62741f, 172.0f, 184.0f, 172.0f),
                    PathNode.LineTo(32.0f, 172.0f),
                    PathNode.CurveTo(25.372583f, 172.0f, 20.0f, 166.62741f, 20.0f, 160.0f),
                    PathNode.LineTo(20.0f, 96.0f),
                    PathNode.CurveTo(20.0f, 89.37258f, 25.372583f, 84.0f, 32.0f, 84.0f),
                    PathNode.LineTo(184.0f, 84.0f),
                    PathNode.CurveTo(190.62741f, 84.0f, 196.0f, 89.37258f, 196.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 96.0f),
                    PathNode.CurveTo(188.0f, 93.79086f, 186.20914f, 92.0f, 184.0f, 92.0f),
                    PathNode.LineTo(32.0f, 92.0f),
                    PathNode.CurveTo(29.790861f, 92.0f, 28.0f, 93.79086f, 28.0f, 96.0f),
                    PathNode.LineTo(28.0f, 160.0f),
                    PathNode.CurveTo(28.0f, 162.20914f, 29.790861f, 164.0f, 32.0f, 164.0f),
                    PathNode.LineTo(184.0f, 164.0f),
                    PathNode.CurveTo(186.20914f, 164.0f, 188.0f, 162.20914f, 188.0f, 160.0f),
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
        return _alignRightSimple!!
    }

private var _alignRightSimple: ImageVector? = null
