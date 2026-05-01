package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SteamLogo: ImageVector
    get() {
        if (_steamLogo != null) return _steamLogo!!
        _steamLogo = phosphorLightIcon(
            name = "SteamLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.38f, 184.17f),
                    PathNode.LineTo(177.59f, 134.24f),
                    PathNode.CurveTo(187.6626f, 126.04933f, 192.1917f, 112.83759f, 189.2627f, 100.18986f),
                    PathNode.CurveTo(186.33366f, 87.54212f, 176.45787f, 77.666336f, 163.81013f, 74.73732f),
                    PathNode.CurveTo(151.1624f, 71.80831f, 137.95067f, 76.3374f, 129.76f, 86.41f),
                    PathNode.LineTo(85.33f, 140.85f),
                    PathNode.LineTo(43.0f, 98.49f),
                    PathNode.CurveTo(58.81064f, 53.010265f, 107.72942f, 28.14817f, 153.78781f, 42.184086f),
                    PathNode.CurveTo(199.8462f, 56.219994f, 226.58577f, 104.138336f, 214.34567f, 150.70616f),
                    PathNode.CurveTo(202.10559f, 197.274f, 155.2597f, 225.85083f, 108.25243f, 215.42494f),
                    PathNode.CurveTo(61.24516f, 204.99907f, 30.874012f, 159.29607f, 39.47f, 111.92f),
                    PathNode.LineTo(77.91f, 150.36f),
                    PathNode.CurveTo(71.30665f, 161.14821f, 73.42525f, 175.1233f, 82.92937f, 183.46965f),
                    PathNode.CurveTo(92.433495f, 191.816f, 106.56516f, 192.1116f, 116.41f, 184.17f),
                    PathNode.Close,
                    PathNode.MoveTo(122.57f, 114.17f),
                    PathNode.CurveTo(125.157906f, 128.00728f, 135.98273f, 138.83209f, 149.82f, 141.42f),
                    PathNode.LineTo(125.82f, 161.0f),
                    PathNode.CurveTo(124.42592f, 149.02167f, 114.97833f, 139.57408f, 103.0f, 138.18f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 130.0f),
                    PathNode.CurveTo(143.84973f, 130.0f, 134.0f, 120.15026f, 134.0f, 108.0f),
                    PathNode.CurveTo(134.0f, 95.84974f, 143.84973f, 86.0f, 156.0f, 86.0f),
                    PathNode.CurveTo(168.15027f, 86.0f, 178.0f, 95.84974f, 178.0f, 108.0f),
                    PathNode.CurveTo(178.0f, 120.15026f, 168.15027f, 130.0f, 156.0f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 150.0f),
                    PathNode.CurveTo(107.73199f, 150.0f, 114.0f, 156.26802f, 114.0f, 164.0f),
                    PathNode.CurveTo(114.0f, 171.73198f, 107.73199f, 178.0f, 100.0f, 178.0f),
                    PathNode.CurveTo(92.26801f, 178.0f, 86.0f, 171.73198f, 86.0f, 164.0f),
                    PathNode.CurveTo(86.0f, 156.26802f, 92.26801f, 150.0f, 100.0f, 150.0f),
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
        return _steamLogo!!
    }

private var _steamLogo: ImageVector? = null
