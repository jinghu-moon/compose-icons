package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Campfire: ImageVector
    get() {
        if (_campfire != null) return _campfire!!
        _campfire = phosphorBoldIcon(
            name = "Campfire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.51 227.4c-1.507 5.101-6.191 8.601-11.51 8.6-1.151-.001-2.296-.166-3.4-.49L128 210.51l-84.6 25c-1.104 .324-2.249 .489-3.4 .49-5.966 .003-11.028-4.378-11.882-10.282-.854-5.905 2.76-11.54 8.482-13.228L85.65 198 36.6 183.51c-6.122-2.055-9.521-8.586-7.69-14.779 1.831-6.193 8.234-9.826 14.49-8.221l84.6 25 84.6-25c4.163-1.397 8.757-.409 11.977 2.577 3.22 2.986 4.552 7.492 3.473 11.748-1.079 4.257-4.397 7.584-8.65 8.675L170.35 198l49.05 14.49c3.053 .901 5.623 2.979 7.144 5.775 1.521 2.796 1.869 6.082 .966 9.135ZM64 104C64 53.41 119.93 22.72 122.31 21.43c3.552-1.913 7.828-1.913 11.38 0C136.07 22.72 192 53.41 192 104c0 35.346-28.654 64-64 64C92.654 168 64 139.346 64 104ZM128 144c6.627 0 12-5.373 12-12 0-6.47-2.71-12.55-8-18.07-1.255-1.275-2.591-2.468-4-3.57-1.407 1.105-2.743 2.297-4 3.57-5.33 5.52-8 11.6-8 18.07 0 6.627 5.373 12 12 12ZM88 104c-.007 6.666 1.66 13.227 4.85 19.08 4.81-25 28.66-37.25 29.78-37.81 3.38-1.691 7.36-1.691 10.74 0 1.12 .56 25 12.78 29.78 37.81 3.19-5.853 4.857-12.414 4.85-19.08C168 75.66 140.26 54.19 128 46.08 115.75 54.18 88 75.66 88 104Z"),
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
        return _campfire!!
    }

private var _campfire: ImageVector? = null
