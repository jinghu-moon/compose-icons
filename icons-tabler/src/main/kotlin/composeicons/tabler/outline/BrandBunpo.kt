package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBunpo: ImageVector
    get() {
        if (_brandBunpo != null) return _brandBunpo!!
        _brandBunpo = tablerOutlineIcon(
            name = "BrandBunpo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.9 7.205C5.103 8.302 6.452 9.228 7.908 9.958c1.434 .638 3.024 .835 4.57 .567 1.5-.33 2.907-1 4.121-1.956 1.122-.796 2.1-1.778 2.892-2.903 .603-.94 .745-1.766 .484-2.231-.261-.465-.927-.568-1.72-.257-1.009 .477-1.899 1.172-2.608 2.034C14.623 6.392 13.754 7.697 13.059 9.096c-.83 1.633-1.529 3.33-2.093 5.073-.388 1.135-.616 2.318-.677 3.515-.07 .752 .07 1.51 .405 2.184 .323 .562 1.06 1.132 2.343 1.132 3.474 0 5.093-3.53 5.463-5.62 .24-1.365-.085-3.197-1.182-4.01"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandBunpo!!
    }

private var _brandBunpo: ImageVector? = null
