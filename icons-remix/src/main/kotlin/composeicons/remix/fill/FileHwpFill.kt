package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileHwpFill: ImageVector
    get() {
        if (_fileHwpFill != null) return _fileHwpFill!!
        _fileHwpFill = remixIcon(
            name = "FileHwpFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 2l5 5L21 20.993c0 .556-.445 1.007-.993 1.007h-16.013C3.445 22 3 21.545 3 21.008v-18.016C3 2.444 3.447 2 3.999 2h12.001ZM9.333 14.667h-1.333v3.333h8v-1.333L9.333 16.666l0-1.999ZM12 14.333c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1ZM12 9C10.619 9 9.5 10.119 9.5 11.5 9.5 12.881 10.619 14 12 14c1.381 0 2.5-1.119 2.5-2.5C14.5 10.119 13.381 9 12 9ZM12 10.333c.644 0 1.167 .522 1.167 1.167 0 .644-.522 1.167-1.167 1.167-.644 0-1.167-.522-1.167-1.167 0-.644 .522-1.167 1.167-1.167ZM12.667 6h-1.333l-0 1.333L8 7.333v1.333h8v-1.333L12.666 7.333 12.667 6Z"),
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
        return _fileHwpFill!!
    }

private var _fileHwpFill: ImageVector? = null
