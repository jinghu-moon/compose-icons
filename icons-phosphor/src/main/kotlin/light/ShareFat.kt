package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShareFat: ImageVector
    get() {
        if (_shareFat != null) return _shareFat!!
        _shareFat = phosphorLightIcon(
            name = "ShareFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.24f, 107.76f),
                    PathNode.LineTo(156.24f, 27.76f),
                    PathNode.CurveTo(154.52411f, 26.046238f, 151.94527f, 25.533934f, 149.7046f, 26.461704f),
                    PathNode.CurveTo(147.46396f, 27.389475f, 146.00215f, 29.574867f, 146.0f, 32.0f),
                    PathNode.LineTo(146.0f, 74.2f),
                    PathNode.CurveTo(91.52f, 77.79f, 25.61f, 129.2f, 18.07f, 194.86f),
                    PathNode.CurveTo(17.567724f, 199.14845f, 19.874624f, 203.27496f, 23.790842f, 205.09329f),
                    PathNode.CurveTo(27.707058f, 206.91162f, 32.34807f, 206.01105f, 35.3f, 202.86f),
                    PathNode.LineTo(35.3f, 202.86f),
                    PathNode.CurveTo(46.56f, 190.85f, 87.0f, 152.6f, 146.0f, 150.13f),
                    PathNode.LineTo(146.0f, 192.0f),
                    PathNode.CurveTo(146.00215f, 194.42514f, 147.46396f, 196.61052f, 149.7046f, 197.5383f),
                    PathNode.CurveTo(151.94527f, 198.46606f, 154.52411f, 197.95377f, 156.24f, 196.24f),
                    PathNode.LineTo(236.24f, 116.24f),
                    PathNode.CurveTo(238.57962f, 113.89746f, 238.57962f, 110.10254f, 236.24f, 107.76f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 177.52f),
                    PathNode.LineTo(158.0f, 144.0f),
                    PathNode.CurveTo(158.0f, 140.6863f, 155.3137f, 138.0f, 152.0f, 138.0f),
                    PathNode.CurveTo(124.27f, 138.0f, 97.24f, 145.25f, 71.68f, 159.55f),
                    PathNode.CurveTo(56.78227f, 167.91878f, 43.059444f, 178.22519f, 30.87f, 190.2f),
                    PathNode.CurveTo(35.57f, 163.64f, 51.03f, 138.2f, 74.87f, 117.93f),
                    PathNode.CurveTo(98.47f, 97.94f, 127.29f, 86.0f, 152.0f, 86.0f),
                    PathNode.CurveTo(155.3137f, 86.0f, 158.0f, 83.313705f, 158.0f, 80.0f),
                    PathNode.LineTo(158.0f, 46.49f),
                    PathNode.LineTo(223.51f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shareFat!!
    }

private var _shareFat: ImageVector? = null
