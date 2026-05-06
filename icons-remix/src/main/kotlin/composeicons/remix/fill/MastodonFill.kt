package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MastodonFill: ImageVector
    get() {
        if (_mastodonFill != null) return _mastodonFill!!
        _mastodonFill = remixIcon(
            name = "MastodonFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.26 13.99c-.274 1.411-2.456 2.955-4.962 3.254-1.307 .156-2.593 .299-3.965 .236-2.244-.103-4.014-.536-4.014-.536 0 .218 .013 .426 .04 .621 .292 2.214 2.196 2.347 3.999 2.409 1.82 .062 3.441-.449 3.441-.449l.075 1.646c0 0-1.273 .684-3.541 .809-1.251 .069-2.804-.031-4.612-.51C3.797 20.432 3.122 16.25 3.019 12.007 2.987 10.748 3.007 9.56 3.007 8.566 3.007 4.228 5.85 2.956 5.85 2.956 7.283 2.298 9.742 2.021 12.299 2h.063c2.557 .021 5.018 .298 6.451 .956 0 0 2.843 1.272 2.843 5.61 0 0 .036 3.201-.396 5.423ZM18.303 8.903c0-1.074-.273-1.927-.822-2.558-.566-.631-1.308-.955-2.228-.955-1.065 0-1.872 .409-2.405 1.228l-.518 .869-.518-.869C11.277 5.799 10.471 5.39 9.406 5.39c-.921 0-1.662 .324-2.228 .955-.549 .631-.822 1.484-.822 2.558v5.253h2.081v-5.099c0-1.075 .452-1.62 1.357-1.62 1 0 1.502 .647 1.502 1.927v2.791h2.069v-2.791c0-1.28 .501-1.927 1.501-1.927 .905 0 1.357 .546 1.357 1.62v5.099h2.081v-5.253Z"),
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
        return _mastodonFill!!
    }

private var _mastodonFill: ImageVector? = null
