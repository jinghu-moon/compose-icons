package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SkipForward: ImageVector
    get() {
        if (_skipForward != null) return _skipForward!!
        _skipForward = phosphorDuotoneIcon(
            name = "SkipForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196.3 134.65 68.19 214.77c-2.443 1.503-5.505 1.583-8.023 .209C57.649 213.605 56.059 210.988 56 208.12v-160.24c.059-2.868 1.649-5.485 4.167-6.859 2.518-1.374 5.58-1.294 8.023 .209l128.11 80.12c2.299 1.429 3.696 3.943 3.696 6.65 0 2.707-1.398 5.221-3.696 6.65Z"),
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
                pathData = parseSvgPathData("M200 32c-4.418 0-8 3.582-8 8v69.23L72.43 34.45C67.526 31.372 61.34 31.192 56.266 33.982 51.192 36.771 48.029 42.09 48 47.88v160.24c.061 5.776 3.23 11.07 8.291 13.852 5.061 2.782 11.23 2.621 16.139-.422L192 146.77v69.23c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-176c0-4.418-3.582-8-8-8ZM64 207.93v-159.88l127.84 80Z"),
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
        return _skipForward!!
    }

private var _skipForward: ImageVector? = null
