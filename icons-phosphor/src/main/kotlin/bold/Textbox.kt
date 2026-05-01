package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Textbox: ImageVector
    get() {
        if (_textbox != null) return _textbox!!
        _textbox = phosphorBoldIcon(
            name = "Textbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(112.0f, 36.0f),
                    PathNode.CurveTo(105.37258f, 36.0f, 100.0f, 41.37258f, 100.0f, 48.0f),
                    PathNode.LineTo(100.0f, 60.0f),
                    PathNode.LineTo(24.0f, 60.0f),
                    PathNode.CurveTo(12.954305f, 60.0f, 4.0f, 68.95431f, 4.0f, 80.0f),
                    PathNode.LineTo(4.0f, 176.0f),
                    PathNode.CurveTo(4.0f, 187.0457f, 12.954305f, 196.0f, 24.0f, 196.0f),
                    PathNode.LineTo(100.0f, 196.0f),
                    PathNode.LineTo(100.0f, 208.0f),
                    PathNode.CurveTo(100.0f, 214.62741f, 105.37258f, 220.0f, 112.0f, 220.0f),
                    PathNode.CurveTo(118.62742f, 220.0f, 124.0f, 214.62741f, 124.0f, 208.0f),
                    PathNode.LineTo(124.0f, 48.0f),
                    PathNode.CurveTo(124.0f, 41.37258f, 118.62742f, 36.0f, 112.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 172.0f),
                    PathNode.LineTo(28.0f, 84.0f),
                    PathNode.LineTo(100.0f, 84.0f),
                    PathNode.LineTo(100.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.0f, 80.0f),
                    PathNode.LineTo(252.0f, 176.0f),
                    PathNode.CurveTo(252.0f, 187.0457f, 243.0457f, 196.0f, 232.0f, 196.0f),
                    PathNode.LineTo(152.0f, 196.0f),
                    PathNode.CurveTo(145.37259f, 196.0f, 140.0f, 190.62741f, 140.0f, 184.0f),
                    PathNode.CurveTo(140.0f, 177.37259f, 145.37259f, 172.0f, 152.0f, 172.0f),
                    PathNode.LineTo(228.0f, 172.0f),
                    PathNode.LineTo(228.0f, 84.0f),
                    PathNode.LineTo(152.0f, 84.0f),
                    PathNode.CurveTo(145.37259f, 84.0f, 140.0f, 78.62742f, 140.0f, 72.0f),
                    PathNode.CurveTo(140.0f, 65.37258f, 145.37259f, 60.0f, 152.0f, 60.0f),
                    PathNode.LineTo(232.0f, 60.0f),
                    PathNode.CurveTo(243.0457f, 60.0f, 252.0f, 68.95431f, 252.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 112.0f),
                    PathNode.CurveTo(88.0f, 118.62742f, 82.62742f, 124.0f, 76.0f, 124.0f),
                    PathNode.LineTo(76.0f, 144.0f),
                    PathNode.CurveTo(76.0f, 150.62741f, 70.62742f, 156.0f, 64.0f, 156.0f),
                    PathNode.CurveTo(57.37258f, 156.0f, 52.0f, 150.62741f, 52.0f, 144.0f),
                    PathNode.LineTo(52.0f, 124.0f),
                    PathNode.CurveTo(45.37258f, 124.0f, 40.0f, 118.62742f, 40.0f, 112.0f),
                    PathNode.CurveTo(40.0f, 105.37258f, 45.37258f, 100.0f, 52.0f, 100.0f),
                    PathNode.LineTo(76.0f, 100.0f),
                    PathNode.CurveTo(82.62742f, 100.0f, 88.0f, 105.37258f, 88.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textbox!!
    }

private var _textbox: ImageVector? = null
