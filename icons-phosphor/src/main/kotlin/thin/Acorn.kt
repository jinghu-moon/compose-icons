package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Acorn: ImageVector
    get() {
        if (_acorn != null) return _acorn!!
        _acorn = phosphorThinIcon(
            name = "Acorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 104.0f),
                    PathNode.CurveTo(227.96693f, 75.2949f, 204.7051f, 52.033066f, 176.0f, 52.0f),
                    PathNode.LineTo(132.0f, 52.0f),
                    PathNode.LineTo(132.0f, 48.0f),
                    PathNode.CurveTo(132.0f, 32.536026f, 144.53603f, 20.0f, 160.0f, 20.0f),
                    PathNode.CurveTo(162.20914f, 20.0f, 164.0f, 18.209139f, 164.0f, 16.0f),
                    PathNode.CurveTo(164.0f, 13.790861f, 162.20914f, 12.0f, 160.0f, 12.0f),
                    PathNode.CurveTo(140.11777f, 12.0f, 124.0f, 28.117748f, 124.0f, 48.0f),
                    PathNode.LineTo(124.0f, 52.0f),
                    PathNode.LineTo(80.0f, 52.0f),
                    PathNode.CurveTo(51.2949f, 52.033066f, 28.033064f, 75.2949f, 28.0f, 104.0f),
                    PathNode.CurveTo(28.005804f, 109.08036f, 31.210182f, 113.606544f, 36.0f, 115.3f),
                    PathNode.LineTo(36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 161.61f, 68.29f, 187.54f, 94.24f, 208.37f),
                    PathNode.CurveTo(109.54f, 220.66f, 124.0f, 232.27f, 124.0f, 240.0f),
                    PathNode.CurveTo(124.0f, 242.20914f, 125.79086f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(130.20914f, 244.0f, 132.0f, 242.20914f, 132.0f, 240.0f),
                    PathNode.CurveTo(132.0f, 232.27f, 146.46f, 220.66f, 161.76f, 208.37f),
                    PathNode.CurveTo(187.71f, 187.54f, 220.0f, 161.61f, 220.0f, 128.0f),
                    PathNode.LineTo(220.0f, 115.3f),
                    PathNode.CurveTo(224.78981f, 113.606544f, 227.9942f, 109.08036f, 228.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.75f, 202.13f),
                    PathNode.CurveTo(144.24f, 212.18f, 133.52f, 220.78f, 128.0f, 228.92f),
                    PathNode.CurveTo(122.48f, 220.78f, 111.76f, 212.18f, 99.25f, 202.13f),
                    PathNode.CurveTo(74.63f, 182.37f, 44.0f, 157.78f, 44.0f, 128.0f),
                    PathNode.LineTo(44.0f, 116.0f),
                    PathNode.LineTo(212.0f, 116.0f),
                    PathNode.LineTo(212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 157.78f, 181.37f, 182.37f, 156.75f, 202.13f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 108.0f),
                    PathNode.LineTo(40.0f, 108.0f),
                    PathNode.CurveTo(37.79086f, 108.0f, 36.0f, 106.20914f, 36.0f, 104.0f),
                    PathNode.CurveTo(36.027554f, 79.71089f, 55.71089f, 60.027554f, 80.0f, 60.0f),
                    PathNode.LineTo(176.0f, 60.0f),
                    PathNode.CurveTo(200.28911f, 60.027554f, 219.97244f, 79.71089f, 220.0f, 104.0f),
                    PathNode.CurveTo(220.0f, 106.20914f, 218.20914f, 108.0f, 216.0f, 108.0f),
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
        return _acorn!!
    }

private var _acorn: ImageVector? = null
