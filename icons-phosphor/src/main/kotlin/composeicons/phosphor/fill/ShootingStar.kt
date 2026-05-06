package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShootingStar: ImageVector
    get() {
        if (_shootingStar != null) return _shootingStar!!
        _shootingStar = phosphorFillIcon(
            name = "ShootingStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.24 84.38l-28.06 23.68 8.56 35.39c1.27 5.239-.739 10.728-5.09 13.91-4.403 3.235-10.319 3.508-15 .69L164 139l-31.65 19.06c-4.679 2.826-10.6 2.553-15-.69-4.36-3.176-6.373-8.668-5.1-13.91l8.56-35.39L92.76 84.38C88.605 80.868 86.988 75.191 88.669 70.017c1.681-5.174 6.325-8.817 11.751-9.217l36.94-2.92L151.57 24.22c2.122-4.983 7.014-8.217 12.43-8.217 5.416 0 10.308 3.234 12.43 8.217l14.21 33.66 36.94 2.92c5.426 .4 10.07 4.043 11.751 9.217 1.681 5.174 .064 10.851-4.091 14.363ZM88.11 111.89c-1.501-1.502-3.537-2.346-5.66-2.346-2.123 0-4.159 .844-5.66 2.346L18.34 170.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L88.11 123.21c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM87.61 173.08 34.34 226.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L98.92 184.39c2.988-3.145 2.925-8.099-.143-11.167-3.068-3.068-8.022-3.131-11.167-.143ZM160.61 172.08l-54.29 54.28c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0l54.28-54.28c3.126-3.123 3.128-8.189 .005-11.315-3.123-3.126-8.189-3.128-11.315-.005Z"),
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
        return _shootingStar!!
    }

private var _shootingStar: ImageVector? = null
