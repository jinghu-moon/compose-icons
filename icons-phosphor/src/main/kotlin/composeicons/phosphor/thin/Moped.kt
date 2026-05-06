package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Moped: ImageVector
    get() {
        if (_moped != null) return _moped!!
        _moped = phosphorThinIcon(
            name = "Moped",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 132c-2.974-.002-5.937 .367-8.82 1.1L171.75 38.6C171.165 37.035 169.67 35.999 168 36h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h29.23l34.47 91.92c-10.794 5.496-18.108 16.044-19.47 28.08h-46.46L107.77 94.6C107.183 93.029 105.678 91.99 104 92h-80c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12v20C16.64 128.096 4.027 147.016 4 168c0 2.209 1.791 4 4 4h12.23c2.066 18.193 17.46 31.937 35.77 31.937 18.31 0 33.704-13.744 35.77-31.937h88.46c2.151 19.243 19.139 33.338 38.449 31.901 19.31-1.437 34.024-17.891 33.303-37.241C251.261 147.31 235.363 131.996 216 132ZM41.33 126.5c1.599-.564 2.669-2.074 2.67-3.77v-22.73h57.23l24 64h-113c1.572-17.099 12.926-31.731 29.1-37.5ZM56 196C42.082 195.999 30.278 185.775 28.29 172h55.42C81.722 185.775 69.918 195.999 56 196ZM216 196c-12.781-.006-23.936-8.666-27.11-21.046-3.174-12.381 2.438-25.339 13.64-31.494l9.72 25.94c.773 2.071 3.079 3.123 5.15 2.35 2.071-.773 3.123-3.079 2.35-5.15L210 140.65c10.478-2.298 21.347 1.592 27.988 10.016 6.64 8.424 7.885 19.902 3.204 29.553C236.51 189.87 226.727 195.999 216 196Z"),
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
        return _moped!!
    }

private var _moped: ImageVector? = null
