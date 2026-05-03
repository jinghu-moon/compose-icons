package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tabs: ImageVector
    get() {
        if (_tabs != null) return _tabs!!
        _tabs = phosphorThinIcon(
            name = "Tabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(251.81f, 166.86f),
                    PathNode.LineTo(251.81f, 166.86f),
                    PathNode.LineTo(229.52f, 92.56f),
                    PathNode.CurveTo(228.02563f, 87.47347f, 223.35149f, 83.98517f, 218.05f, 84.0f),
                    PathNode.LineTo(208.0f, 84.0f),
                    PathNode.CurveTo(205.79086f, 84.0f, 204.0f, 85.79086f, 204.0f, 88.0f),
                    PathNode.CurveTo(204.0f, 90.20914f, 205.79086f, 92.0f, 208.0f, 92.0f),
                    PathNode.LineTo(218.05f, 92.0f),
                    PathNode.CurveTo(219.81578f, 92.000496f, 221.37234f, 93.15877f, 221.88f, 94.85f),
                    PathNode.LineTo(242.62f, 164.0f),
                    PathNode.LineTo(203.0f, 164.0f),
                    PathNode.LineTo(181.54f, 92.55f),
                    PathNode.CurveTo(180.03992f, 87.4603f, 175.35611f, 83.97495f, 170.05f, 84.0f),
                    PathNode.LineTo(160.0f, 84.0f),
                    PathNode.CurveTo(157.79086f, 84.0f, 156.0f, 85.79086f, 156.0f, 88.0f),
                    PathNode.CurveTo(156.0f, 90.20914f, 157.79086f, 92.0f, 160.0f, 92.0f),
                    PathNode.LineTo(170.05f, 92.0f),
                    PathNode.CurveTo(171.81578f, 92.000496f, 173.37234f, 93.15877f, 173.88f, 94.85f),
                    PathNode.LineTo(194.62f, 164.0f),
                    PathNode.LineTo(155.0f, 164.0f),
                    PathNode.LineTo(133.54f, 92.55f),
                    PathNode.CurveTo(132.03992f, 87.4603f, 127.3561f, 83.97495f, 122.05f, 84.0f),
                    PathNode.LineTo(38.0f, 84.0f),
                    PathNode.CurveTo(32.693897f, 83.97495f, 28.01009f, 87.4603f, 26.51f, 92.55f),
                    PathNode.LineTo(4.17f, 166.85f),
                    PathNode.CurveTo(4.17f, 166.91f, 4.17f, 166.97f, 4.17f, 167.02f),
                    PathNode.CurveTo(3.86975f, 168.2078f, 4.130395f, 169.46767f, 4.877287f, 170.43883f),
                    PathNode.CurveTo(5.62418f, 171.40997f, 6.774939f, 171.98529f, 8.0f, 172.0f),
                    PathNode.LineTo(248.0f, 172.0f),
                    PathNode.CurveTo(250.20914f, 172.0f, 252.0f, 170.20914f, 252.0f, 168.0f),
                    PathNode.CurveTo(251.99379f, 167.61266f, 251.92975f, 167.22844f, 251.81f, 166.86f),
                    PathNode.Close,
                    PathNode.MoveTo(34.12f, 94.86f),
                    PathNode.CurveTo(34.629215f, 93.14695f, 36.212982f, 91.97953f, 38.0f, 92.0f),
                    PathNode.LineTo(122.1f, 92.0f),
                    PathNode.CurveTo(123.86578f, 92.000496f, 125.42234f, 93.15877f, 125.93f, 94.85f),
                    PathNode.LineTo(146.62f, 164.0f),
                    PathNode.LineTo(13.38f, 164.0f),
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
        return _tabs!!
    }

private var _tabs: ImageVector? = null
