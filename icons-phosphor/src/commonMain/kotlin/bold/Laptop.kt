package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Laptop: ImageVector
    get() {
        if (_laptop != null) return _laptop!!
        _laptop = phosphorBoldIcon(
            name = "Laptop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 156.0f),
                    PathNode.LineTo(228.0f, 156.0f),
                    PathNode.LineTo(228.0f, 72.0f),
                    PathNode.CurveTo(228.0f, 56.53603f, 215.46397f, 44.0f, 200.0f, 44.0f),
                    PathNode.LineTo(56.0f, 44.0f),
                    PathNode.CurveTo(40.53603f, 44.0f, 28.0f, 56.53603f, 28.0f, 72.0f),
                    PathNode.LineTo(28.0f, 156.0f),
                    PathNode.LineTo(24.0f, 156.0f),
                    PathNode.CurveTo(17.372583f, 156.0f, 12.0f, 161.37259f, 12.0f, 168.0f),
                    PathNode.LineTo(12.0f, 192.0f),
                    PathNode.CurveTo(12.0f, 207.46397f, 24.536028f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(231.46397f, 220.0f, 244.0f, 207.46397f, 244.0f, 192.0f),
                    PathNode.LineTo(244.0f, 168.0f),
                    PathNode.CurveTo(244.0f, 161.37259f, 238.62741f, 156.0f, 232.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 72.0f),
                    PathNode.CurveTo(52.0f, 69.79086f, 53.79086f, 68.0f, 56.0f, 68.0f),
                    PathNode.LineTo(200.0f, 68.0f),
                    PathNode.CurveTo(202.20914f, 68.0f, 204.0f, 69.79086f, 204.0f, 72.0f),
                    PathNode.LineTo(204.0f, 156.0f),
                    PathNode.LineTo(52.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 192.0f),
                    PathNode.CurveTo(220.0f, 194.20914f, 218.20914f, 196.0f, 216.0f, 196.0f),
                    PathNode.LineTo(40.0f, 196.0f),
                    PathNode.CurveTo(37.79086f, 196.0f, 36.0f, 194.20914f, 36.0f, 192.0f),
                    PathNode.LineTo(36.0f, 180.0f),
                    PathNode.LineTo(220.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 96.0f),
                    PathNode.CurveTo(156.0f, 102.62742f, 150.62741f, 108.0f, 144.0f, 108.0f),
                    PathNode.LineTo(112.0f, 108.0f),
                    PathNode.CurveTo(105.37258f, 108.0f, 100.0f, 102.62742f, 100.0f, 96.0f),
                    PathNode.CurveTo(100.0f, 89.37258f, 105.37258f, 84.0f, 112.0f, 84.0f),
                    PathNode.LineTo(144.0f, 84.0f),
                    PathNode.CurveTo(150.62741f, 84.0f, 156.0f, 89.37258f, 156.0f, 96.0f),
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
        return _laptop!!
    }

private var _laptop: ImageVector? = null
