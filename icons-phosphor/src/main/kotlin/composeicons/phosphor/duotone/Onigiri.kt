package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Onigiri: ImageVector
    get() {
        if (_onigiri != null) return _onigiri!!
        _onigiri = phosphorDuotoneIcon(
            name = "Onigiri",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 168v56h-80v-56c0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M231.53 146.57 175.68 50.66l-.11-.19C165.353 34.021 147.363 24.018 128 24.018c-19.363 0-37.353 10.003-47.57 26.452l-.11 .19L24.47 146.57c-10.669 17.271-11.155 38.964-1.271 56.695 9.884 17.732 28.59 28.726 48.891 28.734h111.82c20.301-.008 39.007-11.003 48.891-28.734 9.884-17.732 9.398-39.424-1.271-56.695ZM160 216h-64v-48h64ZM218.86 195.45c-6.976 12.764-20.404 20.66-34.95 20.55h-7.91v-48c0-8.837-7.163-16-16-16h-64c-8.837 0-16 7.163-16 16v48h-7.91c-14.52 .004-27.902-7.86-34.963-20.548-7.061-12.687-6.693-28.205 .963-40.542 .04-.065 .077-.131 .11-.2L94.05 58.81c7.31-11.695 20.128-18.8 33.92-18.8 13.792 0 26.61 7.105 33.92 18.8l55.85 95.9c.033 .069 .07 .135 .11 .2 7.774 12.298 8.158 27.874 1 40.54Z"),
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
        return _onigiri!!
    }

private var _onigiri: ImageVector? = null
