package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DiamondsFour: ImageVector
    get() {
        if (_diamondsFour != null) return _diamondsFour!!
        _diamondsFour = phosphorRegularIcon(
            name = "DiamondsFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M122.34 109.66c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l40-40c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66l-40-40C132.159 16.838 130.123 15.994 128 15.994c-2.123 0-4.159 .844-5.66 2.346l-40 40C80.838 59.841 79.994 61.877 79.994 64c0 2.123 .844 4.159 2.346 5.66ZM128 35.31 156.69 64 128 92.69 99.31 64ZM133.66 146.31c-1.501-1.502-3.537-2.346-5.66-2.346-2.123 0-4.159 .844-5.66 2.346l-40 40c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66l40 40c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l40-40c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM128 220.69 99.31 192 128 163.31 156.69 192ZM237.66 122.34l-40-40C196.159 80.838 194.123 79.994 192 79.994c-2.123 0-4.159 .844-5.66 2.346l-40 40c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66l40 40c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l40-40c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM192 156.69 163.31 128 192 99.31 220.69 128ZM109.66 122.34l-40-40C68.159 80.838 66.123 79.994 64 79.994c-2.123 0-4.159 .844-5.66 2.346l-40 40c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66l40 40c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l40-40c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM64 156.69 35.31 128 64 99.31 92.69 128Z"),
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
        return _diamondsFour!!
    }

private var _diamondsFour: ImageVector? = null
