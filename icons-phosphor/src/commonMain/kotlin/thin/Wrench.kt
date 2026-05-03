package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = phosphorThinIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.05f, 70.5f),
                    PathNode.CurveTo(222.55746f, 69.28267f, 221.4988f, 68.38463f, 220.21744f, 68.09722f),
                    PathNode.CurveTo(218.9361f, 67.809814f, 217.59528f, 68.169655f, 216.63f, 69.06f),
                    PathNode.LineTo(174.81f, 107.66f),
                    PathNode.LineTo(153.0f, 103.0f),
                    PathNode.LineTo(148.32f, 81.21f),
                    PathNode.LineTo(186.92f, 39.39f),
                    PathNode.CurveTo(187.8148f, 38.424706f, 188.17744f, 37.08099f, 187.8898f, 35.79657f),
                    PathNode.CurveTo(187.60216f, 34.512154f, 186.70103f, 33.45145f, 185.48f, 32.96f),
                    PathNode.CurveTo(159.3385f, 22.37527f, 129.37646f, 29.025885f, 110.16828f, 49.676792f),
                    PathNode.CurveTo(90.9601f, 70.3277f, 86.493034f, 100.69215f, 98.94f, 126.0f),
                    PathNode.LineTo(36.4f, 180.0f),
                    PathNode.LineTo(36.19f, 180.2f),
                    PathNode.CurveTo(25.254763f, 191.13524f, 25.254763f, 208.86476f, 36.19f, 219.8f),
                    PathNode.CurveTo(47.125237f, 230.73524f, 64.85476f, 230.73524f, 75.79f, 219.8f),
                    PathNode.LineTo(75.99f, 219.59f),
                    PathNode.LineTo(129.99f, 157.05f),
                    PathNode.CurveTo(151.07153f, 167.41808f, 176.01157f, 166.16989f, 195.95255f, 153.74875f),
                    PathNode.CurveTo(215.89354f, 141.32759f, 228.01048f, 119.49314f, 228.0f, 96.0f),
                    PathNode.CurveTo(228.01627f, 87.25971f, 226.33516f, 78.59943f, 223.05f, 70.5f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 156.0f),
                    PathNode.CurveTo(149.85733f, 156.00117f, 139.8799f, 153.43112f, 131.0f, 148.53f),
                    PathNode.CurveTo(129.3346f, 147.59488f, 127.24043f, 147.96765f, 126.0f, 149.42f),
                    PathNode.LineTo(70.0f, 214.25f),
                    PathNode.CurveTo(62.09813f, 221.40976f, 49.968784f, 221.11111f, 42.428837f, 213.57117f),
                    PathNode.CurveTo(34.888885f, 206.03122f, 34.59025f, 193.90187f, 41.75f, 186.0f),
                    PathNode.LineTo(106.57f, 130.0f),
                    PathNode.CurveTo(108.022354f, 128.75957f, 108.39511f, 126.6654f, 107.46f, 125.0f),
                    PathNode.CurveTo(95.68384f, 103.70389f, 97.9372f, 77.403984f, 113.1644f, 58.421497f),
                    PathNode.CurveTo(128.3916f, 39.43902f, 153.5764f, 31.534054f, 176.92f, 38.41f),
                    PathNode.LineTo(141.05f, 77.29f),
                    PathNode.CurveTo(140.15846f, 78.23989f, 139.78535f, 79.56443f, 140.05f, 80.84f),
                    PathNode.LineTo(145.71f, 107.19f),
                    PathNode.CurveTo(146.04062f, 108.72799f, 147.24202f, 109.92938f, 148.78f, 110.26f),
                    PathNode.LineTo(175.13f, 115.92f),
                    PathNode.CurveTo(176.40558f, 116.18465f, 177.73012f, 115.81153f, 178.68f, 114.92f),
                    PathNode.LineTo(217.55f, 79.05f),
                    PathNode.CurveTo(222.87024f, 97.19005f, 219.33788f, 116.77638f, 208.01587f, 131.91502f),
                    PathNode.CurveTo(196.69386f, 147.05365f, 178.90411f, 155.97707f, 160.0f, 156.0f),
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
        return _wrench!!
    }

private var _wrench: ImageVector? = null
