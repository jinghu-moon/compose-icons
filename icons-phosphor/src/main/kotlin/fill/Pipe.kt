package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pipe: ImageVector
    get() {
        if (_pipe != null) return _pipe!!
        _pipe = phosphorFillIcon(
            name = "Pipe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 104.000 L 208.000 104.000 L 208.000 56.000 L 232.000 56.000 C 236.418 56.000 240.000 52.418 240.000 48.000 C 240.000 43.582 236.418 40.000 232.000 40.000 L 205.830 40.000 C 202.977 35.058 197.707 32.009 192.000 32.000 L 176.000 32.000 C 170.293 32.009 165.023 35.058 162.170 40.000 L 144.000 40.000 C 86.588 40.061 40.061 86.588 40.000 144.000 L 40.000 162.160 C 35.055 165.015 32.006 170.290 32.000 176.000 L 32.000 192.000 C 32.006 197.710 35.055 202.985 40.000 205.840 L 40.000 232.000 C 40.000 236.418 43.582 240.000 48.000 240.000 C 52.418 240.000 56.000 236.418 56.000 232.000 L 56.000 208.000 L 104.000 208.000 L 104.000 232.000 C 104.000 236.418 107.582 240.000 112.000 240.000 C 116.418 240.000 120.000 236.418 120.000 232.000 L 120.000 205.840 C 124.945 202.985 127.994 197.710 128.000 192.000 L 128.000 176.000 C 127.994 170.290 124.945 165.015 120.000 162.160 L 120.000 144.000 C 120.000 130.745 130.745 120.000 144.000 120.000 L 162.170 120.000 C 165.023 124.942 170.293 127.991 176.000 128.000 L 192.000 128.000 C 197.707 127.991 202.977 124.942 205.830 120.000 L 232.000 120.000 C 236.418 120.000 240.000 116.418 240.000 112.000 C 240.000 107.582 236.418 104.000 232.000 104.000 ZM 112.000 192.000 L 48.000 192.000 L 48.000 176.000 L 112.000 176.000 ZM 176.000 112.000 L 176.000 48.000 L 192.000 48.000 L 192.000 111.800 C 192.000 111.870 192.000 111.930 192.000 112.000 Z"),
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
        return _pipe!!
    }

private var _pipe: ImageVector? = null
