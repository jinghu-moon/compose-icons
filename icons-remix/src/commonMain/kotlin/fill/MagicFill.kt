package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MagicFill: ImageVector
    get() {
        if (_magicFill != null) return _magicFill!!
        _magicFill = remixIcon(
            name = "MagicFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.224 15.508 L 13.011 20.158 C 12.869 20.457 12.511 20.584 12.212 20.442 C 12.145 20.410 12.085 20.367 12.034 20.313 L 8.492 16.574 C 8.397 16.474 8.271 16.410 8.134 16.392 L 3.028 15.724 C 2.700 15.681 2.468 15.380 2.511 15.052 C 2.521 14.978 2.544 14.908 2.579 14.843 L 5.040 10.319 C 5.106 10.198 5.128 10.058 5.103 9.923 L 4.160 4.860 C 4.099 4.534 4.314 4.221 4.640 4.160 C 4.713 4.147 4.787 4.147 4.860 4.160 L 9.922 5.103 C 10.058 5.129 10.198 5.106 10.319 5.040 L 14.842 2.579 C 15.134 2.421 15.498 2.528 15.656 2.819 C 15.692 2.884 15.715 2.955 15.724 3.028 L 16.392 8.135 C 16.410 8.271 16.474 8.398 16.574 8.492 L 20.313 12.034 C 20.553 12.262 20.564 12.642 20.336 12.882 C 20.285 12.936 20.225 12.979 20.158 13.011 L 15.508 15.224 C 15.383 15.283 15.283 15.384 15.224 15.508 ZM 16.021 17.435 L 17.435 16.021 L 21.677 20.263 L 20.263 21.678 L 16.021 17.435 Z"),
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
        return _magicFill!!
    }

private var _magicFill: ImageVector? = null
