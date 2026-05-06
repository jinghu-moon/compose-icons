package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CodeBlock: ImageVector
    get() {
        if (_codeBlock != null) return _codeBlock!!
        _codeBlock = phosphorRegularIcon(
            name = "CodeBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M58.34 101.66l-32-32C24.838 68.159 23.994 66.123 23.994 64c0-2.123 .844-4.159 2.346-5.66l32-32c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L43.31 64 69.66 90.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0ZM98.34 101.66c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l32-32c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66l-32-32c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L124.69 64 98.34 90.34C96.838 91.841 95.994 93.877 95.994 96c0 2.123 .844 4.159 2.346 5.66ZM200 40h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24v144h-144v-64c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v64c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16Z"),
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
        return _codeBlock!!
    }

private var _codeBlock: ImageVector? = null
