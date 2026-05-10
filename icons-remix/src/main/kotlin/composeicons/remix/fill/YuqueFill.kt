package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.YuqueFill: ImageVector
    get() {
        if (_yuqueFill != null) return _yuqueFill!!
        _yuqueFill = remixIcon(
            name = "YuqueFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.281 2.955c2.969 .203 3.755 2.341 3.839 2.597l1.297 .095c.13 0 .169 .181 .054 .237-1.323 .716-1.727 2.171-1.49 3.118 .09 .357 .253 .689 .412 1.02 .307 .641 .651 1.418 .707 2.981 .117 3.239-2.511 6.174-5.789 6.592 1.17-1.187 1.814-2.444 2.12-3.375 .606-1.846 .508-3.316 .054-4.44C18.038 10.673 17.281 9.99 16.704 9.64 15.021 8.62 13.485 8.549 12.26 8.878c.465-.594 .876-1.201 1.199-1.864 .584-1.649-.102-2.848-.703-3.518-.192-.246-.061-.655 .304-.655 1.41 0 2.813 .021 4.22 .116ZM3.319 19.107c1.924-2.202 4.713-5.393 7.163-8.15 .559-.629 2.769-2.338 5.747-.532 .878 .532 2.43 2.165 1.332 5.511-.803 2.445-4.407 7.795-15.759 5.844-.227-.039-.511-.354-.218-.688 .415-.472 1.014-1.159 1.736-1.984Z"),
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
        return _yuqueFill!!
    }

private var _yuqueFill: ImageVector? = null
