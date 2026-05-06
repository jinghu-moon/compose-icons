package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.LinkSimple: ImageVector
    get() {
        if (_linkSimple != null) return _linkSimple!!
        _linkSimple = phosphorDuotoneIcon(
            name = "LinkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M209.94 113.94l-96 96c-18.788 18.485-48.967 18.362-67.605-.275C27.698 191.027 27.575 160.848 46.06 142.06L142.06 46.06c18.788-18.485 48.967-18.362 67.605 .275 18.637 18.637 18.76 48.816 .275 67.605Z"),
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
                pathData = parseSvgPathData("M165.66 90.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-64 64c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32l64-64c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346ZM215.6 40.4C205.098 29.897 190.853 23.996 176 23.996c-14.853 0-29.098 5.901-39.6 16.404L106.34 70.45c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L147.72 51.77c15.669-15.324 40.751-15.186 56.25 .31 15.499 15.496 15.641 40.579 .32 56.25l-30.07 30.06c-3.126 3.123-3.128 8.189-.005 11.315 3.123 3.126 8.189 3.128 11.315 .005l30.07-30.11C226.103 109.098 232.004 94.853 232.004 80c0-14.853-5.901-29.098-16.404-39.6ZM138.34 174.22l-30.06 30.06C98.213 214.573 83.392 218.662 69.471 214.986 55.551 211.31 44.68 200.437 41.007 186.517c-3.673-13.921 .418-28.742 10.713-38.807L81.77 117.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L40.4 136.4c-21.87 21.87-21.87 57.33 0 79.2 21.87 21.87 57.33 21.87 79.2 0l30.06-30.07c3.123-3.126 3.121-8.192-.005-11.315-3.126-3.123-8.192-3.121-11.315 .005Z"),
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
        return _linkSimple!!
    }

private var _linkSimple: ImageVector? = null
