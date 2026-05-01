package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) return _shieldCheck!!
        _shieldCheck = phosphorThinIcon(
            name = "ShieldCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 44.0f),
                    PathNode.LineTo(48.0f, 44.0f),
                    PathNode.CurveTo(41.37258f, 44.0f, 36.0f, 49.37258f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 112.0f),
                    PathNode.CurveTo(36.0f, 163.16f, 60.73f, 194.12f, 81.47f, 211.1f),
                    PathNode.CurveTo(103.87f, 229.42f, 126.02f, 235.6f, 126.95f, 235.86f),
                    PathNode.CurveTo(127.637505f, 236.04703f, 128.36249f, 236.04703f, 129.05f, 235.86f),
                    PathNode.CurveTo(129.98f, 235.6f, 152.13f, 229.42f, 174.53f, 211.1f),
                    PathNode.CurveTo(195.27f, 194.1f, 220.0f, 163.16f, 220.0f, 112.0f),
                    PathNode.LineTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 49.37258f, 214.62741f, 44.0f, 208.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 112.0f),
                    PathNode.CurveTo(212.0f, 150.44f, 197.77f, 181.63f, 169.71f, 204.71f),
                    PathNode.CurveTo(157.31924f, 214.87323f, 143.18694f, 222.70343f, 128.0f, 227.82f),
                    PathNode.CurveTo(112.8111f, 222.70792f, 98.678f, 214.87729f, 86.29f, 204.71f),
                    PathNode.CurveTo(58.23f, 181.63f, 44.0f, 150.44f, 44.0f, 112.0f),
                    PathNode.LineTo(44.0f, 56.0f),
                    PathNode.CurveTo(44.0f, 53.79086f, 45.79086f, 52.0f, 48.0f, 52.0f),
                    PathNode.LineTo(208.0f, 52.0f),
                    PathNode.CurveTo(210.20914f, 52.0f, 212.0f, 53.79086f, 212.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.83f, 101.17f),
                    PathNode.CurveTo(171.58112f, 101.92027f, 172.00314f, 102.93836f, 172.00314f, 104.0f),
                    PathNode.CurveTo(172.00314f, 105.06164f, 171.58112f, 106.07973f, 170.83f, 106.83f),
                    PathNode.LineTo(114.83f, 162.83f),
                    PathNode.CurveTo(114.07973f, 163.58112f, 113.06164f, 164.00314f, 112.0f, 164.00314f),
                    PathNode.CurveTo(110.93836f, 164.00314f, 109.92027f, 163.58112f, 109.17f, 162.83f),
                    PathNode.LineTo(85.17f, 138.83f),
                    PathNode.CurveTo(83.60703f, 137.26703f, 83.60703f, 134.73297f, 85.17f, 133.17f),
                    PathNode.CurveTo(86.73296f, 131.60704f, 89.26704f, 131.60704f, 90.83f, 133.17f),
                    PathNode.LineTo(112.0f, 154.34f),
                    PathNode.LineTo(165.17f, 101.17f),
                    PathNode.CurveTo(165.92027f, 100.418884f, 166.93837f, 99.99686f, 168.0f, 99.99686f),
                    PathNode.CurveTo(169.06163f, 99.99686f, 170.07973f, 100.418884f, 170.83f, 101.17f),
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
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
