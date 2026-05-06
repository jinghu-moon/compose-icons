package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) return _codepenLogo!!
        _codepenLogo = phosphorThinIcon(
            name = "CodepenLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234 92.55c0 0-.05 0-.09-.07l-104-56c-1.186-.64-2.614-.64-3.8 0l-104 56L22 92.56c-1.23 .71-1.991 2.02-2 3.44v64c.005 1.424 .767 2.738 2 3.45 .028 .026 .058 .049 .09 .07l104 56c1.186 .64 2.614 .64 3.8 0l104-56c.031-.018 .058-.042 .08-.07 1.233-.712 1.995-2.026 2-3.45v-64c.001-1.418-.748-2.73-1.97-3.45ZM228 153.3 181 128l47-25.3ZM172.57 123.46 132 101.61v-54.91L223.56 96ZM128 147.46 91.87 128 128 108.54 164.13 128ZM124 46.7v54.91L83.43 123.46 32.44 96ZM28 102.7 75 128 28 153.3ZM83.43 132.54 124 154.39v54.91L32.44 160ZM132 209.3v-54.91l40.57-21.85 51 27.46Z"),
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
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
