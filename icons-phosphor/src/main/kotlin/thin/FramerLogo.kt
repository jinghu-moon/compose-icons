package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) return _framerLogo!!
        _framerLogo = phosphorThinIcon(
            name = "FramerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 104.0f),
                    PathNode.LineTo(204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 37.79086f, 202.20914f, 36.0f, 200.0f, 36.0f),
                    PathNode.LineTo(56.0f, 36.0f),
                    PathNode.CurveTo(54.333813f, 35.994053f, 52.83845f, 37.02157f, 52.24659f, 38.579105f),
                    PathNode.CurveTo(51.654724f, 40.13664f, 52.09034f, 41.897926f, 53.34f, 43.0f),
                    PathNode.LineTo(117.48f, 100.0f),
                    PathNode.LineTo(56.0f, 100.0f),
                    PathNode.CurveTo(53.79086f, 100.0f, 52.0f, 101.79086f, 52.0f, 104.0f),
                    PathNode.LineTo(52.0f, 168.0f),
                    PathNode.CurveTo(51.999165f, 169.06119f, 52.420044f, 170.07921f, 53.17f, 170.83f),
                    PathNode.LineTo(125.17f, 242.83f),
                    PathNode.CurveTo(126.31405f, 243.97533f, 128.03563f, 244.31816f, 129.53116f, 243.69849f),
                    PathNode.CurveTo(131.02669f, 243.07881f, 132.00127f, 241.61882f, 132.0f, 240.0f),
                    PathNode.LineTo(132.0f, 172.0f),
                    PathNode.LineTo(200.0f, 172.0f),
                    PathNode.CurveTo(201.66618f, 172.00595f, 203.16154f, 170.97844f, 203.75342f, 169.4209f),
                    PathNode.CurveTo(204.34528f, 167.86336f, 203.90965f, 166.10208f, 202.66f, 165.0f),
                    PathNode.LineTo(138.52f, 108.0f),
                    PathNode.LineTo(200.0f, 108.0f),
                    PathNode.CurveTo(202.20914f, 108.0f, 204.0f, 106.20914f, 204.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(189.48f, 164.0f),
                    PathNode.LineTo(128.0f, 164.0f),
                    PathNode.CurveTo(125.79086f, 164.0f, 124.0f, 165.79086f, 124.0f, 168.0f),
                    PathNode.LineTo(124.0f, 230.34f),
                    PathNode.LineTo(60.0f, 166.34f),
                    PathNode.LineTo(60.0f, 108.0f),
                    PathNode.LineTo(126.48f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 100.0f),
                    PathNode.LineTo(129.52f, 100.0f),
                    PathNode.LineTo(66.52f, 44.0f),
                    PathNode.LineTo(196.0f, 44.0f),
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
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
