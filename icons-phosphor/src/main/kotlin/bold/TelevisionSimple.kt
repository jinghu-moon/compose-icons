package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TelevisionSimple: ImageVector
    get() {
        if (_televisionSimple != null) return _televisionSimple!!
        _televisionSimple = phosphorBoldIcon(
            name = "TelevisionSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 60.000 L 157.000 60.000 L 184.520 32.480 C 189.214 27.786 189.214 20.174 184.520 15.480 C 179.826 10.786 172.214 10.786 167.520 15.480 L 128.000 55.000 L 88.490 15.510 C 83.796 10.816 76.184 10.816 71.490 15.510 C 66.796 20.204 66.796 27.816 71.490 32.510 L 99.000 60.000 L 40.000 60.000 C 28.954 60.000 20.000 68.954 20.000 80.000 L 20.000 200.000 C 20.000 211.046 28.954 220.000 40.000 220.000 L 216.000 220.000 C 227.046 220.000 236.000 211.046 236.000 200.000 L 236.000 80.000 C 236.000 68.954 227.046 60.000 216.000 60.000 ZM 212.000 196.000 L 44.000 196.000 L 44.000 84.000 L 212.000 84.000 Z"),
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
        return _televisionSimple!!
    }

private var _televisionSimple: ImageVector? = null
