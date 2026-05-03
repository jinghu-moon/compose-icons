package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GridNine: ImageVector
    get() {
        if (_gridNine != null) return _gridNine!!
        _gridNine = phosphorRegularIcon(
            name = "GridNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 48.000 L 40.000 48.000 C 31.163 48.000 24.000 55.163 24.000 64.000 L 24.000 192.000 C 24.000 200.837 31.163 208.000 40.000 208.000 L 216.000 208.000 C 224.837 208.000 232.000 200.837 232.000 192.000 L 232.000 64.000 C 232.000 55.163 224.837 48.000 216.000 48.000 ZM 104.000 144.000 L 104.000 112.000 L 152.000 112.000 L 152.000 144.000 ZM 152.000 160.000 L 152.000 192.000 L 104.000 192.000 L 104.000 160.000 ZM 40.000 112.000 L 88.000 112.000 L 88.000 144.000 L 40.000 144.000 ZM 104.000 96.000 L 104.000 64.000 L 152.000 64.000 L 152.000 96.000 ZM 168.000 112.000 L 216.000 112.000 L 216.000 144.000 L 168.000 144.000 ZM 216.000 96.000 L 168.000 96.000 L 168.000 64.000 L 216.000 64.000 ZM 88.000 64.000 L 88.000 96.000 L 40.000 96.000 L 40.000 64.000 ZM 40.000 160.000 L 88.000 160.000 L 88.000 192.000 L 40.000 192.000 ZM 216.000 192.000 L 168.000 192.000 L 168.000 160.000 L 216.000 160.000 L 216.000 192.000 Z"),
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
        return _gridNine!!
    }

private var _gridNine: ImageVector? = null
