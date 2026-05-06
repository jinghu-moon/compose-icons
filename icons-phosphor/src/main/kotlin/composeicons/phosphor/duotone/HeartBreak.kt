package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) return _heartBreak!!
        _heartBreak = phosphorDuotoneIcon(
            name = "HeartBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 102c0 66-104 122-104 122C128 224 24 168 24 102 24.003 80.161 37.16 60.474 57.336 52.118c20.176-8.357 43.4-3.738 58.844 11.702L128 75.63 139.82 63.82C155.264 48.379 178.487 43.761 198.664 52.118 218.84 60.474 231.997 80.161 232 102Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M178 40c-16.452-.044-32.238 6.495-43.84 18.16L128 64.32l-6.16-6.16C104.108 40.429 77.441 35.124 54.274 44.721 31.106 54.317 16.001 76.924 16 102c0 70 103.79 126.67 108.21 129 2.366 1.273 5.214 1.273 7.58 0C136.21 228.67 240 172 240 102 239.961 67.774 212.226 40.039 178 40ZM128 214.8C109.74 204.16 32 155.69 32 102 31.998 83.393 43.205 66.617 60.396 59.496c17.191-7.121 36.978-3.184 50.134 9.974l6.16 6.16L106.34 86c-3.122 3.124-3.122 8.186 0 11.31l24.53 24.53-16.53 16.52c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0l22.18-22.19c3.122-3.124 3.122-8.186 0-11.31L123.31 91.63 145.47 69.47c13.156-13.159 32.944-17.095 50.134-9.974C212.795 66.617 224.003 83.393 224 102c0 53.61-77.76 102.15-96 112.8Z"),
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
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
