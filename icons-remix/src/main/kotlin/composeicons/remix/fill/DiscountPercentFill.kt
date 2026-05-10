package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DiscountPercentFill: ImageVector
    get() {
        if (_discountPercentFill != null) return _discountPercentFill!!
        _discountPercentFill = remixIcon(
            name = "DiscountPercentFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.946 2.094C12.825 1.139 11.176 1.139 10.054 2.094L8.706 3.243c-.16 .136-.359 .219-.569 .236L6.372 3.619C4.903 3.737 3.737 4.903 3.62 6.371L3.479 8.137c-.017 .21-.099 .409-.236 .569L2.095 10.054c-.956 1.121-.956 2.77 0 3.892l1.149 1.348c.136 .16 .219 .359 .236 .569l.141 1.765c.117 1.469 1.283 2.635 2.752 2.752l1.765 .141c.21 .017 .409 .099 .569 .236l1.348 1.149c1.121 .955 2.77 .956 3.892 0l1.348-1.149c.16-.136 .359-.219 .569-.236l1.765-.141c1.469-.117 2.635-1.283 2.752-2.752l.141-1.765c.017-.21 .099-.409 .236-.569l1.149-1.348c.956-1.121 .956-2.77 0-3.892L20.757 8.706c-.136-.16-.219-.359-.236-.569L20.381 6.371C20.263 4.903 19.097 3.737 17.629 3.619L15.863 3.479c-.21-.017-.409-.099-.569-.236L13.946 2.094ZM14.828 7.757l1.414 1.414L9.172 16.243 7.757 14.828 14.828 7.757ZM10.232 10.232c-.586 .586-1.536 .586-2.121 0-.586-.586-.586-1.535 0-2.121 .586-.586 1.536-.586 2.121 0 .586 .586 .586 1.536 0 2.121ZM13.768 15.889c-.586-.586-.586-1.535 0-2.121 .586-.586 1.535-.586 2.121 0 .586 .586 .586 1.535 0 2.121-.586 .586-1.535 .586-2.121 0Z"),
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
        return _discountPercentFill!!
    }

private var _discountPercentFill: ImageVector? = null
