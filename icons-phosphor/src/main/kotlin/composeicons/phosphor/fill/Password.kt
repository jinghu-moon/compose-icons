package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Password: ImageVector
    get() {
        if (_password != null) return _password!!
        _password = phosphorFillIcon(
            name = "Password",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 48h-192C23.163 48 16 55.163 16 64v128c0 8.837 7.163 16 16 16h192c8.837 0 16-7.163 16-16v-128c0-8.837-7.163-16-16-16ZM204.58 142.71c2.598 3.59 1.795 8.606-1.795 11.205-3.59 2.599-8.607 1.795-11.205-1.795L184 141.61l-7.63 10.51c-2.598 3.59-7.615 4.394-11.205 1.795-3.59-2.598-4.393-7.615-1.795-11.205l7.64-10.5-12.36-4c-4.2-1.381-6.486-5.905-5.105-10.105 1.381-4.2 5.905-6.486 10.105-5.105L176 117v-13c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v13l12.35-4c4.2-1.381 8.724 .905 10.105 5.105 1.381 4.2-.905 8.724-5.105 10.105l-12.36 4ZM132.58 142.71c2.598 3.59 1.795 8.606-1.795 11.205-3.59 2.599-8.607 1.795-11.205-1.795L112 141.61l-7.63 10.51c-2.599 3.59-7.615 4.394-11.205 1.795-3.59-2.598-4.394-7.615-1.795-11.205l7.64-10.5-12.36-4c-4.2-1.381-6.486-5.905-5.105-10.105 1.381-4.2 5.905-6.486 10.105-5.105L104 117v-13c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v13l12.35-4c4.2-1.381 8.724 .905 10.105 5.105 1.381 4.2-.905 8.724-5.105 10.105l-12.36 4ZM64 88v80c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _password!!
    }

private var _password: ImageVector? = null
