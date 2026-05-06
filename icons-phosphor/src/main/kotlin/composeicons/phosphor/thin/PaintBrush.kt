package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) return _paintBrush!!
        _paintBrush = phosphorThinIcon(
            name = "PaintBrush",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 28c-20.29 0-43.16 11.24-68 33.4-18.47 16.49-34.39 35.83-45 49.93-17.159-6.189-36.256-3.633-51.184 6.85C44.889 128.663 36.003 145.759 36 164c0 33.22-21.26 48-22.22 48.68-1.459 .98-2.107 2.799-1.597 4.481 .51 1.682 2.059 2.834 3.817 2.839h76c18.241-.003 35.337-8.889 45.82-23.816 10.483-14.927 13.039-34.025 6.85-51.184 14.11-10.63 33.44-26.55 49.93-45C216.76 75.16 228 52.29 228 32c0-2.209-1.791-4-4-4ZM92 212h-65.65C33.91 203.69 44 188.08 44 164c0-26.51 21.49-48 48-48 26.51 0 48 21.49 48 48 0 26.51-21.49 48-48 48ZM118.52 114.69c4.13-5.44 9.32-12 15.29-18.9 10.757 6.597 19.803 15.643 26.4 26.4-6.94 6-13.46 11.16-18.9 15.29-5.214-9.655-13.135-17.576-22.79-22.79ZM166.29 116.83C159.35 105.91 150.09 96.65 139.17 89.71 161 65.43 191.26 38.63 219.82 36.18 217.37 64.74 190.57 95 166.29 116.83Z"),
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
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
