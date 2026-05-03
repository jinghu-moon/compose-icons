package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Microphone: ImageVector
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = phosphorThinIcon(
            name = "Microphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 172.000 C 152.289 171.972 171.972 152.289 172.000 128.000 L 172.000 64.000 C 172.000 39.699 152.301 20.000 128.000 20.000 C 103.699 20.000 84.000 39.699 84.000 64.000 L 84.000 128.000 C 84.028 152.289 103.711 171.972 128.000 172.000 ZM 92.000 64.000 C 92.000 44.118 108.118 28.000 128.000 28.000 C 147.882 28.000 164.000 44.118 164.000 64.000 L 164.000 128.000 C 164.000 147.882 147.882 164.000 128.000 164.000 C 108.118 164.000 92.000 147.882 92.000 128.000 ZM 132.000 203.890 L 132.000 240.000 C 132.000 242.209 130.209 244.000 128.000 244.000 C 125.791 244.000 124.000 242.209 124.000 240.000 L 124.000 203.890 C 83.659 201.718 52.048 168.399 52.000 128.000 C 52.000 125.791 53.791 124.000 56.000 124.000 C 58.209 124.000 60.000 125.791 60.000 128.000 C 60.000 165.555 90.445 196.000 128.000 196.000 C 165.555 196.000 196.000 165.555 196.000 128.000 C 196.000 125.791 197.791 124.000 200.000 124.000 C 202.209 124.000 204.000 125.791 204.000 128.000 C 203.952 168.399 172.341 201.718 132.000 203.890 Z"),
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
        return _microphone!!
    }

private var _microphone: ImageVector? = null
