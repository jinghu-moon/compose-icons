package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Warehouse: ImageVector
    get() {
        if (_warehouse != null) return _warehouse!!
        _warehouse = phosphorThinIcon(
            name = "Warehouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 188.0f),
                    PathNode.LineTo(228.0f, 188.0f),
                    PathNode.LineTo(228.0f, 54.66f),
                    PathNode.LineTo(240.84f, 51.91f),
                    PathNode.CurveTo(242.26144f, 51.634014f, 243.42274f, 50.61138f, 243.87633f, 49.236263f),
                    PathNode.CurveTo(244.32986f, 47.86115f, 244.00485f, 46.348274f, 243.02654f, 45.280773f),
                    PathNode.CurveTo(242.04822f, 44.213272f, 240.56937f, 43.75783f, 239.16f, 44.09f),
                    PathNode.LineTo(15.16f, 92.09f),
                    PathNode.CurveTo(13.161796f, 92.52119f, 11.81023f, 94.38964f, 12.026099f, 96.42241f),
                    PathNode.CurveTo(12.241968f, 98.45517f, 13.955803f, 99.99809f, 16.0f, 100.0f),
                    PathNode.CurveTo(16.282364f, 99.99922f, 16.56388f, 99.969055f, 16.84f, 99.91f),
                    PathNode.LineTo(28.0f, 97.52f),
                    PathNode.LineTo(28.0f, 188.0f),
                    PathNode.LineTo(16.0f, 188.0f),
                    PathNode.CurveTo(13.790861f, 188.0f, 12.0f, 189.79086f, 12.0f, 192.0f),
                    PathNode.CurveTo(12.0f, 194.20914f, 13.790861f, 196.0f, 16.0f, 196.0f),
                    PathNode.LineTo(240.0f, 196.0f),
                    PathNode.CurveTo(242.20914f, 196.0f, 244.0f, 194.20914f, 244.0f, 192.0f),
                    PathNode.CurveTo(244.0f, 189.79086f, 242.20914f, 188.0f, 240.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 95.81f),
                    PathNode.LineTo(220.0f, 56.38f),
                    PathNode.LineTo(220.0f, 188.0f),
                    PathNode.LineTo(188.0f, 188.0f),
                    PathNode.LineTo(188.0f, 128.0f),
                    PathNode.CurveTo(188.0f, 125.79086f, 186.20914f, 124.0f, 184.0f, 124.0f),
                    PathNode.LineTo(72.0f, 124.0f),
                    PathNode.CurveTo(69.79086f, 124.0f, 68.0f, 125.79086f, 68.0f, 128.0f),
                    PathNode.LineTo(68.0f, 188.0f),
                    PathNode.LineTo(36.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 156.0f),
                    PathNode.LineTo(76.0f, 156.0f),
                    PathNode.LineTo(76.0f, 132.0f),
                    PathNode.LineTo(180.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 164.0f),
                    PathNode.LineTo(180.0f, 164.0f),
                    PathNode.LineTo(180.0f, 188.0f),
                    PathNode.LineTo(76.0f, 188.0f),
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
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
