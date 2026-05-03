package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GooglePlayFill: ImageVector
    get() {
        if (_googlePlayFill != null) return _googlePlayFill!!
        _googlePlayFill = remixIcon(
            name = "GooglePlayFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.610 1.814 L 13.793 12.000 L 3.611 22.186 C 3.418 22.105 3.249 21.962 3.136 21.767 C 3.047 21.614 3.001 21.442 3.001 21.266 L 3.001 2.735 C 3.001 2.321 3.252 1.966 3.610 1.814 ZM 14.500 12.707 L 16.802 15.009 L 5.865 21.342 L 14.500 12.707 ZM 17.699 9.509 L 20.506 11.135 C 20.984 11.411 21.147 12.023 20.871 12.501 C 20.783 12.652 20.657 12.778 20.506 12.866 L 17.698 14.491 L 15.207 12.000 L 17.699 9.509 ZM 5.865 2.658 L 16.803 8.990 L 14.500 11.293 L 5.865 2.658 Z"),
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
        return _googlePlayFill!!
    }

private var _googlePlayFill: ImageVector? = null
