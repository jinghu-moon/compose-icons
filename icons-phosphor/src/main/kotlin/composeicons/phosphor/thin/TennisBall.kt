package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) return _tennisBall!!
        _tennisBall = phosphorThinIcon(
            name = "TennisBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198.74 57.29C180.018 38.472 154.545 27.925 128 28h-.19C80.123 28.104 39.145 61.865 29.918 108.651c-9.227 46.786 15.866 93.577 59.942 111.778 44.077 18.201 94.873 2.747 121.345-36.917C237.677 143.848 232.459 91.01 198.74 57.29ZM62.92 63C79.098 46.736 100.802 37.151 123.72 36.15 122.711 59.049 113.126 80.731 96.87 96.89 80.695 113.139 59.005 122.718 36.1 123.73 37.133 100.845 46.701 79.178 62.92 63ZM36.09 131.74c25.036-1.008 48.767-11.437 66.44-29.2C120.308 84.873 130.743 61.134 131.74 36.09c47.883 1.907 86.263 40.287 88.17 88.17-51.882 2.212-93.438 43.768-95.65 95.65C76.377 218.003 37.997 179.623 36.09 131.74ZM193.09 193.05c-16.178 16.264-37.882 25.849-60.8 26.85 2.205-47.45 40.171-85.42 87.62-87.63-1.023 22.903-10.596 44.591-26.83 60.78Z"),
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
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
