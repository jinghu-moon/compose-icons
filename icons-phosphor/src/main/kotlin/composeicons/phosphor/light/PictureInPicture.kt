package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PictureInPicture: ImageVector
    get() {
        if (_pictureInPicture != null) return _pictureInPicture!!
        _pictureInPicture = phosphorLightIcon(
            name = "PictureInPicture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 50h-176C32.268 50 26 56.268 26 64v128c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-128c0-7.732-6.268-14-14-14ZM38 192v-128c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2v58h-82c-3.314 0-6 2.686-6 6v66h-90c-1.105 0-2-.895-2-2ZM216 194h-74v-60h76v58c0 1.105-.895 2-2 2Z"),
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
        return _pictureInPicture!!
    }

private var _pictureInPicture: ImageVector? = null
