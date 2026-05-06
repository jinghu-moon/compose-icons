package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) return _codeSimple!!
        _codeSimple = phosphorRegularIcon(
            name = "CodeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M93.31 70 28 128l65.27 58c3.314 2.933 3.623 7.996 .69 11.31-2.933 3.314-7.996 3.623-11.31 .69L10.65 134C8.928 132.481 7.942 130.296 7.942 128c0-2.296 .986-4.481 2.708-6L82.65 58c3.314-2.944 8.386-2.644 11.33 .67 2.944 3.314 2.644 8.386-.67 11.33ZM245.31 122l-72-64c-3.314-2.933-8.377-2.624-11.31 .69-2.933 3.314-2.624 8.377 .69 11.31L228 128l-65.27 58c-3.314 2.933-3.623 7.996-.69 11.31 2.933 3.314 7.996 3.623 11.31 .69l72-64c1.722-1.519 2.708-3.704 2.708-6 0-2.296-.986-4.481-2.708-6Z"),
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
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
