package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Polygon: ImageVector
    get() {
        if (_polygon != null) return _polygon!!
        _polygon = phosphorFillIcon(
            name = "Polygon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.81f, 52.19f),
                    PathNode.CurveTo(222.5589f, 46.938362f, 215.43655f, 43.98798f, 208.01f, 43.98798f),
                    PathNode.CurveTo(200.58345f, 43.98798f, 193.4611f, 46.938362f, 188.21f, 52.19f),
                    PathNode.LineTo(188.21f, 52.19f),
                    PathNode.CurveTo(186.69077f, 53.699047f, 185.34875f, 55.37657f, 184.21f, 57.19f),
                    PathNode.LineTo(148.0f, 47.33f),
                    PathNode.CurveTo(147.73964f, 36.124165f, 140.82153f, 26.153444f, 130.41586f, 21.986826f),
                    PathNode.CurveTo(120.01021f, 17.820206f, 108.12243f, 20.260712f, 100.2f, 28.19f),
                    PathNode.LineTo(100.2f, 28.19f),
                    PathNode.CurveTo(91.82357f, 36.56299f, 89.62122f, 49.300587f, 94.7f, 60.0f),
                    PathNode.LineTo(54.58f, 96.1f),
                    PathNode.CurveTo(43.54492f, 89.36291f, 29.331894f, 91.05739f, 20.19f, 100.2f),
                    PathNode.LineTo(20.19f, 100.2f),
                    PathNode.CurveTo(9.79321f, 110.60918f, 9.225367f, 127.28914f, 18.890177f, 138.38129f),
                    PathNode.CurveTo(28.554985f, 149.47343f, 45.15567f, 151.1941f, 56.89f, 142.32f),
                    PathNode.LineTo(133.64f, 198.6f),
                    PathNode.CurveTo(128.97751f, 211.66727f, 134.58746f, 226.17839f, 146.82729f, 232.71127f),
                    PathNode.CurveTo(159.06712f, 239.24416f, 174.24532f, 235.82849f, 182.50664f, 224.68207f),
                    PathNode.CurveTo(190.76796f, 213.53564f, 189.62079f, 198.02023f, 179.81f, 188.21f),
                    PathNode.CurveTo(178.77675f, 187.17686f, 177.66327f, 186.22723f, 176.48f, 185.37f),
                    PathNode.LineTo(206.63f, 100.0f),
                    PathNode.QuadTo(207.32f, 100.0f, 208.01f, 100.0f),
                    PathNode.CurveTo(219.33118f, 99.99677f, 229.53644f, 93.17636f, 233.86975f, 82.71732f),
                    PathNode.CurveTo(238.20305f, 72.258286f, 235.81165f, 60.218918f, 227.81f, 52.21f),
                    PathNode.Close,
                    PathNode.MoveTo(161.39f, 180.05f),
                    PathNode.CurveTo(154.8201f, 179.7232f, 148.3449f, 181.71994f, 143.1f, 185.69f),
                    PathNode.LineTo(66.36f, 129.41f),
                    PathNode.CurveTo(68.840996f, 122.41152f, 68.456406f, 114.71624f, 65.29f, 108.0f),
                    PathNode.LineTo(105.41f, 71.89f),
                    PathNode.CurveTo(118.53452f, 79.901276f, 135.66379f, 75.82989f, 143.78f, 62.77f),
                    PathNode.LineTo(180.0f, 72.66f),
                    PathNode.CurveTo(180.15343f, 79.851875f, 183.08072f, 86.70612f, 188.17f, 91.79f),
                    PathNode.CurveTo(189.20229f, 92.82336f, 190.31221f, 93.77614f, 191.49f, 94.64f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _polygon!!
    }

private var _polygon: ImageVector? = null
