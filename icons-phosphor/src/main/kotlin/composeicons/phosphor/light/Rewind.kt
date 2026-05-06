package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Rewind: ImageVector
    get() {
        if (_rewind != null) return _rewind!!
        _rewind = phosphorLightIcon(
            name = "Rewind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.81 59.72c-4.47-2.446-9.917-2.27-14.22 .46L126 112.79v-40.95c-.004-5.05-2.76-9.696-7.19-12.12-4.47-2.446-9.917-2.27-14.22 .46L16.41 116.35C12.418 118.878 9.998 123.275 9.998 128c0 4.725 2.419 9.122 6.412 11.65l88.18 56.17c4.303 2.73 9.75 2.906 14.22 .46 4.43-2.424 7.186-7.07 7.19-12.12v-40.95l82.59 52.61c4.303 2.73 9.75 2.906 14.22 .46 4.43-2.424 7.186-7.07 7.19-12.12v-112.32c-.004-5.05-2.76-9.696-7.19-12.12ZM114 184.16c.008 .681-.383 1.303-1 1.59-.624 .361-1.399 .338-2-.06L22.85 129.53c-.53-.328-.852-.907-.852-1.53 0-.623 .322-1.202 .852-1.53L111 70.31c.296-.2 .643-.311 1-.32 .35-.002 .695 .087 1 .26 .617 .287 1.008 .909 1 1.59ZM218 184.16c.008 .681-.383 1.303-1 1.59-.624 .361-1.399 .338-2-.06L126.81 129.53c-.53-.328-.852-.907-.852-1.53 0-.623 .322-1.202 .852-1.53L215 70.31c.296-.2 .643-.311 1-.32 .35-.002 .695 .087 1 .26 .617 .287 1.008 .909 1 1.59Z"),
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
        return _rewind!!
    }

private var _rewind: ImageVector? = null
