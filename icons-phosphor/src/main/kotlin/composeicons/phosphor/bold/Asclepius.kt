package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Asclepius: ImageVector
    get() {
        if (_asclepius != null) return _asclepius!!
        _asclepius = phosphorBoldIcon(
            name = "Asclepius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M91.82 60h.18c6.627 0 12-5.373 12-12C104 41.373 98.627 36 92 36h-32C35.711 36.028 16.028 55.711 16 80v8c0 6.627 5.373 12 12 12h20C70.74 99.973 89.725 82.644 91.82 60ZM48 76h-7.6C42.301 66.687 50.495 59.998 60 60h7.6C65.699 69.313 57.505 76.002 48 76ZM224 79v1c-.028 24.289-19.711 43.972-44 44h-40v72h8c6.627 0 12-5.373 12-12 .018-3.42-1.439-6.682-4-8.95-3.31-2.827-4.829-7.225-3.97-11.493 .859-4.267 3.962-7.735 8.108-9.061 4.146-1.326 8.685-.303 11.862 2.674 11.123 9.951 14.953 25.734 9.627 39.676C176.301 210.788 162.925 219.999 148 220h-8v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12h-24c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h24v-72h-16c-5.851-.009-10.856 4.204-11.845 9.971-.989 5.767 2.325 11.407 7.845 13.349 6.263 2.209 9.549 9.077 7.34 15.34C101.131 168.923 94.263 172.209 88 170 71.378 164.216 61.375 147.263 64.349 129.917 67.322 112.571 82.401 99.917 100 100h16v-76c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v76h40c11.046 0 20-8.954 20-20v-1C199.973 68.518 191.482 60.027 181 60h-17c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h17c23.737 .028 42.972 19.263 43 43Z"),
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
        return _asclepius!!
    }

private var _asclepius: ImageVector? = null
