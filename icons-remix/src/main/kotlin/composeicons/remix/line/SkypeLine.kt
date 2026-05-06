package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SkypeLine: ImageVector
    get() {
        if (_skypeLine != null) return _skypeLine!!
        _skypeLine = remixIcon(
            name = "SkypeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.005 18.423c.424-.066 .857 .007 1.237 .206 .461 .242 .974 .371 1.509 .371 1.795 0 3.25-1.455 3.25-3.25 0-.536-.128-1.048-.37-1.509-.2-.379-.272-.813-.206-1.237 .051-.33 .077-.665 .077-1.004 0-3.59-2.91-6.5-6.5-6.5-.339 0-.675 .026-1.004 .077-.424 .066-.857-.007-1.237-.206C9.299 5.128 8.787 5 8.251 5 6.456 5 5.001 6.455 5.001 8.25c0 .536 .128 1.048 .37 1.509 .2 .379 .272 .813 .206 1.237-.051 .33-.077 .665-.077 1.004 0 3.59 2.91 6.5 6.5 6.5 .339 0 .674-.026 1.004-.077ZM12.001 20.5C7.307 20.5 3.501 16.694 3.501 12c0-.446 .034-.883 .1-1.31C3.218 9.961 3.001 9.131 3.001 8.25 3.001 5.351 5.351 3 8.251 3c.881 0 1.711 .217 2.44 .6 .427-.066 .864-.1 1.31-.1 4.694 0 8.5 3.806 8.5 8.5 0 .446-.034 .883-.1 1.31 .383 .729 .6 1.559 .6 2.44 0 2.899-2.351 5.25-5.25 5.25-.881 0-1.711-.217-2.44-.6-.427 .066-.865 .1-1.31 .1ZM12.054 16.999c-2.802 0-4.053-1.378-4.053-2.412 0-.533 .391-.902 .928-.902 1.2 0 .886 1.725 3.125 1.725 1.143 0 1.776-.623 1.776-1.261 0-.384-.187-.808-.943-.995l-2.49-.623C8.391 12.026 8.027 10.938 8.027 9.918 8.027 7.797 10.019 7 11.891 7c1.721 0 3.756 .956 3.756 2.228 0 .546-.479 .863-1.012 .863-1.023 0-.834-1.418-2.9-1.418-1.023 0-1.596 .462-1.596 1.126 0 .664 .803 .876 1.502 1.035l1.836 .409c2.013 .452 2.524 1.634 2.524 2.746 0 1.724-1.324 3.011-3.985 3.011l.038-.001Z"),
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
        return _skypeLine!!
    }

private var _skypeLine: ImageVector? = null
