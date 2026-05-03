package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CraneTower: ImageVector
    get() {
        if (_craneTower != null) return _craneTower!!
        _craneTower = phosphorDuotoneIcon(
            name = "CraneTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.0f, 88.0f),
                    PathNode.LineTo(104.0f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.LineTo(80.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 80.0f),
                    PathNode.LineTo(108.94f, 80.0f),
                    PathNode.LineTo(87.16f, 36.42f),
                    PathNode.CurveTo(85.80349f, 33.70914f, 83.03132f, 31.99783f, 80.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(43.581722f, 32.0f, 40.0f, 35.581722f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 80.0f),
                    PathNode.LineTo(24.0f, 80.0f),
                    PathNode.CurveTo(19.581722f, 80.0f, 16.0f, 83.58172f, 16.0f, 88.0f),
                    PathNode.CurveTo(16.0f, 92.41828f, 19.581722f, 96.0f, 24.0f, 96.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.LineTo(24.0f, 208.0f),
                    PathNode.CurveTo(19.581722f, 208.0f, 16.0f, 211.58173f, 16.0f, 216.0f),
                    PathNode.CurveTo(16.0f, 220.41827f, 19.581722f, 224.0f, 24.0f, 224.0f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.CurveTo(132.41827f, 224.0f, 136.0f, 220.41827f, 136.0f, 216.0f),
                    PathNode.CurveTo(136.0f, 211.58173f, 132.41827f, 208.0f, 128.0f, 208.0f),
                    PathNode.LineTo(112.0f, 208.0f),
                    PathNode.LineTo(112.0f, 96.0f),
                    PathNode.LineTo(208.0f, 96.0f),
                    PathNode.LineTo(208.0f, 184.0f),
                    PathNode.LineTo(192.0f, 184.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.CurveTo(192.0f, 171.58173f, 188.41827f, 168.0f, 184.0f, 168.0f),
                    PathNode.CurveTo(179.58173f, 168.0f, 176.0f, 171.58173f, 176.0f, 176.0f),
                    PathNode.LineTo(176.0f, 184.0f),
                    PathNode.CurveTo(176.0f, 192.83656f, 183.16344f, 200.0f, 192.0f, 200.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(216.83656f, 200.0f, 224.0f, 192.83656f, 224.0f, 184.0f),
                    PathNode.LineTo(224.0f, 96.0f),
                    PathNode.LineTo(240.0f, 96.0f),
                    PathNode.CurveTo(244.41827f, 96.0f, 248.0f, 92.41828f, 248.0f, 88.0f),
                    PathNode.CurveTo(248.0f, 83.58172f, 244.41827f, 80.0f, 240.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 48.0f),
                    PathNode.LineTo(75.06f, 48.0f),
                    PathNode.LineTo(91.06f, 80.0f),
                    PathNode.LineTo(56.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 208.0f),
                    PathNode.LineTo(56.0f, 160.0f),
                    PathNode.LineTo(96.0f, 160.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 144.0f),
                    PathNode.LineTo(56.0f, 144.0f),
                    PathNode.LineTo(56.0f, 96.0f),
                    PathNode.LineTo(96.0f, 96.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _craneTower!!
    }

private var _craneTower: ImageVector? = null
