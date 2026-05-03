package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = phosphorBoldIcon(
            name = "ShieldCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(36.954304f, 36.0f, 28.0f, 44.954304f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 112.0f),
                    PathNode.CurveTo(28.0f, 166.29f, 54.32f, 199.22f, 76.4f, 217.29f),
                    PathNode.CurveTo(100.11f, 236.68f, 123.84f, 243.29f, 124.84f, 243.58f),
                    PathNode.CurveTo(126.90947f, 244.1399f, 129.09053f, 244.1399f, 131.16f, 243.58f),
                    PathNode.CurveTo(132.16f, 243.3f, 155.89f, 236.68f, 179.6f, 217.29f),
                    PathNode.CurveTo(201.68f, 199.22f, 228.0f, 166.29f, 228.0f, 112.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 44.954304f, 219.0457f, 36.0f, 208.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 112.0f),
                    PathNode.CurveTo(204.0f, 113.34f, 204.0f, 114.68f, 203.94f, 116.0f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.LineTo(140.0f, 60.0f),
                    PathNode.LineTo(204.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 60.0f),
                    PathNode.LineTo(116.0f, 60.0f),
                    PathNode.LineTo(116.0f, 116.0f),
                    PathNode.LineTo(52.06f, 116.0f),
                    PathNode.CurveTo(52.06f, 114.68f, 52.0f, 113.34f, 52.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(55.0f, 140.0f),
                    PathNode.LineTo(116.0f, 140.0f),
                    PathNode.LineTo(116.0f, 214.29f),
                    PathNode.CurveTo(107.031624f, 209.9144f, 98.6102f, 204.49702f, 90.91f, 198.15f),
                    PathNode.CurveTo(72.22f, 182.61f, 60.2f, 163.13f, 55.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.1f, 198.15f),
                    PathNode.CurveTo(157.39668f, 204.49768f, 148.97186f, 209.91507f, 140.0f, 214.29f),
                    PathNode.LineTo(140.0f, 140.0f),
                    PathNode.LineTo(201.0f, 140.0f),
                    PathNode.CurveTo(195.8f, 163.13f, 183.78f, 182.61f, 165.09f, 198.15f),
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
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
