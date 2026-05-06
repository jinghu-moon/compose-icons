package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MarkdownLogo: ImageVector
    get() {
        if (_markdownLogo != null) return _markdownLogo!!
        _markdownLogo = phosphorRegularIcon(
            name = "MarkdownLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 48h-208C15.163 48 8 55.163 8 64v128c0 8.837 7.163 16 16 16h208c8.837 0 16-7.163 16-16v-128c0-8.837-7.163-16-16-16ZM232 192h-208v-128h208v128ZM128 104v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-28.69L93.66 141.66c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346L64 123.31v28.69c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-48c-.003-3.238 1.947-6.158 4.938-7.397 2.991-1.239 6.434-.554 8.722 1.737L88 124.69 114.34 98.34c2.288-2.291 5.731-2.976 8.722-1.737 2.991 1.239 4.94 4.159 4.938 7.397ZM205.66 122.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-24 24c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346l-24-24c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L168 132.69v-28.69c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v28.69l10.34-10.35c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346Z"),
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
        return _markdownLogo!!
    }

private var _markdownLogo: ImageVector? = null
