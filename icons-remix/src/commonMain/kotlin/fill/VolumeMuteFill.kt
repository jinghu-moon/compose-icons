package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VolumeMuteFill: ImageVector
    get() {
        if (_volumeMuteFill != null) return _volumeMuteFill!!
        _volumeMuteFill = remixIcon(
            name = "VolumeMuteFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.889 16.000 L 2.000 16.000 C 1.448 16.000 1.000 15.552 1.000 15.000 L 1.000 9.000 C 1.000 8.448 1.448 8.000 2.000 8.000 L 5.889 8.000 L 11.183 3.668 C 11.397 3.493 11.712 3.525 11.887 3.739 C 11.960 3.828 12.000 3.940 12.000 4.055 L 12.000 19.945 C 12.000 20.221 11.776 20.445 11.500 20.445 C 11.385 20.445 11.273 20.405 11.183 20.332 L 5.889 16.000 ZM 20.414 12.000 L 23.950 15.536 L 22.535 16.950 L 19.000 13.414 L 15.465 16.950 L 14.050 15.536 L 17.586 12.000 L 14.050 8.465 L 15.465 7.050 L 19.000 10.586 L 22.535 7.050 L 23.950 8.465 L 20.414 12.000 Z"),
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
        return _volumeMuteFill!!
    }

private var _volumeMuteFill: ImageVector? = null
