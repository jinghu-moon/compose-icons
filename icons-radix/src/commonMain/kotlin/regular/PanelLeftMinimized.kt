package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.PanelLeftMinimized: ImageVector
    get() {
        if (_panelLeftMinimized != null) return _panelLeftMinimized!!
        _panelLeftMinimized = radixIcon(
            name = "PanelLeftMinimized",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.653 2.008 C 14.410 2.085 15.000 2.723 15.000 3.500 L 15.000 11.500 L 14.992 11.653 C 14.920 12.359 14.359 12.920 13.653 12.992 L 13.500 13.000 L 1.500 13.000 L 1.347 12.992 C 0.641 12.920 0.079 12.359 0.008 11.653 L 0.000 11.500 L 0.000 3.500 C 0.000 2.723 0.590 2.085 1.347 2.008 L 1.500 2.000 L 13.500 2.000 L 13.653 2.008 ZM 1.500 2.984 C 1.215 2.984 0.984 3.215 0.984 3.500 L 0.984 11.500 C 0.984 11.785 1.215 12.016 1.500 12.016 L 13.500 12.016 C 13.785 12.016 14.016 11.785 14.016 11.500 L 14.016 3.500 C 14.016 3.215 13.785 2.984 13.500 2.984 L 1.500 2.984 ZM 3.500 4.000 C 3.776 4.000 4.000 4.224 4.000 4.500 L 4.000 10.500 C 4.000 10.776 3.776 11.000 3.500 11.000 C 3.224 11.000 3.000 10.776 3.000 10.500 L 3.000 4.500 C 3.000 4.224 3.224 4.000 3.500 4.000 Z"),
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
        return _panelLeftMinimized!!
    }

private var _panelLeftMinimized: ImageVector? = null
