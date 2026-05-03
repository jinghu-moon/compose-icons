package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ColumnsPlusLeft: ImageVector
    get() {
        if (_columnsPlusLeft != null) return _columnsPlusLeft!!
        _columnsPlusLeft = phosphorLightIcon(
            name = "ColumnsPlusLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 34.000 L 104.000 34.000 C 96.268 34.000 90.000 40.268 90.000 48.000 L 90.000 208.000 C 90.000 215.732 96.268 222.000 104.000 222.000 L 128.000 222.000 C 135.732 222.000 142.000 215.732 142.000 208.000 L 142.000 48.000 C 142.000 40.268 135.732 34.000 128.000 34.000 ZM 130.000 208.000 C 130.000 209.105 129.105 210.000 128.000 210.000 L 104.000 210.000 C 102.895 210.000 102.000 209.105 102.000 208.000 L 102.000 48.000 C 102.000 46.895 102.895 46.000 104.000 46.000 L 128.000 46.000 C 129.105 46.000 130.000 46.895 130.000 48.000 ZM 200.000 34.000 L 176.000 34.000 C 168.268 34.000 162.000 40.268 162.000 48.000 L 162.000 208.000 C 162.000 215.732 168.268 222.000 176.000 222.000 L 200.000 222.000 C 207.732 222.000 214.000 215.732 214.000 208.000 L 214.000 48.000 C 214.000 40.268 207.732 34.000 200.000 34.000 ZM 202.000 208.000 C 202.000 209.105 201.105 210.000 200.000 210.000 L 176.000 210.000 C 174.895 210.000 174.000 209.105 174.000 208.000 L 174.000 48.000 C 174.000 46.895 174.895 46.000 176.000 46.000 L 200.000 46.000 C 201.105 46.000 202.000 46.895 202.000 48.000 ZM 70.000 128.000 C 70.000 131.314 67.314 134.000 64.000 134.000 L 46.000 134.000 L 46.000 152.000 C 46.000 155.314 43.314 158.000 40.000 158.000 C 36.686 158.000 34.000 155.314 34.000 152.000 L 34.000 134.000 L 16.000 134.000 C 12.686 134.000 10.000 131.314 10.000 128.000 C 10.000 124.686 12.686 122.000 16.000 122.000 L 34.000 122.000 L 34.000 104.000 C 34.000 100.686 36.686 98.000 40.000 98.000 C 43.314 98.000 46.000 100.686 46.000 104.000 L 46.000 122.000 L 64.000 122.000 C 67.314 122.000 70.000 124.686 70.000 128.000 Z"),
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
        return _columnsPlusLeft!!
    }

private var _columnsPlusLeft: ImageVector? = null
