package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) return _waveTriangle!!
        _waveTriangle = phosphorFillIcon(
            name = "WaveTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.15f, 133.12f),
                    PathNode.LineTo(166.15f, 181.12f),
                    PathNode.CurveTo(164.62938f, 182.94563f, 162.37596f, 184.00089f, 160.0f, 184.0f),
                    PathNode.LineTo(159.57f, 184.0f),
                    PathNode.CurveTo(157.0496f, 183.86569f, 154.74039f, 182.54985f, 153.34f, 180.45f),
                    PathNode.LineTo(95.34f, 93.36f),
                    PathNode.LineTo(62.15f, 133.12f),
                    PathNode.CurveTo(59.322304f, 136.51656f, 54.27655f, 136.97769f, 50.88f, 134.15f),
                    PathNode.CurveTo(47.483448f, 131.3223f, 47.0223f, 126.27655f, 49.85f, 122.88f),
                    PathNode.LineTo(89.85f, 74.88f),
                    PathNode.CurveTo(91.4651f, 72.937416f, 93.90288f, 71.871864f, 96.42562f, 72.005775f),
                    PathNode.CurveTo(98.948364f, 72.139694f, 101.25963f, 73.457344f, 102.66f, 75.56f),
                    PathNode.LineTo(160.71f, 162.65f),
                    PathNode.LineTo(193.85f, 122.88f),
                    PathNode.CurveTo(196.67769f, 119.483444f, 201.72345f, 119.0223f, 205.12f, 121.85f),
                    PathNode.CurveTo(208.51656f, 124.6777f, 208.97769f, 129.72345f, 206.15f, 133.12f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null
