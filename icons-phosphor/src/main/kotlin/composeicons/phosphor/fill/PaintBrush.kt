package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) return _paintBrush!!
        _paintBrush = phosphorFillIcon(
            name = "PaintBrush",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 32c0-4.418-3.582-8-8-8-44.08 0-89.31 49.71-114.43 82.63-18.193-5.572-37.95-2.184-53.248 9.13C41.025 127.074 32 144.973 32 164c0 30.88-19.54 44.73-20.47 45.37-2.913 1.967-4.201 5.606-3.174 8.968 1.027 3.362 4.129 5.659 7.644 5.662h76c19.027 0 36.926-9.025 48.24-24.322 11.314-15.298 14.702-35.055 9.13-53.248C182.3 121.31 232 76.08 232 32ZM124.42 113.55q5.14-6.66 10.09-12.55c8.077 5.457 15.033 12.413 20.49 20.49q-5.9 4.94-12.55 10.09c-4.662-7.222-10.808-13.368-18.03-18.03ZM167.12 110.87c-6.04-8.522-13.478-15.96-22-22C176.9 54.34 200.87 43.87 215.02 40.96c-2.85 14.16-13.37 38.13-47.9 69.91Z"),
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
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
