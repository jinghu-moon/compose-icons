package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MetaFill: ImageVector
    get() {
        if (_metaFill != null) return _metaFill!!
        _metaFill = remixIcon(
            name = "MetaFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.92 4.5c-1.851 0-3.298 1.394-4.607 3.165C10.512 5.373 9.007 4.5 7.206 4.5 3.534 4.5 .72 9.279 .72 14.338c0 3.166 1.531 5.162 4.097 5.162 1.846 0 3.174-.87 5.535-4.997 0 0 .984-1.738 1.661-2.934 .237 .383 .487 .795 .75 1.238l1.107 1.862c2.156 3.608 3.358 4.831 5.535 4.831 2.499 0 3.89-2.024 3.89-5.255 0-5.297-2.877-9.745-6.372-9.745ZM8.551 13.386c-1.914 3-2.576 3.672-3.641 3.672-1.097 0-1.748-.963-1.748-2.679 0-3.672 1.831-7.428 4.014-7.428 1.182 0 2.17 .683 3.683 2.849C9.421 12.004 8.551 13.386 8.551 13.386ZM15.774 13.009 14.45 10.801c-.358-.583-.701-1.118-1.033-1.608C14.611 7.352 15.594 6.434 16.765 6.434c2.431 0 4.376 3.579 4.376 7.976 0 1.676-.549 2.648-1.686 2.648-1.09 0-1.611-.72-3.681-4.05Z"),
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
        return _metaFill!!
    }

private var _metaFill: ImageVector? = null
