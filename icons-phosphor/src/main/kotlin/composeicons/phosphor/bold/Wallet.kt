package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Wallet: ImageVector
    get() {
        if (_wallet != null) return _wallet!!
        _wallet = phosphorBoldIcon(
            name = "Wallet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 136c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM236 100v80c0 17.673-14.327 32-32 32h-144C42.327 212 28 197.673 28 180v-119.08c-.249-8.645 3.013-17.023 9.041-23.225C43.069 31.494 51.351 27.996 60 28h132c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-132c-2.168-.001-4.243 .877-5.751 2.434C52.741 55.991 51.93 58.094 52 60.26v.08c.349 4.398 4.07 7.759 8.48 7.66h143.52c17.673 0 32 14.327 32 32ZM212 100c0-4.418-3.582-8-8-8h-143.52C57.619 92.001 54.769 91.638 52 90.92v89.08c0 4.418 3.582 8 8 8h144c4.418 0 8-3.582 8-8Z"),
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
        return _wallet!!
    }

private var _wallet: ImageVector? = null
