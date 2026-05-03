package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) return _flagBannerFold!!
        _flagBannerFold = phosphorThinIcon(
            name = "FlagBannerFold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.36f, 45.83f),
                    PathNode.CurveTo(234.62326f, 44.68918f, 233.35803f, 44.000076f, 232.0f, 44.0f),
                    PathNode.LineTo(152.0f, 44.0f),
                    PathNode.CurveTo(150.43307f, 43.99972f, 149.01027f, 44.914375f, 148.36f, 46.34f),
                    PathNode.LineTo(138.52f, 68.0f),
                    PathNode.LineTo(28.0f, 68.0f),
                    PathNode.CurveTo(26.40971f, 67.98418f, 24.961119f, 68.911964f, 24.310383f, 70.363106f),
                    PathNode.CurveTo(23.659645f, 71.81425f, 23.930399f, 73.51305f, 25.0f, 74.69f),
                    PathNode.LineTo(62.59f, 116.0f),
                    PathNode.LineTo(25.0f, 157.31f),
                    PathNode.CurveTo(23.930399f, 158.48695f, 23.659645f, 160.18575f, 24.310383f, 161.63689f),
                    PathNode.CurveTo(24.961119f, 163.08803f, 26.40971f, 164.01582f, 28.0f, 164.0f),
                    PathNode.LineTo(101.09f, 164.0f),
                    PathNode.CurveTo(102.659256f, 163.99849f, 104.08268f, 163.07953f, 104.73f, 161.65f),
                    PathNode.LineTo(114.58f, 140.0f),
                    PathNode.LineTo(185.79f, 140.0f),
                    PathNode.LineTo(148.36f, 222.34f),
                    PathNode.CurveTo(147.92084f, 223.30785f, 147.88492f, 224.41066f, 148.26015f, 225.40504f),
                    PathNode.CurveTo(148.63539f, 226.39941f, 149.39093f, 227.20357f, 150.36f, 227.64f),
                    PathNode.CurveTo(150.8757f, 227.87268f, 151.43425f, 227.99529f, 152.0f, 228.0f),
                    PathNode.CurveTo(153.56926f, 227.99849f, 154.99268f, 227.07953f, 155.64f, 225.65f),
                    PathNode.LineTo(235.64f, 49.65f),
                    PathNode.CurveTo(236.20201f, 48.411842f, 236.09654f, 46.972977f, 235.36f, 45.83f),
                    PathNode.Close,
                    PathNode.MoveTo(98.52f, 156.0f),
                    PathNode.LineTo(37.0f, 156.0f),
                    PathNode.LineTo(71.0f, 118.69f),
                    PathNode.CurveTo(72.38615f, 117.16452f, 72.38615f, 114.83548f, 71.0f, 113.31f),
                    PathNode.LineTo(37.0f, 76.0f),
                    PathNode.LineTo(134.84f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(189.42f, 132.0f),
                    PathNode.LineTo(118.21f, 132.0f),
                    PathNode.LineTo(154.58f, 52.0f),
                    PathNode.LineTo(225.79f, 52.0f),
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
        return _flagBannerFold!!
    }

private var _flagBannerFold: ImageVector? = null
