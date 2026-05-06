package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Calendar: ImageVector
    get() {
        if (_calendar != null) return _calendar!!
        _calendar = phosphorLightIcon(
            name = "Calendar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-26v-10c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v10h-84v-10c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v10h-26C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM48 46h26v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h84v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h26c1.105 0 2 .895 2 2v34h-164v-34c0-1.105 .895-2 2-2ZM208 210h-160c-1.105 0-2-.895-2-2v-114h164v114c0 1.105-.895 2-2 2ZM110 120v64c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-54.29l-7.32 3.66c-2.966 1.48-6.57 .276-8.05-2.69-1.48-2.966-.276-6.57 2.69-8.05l16-8c1.86-.929 4.069-.828 5.837 .266 1.768 1.094 2.844 3.025 2.843 5.104ZM169.57 149.25 148 178h20c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-32c-2.273 0-4.35-1.284-5.367-3.317-1.016-2.033-.797-4.465 .567-6.283L160 142c2.26-2.97 2.679-6.951 1.085-10.326-1.593-3.375-4.933-5.581-8.663-5.723-3.729-.142-7.227 1.805-9.072 5.049-.975 2.034-3.009 3.349-5.264 3.403-2.255 .055-4.35-1.16-5.423-3.144-1.073-1.984-.943-4.402 .337-6.26 4.109-7.053 11.785-11.252 19.94-10.907 8.155 .345 15.449 5.177 18.948 12.552 3.498 7.375 2.625 16.081-2.268 22.615Z"),
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
        return _calendar!!
    }

private var _calendar: ImageVector? = null
