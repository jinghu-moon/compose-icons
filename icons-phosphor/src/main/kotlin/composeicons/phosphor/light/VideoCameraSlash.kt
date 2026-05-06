package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) return _videoCameraSlash!!
        _videoCameraSlash = phosphorLightIcon(
            name = "VideoCameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M250.83 74.71c-1.952-1.044-4.319-.928-6.16 .3L206 100.79v-28.79c0-7.732-6.268-14-14-14h-78.94c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h78.94c1.105 0 2 .895 2 2v87.63c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-4.42L244.67 181c1.842 1.229 4.212 1.344 6.164 .297 1.952-1.046 3.169-3.083 3.166-5.297v-96c-0-2.213-1.219-4.246-3.17-5.29ZM242 164.79l-36-24v-25.58l36-24ZM52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L56.25 58h-24.25C24.268 58 18 64.268 18 72v112c0 7.732 6.268 14 14 14h151.53l20 22c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM32 186c-1.105 0-2-.895-2-2v-112c0-1.105 .895-2 2-2h35.16L172.62 186Z"),
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
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
