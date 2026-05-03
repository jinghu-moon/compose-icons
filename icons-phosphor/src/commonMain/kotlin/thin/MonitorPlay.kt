package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MonitorPlay: ImageVector
    get() {
        if (_monitorPlay != null) return _monitorPlay!!
        _monitorPlay = phosphorThinIcon(
            name = "MonitorPlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(162.22f, 116.67f),
                    PathNode.LineTo(114.22f, 84.67f),
                    PathNode.CurveTo(112.99226f, 83.85087f, 111.41322f, 83.77437f, 110.11206f, 84.47098f),
                    PathNode.CurveTo(108.81089f, 85.16758f, 107.99904f, 86.52409f, 108.0f, 88.0f),
                    PathNode.LineTo(108.0f, 152.0f),
                    PathNode.CurveTo(107.998276f, 153.47581f, 108.80932f, 154.83267f, 110.11f, 155.53f),
                    PathNode.CurveTo(111.41188f, 156.22714f, 112.99196f, 156.15025f, 114.22f, 155.33f),
                    PathNode.LineTo(162.22f, 123.33f),
                    PathNode.CurveTo(163.33435f, 122.5884f, 164.0039f, 121.33856f, 164.0039f, 120.0f),
                    PathNode.CurveTo(164.0039f, 118.66144f, 163.33435f, 117.4116f, 162.22f, 116.67f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 144.53f),
                    PathNode.LineTo(116.0f, 95.47f),
                    PathNode.LineTo(152.79f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 44.0f),
                    PathNode.LineTo(48.0f, 44.0f),
                    PathNode.CurveTo(36.954304f, 44.0f, 28.0f, 52.954304f, 28.0f, 64.0f),
                    PathNode.LineTo(28.0f, 176.0f),
                    PathNode.CurveTo(28.0f, 187.0457f, 36.954304f, 196.0f, 48.0f, 196.0f),
                    PathNode.LineTo(208.0f, 196.0f),
                    PathNode.CurveTo(219.0457f, 196.0f, 228.0f, 187.0457f, 228.0f, 176.0f),
                    PathNode.LineTo(228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 52.954304f, 219.0457f, 44.0f, 208.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 176.0f),
                    PathNode.CurveTo(220.0f, 182.62741f, 214.62741f, 188.0f, 208.0f, 188.0f),
                    PathNode.LineTo(48.0f, 188.0f),
                    PathNode.CurveTo(41.37258f, 188.0f, 36.0f, 182.62741f, 36.0f, 176.0f),
                    PathNode.LineTo(36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 57.37258f, 41.37258f, 52.0f, 48.0f, 52.0f),
                    PathNode.LineTo(208.0f, 52.0f),
                    PathNode.CurveTo(214.62741f, 52.0f, 220.0f, 57.37258f, 220.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 224.0f),
                    PathNode.CurveTo(164.0f, 226.20914f, 162.20914f, 228.0f, 160.0f, 228.0f),
                    PathNode.LineTo(96.0f, 228.0f),
                    PathNode.CurveTo(93.79086f, 228.0f, 92.0f, 226.20914f, 92.0f, 224.0f),
                    PathNode.CurveTo(92.0f, 221.79086f, 93.79086f, 220.0f, 96.0f, 220.0f),
                    PathNode.LineTo(160.0f, 220.0f),
                    PathNode.CurveTo(162.20914f, 220.0f, 164.0f, 221.79086f, 164.0f, 224.0f),
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
        return _monitorPlay!!
    }

private var _monitorPlay: ImageVector? = null
