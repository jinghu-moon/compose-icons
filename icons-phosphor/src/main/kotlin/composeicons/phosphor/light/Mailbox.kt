package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Mailbox: ImageVector
    get() {
        if (_mailbox != null) return _mailbox!!
        _mailbox = phosphorLightIcon(
            name = "Mailbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M102 152c0 3.314-2.686 6-6 6h-40c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h40c3.314 0 6 2.686 6 6ZM238 116v60c0 7.732-6.268 14-14 14h-90v34c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-34h-90c-7.732 0-14-6.268-14-14v-60C18.039 83.983 43.983 58.039 76 58h78v-34c0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-26v28h14c32.017 .039 57.961 25.983 58 58ZM122 178v-62C122 90.595 101.405 70 76 70 50.595 70 30 90.595 30 116v60c0 1.105 .895 2 2 2ZM226 116C225.967 90.609 205.391 70.033 180 70h-14v74c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-74h-42.71c14.317 10.963 22.712 27.968 22.71 46v62h90c1.105 0 2-.895 2-2Z"),
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
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
