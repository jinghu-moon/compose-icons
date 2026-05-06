package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaypalLogo: ImageVector
    get() {
        if (_paypalLogo != null) return _paypalLogo!!
        _paypalLogo = phosphorThinIcon(
            name = "PaypalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M217 96C211.503 88.939 204.267 83.426 196 80 196 51.281 172.719 28 144 28h-60c-5.51-.004-10.314 3.745-11.65 9.09l-36 144c-.896 3.586-.09 7.385 2.186 10.298 2.276 2.913 5.767 4.614 9.464 4.612h31.5c.381 0 .761-.02 1.14-.06l-4.29 17.15c-.896 3.586-.09 7.385 2.186 10.298 2.276 2.913 5.767 4.614 9.464 4.612h31.5c5.506-.001 10.305-3.748 11.64-9.09l9-35.88c.457-1.769 2.053-3.003 3.88-3h32c19.88 .005 38.023-11.326 46.743-29.191 8.72-17.865 6.491-39.139-5.743-54.809ZM48 188c-1.24 .005-2.413-.565-3.174-1.544-.762-.979-1.026-2.255-.716-3.456l36-144c.458-1.772 2.06-3.008 3.89-3h60c23.282-.005 42.538 18.129 43.93 41.37C184.019 76.459 180.016 75.999 176 76h-56c-5.51-.004-10.314 3.745-11.65 9.09L83.39 185c-.457 1.769-2.053 3.003-3.88 3ZM187.63 85.56c-.23 1.722-.564 3.428-1 5.11C181.758 110.25 164.177 123.996 144 124h-36c-.381-0-.761 .02-1.14 .06l9.25-37c.434-1.796 2.042-3.061 3.89-3.06h56c3.929 .002 7.84 .527 11.63 1.56ZM218.63 138.67C213.758 158.25 196.177 171.995 176 172h-32c-5.506 .001-10.305 3.748-11.64 9.09l-9 35.88c-.457 1.769-2.053 3.003-3.88 3h-31.48c-1.24 .005-2.413-.565-3.174-1.544-.762-.979-1.026-2.255-.716-3.456l20-80c.458-1.772 2.06-3.008 3.89-3h36c23.869 .025 44.68-16.227 50.44-39.39 .35-1.39 .62-2.79 .85-4.19 18.67 9.14 28.417 30.08 23.39 50.25Z"),
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
        return _paypalLogo!!
    }

private var _paypalLogo: ImageVector? = null
