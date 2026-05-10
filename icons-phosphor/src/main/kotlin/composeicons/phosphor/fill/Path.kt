package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Path: ImageVector
    get() {
        if (_path != null) return _path!!
        _path = phosphorFillIcon(
            name = "Path",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 200c-.005 13.899-10.204 25.691-23.957 27.697C190.289 229.704 177.146 221.318 173.17 208h-101.17C45.49 208 24 186.51 24 160c0-26.51 21.49-48 48-48h96c13.255 0 24-10.745 24-24C192 74.745 181.255 64 168 64h-96c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h96c22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40h-96c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32h101.17c3.976-13.318 17.119-21.704 30.873-19.697 13.753 2.007 23.953 13.798 23.957 27.697Z"),
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
        return _path!!
    }

private var _path: ImageVector? = null
