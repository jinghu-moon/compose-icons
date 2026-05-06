package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) return _scribbleLoop!!
        _scribbleLoop = phosphorRegularIcon(
            name = "ScribbleLoop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M253.93 154.63c-1.32-1.46-24.09-26.22-61-40.56C191.21 95.65 184.47 78.9 173.52 66.15 158.87 49 137.58 40 112 40 60.48 40 26.89 86.18 25.49 88.15c-2.382 3.589-1.494 8.42 2.008 10.928 3.502 2.508 8.361 1.793 10.992-1.618C38.8 97.05 68.81 56 112 56c20.77 0 37.86 7.11 49.41 20.57 7.42 8.64 12.44 19.69 14.67 32C164.496 105.545 152.573 104.009 140.6 104c-26.06 0-47.93 6.81-63.26 19.69C63.78 135.09 56 151 56 167.25c-.125 12.75 4.872 25.016 13.87 34.05C79.53 210.92 92.93 216 108.6 216c51.81 0 81.18-42.13 84.49-84.42 18.287 8.129 34.902 19.587 49 33.79 2.966 3.275 8.025 3.526 11.3 .56 3.275-2.966 3.526-8.025 .56-11.3ZM159.47 176.27C150.64 187.09 134.66 200 108.6 200 83.32 200 72 183.55 72 167.25 72 144.49 93.47 120 140.6 120c12.476 .037 24.874 1.952 36.78 5.68-.45 18.76-6.92 37.1-17.91 50.59Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
