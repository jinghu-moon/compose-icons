package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareDownLeft: ImageVector
    get() {
        if (_arrowSquareDownLeft != null) return _arrowSquareDownLeft!!
        _arrowSquareDownLeft = phosphorBoldIcon(
            name = "ArrowSquareDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 84.000 160.000 L 84.000 112.000 C 84.000 105.373 89.373 100.000 96.000 100.000 C 102.627 100.000 108.000 105.373 108.000 112.000 L 108.000 131.000 L 151.510 87.480 C 156.204 82.786 163.816 82.786 168.510 87.480 C 173.204 92.174 173.204 99.786 168.510 104.480 L 125.000 148.000 L 144.000 148.000 C 150.627 148.000 156.000 153.373 156.000 160.000 C 156.000 166.627 150.627 172.000 144.000 172.000 L 96.000 172.000 C 89.373 172.000 84.000 166.627 84.000 160.000 Z"),
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
        return _arrowSquareDownLeft!!
    }

private var _arrowSquareDownLeft: ImageVector? = null
