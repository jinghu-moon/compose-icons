package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BlueskyFill: ImageVector
    get() {
        if (_blueskyFill != null) return _blueskyFill!!
        _blueskyFill = remixIcon(
            name = "BlueskyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 11.388C11.094 9.627 8.628 6.344 6.335 4.726 4.138 3.175 3.301 3.443 2.752 3.693 2.116 3.978 2 4.955 2 5.528c0 .575 .315 4.708 .52 5.399 .679 2.28 3.094 3.05 5.319 2.803-3.26 .483-6.156 1.671-2.358 5.898 4.177 4.325 5.725-.927 6.519-3.59 .794 2.663 1.708 7.726 6.444 3.59C22 16.039 19.421 14.214 16.161 13.731c2.225 .248 4.64-.523 5.319-2.803C21.685 10.238 22 6.103 22 5.529c0-.575-.116-1.551-.752-1.838-.549-.248-1.387-.517-3.583 1.033C15.372 6.345 12.906 9.628 12 11.388Z"),
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
        return _blueskyFill!!
    }

private var _blueskyFill: ImageVector? = null
