package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CallBell: ImageVector
    get() {
        if (_callBell != null) return _callBell!!
        _callBell = phosphorBoldIcon(
            name = "CallBell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 24.000 180.000 L 232.000 180.000 C 238.627 180.000 244.000 174.627 244.000 168.000 C 244.000 161.373 238.627 156.000 232.000 156.000 L 227.910 156.000 C 225.884 107.001 188.677 66.676 140.000 60.720 L 140.000 44.000 L 152.000 44.000 C 158.627 44.000 164.000 38.627 164.000 32.000 C 164.000 25.373 158.627 20.000 152.000 20.000 L 104.000 20.000 C 97.373 20.000 92.000 25.373 92.000 32.000 C 92.000 38.627 97.373 44.000 104.000 44.000 L 116.000 44.000 L 116.000 60.720 C 67.323 66.676 30.116 107.001 28.090 156.000 L 24.000 156.000 C 17.373 156.000 12.000 161.373 12.000 168.000 C 12.000 174.627 17.373 180.000 24.000 180.000 ZM 128.000 84.000 C 168.399 84.048 201.718 115.659 203.890 156.000 L 52.110 156.000 C 54.282 115.659 87.601 84.048 128.000 84.000 ZM 244.000 208.000 C 244.000 214.627 238.627 220.000 232.000 220.000 L 24.000 220.000 C 17.373 220.000 12.000 214.627 12.000 208.000 C 12.000 201.373 17.373 196.000 24.000 196.000 L 232.000 196.000 C 238.627 196.000 244.000 201.373 244.000 208.000 Z"),
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
        return _callBell!!
    }

private var _callBell: ImageVector? = null
