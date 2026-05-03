package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ColumnsPlusRight: ImageVector
    get() {
        if (_columnsPlusRight != null) return _columnsPlusRight!!
        _columnsPlusRight = phosphorLightIcon(
            name = "ColumnsPlusRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 80.000 34.000 L 56.000 34.000 C 48.268 34.000 42.000 40.268 42.000 48.000 L 42.000 208.000 C 42.000 215.732 48.268 222.000 56.000 222.000 L 80.000 222.000 C 87.732 222.000 94.000 215.732 94.000 208.000 L 94.000 48.000 C 94.000 40.268 87.732 34.000 80.000 34.000 ZM 82.000 208.000 C 82.000 209.105 81.105 210.000 80.000 210.000 L 56.000 210.000 C 54.895 210.000 54.000 209.105 54.000 208.000 L 54.000 48.000 C 54.000 46.895 54.895 46.000 56.000 46.000 L 80.000 46.000 C 81.105 46.000 82.000 46.895 82.000 48.000 ZM 152.000 34.000 L 128.000 34.000 C 120.268 34.000 114.000 40.268 114.000 48.000 L 114.000 208.000 C 114.000 215.732 120.268 222.000 128.000 222.000 L 152.000 222.000 C 159.732 222.000 166.000 215.732 166.000 208.000 L 166.000 48.000 C 166.000 40.268 159.732 34.000 152.000 34.000 ZM 154.000 208.000 C 154.000 209.105 153.105 210.000 152.000 210.000 L 128.000 210.000 C 126.895 210.000 126.000 209.105 126.000 208.000 L 126.000 48.000 C 126.000 46.895 126.895 46.000 128.000 46.000 L 152.000 46.000 C 153.105 46.000 154.000 46.895 154.000 48.000 ZM 246.000 128.000 C 246.000 131.314 243.314 134.000 240.000 134.000 L 222.000 134.000 L 222.000 152.000 C 222.000 155.314 219.314 158.000 216.000 158.000 C 212.686 158.000 210.000 155.314 210.000 152.000 L 210.000 134.000 L 192.000 134.000 C 188.686 134.000 186.000 131.314 186.000 128.000 C 186.000 124.686 188.686 122.000 192.000 122.000 L 210.000 122.000 L 210.000 104.000 C 210.000 100.686 212.686 98.000 216.000 98.000 C 219.314 98.000 222.000 100.686 222.000 104.000 L 222.000 122.000 L 240.000 122.000 C 243.314 122.000 246.000 124.686 246.000 128.000 Z"),
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
        return _columnsPlusRight!!
    }

private var _columnsPlusRight: ImageVector? = null
