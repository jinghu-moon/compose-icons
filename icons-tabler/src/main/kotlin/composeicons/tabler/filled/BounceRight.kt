package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BounceRight: ImageVector
    get() {
        if (_bounceRight != null) return _bounceRight!!
        _bounceRight = tablerFilledIcon(
            name = "BounceRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.143 11.486c.293-.451 .891-.589 1.352-.312 .461 .277 .621 .869 .362 1.34-1.502 2.505-2.41 4.89-2.87 7.65-.16 .956-1.448 1.15-1.881 .283C9.046 16.327 7.248 15.471 4.316 16.449c-.524 .175-1.09-.109-1.265-.633-.175-.524 .109-1.09 .633-1.265 3.2-1.067 5.656-.373 7.803 2.623l.091 .13 .011-.04c.522-1.828 1.267-3.55 2.273-5.3l.28-.478Z")
            addPathData("M18 4C16.343 4 15 5.343 15 7c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C21 5.343 19.657 4 18 4")
        }
        return _bounceRight!!
    }

private var _bounceRight: ImageVector? = null
