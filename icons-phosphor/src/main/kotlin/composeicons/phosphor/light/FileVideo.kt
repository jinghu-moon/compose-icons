package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) return _fileVideo!!
        _fileVideo = phosphorLightIcon(
            name = "FileVideo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.24 83.76l-56-56C155.116 26.634 153.591 26.001 152 26h-96C48.268 26 42 32.268 42 40v72c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-72c0-1.105 .895-2 2-2h90v50c0 3.314 2.686 6 6 6h50v122c0 1.105-.895 2-2 2h-8c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h8c7.732 0 14-6.268 14-14v-128c-.001-1.591-.634-3.116-1.76-4.24ZM158 46.48 193.52 82h-35.52ZM154.91 146.75c-1.908-1.058-4.24-.997-6.09 .16L126 161.17v-1.17c0-7.732-6.268-14-14-14h-64c-7.732 0-14 6.268-14 14v48c0 7.732 6.268 14 14 14h64c7.732 0 14-6.268 14-14v-1.17l22.82 14.26c1.85 1.156 4.182 1.217 6.089 .159 1.908-1.058 3.091-3.068 3.091-5.249v-64c.001-2.182-1.182-4.192-3.09-5.25ZM114 208c0 1.105-.895 2-2 2h-64c-1.105 0-2-.895-2-2v-48c0-1.105 .895-2 2-2h64c1.105 0 2 .895 2 2ZM146 205.17 126 192.67v-17.34l20-12.5Z"),
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
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
