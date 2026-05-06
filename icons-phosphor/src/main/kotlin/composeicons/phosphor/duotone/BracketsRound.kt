package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) return _bracketsRound!!
        _bracketsRound = phosphorDuotoneIcon(
            name = "BracketsRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 64-40 88-40 88h-112c0 0-40-24-40-88C32 64 72 40 72 40h112c0 0 40 24 40 88Z"),
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
                pathData = parseSvgPathData("M40 128c0 58.29 34.67 80.25 36.15 81.16 3.783 2.284 4.999 7.202 2.715 10.985-2.284 3.783-7.202 4.999-10.985 2.715C66.09 221.78 24 195.75 24 128 24 60.25 66.09 34.22 67.88 33.14c3.776-2.185 8.606-.942 10.858 2.793 2.252 3.736 1.097 8.587-2.598 10.907C74.54 47.83 40 69.82 40 128ZM188.12 33.14c-3.783-2.284-8.701-1.068-10.985 2.715-2.284 3.783-1.068 8.701 2.715 10.985C181.33 47.75 216 69.71 216 128c0 58.29-34.67 80.25-36.12 81.14-3.789 2.275-5.015 7.191-2.74 10.98 2.275 3.789 7.191 5.015 10.98 2.74C189.91 221.78 232 195.75 232 128 232 60.25 189.91 34.22 188.12 33.14Z"),
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
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
