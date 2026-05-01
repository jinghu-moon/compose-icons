package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = phosphorThinIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(116.0f, 64.0f),
                    PathNode.CurveTo(116.0f, 66.20914f, 114.20914f, 68.0f, 112.0f, 68.0f),
                    PathNode.LineTo(96.0f, 68.0f),
                    PathNode.CurveTo(93.79086f, 68.0f, 92.0f, 66.20914f, 92.0f, 64.0f),
                    PathNode.CurveTo(92.0f, 61.79086f, 93.79086f, 60.0f, 96.0f, 60.0f),
                    PathNode.LineTo(112.0f, 60.0f),
                    PathNode.CurveTo(114.20914f, 60.0f, 116.0f, 61.79086f, 116.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 194.86f),
                    PathNode.LineTo(171.92f, 222.3f),
                    PathNode.CurveTo(172.41393f, 225.75122f, 171.38248f, 229.24664f, 169.09402f, 231.87683f),
                    PathNode.CurveTo(166.80557f, 234.50702f, 163.48637f, 236.01192f, 160.0f, 236.0f),
                    PathNode.LineTo(96.0f, 236.0f),
                    PathNode.CurveTo(92.52061f, 236.0003f, 89.21238f, 234.49039f, 86.932884f, 231.86168f),
                    PathNode.CurveTo(84.6534f, 229.23297f, 83.62708f, 225.74431f, 84.12f, 222.3f),
                    PathNode.LineTo(88.0f, 194.86f),
                    PathNode.CurveTo(56.220104f, 179.48714f, 36.02234f, 147.30278f, 36.0f, 112.0f),
                    PathNode.CurveTo(36.0f, 109.79086f, 37.79086f, 108.0f, 40.0f, 108.0f),
                    PathNode.LineTo(60.0f, 108.0f),
                    PathNode.LineTo(60.0f, 40.0f),
                    PathNode.CurveTo(60.0f, 33.37258f, 65.37258f, 28.0f, 72.0f, 28.0f),
                    PathNode.LineTo(184.0f, 28.0f),
                    PathNode.CurveTo(190.62741f, 28.0f, 196.0f, 33.37258f, 196.0f, 40.0f),
                    PathNode.LineTo(196.0f, 108.0f),
                    PathNode.LineTo(216.0f, 108.0f),
                    PathNode.CurveTo(218.20914f, 108.0f, 220.0f, 109.79086f, 220.0f, 112.0f),
                    PathNode.CurveTo(219.97766f, 147.30278f, 199.77989f, 179.48714f, 168.0f, 194.86f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 108.0f),
                    PathNode.LineTo(188.0f, 108.0f),
                    PathNode.LineTo(188.0f, 40.0f),
                    PathNode.CurveTo(188.0f, 37.79086f, 186.20914f, 36.0f, 184.0f, 36.0f),
                    PathNode.LineTo(72.0f, 36.0f),
                    PathNode.CurveTo(69.79086f, 36.0f, 68.0f, 37.79086f, 68.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.34f, 198.13f),
                    PathNode.CurveTo(139.49066f, 205.95862f, 116.50934f, 205.95862f, 95.66f, 198.13f),
                    PathNode.LineTo(92.0f, 223.43f),
                    PathNode.CurveTo(91.8355f, 224.57936f, 92.178535f, 225.74348f, 92.94f, 226.62f),
                    PathNode.CurveTo(93.70236f, 227.51439f, 94.824974f, 228.02066f, 96.0f, 228.0f),
                    PathNode.LineTo(160.0f, 228.0f),
                    PathNode.CurveTo(161.15411f, 228.00282f, 162.25114f, 227.4982f, 163.0f, 226.62f),
                    PathNode.CurveTo(163.76146f, 225.74348f, 164.10449f, 224.57936f, 163.94f, 223.43f),
                    PathNode.Close,
                    PathNode.MoveTo(211.91f, 116.0f),
                    PathNode.LineTo(44.09f, 116.0f),
                    PathNode.CurveTo(46.167004f, 160.83234f, 83.11957f, 196.1126f, 128.0f, 196.1126f),
                    PathNode.CurveTo(172.88043f, 196.1126f, 209.833f, 160.83234f, 211.91f, 116.0f),
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
        return _toilet!!
    }

private var _toilet: ImageVector? = null
