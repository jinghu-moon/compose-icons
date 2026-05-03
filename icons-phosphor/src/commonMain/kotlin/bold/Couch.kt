package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Couch: ImageVector
    get() {
        if (_couch != null) return _couch!!
        _couch = phosphorBoldIcon(
            name = "Couch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 104.0f),
                    PathNode.LineTo(244.0f, 72.0f),
                    PathNode.CurveTo(244.0f, 60.954304f, 235.0457f, 52.0f, 224.0f, 52.0f),
                    PathNode.LineTo(32.0f, 52.0f),
                    PathNode.CurveTo(20.954306f, 52.0f, 12.0f, 60.954304f, 12.0f, 72.0f),
                    PathNode.LineTo(12.0f, 104.0f),
                    PathNode.CurveTo(6.963883f, 107.777084f, 4.0f, 113.70486f, 4.0f, 120.0f),
                    PathNode.LineTo(4.0f, 168.0f),
                    PathNode.CurveTo(4.0f, 179.0457f, 12.954305f, 188.0f, 24.0f, 188.0f),
                    PathNode.LineTo(28.0f, 188.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 206.62741f, 33.37258f, 212.0f, 40.0f, 212.0f),
                    PathNode.CurveTo(46.62742f, 212.0f, 52.0f, 206.62741f, 52.0f, 200.0f),
                    PathNode.LineTo(52.0f, 188.0f),
                    PathNode.LineTo(204.0f, 188.0f),
                    PathNode.LineTo(204.0f, 200.0f),
                    PathNode.CurveTo(204.0f, 206.62741f, 209.37259f, 212.0f, 216.0f, 212.0f),
                    PathNode.CurveTo(222.62741f, 212.0f, 228.0f, 206.62741f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 188.0f),
                    PathNode.LineTo(232.0f, 188.0f),
                    PathNode.CurveTo(243.0457f, 188.0f, 252.0f, 179.0457f, 252.0f, 168.0f),
                    PathNode.LineTo(252.0f, 120.0f),
                    PathNode.CurveTo(252.0f, 113.70486f, 249.03612f, 107.777084f, 244.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 100.0f),
                    PathNode.LineTo(208.0f, 100.0f),
                    PathNode.CurveTo(196.9543f, 100.0f, 188.0f, 108.95431f, 188.0f, 120.0f),
                    PathNode.LineTo(188.0f, 124.0f),
                    PathNode.LineTo(140.0f, 124.0f),
                    PathNode.LineTo(140.0f, 76.0f),
                    PathNode.LineTo(220.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 76.0f),
                    PathNode.LineTo(116.0f, 124.0f),
                    PathNode.LineTo(68.0f, 124.0f),
                    PathNode.LineTo(68.0f, 120.0f),
                    PathNode.CurveTo(68.0f, 108.95431f, 59.045696f, 100.0f, 48.0f, 100.0f),
                    PathNode.LineTo(36.0f, 100.0f),
                    PathNode.LineTo(36.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 164.0f),
                    PathNode.LineTo(28.0f, 164.0f),
                    PathNode.LineTo(28.0f, 124.0f),
                    PathNode.LineTo(44.0f, 124.0f),
                    PathNode.LineTo(44.0f, 136.0f),
                    PathNode.CurveTo(44.0f, 142.62741f, 49.37258f, 148.0f, 56.0f, 148.0f),
                    PathNode.LineTo(200.0f, 148.0f),
                    PathNode.CurveTo(206.62741f, 148.0f, 212.0f, 142.62741f, 212.0f, 136.0f),
                    PathNode.LineTo(212.0f, 124.0f),
                    PathNode.LineTo(228.0f, 124.0f),
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
        return _couch!!
    }

private var _couch: ImageVector? = null
