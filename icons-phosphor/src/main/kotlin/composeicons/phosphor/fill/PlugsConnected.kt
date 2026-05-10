package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PlugsConnected: ImageVector
    get() {
        if (_plugsConnected != null) return _plugsConnected!!
        _plugsConnected = phosphorFillIcon(
            name = "PlugsConnected",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88.57 35C86.913 30.897 88.897 26.227 93 24.57c4.103-1.657 8.773 .327 10.43 4.43l8 20c1.657 4.103-.327 8.773-4.43 10.43C102.897 61.087 98.227 59.103 96.57 55ZM29 103.43l20 8c4.103 1.657 8.773-.327 10.43-4.43C61.087 102.897 59.103 98.227 55 96.57l-20-8C30.897 86.913 26.227 88.897 24.57 93c-1.657 4.103 .327 8.773 4.43 10.43ZM227 152.57l-20-8c-4.103-1.657-8.773 .327-10.43 4.43-1.657 4.103 .327 8.773 4.43 10.43l20 8c4.103 1.657 8.773-.327 10.43-4.43 1.657-4.103-.327-8.773-4.43-10.43ZM159.43 201c-1.657-4.103-6.327-6.087-10.43-4.43-4.103 1.657-6.087 6.327-4.43 10.43l8 20c1.657 4.103 6.327 6.087 10.43 4.43 4.103-1.657 6.087-6.327 4.43-10.43ZM237.91 18.52c-1.483-1.582-3.544-2.494-5.712-2.528-2.168-.034-4.257 .814-5.788 2.348L174 70.75l-5.38-5.38c-6.002-6.009-14.147-9.385-22.64-9.385-8.493 0-16.638 3.376-22.64 9.385L106.14 82.54c-.751 .75-1.173 1.768-1.173 2.83 0 1.062 .422 2.08 1.173 2.83l61.7 61.66c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l16.74-16.74c6.067-5.95 9.585-14.025 9.81-22.52 .167-8.678-3.217-17.048-9.37-23.17l-5.38-5.37L237.5 29.89c3.161-3.068 3.342-8.082 .41-11.37ZM85.64 90.34C84.109 88.808 82.022 87.963 79.857 87.997c-2.165 .034-4.225 .944-5.707 2.523-2.932 3.288-2.751 8.302 .41 11.37L80.67 108 65.34 123.31c-6.139 6.125-9.513 14.49-9.34 23.16 .211 8.493 3.714 16.571 9.77 22.53l5 4.94L18.49 226.13c-3.058 2.979-3.324 7.804-.61 11.1 1.453 1.686 3.542 2.69 5.766 2.771 2.224 .082 4.381-.767 5.954-2.341L82 185.25l5.37 5.38c12.524 12.465 32.766 12.465 45.29 0L148 175.31l6.34 6.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32Z"),
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
        return _plugsConnected!!
    }

private var _plugsConnected: ImageVector? = null
