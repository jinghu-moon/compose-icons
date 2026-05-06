package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CodeBlock: ImageVector
    get() {
        if (_codeBlock != null) return _codeBlock!!
        _codeBlock = phosphorFillIcon(
            name = "CodeBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 40h-32c0-8.837-7.163-16-16-16h-120C23.163 24 16 31.163 16 40v80c0 8.837 7.163 16 16 16h8v64c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM106.34 61.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0l24 24c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-24 24c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L124.69 80ZM42.34 85.66C40.838 84.159 39.994 82.123 39.994 80c0-2.123 .844-4.159 2.346-5.66L66.34 50.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L59.31 80 77.66 98.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0ZM200 200h-144v-64h96c8.837 0 16-7.163 16-16v-64h32Z"),
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
