package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowFatLinesUp: ImageVector
    get() {
        if (_arrowFatLinesUp != null) return _arrowFatLinesUp!!
        _arrowFatLinesUp = phosphorThinIcon(
            name = "ArrowFatLinesUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.83f, 117.17f),
                    PathNode.LineTo(130.83f, 21.17f),
                    PathNode.CurveTo(130.07973f, 20.418892f, 129.06163f, 19.996853f, 128.0f, 19.996853f),
                    PathNode.CurveTo(126.93836f, 19.996853f, 125.92027f, 20.418892f, 125.17f, 21.17f),
                    PathNode.LineTo(29.17f, 117.17f),
                    PathNode.CurveTo(28.02468f, 118.31405f, 27.681837f, 120.03563f, 28.30151f, 121.53116f),
                    PathNode.CurveTo(28.92118f, 123.02669f, 30.381174f, 124.001274f, 32.0f, 124.0f),
                    PathNode.LineTo(76.0f, 124.0f),
                    PathNode.LineTo(76.0f, 152.0f),
                    PathNode.CurveTo(76.0f, 154.20914f, 77.79086f, 156.0f, 80.0f, 156.0f),
                    PathNode.LineTo(176.0f, 156.0f),
                    PathNode.CurveTo(178.20914f, 156.0f, 180.0f, 154.20914f, 180.0f, 152.0f),
                    PathNode.LineTo(180.0f, 124.0f),
                    PathNode.LineTo(224.0f, 124.0f),
                    PathNode.CurveTo(225.61882f, 124.001274f, 227.07881f, 123.02669f, 227.69849f, 121.53116f),
                    PathNode.CurveTo(228.31816f, 120.03563f, 227.97533f, 118.31405f, 226.83f, 117.17f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 116.0f),
                    PathNode.CurveTo(173.79086f, 116.0f, 172.0f, 117.79086f, 172.0f, 120.0f),
                    PathNode.LineTo(172.0f, 148.0f),
                    PathNode.LineTo(84.0f, 148.0f),
                    PathNode.LineTo(84.0f, 120.0f),
                    PathNode.CurveTo(84.0f, 117.79086f, 82.20914f, 116.0f, 80.0f, 116.0f),
                    PathNode.LineTo(41.66f, 116.0f),
                    PathNode.LineTo(128.0f, 29.66f),
                    PathNode.LineTo(214.34f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 216.0f),
                    PathNode.CurveTo(180.0f, 218.20914f, 178.20914f, 220.0f, 176.0f, 220.0f),
                    PathNode.LineTo(80.0f, 220.0f),
                    PathNode.CurveTo(77.79086f, 220.0f, 76.0f, 218.20914f, 76.0f, 216.0f),
                    PathNode.CurveTo(76.0f, 213.79086f, 77.79086f, 212.0f, 80.0f, 212.0f),
                    PathNode.LineTo(176.0f, 212.0f),
                    PathNode.CurveTo(178.20914f, 212.0f, 180.0f, 213.79086f, 180.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 184.0f),
                    PathNode.CurveTo(180.0f, 186.20914f, 178.20914f, 188.0f, 176.0f, 188.0f),
                    PathNode.LineTo(80.0f, 188.0f),
                    PathNode.CurveTo(77.79086f, 188.0f, 76.0f, 186.20914f, 76.0f, 184.0f),
                    PathNode.CurveTo(76.0f, 181.79086f, 77.79086f, 180.0f, 80.0f, 180.0f),
                    PathNode.LineTo(176.0f, 180.0f),
                    PathNode.CurveTo(178.20914f, 180.0f, 180.0f, 181.79086f, 180.0f, 184.0f),
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
        return _arrowFatLinesUp!!
    }

private var _arrowFatLinesUp: ImageVector? = null
