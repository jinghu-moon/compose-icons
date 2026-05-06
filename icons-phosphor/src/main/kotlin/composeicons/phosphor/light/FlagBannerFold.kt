package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) return _flagBannerFold!!
        _flagBannerFold = phosphorLightIcon(
            name = "FlagBannerFold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237 44.75C235.904 43.049 234.024 42.015 232 42h-80c-2.353 .001-4.488 1.378-5.46 3.52L137.23 66h-109.23c-2.36 .013-4.494 1.408-5.452 3.565-.958 2.157-.562 4.676 1.012 6.435l36.33 40L23.56 156c-1.574 1.759-1.97 4.278-1.012 6.435 .958 2.157 3.091 3.553 5.452 3.565h73.09c2.353-.001 4.488-1.378 5.46-3.52L115.86 142h66.82l-36.14 79.52c-.656 1.451-.708 3.102-.145 4.592 .563 1.489 1.694 2.694 3.145 3.348 .772 .355 1.611 .539 2.46 .54 2.353-.001 4.488-1.378 5.46-3.52l80-176c.831-1.864 .658-4.023-.46-5.73ZM97.23 154h-55.67L72.44 120c2.085-2.29 2.085-5.79 0-8.08L41.56 78h90.21ZM188.14 130h-66.82L155.86 54h66.82Z"),
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
        return _flagBannerFold!!
    }

private var _flagBannerFold: ImageVector? = null
