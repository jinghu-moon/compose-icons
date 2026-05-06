package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MedalMilitary: ImageVector
    get() {
        if (_medalMilitary != null) return _medalMilitary!!
        _medalMilitary = phosphorThinIcon(
            name = "MedalMilitary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M207 44h-158C41.82 44 36 49.82 36 57v49.21c.017 5.082 2.994 9.687 7.62 11.79l70.72 32.14c-20.562 6.715-33.193 27.38-29.793 48.742 3.4 21.362 21.822 37.084 43.453 37.084 21.631 0 40.053-15.722 43.453-37.084 3.4-21.362-9.231-42.027-29.793-48.742L212.38 118c4.626-2.103 7.603-6.708 7.62-11.79v-49.21c0-7.18-5.82-13-13-13ZM164 52v79.24l-36 16.37L92 131.24v-79.24ZM44 106.21v-49.21c0-2.761 2.239-5 5-5h35v75.61L46.93 110.76c-1.784-.811-2.929-2.59-2.93-4.55ZM164 192c0 19.882-16.118 36-36 36C108.118 228 92 211.882 92 192c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36ZM212 106.21c-.001 1.96-1.146 3.739-2.93 4.55L172 127.61v-75.61h35c2.761 0 5 2.239 5 5Z"),
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
        return _medalMilitary!!
    }

private var _medalMilitary: ImageVector? = null
