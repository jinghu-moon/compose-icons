package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlayLargeLine: ImageVector
    get() {
        if (_playLargeLine != null) return _playLargeLine!!
        _playLargeLine = remixIcon(
            name = "PlayLargeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 18.392v-12.783L18.226 12 8 18.392ZM6 3.804v16.391c0 .785 .864 1.264 1.53 .848L20.643 12.848c.627-.392 .627-1.304 0-1.696L7.53 2.956C6.864 2.54 6 3.019 6 3.804Z"),
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
        return _playLargeLine!!
    }

private var _playLargeLine: ImageVector? = null
