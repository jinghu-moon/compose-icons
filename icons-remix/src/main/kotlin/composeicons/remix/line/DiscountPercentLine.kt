package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DiscountPercentLine: ImageVector
    get() {
        if (_discountPercentLine != null) return _discountPercentLine!!
        _discountPercentLine = remixIcon(
            name = "DiscountPercentLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.054 2.094c1.121-.956 2.77-.956 3.892 0l1.348 1.149c.16 .136 .359 .219 .569 .236l1.765 .141c1.469 .117 2.635 1.283 2.752 2.752l.141 1.765c.017 .21 .099 .409 .236 .569l1.149 1.348c.956 1.121 .956 2.77 0 3.892l-1.149 1.348c-.136 .16-.219 .359-.236 .569l-.141 1.765c-.117 1.469-1.283 2.635-2.752 2.752l-1.765 .141c-.21 .017-.409 .099-.569 .236l-1.348 1.149c-1.121 .956-2.771 .955-3.892 0L8.706 20.757c-.16-.136-.359-.219-.569-.236L6.372 20.38C4.903 20.263 3.737 19.097 3.62 17.628L3.479 15.863c-.017-.21-.099-.409-.236-.569L2.095 13.946C1.139 12.824 1.139 11.175 2.095 10.054L3.243 8.706c.136-.16 .219-.359 .236-.569L3.62 6.371C3.737 4.903 4.903 3.737 6.372 3.619L8.137 3.479c.21-.017 .409-.099 .569-.236L10.054 2.094ZM12.649 3.616c-.374-.318-.924-.319-1.297 0L10.004 4.765c-.481 .409-1.078 .657-1.707 .707L6.531 5.613c-.49 .039-.878 .428-.917 .917L5.473 8.296c-.05 .629-.298 1.227-.707 1.707L3.617 11.351c-.319 .374-.319 .924 0 1.297l1.149 1.348c.409 .481 .657 1.078 .707 1.707l.141 1.766c.039 .49 .428 .878 .917 .917l1.765 .141c.629 .05 1.227 .298 1.707 .707l1.348 1.149c.374 .318 .924 .318 1.297 0l1.348-1.149c.48-.409 1.078-.657 1.707-.707l1.765-.141c.49-.039 .878-.428 .917-.917l.141-1.766c.05-.629 .298-1.227 .707-1.707l1.149-1.348c.319-.374 .319-.923 0-1.297L19.235 10.003c-.41-.481-.657-1.078-.707-1.707L18.387 6.53c-.039-.49-.428-.878-.917-.917L15.704 5.472c-.629-.05-1.227-.298-1.707-.707L12.649 3.616ZM14.828 7.757l1.414 1.414L9.172 16.243 7.757 14.828 14.828 7.757ZM10.232 10.232c-.586 .586-1.536 .586-2.121 0-.586-.586-.586-1.535 0-2.121 .586-.586 1.536-.586 2.121 0 .586 .586 .586 1.536 0 2.121ZM13.768 15.889c.586 .586 1.535 .586 2.121 0 .586-.586 .586-1.535 0-2.121-.586-.586-1.535-.586-2.121 0-.586 .586-.586 1.535 0 2.121Z"),
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
        return _discountPercentLine!!
    }

private var _discountPercentLine: ImageVector? = null
