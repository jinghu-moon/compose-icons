package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.PanelRight: ImageVector
    get() {
        if (_panelRight != null) return _panelRight!!
        _panelRight = radixIcon(
            name = "PanelRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.653 2.008 C 14.410 2.085 15.000 2.723 15.000 3.500 L 15.000 11.500 L 14.992 11.653 C 14.920 12.359 14.359 12.920 13.653 12.992 L 13.500 13.000 L 1.500 13.000 L 1.347 12.992 C 0.641 12.920 0.079 12.359 0.008 11.653 L 0.000 11.500 L 0.000 3.500 C 0.000 2.723 0.590 2.085 1.347 2.008 L 1.500 2.000 L 13.500 2.000 L 13.653 2.008 ZM 1.500 2.984 C 1.215 2.984 0.984 3.215 0.984 3.500 L 0.984 11.500 C 0.984 11.785 1.215 12.016 1.500 12.016 L 10.000 12.016 L 10.000 2.984 L 1.500 2.984 ZM 11.000 12.016 L 13.500 12.016 C 13.785 12.016 14.016 11.785 14.016 11.500 L 14.016 3.500 C 14.016 3.215 13.785 2.984 13.500 2.984 L 11.000 2.984 L 11.000 12.016 Z"),
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
        return _panelRight!!
    }

private var _panelRight: ImageVector? = null
