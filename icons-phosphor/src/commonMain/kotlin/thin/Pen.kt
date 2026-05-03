package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pen: ImageVector
    get() {
        if (_pen != null) return _pen!!
        _pen = phosphorThinIcon(
            name = "Pen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.49f, 76.2f),
                    PathNode.LineTo(179.8f, 31.51f),
                    PathNode.CurveTo(177.54837f, 29.250546f, 174.48982f, 27.980537f, 171.3f, 27.980537f),
                    PathNode.CurveTo(168.11017f, 27.980537f, 165.05162f, 29.250546f, 162.8f, 31.51f),
                    PathNode.LineTo(39.51f, 154.83f),
                    PathNode.CurveTo(37.26259f, 157.07991f, 36.00015f, 160.12991f, 36.0f, 163.31f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(92.69f, 220.0f),
                    PathNode.CurveTo(95.87163f, 220.00758f, 98.92446f, 218.74396f, 101.17f, 216.49f),
                    PathNode.LineTo(189.84f, 127.82f),
                    PathNode.LineTo(195.57f, 150.82f),
                    PathNode.LineTo(157.18f, 189.22f),
                    PathNode.CurveTo(156.1254f, 190.2202f, 155.69633f, 191.71375f, 156.05928f, 193.12117f),
                    PathNode.CurveTo(156.42224f, 194.5286f, 157.52008f, 195.62837f, 158.92686f, 195.9938f),
                    PathNode.CurveTo(160.33363f, 196.35925f, 161.82794f, 195.93283f, 162.83f, 194.88f),
                    PathNode.LineTo(202.83f, 154.88f),
                    PathNode.CurveTo(203.82684f, 153.88779f, 204.22931f, 152.44493f, 203.89f, 151.08f),
                    PathNode.LineTo(196.43f, 121.28f),
                    PathNode.LineTo(224.49f, 93.22f),
                    PathNode.CurveTo(226.7556f, 90.96758f, 228.02951f, 87.90473f, 228.02951f, 84.71f),
                    PathNode.CurveTo(228.02951f, 81.51527f, 226.7556f, 78.452415f, 224.49f, 76.2f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 169.66f),
                    PathNode.LineTo(86.35f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 210.34f),
                    PathNode.LineTo(45.66f, 160.0f),
                    PathNode.LineTo(136.0f, 69.66f),
                    PathNode.LineTo(186.35f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.83f, 87.51f),
                    PathNode.LineTo(192.0f, 114.34f),
                    PathNode.LineTo(141.66f, 64.0f),
                    PathNode.LineTo(168.49f, 37.17f),
                    PathNode.CurveTo(169.2403f, 36.41889f, 170.25836f, 35.996853f, 171.32f, 35.996853f),
                    PathNode.CurveTo(172.38164f, 35.996853f, 173.39973f, 36.41889f, 174.15f, 37.17f),
                    PathNode.LineTo(218.83f, 81.86f),
                    PathNode.CurveTo(220.38753f, 83.42131f, 220.38753f, 85.94869f, 218.83f, 87.51f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pen!!
    }

private var _pen: ImageVector? = null
