package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = phosphorBoldIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 84.38f),
                    PathNode.LineTo(140.1f, 16.09f),
                    PathNode.LineTo(139.84f, 15.89f),
                    PathNode.CurveTo(132.8075f, 10.699033f, 123.2125f, 10.699033f, 116.18f, 15.89f),
                    PathNode.LineTo(115.92f, 16.09f),
                    PathNode.LineTo(28.0f, 84.38f),
                    PathNode.CurveTo(21.209309f, 89.467f, 18.36746f, 98.28515f, 20.91f, 106.38f),
                    PathNode.LineTo(52.91f, 213.89f),
                    PathNode.LineTo(52.99f, 214.15f),
                    PathNode.CurveTo(55.63669f, 222.41223f, 63.324238f, 228.01308f, 72.0f, 228.0f),
                    PathNode.LineTo(184.0f, 228.0f),
                    PathNode.CurveTo(192.67747f, 228.00595f, 200.36148f, 222.3966f, 203.0f, 214.13f),
                    PathNode.LineTo(203.08f, 213.87f),
                    PathNode.LineTo(235.08f, 106.36f),
                    PathNode.CurveTo(237.61528f, 98.273285f, 234.77855f, 89.46663f, 228.0f, 84.38f),
                    PathNode.Close,
                    PathNode.MoveTo(181.0f, 204.0f),
                    PathNode.LineTo(75.0f, 204.0f),
                    PathNode.LineTo(44.62f, 101.87f),
                    PathNode.LineTo(128.0f, 37.09f),
                    PathNode.LineTo(211.38f, 101.87f),
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
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
