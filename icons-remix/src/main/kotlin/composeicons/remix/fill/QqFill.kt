package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.QqFill: ImageVector
    get() {
        if (_qqFill != null) return _qqFill!!
        _qqFill = remixIcon(
            name = "QqFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.914 14.529c-.18-.574-.426-1.243-.675-1.886l-.91-2.246c.001-.026 .012-.468 .012-.696C18.341 5.86 16.508 2 12.001 2 7.494 2 5.661 5.86 5.661 9.701c0 .228 .011 .67 .012 .696l-.909 2.246c-.249 .643-.496 1.312-.676 1.886-.859 2.737-.581 3.869-.369 3.895 .455 .054 1.771-2.06 1.771-2.06 0 1.224 .637 2.822 2.016 3.976-.516 .157-1.148 .399-1.554 .696-.365 .267-.319 .539-.254 .649 .289 .482 4.956 .308 6.303 .158 1.347 .15 6.014 .324 6.303-.158 .066-.11 .111-.382-.254-.649-.406-.297-1.039-.538-1.555-.696 1.379-1.154 2.016-2.752 2.016-3.976 0 0 1.316 2.114 1.771 2.06 .212-.026 .49-1.158-.369-3.895Z"),
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
        return _qqFill!!
    }

private var _qqFill: ImageVector? = null
