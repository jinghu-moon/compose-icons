package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderSimpleLock: ImageVector
    get() {
        if (_folderSimpleLock != null) return _folderSimpleLock!!
        _folderSimpleLock = phosphorLightIcon(
            name = "FolderSimpleLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 88v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16c0-1.105-.895-2-2-2h-85.33c-3.029 0-5.977-.982-8.4-2.8L94.53 62.4C94.184 62.14 93.763 62 93.33 62h-53.33c-1.105 0-2 .895-2 2v136c0 1.105 .895 2 2 2h72c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-72c-7.732 0-14-6.268-14-14v-136C26 56.268 32.268 50 40 50h53.33c3.029 0 5.977 .982 8.4 2.8l27.74 20.8c.346 .26 .767 .4 1.2 .4h85.33c7.732 0 14 6.268 14 14ZM230 168v40c0 3.314-2.686 6-6 6h-72c-3.314 0-6-2.686-6-6v-40c0-3.314 2.686-6 6-6h10v-6c0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26v6h10c3.314 0 6 2.686 6 6ZM174 162h28v-6c0-7.732-6.268-14-14-14-7.732 0-14 6.268-14 14ZM218 174h-60v28h60Z"),
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
        return _folderSimpleLock!!
    }

private var _folderSimpleLock: ImageVector? = null
