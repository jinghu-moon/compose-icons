package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Shrimp: ImageVector
    get() {
        if (_shrimp != null) return _shrimp!!
        _shrimp = phosphorFillIcon(
            name = "Shrimp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 116c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM240 60c-.005 10.891-6.324 20.79-16.2 25.38C220.927 127.352 186.07 159.946 144 160h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h56c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-48v16h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-56C51.817 232 16 196.183 16 152 16 107.817 51.817 72 96 72h116c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-84C114.745 48 104 37.255 104 24c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418 3.582 8 8 8h84c15.464 0 28 12.536 28 28ZM85.72 182.2c-1.233-1.727-3.102-2.893-5.195-3.241-2.093-.349-4.239 .148-5.965 1.381l-15.36 11c-3.366 2.643-4.056 7.466-1.566 10.947 2.49 3.48 7.278 4.385 10.866 2.053l15.36-11c3.583-2.567 4.415-7.548 1.86-11.14ZM84.22 146.58 45.55 129c-2.615-1.274-5.716-1.028-8.097 .642-2.382 1.67-3.669 4.502-3.362 7.394 .307 2.893 2.16 5.391 4.839 6.524l38.67 17.59c1.935 .875 4.138 .945 6.124 .195 1.986-.75 3.593-2.259 4.466-4.195 1.813-4.015 .038-8.741-3.97-10.57ZM207.5 88h-87.5v56h24c32.239-.039 59.431-24.019 63.5-56Z"),
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
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
