package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RainbowLine: ImageVector
    get() {
        if (_rainbowLine != null) return _rainbowLine!!
        _rainbowLine = remixIcon(
            name = "RainbowLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 4c6.075 0 11 4.925 11 11v5h-2v-5C21 10.118 17.113 6.144 12.265 6.004L12 6C7.118 6 3.144 9.887 3.004 14.735L3 15v5h-2v-5C1 8.925 5.925 4 12 4ZM12 8c3.866 0 7 3.134 7 7v5h-2v-5c0-2.689-2.122-4.882-4.783-4.995L12 10C9.311 10 7.118 12.122 7.005 14.783L7 15v5h-2v-5C5 11.134 8.134 8 12 8ZM12 12c1.657 0 3 1.343 3 3v5h-2v-5c0-.513-.386-.936-.883-.993L12 14c-.513 0-.936 .386-.993 .883L11 15v5h-2v-5c0-1.657 1.343-3 3-3Z"),
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
        return _rainbowLine!!
    }

private var _rainbowLine: ImageVector? = null
