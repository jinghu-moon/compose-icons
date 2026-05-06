package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DeviceMobileSlash: ImageVector
    get() {
        if (_deviceMobileSlash != null) return _deviceMobileSlash!!
        _deviceMobileSlash = phosphorRegularIcon(
            name = "DeviceMobileSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.92 210.62 53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L56 60.69v155.31c0 13.255 10.745 24 24 24h96c12.135-.003 22.359-9.063 23.82-21.11l2.26 2.49c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM184 216c0 4.418-3.582 8-8 8h-96c-4.418 0-8-3.582-8-8v-137.71L184 201.49ZM68.7 24c0-4.418 3.582-8 8-8h99.3c13.255 0 24 10.745 24 24v110.83c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-110.83c0-4.418-3.582-8-8-8h-99.3c-4.418 0-8-3.582-8-8Z"),
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
        return _deviceMobileSlash!!
    }

private var _deviceMobileSlash: ImageVector? = null
