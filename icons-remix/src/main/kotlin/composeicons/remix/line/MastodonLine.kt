package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MastodonLine: ImageVector
    get() {
        if (_mastodonLine != null) return _mastodonLine!!
        _mastodonLine = remixIcon(
            name = "MastodonLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.019 12.007C2.987 10.748 3.007 9.56 3.007 8.566 3.007 4.228 5.85 2.956 5.85 2.956 7.283 2.298 9.742 2.021 12.299 2h.063c2.557 .021 5.018 .298 6.451 .956 0 0 2.843 1.272 2.843 5.61 0 0 .036 3.201-.396 5.423-.274 1.411-2.456 2.955-4.962 3.254-1.307 .156-2.593 .299-3.965 .236-2.244-.103-4.014-.536-4.014-.536 0 .219 .014 .427 .04 .621 .083 .632 .298 1.095 .604 1.434 .766 .85 2.106 .93 3.395 .974 1.82 .062 3.441-.449 3.441-.449l.075 1.646c0 0-1.273 .684-3.541 .809-1.251 .069-2.804-.031-4.613-.51C6.188 21.065 5.152 20.18 4.451 19 3.357 17.157 3.082 14.594 3.019 12.007ZM6.318 16.945v-2.548l2.475 .605c.047 .012 .158 .036 .324 .071 .288 .059 .617 .118 .979 .174 .753 .116 1.538 .2 2.328 .236 1.019 .047 1.901-.017 3.637-.224 1.663-.199 3.148-1.196 3.236-1.65 .082-.422 .151-.922 .206-1.482 .069-.706 .113-1.47 .137-2.245 .015-.51 .019-.944 .018-1.256l-0-.058c0-1.43-.369-2.439-.963-3.159-.192-.232-.392-.414-.584-.548-.09-.063-.135-.088-.13-.086C16.966 4.308 14.886 4.021 12.362 4h-.046C9.776 4.021 7.697 4.308 6.666 4.782c.023-.01-.022 .015-.112 .078-.192 .135-.392 .316-.584 .548-.594 .72-.963 1.729-.963 3.159 0 .231-.001 .397-.003 .875-.006 1.182-.004 1.784 .014 2.518 .053 2.197 .264 3.835 .7 5.041 .212 .587 .472 1.071 .779 1.451-.119-.435-.179-.937-.179-1.506ZM8.086 6.371c.632 0 1.143 .512 1.143 1.143 0 .631-.512 1.143-1.143 1.143C7.454 8.658 6.942 8.146 6.942 7.515c0-.632 .512-1.143 1.143-1.143Z"),
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
        return _mastodonLine!!
    }

private var _mastodonLine: ImageVector? = null
