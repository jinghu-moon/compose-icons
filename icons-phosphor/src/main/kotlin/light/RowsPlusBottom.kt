package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RowsPlusBottom: ImageVector
    get() {
        if (_rowsPlusBottom != null) return _rowsPlusBottom!!
        _rowsPlusBottom = phosphorLightIcon(
            name = "RowsPlusBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 114.000 L 48.000 114.000 C 40.268 114.000 34.000 120.268 34.000 128.000 L 34.000 152.000 C 34.000 159.732 40.268 166.000 48.000 166.000 L 208.000 166.000 C 215.732 166.000 222.000 159.732 222.000 152.000 L 222.000 128.000 C 222.000 120.268 215.732 114.000 208.000 114.000 ZM 210.000 152.000 C 210.000 153.105 209.105 154.000 208.000 154.000 L 48.000 154.000 C 46.895 154.000 46.000 153.105 46.000 152.000 L 46.000 128.000 C 46.000 126.895 46.895 126.000 48.000 126.000 L 208.000 126.000 C 209.105 126.000 210.000 126.895 210.000 128.000 ZM 208.000 42.000 L 48.000 42.000 C 40.268 42.000 34.000 48.268 34.000 56.000 L 34.000 80.000 C 34.000 87.732 40.268 94.000 48.000 94.000 L 208.000 94.000 C 215.732 94.000 222.000 87.732 222.000 80.000 L 222.000 56.000 C 222.000 48.268 215.732 42.000 208.000 42.000 ZM 210.000 80.000 C 210.000 81.105 209.105 82.000 208.000 82.000 L 48.000 82.000 C 46.895 82.000 46.000 81.105 46.000 80.000 L 46.000 56.000 C 46.000 54.895 46.895 54.000 48.000 54.000 L 208.000 54.000 C 209.105 54.000 210.000 54.895 210.000 56.000 ZM 158.000 216.000 C 158.000 219.314 155.314 222.000 152.000 222.000 L 134.000 222.000 L 134.000 240.000 C 134.000 243.314 131.314 246.000 128.000 246.000 C 124.686 246.000 122.000 243.314 122.000 240.000 L 122.000 222.000 L 104.000 222.000 C 100.686 222.000 98.000 219.314 98.000 216.000 C 98.000 212.686 100.686 210.000 104.000 210.000 L 122.000 210.000 L 122.000 192.000 C 122.000 188.686 124.686 186.000 128.000 186.000 C 131.314 186.000 134.000 188.686 134.000 192.000 L 134.000 210.000 L 152.000 210.000 C 155.314 210.000 158.000 212.686 158.000 216.000 Z"),
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
        return _rowsPlusBottom!!
    }

private var _rowsPlusBottom: ImageVector? = null
