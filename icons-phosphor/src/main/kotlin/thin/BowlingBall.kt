package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BowlingBall: ImageVector
    get() {
        if (_bowlingBall != null) return _bowlingBall!!
        _bowlingBall = phosphorThinIcon(
            name = "BowlingBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 140.000 116.000 C 140.000 120.418 136.418 124.000 132.000 124.000 C 127.582 124.000 124.000 120.418 124.000 116.000 C 124.000 111.582 127.582 108.000 132.000 108.000 C 136.418 108.000 140.000 111.582 140.000 116.000 ZM 164.000 100.000 C 159.582 100.000 156.000 96.418 156.000 92.000 C 156.000 87.582 159.582 84.000 164.000 84.000 C 168.418 84.000 172.000 87.582 172.000 92.000 C 172.000 96.418 168.418 100.000 164.000 100.000 ZM 180.000 132.000 C 180.000 136.418 176.418 140.000 172.000 140.000 C 167.582 140.000 164.000 136.418 164.000 132.000 C 164.000 127.582 167.582 124.000 172.000 124.000 C 176.418 124.000 180.000 127.582 180.000 132.000 Z"),
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
        return _bowlingBall!!
    }

private var _bowlingBall: ImageVector? = null
