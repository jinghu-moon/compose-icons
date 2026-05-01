package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) return _asteriskSimple!!
        _asteriskSimple = phosphorThinIcon(
            name = "AsteriskSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(209.48f, 99.71f),
                    PathNode.LineTo(134.42f, 129.71f),
                    PathNode.LineTo(187.16f, 197.51f),
                    PathNode.CurveTo(187.81255f, 198.34886f, 188.10443f, 199.41293f, 187.97122f, 200.46733f),
                    PathNode.CurveTo(187.83801f, 201.52173f, 187.29066f, 202.47978f, 186.45f, 203.13f),
                    PathNode.CurveTo(185.75569f, 203.68954f, 184.89172f, 203.99635f, 184.0f, 204.0f),
                    PathNode.CurveTo(182.76546f, 204.0018f, 181.59924f, 203.43347f, 180.84f, 202.46f),
                    PathNode.LineTo(128.0f, 134.52f),
                    PathNode.LineTo(75.16f, 202.46f),
                    PathNode.CurveTo(74.40076f, 203.43347f, 73.23454f, 204.0018f, 72.0f, 204.0f),
                    PathNode.CurveTo(71.11278f, 203.99947f, 70.2509f, 203.70396f, 69.55f, 203.16f),
                    PathNode.CurveTo(68.709335f, 202.50978f, 68.16199f, 201.55174f, 68.028786f, 200.49733f),
                    PathNode.CurveTo(67.89558f, 199.44293f, 68.187454f, 198.37886f, 68.84f, 197.54f),
                    PathNode.LineTo(121.58f, 129.74f),
                    PathNode.LineTo(46.52f, 99.74f),
                    PathNode.CurveTo(44.471024f, 98.911575f, 43.48157f, 96.57898f, 44.31f, 94.53f),
                    PathNode.CurveTo(45.138428f, 92.481026f, 47.471024f, 91.49157f, 49.52f, 92.32f),
                    PathNode.LineTo(124.0f, 122.09f),
                    PathNode.LineTo(124.0f, 40.0f),
                    PathNode.CurveTo(124.0f, 37.79086f, 125.79086f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(130.20914f, 36.0f, 132.0f, 37.79086f, 132.0f, 40.0f),
                    PathNode.LineTo(132.0f, 122.09f),
                    PathNode.LineTo(206.51f, 92.29f),
                    PathNode.CurveTo(208.55898f, 91.46157f, 210.89157f, 92.45103f, 211.72f, 94.5f),
                    PathNode.CurveTo(212.54843f, 96.54897f, 211.55898f, 98.88158f, 209.51f, 99.71f),
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
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
