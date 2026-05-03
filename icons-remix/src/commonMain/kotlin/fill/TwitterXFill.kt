package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TwitterXFill: ImageVector
    get() {
        if (_twitterXFill != null) return _twitterXFill!!
        _twitterXFill = remixIcon(
            name = "TwitterXFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.687 3.062 L 12.691 8.774 L 8.370 3.062 L 2.113 3.062 L 9.590 12.839 L 2.504 20.938 L 5.538 20.938 L 11.007 14.689 L 15.786 20.938 L 21.889 20.938 L 14.095 10.634 L 20.720 3.062 L 17.687 3.062 ZM 16.623 19.122 L 5.654 4.782 L 7.457 4.782 L 18.303 19.122 L 16.623 19.122 Z"),
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
        return _twitterXFill!!
    }

private var _twitterXFill: ImageVector? = null
