package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BaseStationFill: ImageVector
    get() {
        if (_baseStationFill != null) return _baseStationFill!!
        _baseStationFill = remixIcon(
            name = "BaseStationFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 13l6 9h-12l6-9ZM10.939 10.561c-.586-.586-.586-1.535 0-2.121 .586-.586 1.536-.586 2.121 0 .586 .586 .586 1.536 0 2.121-.586 .586-1.536 .586-2.121 0ZM5.282 2.782 6.697 4.197c-2.929 2.929-2.929 7.678 0 10.607L5.282 16.218C1.572 12.507 1.572 6.492 5.282 2.782ZM18.718 2.782c3.71 3.71 3.71 9.725 0 13.435L17.303 14.803c2.929-2.929 2.929-7.678 0-10.607L18.718 2.782ZM8.111 5.611 9.525 7.025c-1.367 1.367-1.367 3.583 0 4.95L8.111 13.389C5.963 11.241 5.963 7.759 8.111 5.611h0ZM15.889 5.611c2.148 2.148 2.148 5.63 0 7.778L14.475 11.975c1.367-1.367 1.367-3.583 0-4.95L15.889 5.611Z"),
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
        return _baseStationFill!!
    }

private var _baseStationFill: ImageVector? = null
