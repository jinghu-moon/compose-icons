package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Virus: ImageVector
    get() {
        if (_virus != null) return _virus!!
        _virus = phosphorLightIcon(
            name = "Virus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134 108C134 93.641 122.359 82 108 82 93.641 82 82 93.641 82 108c0 14.359 11.641 26 26 26 14.359 0 26-11.641 26-26ZM108 122c-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14ZM190 128c0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14ZM142 176c0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14ZM240 122h-18.2C220.491 101.248 212.307 81.523 198.54 65.94L212.24 52.24c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147L190.06 57.46C174.477 43.693 154.752 35.509 134 34.2v-18.2c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18.2C101.248 35.509 81.523 43.693 65.94 57.46L52.24 43.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L57.46 65.94C43.693 81.523 35.509 101.248 34.2 122h-18.2c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18.2c1.309 20.752 9.493 40.477 23.26 56.06L43.76 203.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723L65.94 198.54c15.583 13.767 35.308 21.951 56.06 23.26v18.2c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18.2c20.752-1.309 40.477-9.493 56.06-23.26l13.7 13.7c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333L198.54 190.06C212.307 174.477 220.491 154.752 221.8 134h18.2c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM128 210C82.713 210 46 173.287 46 128 46 82.713 82.713 46 128 46c45.287 0 82 36.713 82 82-.055 45.265-36.735 81.945-82 82Z"),
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
        return _virus!!
    }

private var _virus: ImageVector? = null
