package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) return _cameraPlus!!
        _cameraPlus = phosphorBoldIcon(
            name = "CameraPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 136c0 6.627-5.373 12-12 12h-20v20c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-20h-20c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h20v-20c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v20h20c6.627 0 12 5.373 12 12ZM236 80v112c0 15.464-12.536 28-28 28h-160C32.536 220 20 207.464 20 192v-112C20 64.536 32.536 52 48 52h25.58L83.64 36.91C87.348 31.345 93.593 28.001 100.28 28h55.44c6.687 .001 12.932 3.345 16.64 8.91L182.42 52h25.58c15.464 0 28 12.536 28 28ZM212 80c0-2.209-1.791-4-4-4h-32c-4.017 .006-7.771-1.998-10-5.34L153.58 52h-51.16L90 70.66C87.771 74.002 84.017 76.006 80 76h-32c-2.209 0-4 1.791-4 4v112c0 2.209 1.791 4 4 4h160c2.209 0 4-1.791 4-4Z"),
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
        return _cameraPlus!!
    }

private var _cameraPlus: ImageVector? = null
