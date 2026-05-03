package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerHifi: ImageVector
    get() {
        if (_speakerHifi != null) return _speakerHifi!!
        _speakerHifi = phosphorBoldIcon(
            name = "SpeakerHifi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 20.000 L 64.000 20.000 C 52.954 20.000 44.000 28.954 44.000 40.000 L 44.000 216.000 C 44.000 227.046 52.954 236.000 64.000 236.000 L 192.000 236.000 C 203.046 236.000 212.000 227.046 212.000 216.000 L 212.000 40.000 C 212.000 28.954 203.046 20.000 192.000 20.000 ZM 188.000 212.000 L 68.000 212.000 L 68.000 44.000 L 188.000 44.000 ZM 112.000 76.000 C 112.000 67.163 119.163 60.000 128.000 60.000 C 136.837 60.000 144.000 67.163 144.000 76.000 C 144.000 84.837 136.837 92.000 128.000 92.000 C 119.163 92.000 112.000 84.837 112.000 76.000 ZM 128.000 196.000 C 152.301 196.000 172.000 176.301 172.000 152.000 C 172.000 127.699 152.301 108.000 128.000 108.000 C 103.699 108.000 84.000 127.699 84.000 152.000 C 84.028 176.289 103.711 195.972 128.000 196.000 ZM 128.000 132.000 C 139.046 132.000 148.000 140.954 148.000 152.000 C 148.000 163.046 139.046 172.000 128.000 172.000 C 116.954 172.000 108.000 163.046 108.000 152.000 C 108.000 140.954 116.954 132.000 128.000 132.000 Z"),
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
        return _speakerHifi!!
    }

private var _speakerHifi: ImageVector? = null
