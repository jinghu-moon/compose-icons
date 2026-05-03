package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) return _framerLogo!!
        _framerLogo = phosphorLightIcon(
            name = "FramerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 104.0f),
                    PathNode.LineTo(206.0f, 40.0f),
                    PathNode.CurveTo(206.0f, 36.68629f, 203.3137f, 34.0f, 200.0f, 34.0f),
                    PathNode.LineTo(56.0f, 34.0f),
                    PathNode.CurveTo(53.508533f, 33.996338f, 51.274044f, 35.53278f, 50.385612f, 37.860462f),
                    PathNode.CurveTo(49.497185f, 40.18815f, 50.1397f, 42.82268f, 52.0f, 44.48f),
                    PathNode.LineTo(112.22f, 98.0f),
                    PathNode.LineTo(56.0f, 98.0f),
                    PathNode.CurveTo(52.68629f, 98.0f, 50.0f, 100.686295f, 50.0f, 104.0f),
                    PathNode.LineTo(50.0f, 168.0f),
                    PathNode.CurveTo(50.0014f, 169.59076f, 50.63446f, 171.11586f, 51.76f, 172.24f),
                    PathNode.LineTo(123.76f, 244.24f),
                    PathNode.CurveTo(125.47589f, 245.95377f, 128.05473f, 246.46606f, 130.2954f, 245.5383f),
                    PathNode.CurveTo(132.53604f, 244.61052f, 133.99786f, 242.42514f, 134.0f, 240.0f),
                    PathNode.LineTo(134.0f, 174.0f),
                    PathNode.LineTo(200.0f, 174.0f),
                    PathNode.CurveTo(202.49147f, 174.00366f, 204.72595f, 172.46724f, 205.61438f, 170.13954f),
                    PathNode.CurveTo(206.50282f, 167.81186f, 205.8603f, 165.17732f, 204.0f, 163.52f),
                    PathNode.LineTo(143.78f, 110.0f),
                    PathNode.LineTo(200.0f, 110.0f),
                    PathNode.CurveTo(203.3137f, 110.0f, 206.0f, 107.313705f, 206.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.22f, 162.0f),
                    PathNode.LineTo(128.0f, 162.0f),
                    PathNode.CurveTo(124.686295f, 162.0f, 122.0f, 164.6863f, 122.0f, 168.0f),
                    PathNode.LineTo(122.0f, 225.51f),
                    PathNode.LineTo(62.0f, 165.51f),
                    PathNode.LineTo(62.0f, 110.0f),
                    PathNode.LineTo(125.72f, 110.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 98.0f),
                    PathNode.LineTo(130.28f, 98.0f),
                    PathNode.LineTo(71.78f, 46.0f),
                    PathNode.LineTo(194.0f, 46.0f),
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
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
