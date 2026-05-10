package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DiamondRingFill: ImageVector
    get() {
        if (_diamondRingFill != null) return _diamondRingFill!!
        _diamondRingFill = remixIcon(
            name = "DiamondRingFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.535 1h-5.07L7.691 3.661 9.556 5.357C6.053 6.407 3.5 9.655 3.5 13.5 3.5 18.194 7.306 22 12 22c4.694 0 8.5-3.806 8.5-8.5 0-3.845-2.553-7.093-6.056-8.143L16.309 3.661 14.535 1ZM12 7c3.59 0 6.5 2.91 6.5 6.5C18.5 17.09 15.59 20 12 20 8.41 20 5.5 17.09 5.5 13.5 5.5 9.91 8.41 7 12 7Z"),
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
        return _diamondRingFill!!
    }

private var _diamondRingFill: ImageVector? = null
