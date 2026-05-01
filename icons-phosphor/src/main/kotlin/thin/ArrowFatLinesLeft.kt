package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowFatLinesLeft: ImageVector
    get() {
        if (_arrowFatLinesLeft != null) return _arrowFatLinesLeft!!
        _arrowFatLinesLeft = phosphorThinIcon(
            name = "ArrowFatLinesLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 76.0f),
                    PathNode.LineTo(124.0f, 76.0f),
                    PathNode.LineTo(124.0f, 32.0f),
                    PathNode.CurveTo(124.001274f, 30.381174f, 123.02669f, 28.92118f, 121.53116f, 28.30151f),
                    PathNode.CurveTo(120.03563f, 27.681837f, 118.31405f, 28.02468f, 117.17f, 29.17f),
                    PathNode.LineTo(21.17f, 125.17f),
                    PathNode.CurveTo(20.418892f, 125.92027f, 19.996853f, 126.93836f, 19.996853f, 128.0f),
                    PathNode.CurveTo(19.996853f, 129.06163f, 20.418892f, 130.07973f, 21.17f, 130.83f),
                    PathNode.LineTo(117.17f, 226.83f),
                    PathNode.CurveTo(118.31405f, 227.97533f, 120.03563f, 228.31816f, 121.53116f, 227.69849f),
                    PathNode.CurveTo(123.02669f, 227.07881f, 124.001274f, 225.61882f, 124.0f, 224.0f),
                    PathNode.LineTo(124.0f, 180.0f),
                    PathNode.LineTo(152.0f, 180.0f),
                    PathNode.CurveTo(154.20914f, 180.0f, 156.0f, 178.20914f, 156.0f, 176.0f),
                    PathNode.LineTo(156.0f, 80.0f),
                    PathNode.CurveTo(156.0f, 77.79086f, 154.20914f, 76.0f, 152.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 172.0f),
                    PathNode.LineTo(120.0f, 172.0f),
                    PathNode.CurveTo(117.79086f, 172.0f, 116.0f, 173.79086f, 116.0f, 176.0f),
                    PathNode.LineTo(116.0f, 214.34f),
                    PathNode.LineTo(29.66f, 128.0f),
                    PathNode.LineTo(116.0f, 41.66f),
                    PathNode.LineTo(116.0f, 80.0f),
                    PathNode.CurveTo(116.0f, 82.20914f, 117.79086f, 84.0f, 120.0f, 84.0f),
                    PathNode.LineTo(148.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 80.0f),
                    PathNode.LineTo(220.0f, 176.0f),
                    PathNode.CurveTo(220.0f, 178.20914f, 218.20914f, 180.0f, 216.0f, 180.0f),
                    PathNode.CurveTo(213.79086f, 180.0f, 212.0f, 178.20914f, 212.0f, 176.0f),
                    PathNode.LineTo(212.0f, 80.0f),
                    PathNode.CurveTo(212.0f, 77.79086f, 213.79086f, 76.0f, 216.0f, 76.0f),
                    PathNode.CurveTo(218.20914f, 76.0f, 220.0f, 77.79086f, 220.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 80.0f),
                    PathNode.LineTo(188.0f, 176.0f),
                    PathNode.CurveTo(188.0f, 178.20914f, 186.20914f, 180.0f, 184.0f, 180.0f),
                    PathNode.CurveTo(181.79086f, 180.0f, 180.0f, 178.20914f, 180.0f, 176.0f),
                    PathNode.LineTo(180.0f, 80.0f),
                    PathNode.CurveTo(180.0f, 77.79086f, 181.79086f, 76.0f, 184.0f, 76.0f),
                    PathNode.CurveTo(186.20914f, 76.0f, 188.0f, 77.79086f, 188.0f, 80.0f),
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
        return _arrowFatLinesLeft!!
    }

private var _arrowFatLinesLeft: ImageVector? = null
