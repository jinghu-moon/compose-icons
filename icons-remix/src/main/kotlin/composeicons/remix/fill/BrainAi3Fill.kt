package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BrainAi3Fill: ImageVector
    get() {
        if (_brainAi3Fill != null) return _brainAi3Fill!!
        _brainAi3Fill = remixIcon(
            name = "BrainAi3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.5 4.783v2.888L22 9.114v5.772l-2.501 1.444 .001 2.887-5 2.887L12 20.661 9.5 22.104l-5-2.887v-2.887L2 14.888 2.001 9.113 4.5 7.67v-2.886l5-2.887 2.499 1.443L14.501 1.896l4.999 2.887ZM14.735 13.16c-.088-.213-.383-.213-.471 0l-.127 .305c-.216 .521-.618 .938-1.125 1.163l-.358 .159c-.205 .091-.205 .39 0 .482l.38 .169c.494 .22 .89 .621 1.109 1.125l.123 .282c.09 .207 .377 .207 .467 0l.123-.282c.22-.504 .616-.905 1.109-1.125l.38-.169c.205-.091 .205-.39 0-.482l-.358-.159c-.507-.225-.91-.642-1.126-1.163l-.126-.305ZM10.412 7.779c-.154-.372-.67-.372-.824 0l-.222 .535C8.988 9.227 8.284 9.956 7.397 10.351l-.628 .279c-.359 .16-.359 .683 0 .843l.665 .295c.864 .384 1.557 1.087 1.941 1.97l.216 .495c.158 .362 .659 .362 .816 0l.216-.495c.385-.882 1.077-1.585 1.941-1.97l.665-.295c.359-.16 .359-.683 0-.843l-.628-.279C11.716 9.956 11.011 9.227 10.633 8.314l-.221-.535Z"),
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
        return _brainAi3Fill!!
    }

private var _brainAi3Fill: ImageVector? = null
