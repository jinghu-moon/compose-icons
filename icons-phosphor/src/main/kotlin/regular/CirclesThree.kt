package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CirclesThree: ImageVector
    get() {
        if (_circlesThree != null) return _circlesThree!!
        _circlesThree = phosphorRegularIcon(
            name = "CirclesThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.000 76.000 C 172.000 51.699 152.301 32.000 128.000 32.000 C 103.699 32.000 84.000 51.699 84.000 76.000 C 84.000 100.301 103.699 120.000 128.000 120.000 C 152.289 119.972 171.972 100.289 172.000 76.000 ZM 128.000 104.000 C 112.536 104.000 100.000 91.464 100.000 76.000 C 100.000 60.536 112.536 48.000 128.000 48.000 C 143.464 48.000 156.000 60.536 156.000 76.000 C 156.000 91.464 143.464 104.000 128.000 104.000 ZM 188.000 128.000 C 163.699 128.000 144.000 147.699 144.000 172.000 C 144.000 196.301 163.699 216.000 188.000 216.000 C 212.301 216.000 232.000 196.301 232.000 172.000 C 231.972 147.711 212.289 128.028 188.000 128.000 ZM 188.000 200.000 C 172.536 200.000 160.000 187.464 160.000 172.000 C 160.000 156.536 172.536 144.000 188.000 144.000 C 203.464 144.000 216.000 156.536 216.000 172.000 C 216.000 187.464 203.464 200.000 188.000 200.000 ZM 68.000 128.000 C 43.699 128.000 24.000 147.699 24.000 172.000 C 24.000 196.301 43.699 216.000 68.000 216.000 C 92.301 216.000 112.000 196.301 112.000 172.000 C 111.972 147.711 92.289 128.028 68.000 128.000 ZM 68.000 200.000 C 52.536 200.000 40.000 187.464 40.000 172.000 C 40.000 156.536 52.536 144.000 68.000 144.000 C 83.464 144.000 96.000 156.536 96.000 172.000 C 96.000 187.464 83.464 200.000 68.000 200.000 Z"),
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
        return _circlesThree!!
    }

private var _circlesThree: ImageVector? = null
