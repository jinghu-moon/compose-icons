package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StripeLogo: ImageVector
    get() {
        if (_stripeLogo != null) return _stripeLogo!!
        _stripeLogo = phosphorThinIcon(
            name = "StripeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 152.0f),
                    PathNode.CurveTo(164.0f, 167.44f, 147.85f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(108.15f, 180.0f, 92.0f, 167.44f, 92.0f, 152.0f),
                    PathNode.CurveTo(92.0f, 149.79086f, 93.79086f, 148.0f, 96.0f, 148.0f),
                    PathNode.CurveTo(98.20914f, 148.0f, 100.0f, 149.79086f, 100.0f, 152.0f),
                    PathNode.CurveTo(100.0f, 163.0f, 112.56f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(143.44f, 172.0f, 156.0f, 163.0f, 156.0f, 152.0f),
                    PathNode.CurveTo(156.0f, 139.42f, 144.21f, 135.08f, 126.22f, 129.89f),
                    PathNode.CurveTo(111.0f, 125.51f, 93.78f, 120.54f, 93.78f, 104.0f),
                    PathNode.CurveTo(93.78f, 88.0f, 108.49f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(142.2f, 76.0f, 154.3f, 82.46f, 159.55f, 92.85f),
                    PathNode.CurveTo(160.27379f, 94.13207f, 160.23479f, 95.70811f, 159.44847f, 96.952805f),
                    PathNode.CurveTo(158.66214f, 98.1975f, 157.25563f, 98.90964f, 155.78697f, 98.806656f),
                    PathNode.CurveTo(154.31831f, 98.70368f, 153.02493f, 97.802246f, 152.42f, 96.46f),
                    PathNode.CurveTo(148.53f, 88.78f, 139.17f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(113.0f, 84.0f, 101.78f, 92.6f, 101.78f, 104.0f),
                    PathNode.CurveTo(101.78f, 113.81f, 111.85f, 117.43f, 128.44f, 122.21f),
                    PathNode.CurveTo(145.03f, 126.99f, 164.0f, 132.46f, 164.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 48.0f),
                    PathNode.LineTo(220.0f, 208.0f),
                    PathNode.CurveTo(220.0f, 214.62741f, 214.62741f, 220.0f, 208.0f, 220.0f),
                    PathNode.LineTo(48.0f, 220.0f),
                    PathNode.CurveTo(41.37258f, 220.0f, 36.0f, 214.62741f, 36.0f, 208.0f),
                    PathNode.LineTo(36.0f, 48.0f),
                    PathNode.CurveTo(36.0f, 41.37258f, 41.37258f, 36.0f, 48.0f, 36.0f),
                    PathNode.LineTo(208.0f, 36.0f),
                    PathNode.CurveTo(214.62741f, 36.0f, 220.0f, 41.37258f, 220.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 48.0f),
                    PathNode.CurveTo(212.0f, 45.79086f, 210.20914f, 44.0f, 208.0f, 44.0f),
                    PathNode.LineTo(48.0f, 44.0f),
                    PathNode.CurveTo(45.79086f, 44.0f, 44.0f, 45.79086f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 210.20914f, 45.79086f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(210.20914f, 212.0f, 212.0f, 210.20914f, 212.0f, 208.0f),
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
        return _stripeLogo!!
    }

private var _stripeLogo: ImageVector? = null
