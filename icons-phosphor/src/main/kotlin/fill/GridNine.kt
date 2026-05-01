package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GridNine: ImageVector
    get() {
        if (_gridNine != null) return _gridNine!!
        _gridNine = phosphorFillIcon(
            name = "GridNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(84.0f, 52.0f),
                    PathNode.LineTo(84.0f, 92.0f),
                    PathNode.LineTo(28.0f, 92.0f),
                    PathNode.CurveTo(25.790861f, 92.0f, 24.0f, 90.20914f, 24.0f, 88.0f),
                    PathNode.LineTo(24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 55.163445f, 31.163445f, 48.0f, 40.0f, 48.0f),
                    PathNode.LineTo(80.0f, 48.0f),
                    PathNode.CurveTo(82.20914f, 48.0f, 84.0f, 49.79086f, 84.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 204.0f),
                    PathNode.CurveTo(100.0f, 206.20914f, 101.79086f, 208.0f, 104.0f, 208.0f),
                    PathNode.LineTo(152.0f, 208.0f),
                    PathNode.CurveTo(154.20914f, 208.0f, 156.0f, 206.20914f, 156.0f, 204.0f),
                    PathNode.LineTo(156.0f, 164.0f),
                    PathNode.LineTo(100.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(24.0f, 168.0f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.CurveTo(24.0f, 200.83656f, 31.163445f, 208.0f, 40.0f, 208.0f),
                    PathNode.LineTo(80.0f, 208.0f),
                    PathNode.CurveTo(82.20914f, 208.0f, 84.0f, 206.20914f, 84.0f, 204.0f),
                    PathNode.LineTo(84.0f, 164.0f),
                    PathNode.LineTo(28.0f, 164.0f),
                    PathNode.CurveTo(25.790861f, 164.0f, 24.0f, 165.79086f, 24.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(24.0f, 112.0f),
                    PathNode.LineTo(24.0f, 144.0f),
                    PathNode.CurveTo(24.0f, 146.20914f, 25.790861f, 148.0f, 28.0f, 148.0f),
                    PathNode.LineTo(84.0f, 148.0f),
                    PathNode.LineTo(84.0f, 108.0f),
                    PathNode.LineTo(28.0f, 108.0f),
                    PathNode.CurveTo(25.790861f, 108.0f, 24.0f, 109.79086f, 24.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 48.0f),
                    PathNode.LineTo(104.0f, 48.0f),
                    PathNode.CurveTo(101.79086f, 48.0f, 100.0f, 49.79086f, 100.0f, 52.0f),
                    PathNode.LineTo(100.0f, 92.0f),
                    PathNode.LineTo(156.0f, 92.0f),
                    PathNode.LineTo(156.0f, 52.0f),
                    PathNode.CurveTo(156.0f, 49.79086f, 154.20914f, 48.0f, 152.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 108.0f),
                    PathNode.LineTo(172.0f, 108.0f),
                    PathNode.LineTo(172.0f, 148.0f),
                    PathNode.LineTo(228.0f, 148.0f),
                    PathNode.CurveTo(230.20914f, 148.0f, 232.0f, 146.20914f, 232.0f, 144.0f),
                    PathNode.LineTo(232.0f, 112.0f),
                    PathNode.CurveTo(232.0f, 109.79086f, 230.20914f, 108.0f, 228.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 148.0f),
                    PathNode.LineTo(156.0f, 148.0f),
                    PathNode.LineTo(156.0f, 108.0f),
                    PathNode.LineTo(100.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(176.0f, 48.0f),
                    PathNode.CurveTo(173.79086f, 48.0f, 172.0f, 49.79086f, 172.0f, 52.0f),
                    PathNode.LineTo(172.0f, 92.0f),
                    PathNode.LineTo(228.0f, 92.0f),
                    PathNode.CurveTo(230.20914f, 92.0f, 232.0f, 90.20914f, 232.0f, 88.0f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.CurveTo(232.0f, 55.163445f, 224.83656f, 48.0f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 164.0f),
                    PathNode.LineTo(172.0f, 164.0f),
                    PathNode.LineTo(172.0f, 204.0f),
                    PathNode.CurveTo(172.0f, 206.20914f, 173.79086f, 208.0f, 176.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(224.83656f, 208.0f, 232.0f, 200.83656f, 232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 168.0f),
                    PathNode.CurveTo(232.0f, 165.79086f, 230.20914f, 164.0f, 228.0f, 164.0f),
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
        return _gridNine!!
    }

private var _gridNine: ImageVector? = null
