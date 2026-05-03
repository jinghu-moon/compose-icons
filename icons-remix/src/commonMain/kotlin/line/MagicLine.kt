package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MagicLine: ImageVector
    get() {
        if (_magicLine != null) return _magicLine!!
        _magicLine = remixIcon(
            name = "MagicLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.199 9.944 C 14.765 9.534 14.486 8.986 14.408 8.394 L 14.006 5.311 L 11.275 6.797 C 10.750 7.083 10.143 7.179 9.556 7.069 L 6.500 6.500 L 7.069 9.556 C 7.179 10.144 7.083 10.750 6.797 11.275 L 5.311 14.006 L 8.394 14.409 C 8.986 14.486 9.534 14.765 9.944 15.199 L 12.082 17.456 L 13.418 14.649 C 13.675 14.109 14.109 13.675 14.648 13.418 L 17.455 12.082 L 15.199 9.944 ZM 15.224 15.508 L 13.011 20.158 C 12.869 20.457 12.511 20.584 12.212 20.442 C 12.145 20.410 12.085 20.367 12.034 20.313 L 8.492 16.574 C 8.397 16.474 8.271 16.410 8.134 16.392 L 3.028 15.724 C 2.700 15.681 2.468 15.380 2.511 15.052 C 2.521 14.978 2.544 14.908 2.579 14.843 L 5.040 10.319 C 5.106 10.198 5.128 10.058 5.103 9.923 L 4.160 4.860 C 4.099 4.534 4.314 4.221 4.640 4.160 C 4.713 4.147 4.787 4.147 4.860 4.160 L 9.922 5.103 C 10.058 5.129 10.198 5.106 10.319 5.040 L 14.842 2.579 C 15.134 2.421 15.498 2.528 15.656 2.819 C 15.692 2.884 15.715 2.955 15.724 3.028 L 16.392 8.135 C 16.410 8.271 16.474 8.398 16.574 8.492 L 20.313 12.034 C 20.553 12.262 20.564 12.642 20.336 12.882 C 20.285 12.936 20.225 12.979 20.158 13.011 L 15.508 15.224 C 15.383 15.283 15.283 15.384 15.224 15.508 ZM 16.021 17.435 L 17.435 16.021 L 21.677 20.263 L 20.263 21.678 L 16.021 17.435 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _magicLine!!
    }

private var _magicLine: ImageVector? = null
