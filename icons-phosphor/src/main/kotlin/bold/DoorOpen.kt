package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DoorOpen: ImageVector
    get() {
        if (_doorOpen != null) return _doorOpen!!
        _doorOpen = phosphorBoldIcon(
            name = "DoorOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 212.000 L 212.000 212.000 L 212.000 40.000 C 212.000 28.954 203.046 20.000 192.000 20.000 L 64.000 20.000 C 52.954 20.000 44.000 28.954 44.000 40.000 L 44.000 212.000 L 24.000 212.000 C 17.373 212.000 12.000 217.373 12.000 224.000 C 12.000 230.627 17.373 236.000 24.000 236.000 L 232.000 236.000 C 238.627 236.000 244.000 230.627 244.000 224.000 C 244.000 217.373 238.627 212.000 232.000 212.000 ZM 188.000 212.000 L 172.000 212.000 L 172.000 44.000 L 188.000 44.000 ZM 68.000 44.000 L 148.000 44.000 L 148.000 212.000 L 68.000 212.000 ZM 136.000 128.000 C 136.000 136.837 128.837 144.000 120.000 144.000 C 111.163 144.000 104.000 136.837 104.000 128.000 C 104.000 119.163 111.163 112.000 120.000 112.000 C 128.837 112.000 136.000 119.163 136.000 128.000 Z"),
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
        return _doorOpen!!
    }

private var _doorOpen: ImageVector? = null
