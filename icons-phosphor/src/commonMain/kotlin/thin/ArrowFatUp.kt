package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowFatUp: ImageVector
    get() {
        if (_arrowFatUp != null) return _arrowFatUp!!
        _arrowFatUp = phosphorThinIcon(
            name = "ArrowFatUp",
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
                    PathNode.LineTo(76.0f, 208.0f),
                    PathNode.CurveTo(76.0f, 214.62741f, 81.37258f, 220.0f, 88.0f, 220.0f),
                    PathNode.LineTo(168.0f, 220.0f),
                    PathNode.CurveTo(174.62741f, 220.0f, 180.0f, 214.62741f, 180.0f, 208.0f),
                    PathNode.LineTo(180.0f, 124.0f),
                    PathNode.LineTo(224.0f, 124.0f),
                    PathNode.CurveTo(225.61882f, 124.001274f, 227.07881f, 123.02669f, 227.69849f, 121.53116f),
                    PathNode.CurveTo(228.31816f, 120.03563f, 227.97533f, 118.31405f, 226.83f, 117.17f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 116.0f),
                    PathNode.CurveTo(173.79086f, 116.0f, 172.0f, 117.79086f, 172.0f, 120.0f),
                    PathNode.LineTo(172.0f, 208.0f),
                    PathNode.CurveTo(172.0f, 210.20914f, 170.20914f, 212.0f, 168.0f, 212.0f),
                    PathNode.LineTo(88.0f, 212.0f),
                    PathNode.CurveTo(85.79086f, 212.0f, 84.0f, 210.20914f, 84.0f, 208.0f),
                    PathNode.LineTo(84.0f, 120.0f),
                    PathNode.CurveTo(84.0f, 117.79086f, 82.20914f, 116.0f, 80.0f, 116.0f),
                    PathNode.LineTo(41.66f, 116.0f),
                    PathNode.LineTo(128.0f, 29.66f),
                    PathNode.LineTo(214.34f, 116.0f),
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
        return _arrowFatUp!!
    }

private var _arrowFatUp: ImageVector? = null
