package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShareFat: ImageVector
    get() {
        if (_shareFat != null) return _shareFat!!
        _shareFat = phosphorThinIcon(
            name = "ShareFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.83f, 109.17f),
                    PathNode.LineTo(154.83f, 29.17f),
                    PathNode.CurveTo(153.68596f, 28.02468f, 151.96437f, 27.681837f, 150.46884f, 28.30151f),
                    PathNode.CurveTo(148.97331f, 28.92118f, 147.99873f, 30.381174f, 148.0f, 32.0f),
                    PathNode.LineTo(148.0f, 76.09f),
                    PathNode.CurveTo(94.0f, 78.53f, 27.57f, 129.64f, 20.06f, 195.09f),
                    PathNode.CurveTo(19.628248f, 198.5208f, 21.486473f, 201.83151f, 24.64f, 203.25f),
                    PathNode.CurveTo(25.706001f, 203.75491f, 26.870468f, 204.01785f, 28.05f, 204.02f),
                    PathNode.CurveTo(30.250954f, 204.01366f, 32.349483f, 203.08945f, 33.84f, 201.47f),
                    PathNode.LineTo(33.84f, 201.47f),
                    PathNode.CurveTo(45.37f, 189.2f, 87.13f, 149.74f, 148.0f, 148.07f),
                    PathNode.LineTo(148.0f, 192.0f),
                    PathNode.CurveTo(147.99873f, 193.61882f, 148.97331f, 195.07881f, 150.46884f, 195.69849f),
                    PathNode.CurveTo(151.96437f, 196.31816f, 153.68596f, 195.97533f, 154.83f, 194.83f),
                    PathNode.LineTo(234.83f, 114.83f),
                    PathNode.CurveTo(235.58112f, 114.07973f, 236.00314f, 113.06164f, 236.00314f, 112.0f),
                    PathNode.CurveTo(236.00314f, 110.93836f, 235.58112f, 109.92027f, 234.83f, 109.17f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 182.33f),
                    PathNode.LineTo(156.0f, 144.0f),
                    PathNode.CurveTo(156.0f, 141.79086f, 154.20914f, 140.0f, 152.0f, 140.0f),
                    PathNode.CurveTo(124.61f, 140.0f, 97.92f, 147.17f, 72.66f, 161.3f),
                    PathNode.CurveTo(56.124817f, 170.57274f, 41.07126f, 182.26907f, 28.0f, 196.0f),
                    PathNode.LineTo(30.92f, 198.74f),
                    PathNode.LineTo(28.0f, 196.0f),
                    PathNode.CurveTo(31.36f, 166.79f, 47.55f, 138.52f, 73.6f, 116.43f),
                    PathNode.CurveTo(97.53f, 96.11f, 126.83f, 84.0f, 152.0f, 84.0f),
                    PathNode.CurveTo(154.20914f, 84.0f, 156.0f, 82.20914f, 156.0f, 80.0f),
                    PathNode.LineTo(156.0f, 41.66f),
                    PathNode.LineTo(226.34f, 112.0f),
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
        return _shareFat!!
    }

private var _shareFat: ImageVector? = null
