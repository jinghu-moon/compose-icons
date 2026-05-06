package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) return _paperPlane!!
        _paperPlane = phosphorLightIcon(
            name = "PaperPlane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.17 201.09 140.1 33.16c-2.479-4.411-7.145-7.142-12.205-7.142-5.06 0-9.726 2.73-12.205 7.142L19.81 201.16c-2.851 5.084-2.254 11.402 1.498 15.861 3.752 4.46 9.875 6.128 15.372 4.189L128 190.34l91.33 30.85c1.501 .528 3.079 .801 4.67 .81 4.975-.016 9.568-2.672 12.064-6.975 2.496-4.303 2.521-9.608 .066-13.935ZM225.51 209.27c-.512 .676-1.415 .922-2.2 .6h-.1L134 179.7v-59.7c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v59.7L32.8 209.83h-.1c-.785 .322-1.688 .076-2.2-.6-.571-.601-.669-1.51-.24-2.22L126.14 39c.347-.632 1.019-1.018 1.74-1 .747-.003 1.433 .409 1.78 1.07L225.73 207c.454 .718 .363 1.652-.22 2.27Z"),
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
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
