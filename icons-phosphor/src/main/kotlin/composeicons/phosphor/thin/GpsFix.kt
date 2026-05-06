package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GpsFix: ImageVector
    get() {
        if (_gpsFix != null) return _gpsFix!!
        _gpsFix = phosphorThinIcon(
            name = "GpsFix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 124h-28.1C209.786 80.778 175.222 46.214 132 44.1v-28.1c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v28.1C80.778 46.214 46.214 80.778 44.1 124h-28.1c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h28.1c2.114 43.222 36.678 77.786 79.9 79.9v28.1c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-28.1c43.222-2.114 77.786-36.678 79.9-79.9h28.1c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM128 204C86.026 204 52 169.974 52 128 52 86.026 86.026 52 128 52c41.974 0 76 34.026 76 76-.044 41.955-34.045 75.956-76 76ZM128 92c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36C164 108.118 147.882 92 128 92ZM128 156c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
        return _gpsFix!!
    }

private var _gpsFix: ImageVector? = null
