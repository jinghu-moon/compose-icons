package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Scribble: ImageVector
    get() {
        if (_scribble != null) return _scribble!!
        _scribble = phosphorDuotoneIcon(
            name = "Scribble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 56v144c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-144C40 47.163 47.163 40 56 40h144c8.837 0 16 7.163 16 16Z"),
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
                pathData = parseSvgPathData("M205.67 189.66c-2.746 2.741-4.288 6.461-4.288 10.34 0 3.879 1.543 7.599 4.288 10.34 3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0-11.958-11.964-11.958-31.356 0-43.32l9.38-9.37c5.713-5.724 5.704-14.997-.02-20.71-5.724-5.713-14.997-5.704-20.71 .02L116.28 215c-12.084 11.12-30.787 10.731-42.399-.881C62.269 202.507 61.88 183.804 73 171.72L171.72 73c5.722-5.722 5.722-14.998 0-20.72-5.722-5.722-14.998-5.722-20.72 0L84.28 119c-12.084 11.12-30.787 10.731-42.399-.881C30.269 106.507 29.88 87.804 41 75.72L82.34 34.34c3.126-3.123 8.192-3.121 11.315 .005 3.123 3.126 3.121 8.192-.005 11.315L52.27 87c-5.722 5.724-5.719 15.003 .005 20.725 5.724 5.722 15.003 5.719 20.725-.005L139.72 41c12.084-11.12 30.787-10.731 42.399 .881 11.612 11.612 12 30.315 .881 42.399L84.28 183c-5.722 5.722-5.722 14.998 0 20.72 5.722 5.722 14.998 5.722 20.72 0L171.72 137c12.084-11.12 30.787-10.731 42.399 .881 11.612 11.612 12 30.315 .881 42.399Z"),
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
        return _scribble!!
    }

private var _scribble: ImageVector? = null
