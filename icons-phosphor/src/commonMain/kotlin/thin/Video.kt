package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = phosphorThinIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(162.22f, 108.67f),
                    PathNode.LineTo(114.22f, 76.67f),
                    PathNode.CurveTo(112.99226f, 75.85087f, 111.41322f, 75.77437f, 110.11206f, 76.47098f),
                    PathNode.CurveTo(108.81089f, 77.16758f, 107.99904f, 78.52409f, 108.0f, 80.0f),
                    PathNode.LineTo(108.0f, 144.0f),
                    PathNode.CurveTo(107.998276f, 145.47581f, 108.80932f, 146.83267f, 110.11f, 147.53f),
                    PathNode.CurveTo(111.41188f, 148.22714f, 112.99196f, 148.15025f, 114.22f, 147.33f),
                    PathNode.LineTo(162.22f, 115.33f),
                    PathNode.CurveTo(163.33435f, 114.5884f, 164.0039f, 113.33856f, 164.0039f, 112.0f),
                    PathNode.CurveTo(164.0039f, 110.66144f, 163.33435f, 109.4116f, 162.22f, 108.67f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 136.53f),
                    PathNode.LineTo(116.0f, 87.47f),
                    PathNode.LineTo(152.79f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(33.37258f, 44.0f, 28.0f, 49.37258f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 168.0f),
                    PathNode.CurveTo(28.0f, 174.62741f, 33.37258f, 180.0f, 40.0f, 180.0f),
                    PathNode.LineTo(216.0f, 180.0f),
                    PathNode.CurveTo(222.62741f, 180.0f, 228.0f, 174.62741f, 228.0f, 168.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 49.37258f, 222.62741f, 44.0f, 216.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 168.0f),
                    PathNode.CurveTo(220.0f, 170.20914f, 218.20914f, 172.0f, 216.0f, 172.0f),
                    PathNode.LineTo(40.0f, 172.0f),
                    PathNode.CurveTo(37.79086f, 172.0f, 36.0f, 170.20914f, 36.0f, 168.0f),
                    PathNode.LineTo(36.0f, 56.0f),
                    PathNode.CurveTo(36.0f, 53.79086f, 37.79086f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(218.20914f, 52.0f, 220.0f, 53.79086f, 220.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 210.20914f, 226.20914f, 212.0f, 224.0f, 212.0f),
                    PathNode.LineTo(32.0f, 212.0f),
                    PathNode.CurveTo(29.790861f, 212.0f, 28.0f, 210.20914f, 28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 205.79086f, 29.790861f, 204.0f, 32.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(226.20914f, 204.0f, 228.0f, 205.79086f, 228.0f, 208.0f),
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
        return _video!!
    }

private var _video: ImageVector? = null
