package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextB: ImageVector
    get() {
        if (_textB != null) return _textB!!
        _textB = phosphorDuotoneIcon(
            name = "TextB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 160c0 22.091-17.909 40-40 40h-80v-152h68c19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36h12c22.091 0 40 17.909 40 40Z"),
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
                pathData = parseSvgPathData("M178.48 115.7c12.927-12.443 17.003-31.49 10.302-48.134C182.08 50.922 165.943 40.014 148 40h-68c-4.418 0-8 3.582-8 8v152c0 4.418 3.582 8 8 8h80c22.877 0 42.575-16.145 47.066-38.577 4.491-22.432-7.472-44.916-28.586-53.723ZM88 56h60c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28h-60ZM160 192h-72v-64h72c17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
        return _textB!!
    }

private var _textB: ImageVector? = null
