package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Eject: ImageVector
    get() {
        if (_eject != null) return _eject!!
        _eject = phosphorThinIcon(
            name = "Eject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 156.0f),
                    PathNode.LineTo(48.0f, 156.0f),
                    PathNode.CurveTo(41.37258f, 156.0f, 36.0f, 161.37259f, 36.0f, 168.0f),
                    PathNode.LineTo(36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 198.62741f, 41.37258f, 204.0f, 48.0f, 204.0f),
                    PathNode.LineTo(208.0f, 204.0f),
                    PathNode.CurveTo(214.62741f, 204.0f, 220.0f, 198.62741f, 220.0f, 192.0f),
                    PathNode.LineTo(220.0f, 168.0f),
                    PathNode.CurveTo(220.0f, 161.37259f, 214.62741f, 156.0f, 208.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 192.0f),
                    PathNode.CurveTo(212.0f, 194.20914f, 210.20914f, 196.0f, 208.0f, 196.0f),
                    PathNode.LineTo(48.0f, 196.0f),
                    PathNode.CurveTo(45.79086f, 196.0f, 44.0f, 194.20914f, 44.0f, 192.0f),
                    PathNode.LineTo(44.0f, 168.0f),
                    PathNode.CurveTo(44.0f, 165.79086f, 45.79086f, 164.0f, 48.0f, 164.0f),
                    PathNode.LineTo(208.0f, 164.0f),
                    PathNode.CurveTo(210.20914f, 164.0f, 212.0f, 165.79086f, 212.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.23f, 132.0f),
                    PathNode.LineTo(207.77f, 132.0f),
                    PathNode.CurveTo(212.65672f, 132.07146f, 217.09857f, 129.1722f, 219.0f, 124.67f),
                    PathNode.CurveTo(220.89153f, 120.32569f, 219.97107f, 115.2691f, 216.67f, 111.87f),
                    PathNode.LineTo(143.0f, 34.37f),
                    PathNode.CurveTo(139.08768f, 30.299648f, 133.68571f, 27.999184f, 128.04f, 27.999184f),
                    PathNode.CurveTo(122.39429f, 27.999184f, 116.992325f, 30.299648f, 113.08f, 34.37f),
                    PathNode.LineTo(39.3f, 111.87f),
                    PathNode.CurveTo(36.009224f, 115.2758f, 35.100758f, 120.33162f, 37.0f, 124.67f),
                    PathNode.CurveTo(38.90143f, 129.1722f, 43.34328f, 132.07146f, 48.23f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(45.1f, 117.39f),
                    PathNode.LineTo(118.83f, 39.88f),
                    PathNode.CurveTo(121.2367f, 37.40075f, 124.54473f, 36.001656f, 128.0f, 36.001656f),
                    PathNode.CurveTo(131.45528f, 36.001656f, 134.7633f, 37.40075f, 137.17f, 39.88f),
                    PathNode.LineTo(210.9f, 117.39f),
                    PathNode.CurveTo(211.99545f, 118.465866f, 212.30293f, 120.11111f, 211.67f, 121.51f),
                    PathNode.CurveTo(211.00731f, 123.064354f, 209.4589f, 124.05294f, 207.77f, 124.0f),
                    PathNode.LineTo(48.23f, 124.0f),
                    PathNode.CurveTo(46.541103f, 124.05294f, 44.9927f, 123.064354f, 44.33f, 121.51f),
                    PathNode.CurveTo(43.69706f, 120.11111f, 44.004543f, 118.465866f, 45.1f, 117.39f),
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
        return _eject!!
    }

private var _eject: ImageVector? = null
