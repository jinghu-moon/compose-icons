package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FunnelSimpleX: ImageVector
    get() {
        if (_funnelSimpleX != null) return _funnelSimpleX!!
        _funnelSimpleX = phosphorThinIcon(
            name = "FunnelSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 140.0f),
                    PathNode.LineTo(64.0f, 140.0f),
                    PathNode.CurveTo(61.79086f, 140.0f, 60.0f, 138.20914f, 60.0f, 136.0f),
                    PathNode.CurveTo(60.0f, 133.79086f, 61.79086f, 132.0f, 64.0f, 132.0f),
                    PathNode.LineTo(192.0f, 132.0f),
                    PathNode.CurveTo(194.20914f, 132.0f, 196.0f, 133.79086f, 196.0f, 136.0f),
                    PathNode.CurveTo(196.0f, 138.20914f, 194.20914f, 140.0f, 192.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 84.0f),
                    PathNode.LineTo(24.0f, 84.0f),
                    PathNode.CurveTo(21.790861f, 84.0f, 20.0f, 85.79086f, 20.0f, 88.0f),
                    PathNode.CurveTo(20.0f, 90.20914f, 21.790861f, 92.0f, 24.0f, 92.0f),
                    PathNode.LineTo(232.0f, 92.0f),
                    PathNode.CurveTo(234.20914f, 92.0f, 236.0f, 90.20914f, 236.0f, 88.0f),
                    PathNode.CurveTo(236.0f, 85.79086f, 234.20914f, 84.0f, 232.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 180.0f),
                    PathNode.LineTo(104.0f, 180.0f),
                    PathNode.CurveTo(101.79086f, 180.0f, 100.0f, 181.79086f, 100.0f, 184.0f),
                    PathNode.CurveTo(100.0f, 186.20914f, 101.79086f, 188.0f, 104.0f, 188.0f),
                    PathNode.LineTo(128.0f, 188.0f),
                    PathNode.CurveTo(130.20914f, 188.0f, 132.0f, 186.20914f, 132.0f, 184.0f),
                    PathNode.CurveTo(132.0f, 181.79086f, 130.20914f, 180.0f, 128.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.83f, 173.17f),
                    PathNode.CurveTo(218.07973f, 172.41888f, 217.06163f, 171.99686f, 216.0f, 171.99686f),
                    PathNode.CurveTo(214.93837f, 171.99686f, 213.92027f, 172.41888f, 213.17f, 173.17f),
                    PathNode.LineTo(192.0f, 194.34f),
                    PathNode.LineTo(170.83f, 173.17f),
                    PathNode.CurveTo(169.26703f, 171.60704f, 166.73297f, 171.60704f, 165.17f, 173.17f),
                    PathNode.CurveTo(163.60704f, 174.73297f, 163.60704f, 177.26703f, 165.17f, 178.83f),
                    PathNode.LineTo(186.34f, 200.0f),
                    PathNode.LineTo(165.17f, 221.17f),
                    PathNode.CurveTo(163.60704f, 222.73297f, 163.60704f, 225.26703f, 165.17f, 226.83f),
                    PathNode.CurveTo(166.73297f, 228.39296f, 169.26703f, 228.39296f, 170.83f, 226.83f),
                    PathNode.LineTo(192.0f, 205.66f),
                    PathNode.LineTo(213.17f, 226.83f),
                    PathNode.CurveTo(214.73297f, 228.39296f, 217.26703f, 228.39296f, 218.83f, 226.83f),
                    PathNode.CurveTo(220.39296f, 225.26703f, 220.39296f, 222.73297f, 218.83f, 221.17f),
                    PathNode.LineTo(197.66f, 200.0f),
                    PathNode.LineTo(218.83f, 178.83f),
                    PathNode.CurveTo(219.58112f, 178.07973f, 220.00314f, 177.06163f, 220.00314f, 176.0f),
                    PathNode.CurveTo(220.00314f, 174.93837f, 219.58112f, 173.92027f, 218.83f, 173.17f),
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
        return _funnelSimpleX!!
    }

private var _funnelSimpleX: ImageVector? = null
