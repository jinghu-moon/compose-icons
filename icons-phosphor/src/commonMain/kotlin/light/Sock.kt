package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sock: ImageVector
    get() {
        if (_sock != null) return _sock!!
        _sock = phosphorLightIcon(
            name = "Sock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 18.0f),
                    PathNode.LineTo(104.0f, 18.0f),
                    PathNode.CurveTo(96.26801f, 18.0f, 90.0f, 24.268015f, 90.0f, 32.0f),
                    PathNode.LineTo(90.0f, 109.51f),
                    PathNode.LineTo(50.67f, 148.85f),
                    PathNode.CurveTo(36.08972f, 163.18507f, 30.32028f, 184.24005f, 35.5565f, 204.00519f),
                    PathNode.CurveTo(40.792713f, 223.77034f, 56.229664f, 239.20729f, 75.994804f, 244.4435f),
                    PathNode.CurveTo(95.75995f, 249.67972f, 116.81493f, 243.91028f, 131.15f, 229.33f),
                    PathNode.LineTo(199.56f, 160.93f),
                    PathNode.CurveTo(203.69661f, 156.81023f, 206.01521f, 151.20813f, 206.0f, 145.37f),
                    PathNode.LineTo(206.0f, 32.0f),
                    PathNode.CurveTo(206.0f, 24.268015f, 199.73198f, 18.0f, 192.0f, 18.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 30.0f),
                    PathNode.LineTo(192.0f, 30.0f),
                    PathNode.CurveTo(193.10457f, 30.0f, 194.0f, 30.89543f, 194.0f, 32.0f),
                    PathNode.LineTo(194.0f, 50.0f),
                    PathNode.LineTo(102.0f, 50.0f),
                    PathNode.LineTo(102.0f, 32.0f),
                    PathNode.CurveTo(102.0f, 30.89543f, 102.89543f, 30.0f, 104.0f, 30.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.67f, 220.85f),
                    PathNode.CurveTo(105.05834f, 237.96587f, 76.96572f, 237.76534f, 59.600193f, 220.39981f),
                    PathNode.CurveTo(42.234665f, 203.03427f, 42.034138f, 174.94167f, 59.15f, 157.33f),
                    PathNode.LineTo(100.24f, 116.24f),
                    PathNode.CurveTo(101.36554f, 115.11585f, 101.9986f, 113.59076f, 102.0f, 112.0f),
                    PathNode.LineTo(102.0f, 62.0f),
                    PathNode.LineTo(194.0f, 62.0f),
                    PathNode.LineTo(194.0f, 106.34f),
                    PathNode.CurveTo(166.6865f, 109.42575f, 146.03467f, 132.51276f, 146.0f, 160.0f),
                    PathNode.CurveTo(145.97238f, 170.28053f, 148.91348f, 180.35042f, 154.47f, 189.0f),
                    PathNode.Close,
                    PathNode.MoveTo(191.07f, 152.44f),
                    PathNode.LineTo(163.22f, 180.3f),
                    PathNode.CurveTo(159.77336f, 174.09079f, 157.97615f, 167.10162f, 158.0f, 160.0f),
                    PathNode.CurveTo(158.02605f, 139.13333f, 173.35042f, 121.44221f, 194.0f, 118.44f),
                    PathNode.LineTo(194.0f, 145.37f),
                    PathNode.CurveTo(194.00719f, 148.02348f, 192.95206f, 150.56947f, 191.07f, 152.44f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _sock!!
    }

private var _sock: ImageVector? = null
