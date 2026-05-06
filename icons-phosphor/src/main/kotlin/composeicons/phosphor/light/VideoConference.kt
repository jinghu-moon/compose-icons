package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.VideoConference: ImageVector
    get() {
        if (_videoConference != null) return _videoConference!!
        _videoConference = phosphorLightIcon(
            name = "VideoConference",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-176C32.268 42 26 48.268 26 56v144c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-144c0-7.732-6.268-14-14-14ZM218 56v66h-52v-68h50c1.105 0 2 .895 2 2ZM38 200v-144c0-1.105 .895-2 2-2h114v148h-114c-1.105 0-2-.895-2-2ZM216 202h-50v-68h52v66c0 1.105-.895 2-2 2ZM182 88c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10ZM202 168c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM133.81 166.51C131.098 156.459 124.382 147.961 115.23 143c9.693-8.091 13.282-21.385 8.979-33.255C119.906 97.875 108.631 89.97 96.005 89.97c-12.626 0-23.901 7.905-28.204 19.775-4.303 11.87-.714 25.164 8.979 33.255-9.154 4.956-15.874 13.451-18.59 23.5-.828 3.209 1.101 6.482 4.31 7.31 3.209 .828 6.482-1.101 7.31-4.31C72.67 158.38 83.93 150 96 150c12.07 0 23.34 8.38 26.19 19.49 .828 3.209 4.101 5.138 7.31 4.31 3.209-.828 5.138-4.101 4.31-7.31ZM78 120c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18Z"),
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
        return _videoConference!!
    }

private var _videoConference: ImageVector? = null
