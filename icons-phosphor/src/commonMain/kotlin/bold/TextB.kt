package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextB: ImageVector
    get() {
        if (_textB != null) return _textB!!
        _textB = phosphorBoldIcon(
            name = "TextB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(185.08f, 114.46f),
                    PathNode.CurveTo(196.85706f, 100.11681f, 199.31047f, 80.26964f, 191.38063f, 63.49038f),
                    PathNode.CurveTo(183.45079f, 46.711117f, 166.55872f, 36.006577f, 148.0f, 36.0f),
                    PathNode.LineTo(80.0f, 36.0f),
                    PathNode.CurveTo(73.37258f, 36.0f, 68.0f, 41.37258f, 68.0f, 48.0f),
                    PathNode.LineTo(68.0f, 200.0f),
                    PathNode.CurveTo(68.0f, 206.62741f, 73.37258f, 212.0f, 80.0f, 212.0f),
                    PathNode.LineTo(160.0f, 212.0f),
                    PathNode.CurveTo(183.72322f, 211.98999f, 204.43222f, 195.92519f, 210.33989f, 172.94931f),
                    PathNode.CurveTo(216.24757f, 149.97343f, 205.85608f, 125.91191f, 185.08f, 114.46f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 60.0f),
                    PathNode.LineTo(148.0f, 60.0f),
                    PathNode.CurveTo(161.25484f, 60.0f, 172.0f, 70.74516f, 172.0f, 84.0f),
                    PathNode.CurveTo(172.0f, 97.25484f, 161.25484f, 108.0f, 148.0f, 108.0f),
                    PathNode.LineTo(92.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 188.0f),
                    PathNode.LineTo(92.0f, 188.0f),
                    PathNode.LineTo(92.0f, 132.0f),
                    PathNode.LineTo(160.0f, 132.0f),
                    PathNode.CurveTo(175.46397f, 132.0f, 188.0f, 144.53603f, 188.0f, 160.0f),
                    PathNode.CurveTo(188.0f, 175.46397f, 175.46397f, 188.0f, 160.0f, 188.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textB!!
    }

private var _textB: ImageVector? = null
