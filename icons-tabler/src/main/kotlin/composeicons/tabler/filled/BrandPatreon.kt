package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandPatreon: ImageVector
    get() {
        if (_brandPatreon != null) return _brandPatreon!!
        _brandPatreon = tablerFilledIcon(
            name = "BrandPatreon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.462 3.1c2.615-1.268 6.226-1.446 9.063-.503 2.568 .853 4.471 3.175 4.475 5.81 .004 3.061-1.942 5.492-4.896 6.243-1.693 .43-2.338 .75-2.942 1.582-.238 .328-.45 .745-.796 1.533l-.22 .5C11 20.866 9.99 22.027 7.91 22 5.678 21.97 4.307 20.258 3.597 17.52 3.139 15.752 2.98 13.712 3.003 11.644 3.047 7.651 4.423 4.572 7.463 3.099Z"),
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
        return _brandPatreon!!
    }

private var _brandPatreon: ImageVector? = null
