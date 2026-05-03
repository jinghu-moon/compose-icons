package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GooglePhotosLogo: ImageVector
    get() {
        if (_googlePhotosLogo != null) return _googlePhotosLogo!!
        _googlePhotosLogo = phosphorThinIcon(
            name = "GooglePhotosLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 124.0f),
                    PathNode.LineTo(185.68f, 124.0f),
                    PathNode.CurveTo(198.76161f, 103.03715f, 199.44215f, 76.6278f, 187.4576f, 55.019012f),
                    PathNode.CurveTo(175.47302f, 33.41022f, 152.7097f, 20.003204f, 128.0f, 20.0f),
                    PathNode.CurveTo(125.79086f, 20.0f, 124.0f, 21.790861f, 124.0f, 24.0f),
                    PathNode.LineTo(124.0f, 70.32f),
                    PathNode.CurveTo(103.03715f, 57.23839f, 76.6278f, 56.55784f, 55.019012f, 68.54241f),
                    PathNode.CurveTo(33.41022f, 80.52697f, 20.003204f, 103.29029f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 130.20914f, 21.790861f, 132.0f, 24.0f, 132.0f),
                    PathNode.LineTo(70.32f, 132.0f),
                    PathNode.CurveTo(57.23839f, 152.96284f, 56.55784f, 179.3722f, 68.54241f, 200.98099f),
                    PathNode.CurveTo(80.52697f, 222.58978f, 103.29029f, 235.9968f, 128.0f, 236.0f),
                    PathNode.CurveTo(130.20914f, 236.0f, 132.0f, 234.20914f, 132.0f, 232.0f),
                    PathNode.LineTo(132.0f, 185.68f),
                    PathNode.CurveTo(152.96284f, 198.76161f, 179.3722f, 199.44215f, 200.98099f, 187.4576f),
                    PathNode.CurveTo(222.58978f, 175.47302f, 235.9968f, 152.7097f, 236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 125.79086f, 234.20914f, 124.0f, 232.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 88.0f),
                    PathNode.CurveTo(188.05263f, 100.9907f, 183.83652f, 113.639015f, 176.0f, 124.0f),
                    PathNode.LineTo(132.0f, 124.0f),
                    PathNode.LineTo(132.0f, 28.13f),
                    PathNode.CurveTo(163.49736f, 30.273895f, 187.96252f, 56.429775f, 188.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 68.0f),
                    PathNode.CurveTo(100.9907f, 67.94737f, 113.639015f, 72.163475f, 124.0f, 80.0f),
                    PathNode.LineTo(124.0f, 124.0f),
                    PathNode.LineTo(28.13f, 124.0f),
                    PathNode.CurveTo(30.273895f, 92.50263f, 56.429775f, 68.03746f, 88.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 168.0f),
                    PathNode.CurveTo(67.94737f, 155.00931f, 72.163475f, 142.36098f, 80.0f, 132.0f),
                    PathNode.LineTo(124.0f, 132.0f),
                    PathNode.LineTo(124.0f, 227.87f),
                    PathNode.CurveTo(92.50263f, 225.7261f, 68.03746f, 199.57022f, 68.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 188.0f),
                    PathNode.CurveTo(155.00931f, 188.05263f, 142.36098f, 183.83652f, 132.0f, 176.0f),
                    PathNode.LineTo(132.0f, 132.0f),
                    PathNode.LineTo(227.87f, 132.0f),
                    PathNode.CurveTo(225.7261f, 163.49736f, 199.57022f, 187.96252f, 168.0f, 188.0f),
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
        return _googlePhotosLogo!!
    }

private var _googlePhotosLogo: ImageVector? = null
