package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FilmReel: ImageVector
    get() {
        if (_filmReel != null) return _filmReel!!
        _filmReel = phosphorLightIcon(
            name = "FilmReel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 218h-56c45.453-24.242 65.697-78.569 47.19-126.644C204.684 43.282 153.237 16.552 103.261 29.045 53.286 41.539 20.47 89.335 26.764 140.463 33.058 191.59 76.487 230 128 230h104c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM38 128C38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90 0 49.706-40.294 90-90 90C78.317 217.945 38.055 177.683 38 128ZM128 102c12.15 0 22-9.85 22-22C150 67.85 140.15 58 128 58c-12.15 0-22 9.85-22 22 0 12.15 9.85 22 22 22ZM128 70c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10ZM150 176c0-12.15-9.85-22-22-22-12.15 0-22 9.85-22 22 0 12.15 9.85 22 22 22 12.15 0 22-9.85 22-22ZM118 176c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10ZM176 150c12.15 0 22-9.85 22-22 0-12.15-9.85-22-22-22-12.15 0-22 9.85-22 22 0 12.15 9.85 22 22 22ZM176 118c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10ZM80 106c-12.15 0-22 9.85-22 22 0 12.15 9.85 22 22 22 12.15 0 22-9.85 22-22 0-12.15-9.85-22-22-22ZM80 138c-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10Z"),
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
        return _filmReel!!
    }

private var _filmReel: ImageVector? = null
