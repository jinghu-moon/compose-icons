package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RowsPlusTop: ImageVector
    get() {
        if (_rowsPlusTop != null) return _rowsPlusTop!!
        _rowsPlusTop = phosphorLightIcon(
            name = "RowsPlusTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 162.000 L 48.000 162.000 C 40.268 162.000 34.000 168.268 34.000 176.000 L 34.000 200.000 C 34.000 207.732 40.268 214.000 48.000 214.000 L 208.000 214.000 C 215.732 214.000 222.000 207.732 222.000 200.000 L 222.000 176.000 C 222.000 168.268 215.732 162.000 208.000 162.000 ZM 210.000 200.000 C 210.000 201.105 209.105 202.000 208.000 202.000 L 48.000 202.000 C 46.895 202.000 46.000 201.105 46.000 200.000 L 46.000 176.000 C 46.000 174.895 46.895 174.000 48.000 174.000 L 208.000 174.000 C 209.105 174.000 210.000 174.895 210.000 176.000 ZM 208.000 90.000 L 48.000 90.000 C 40.268 90.000 34.000 96.268 34.000 104.000 L 34.000 128.000 C 34.000 135.732 40.268 142.000 48.000 142.000 L 208.000 142.000 C 215.732 142.000 222.000 135.732 222.000 128.000 L 222.000 104.000 C 222.000 96.268 215.732 90.000 208.000 90.000 ZM 210.000 128.000 C 210.000 129.105 209.105 130.000 208.000 130.000 L 48.000 130.000 C 46.895 130.000 46.000 129.105 46.000 128.000 L 46.000 104.000 C 46.000 102.895 46.895 102.000 48.000 102.000 L 208.000 102.000 C 209.105 102.000 210.000 102.895 210.000 104.000 ZM 98.000 40.000 C 98.000 36.686 100.686 34.000 104.000 34.000 L 122.000 34.000 L 122.000 16.000 C 122.000 12.686 124.686 10.000 128.000 10.000 C 131.314 10.000 134.000 12.686 134.000 16.000 L 134.000 34.000 L 152.000 34.000 C 155.314 34.000 158.000 36.686 158.000 40.000 C 158.000 43.314 155.314 46.000 152.000 46.000 L 134.000 46.000 L 134.000 64.000 C 134.000 67.314 131.314 70.000 128.000 70.000 C 124.686 70.000 122.000 67.314 122.000 64.000 L 122.000 46.000 L 104.000 46.000 C 100.686 46.000 98.000 43.314 98.000 40.000 Z"),
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
        return _rowsPlusTop!!
    }

private var _rowsPlusTop: ImageVector? = null
