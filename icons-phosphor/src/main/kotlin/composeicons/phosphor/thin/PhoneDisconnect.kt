package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) return _phoneDisconnect!!
        _phoneDisconnect = phosphorThinIcon(
            name = "PhoneDisconnect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.79 93C174.15 38.34 81.85 38.34 27.21 93 8.69 111.5 6.9 138.81 22.85 159.39c3.271 4.175 8.893 5.707 13.83 3.77l49-17.39 .15-.06c3.765-1.506 6.515-4.813 7.31-8.79l5.9-29.51c.244-1.375 1.2-2.517 2.51-3 16.996-5.899 35.477-5.941 52.5-.12 1.297 .471 2.253 1.586 2.52 2.94L162.81 137c.821 3.935 3.558 7.197 7.29 8.69l.15 .06 49.07 17.41c4.937 1.937 10.559 .405 13.83-3.77C249.1 138.81 247.31 111.5 228.79 93ZM226.79 154.51c-1.102 1.375-2.975 1.866-4.61 1.21l-.15-.06L173 138.24c-1.214-.508-2.1-1.582-2.37-2.87l-6.21-29.75c-.855-4.108-3.793-7.472-7.75-8.87-18.723-6.4-39.049-6.35-57.74 .14-3.979 1.43-6.912 4.849-7.72 9l-5.9 29.51c-.26 1.272-1.122 2.338-2.31 2.86L34 155.64l-.15 .06c-1.635 .656-3.508 .165-4.61-1.21C15.82 137.19 17.34 114.23 32.93 98.64 58.65 72.85 93.33 60 128 60c34.67 0 69.35 12.89 95.13 38.68 15.58 15.55 17.11 38.51 3.69 55.81ZM220 200c0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4Z"),
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
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
