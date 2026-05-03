package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SpeakerHifi: ImageVector
    get() {
        if (_speakerHifi != null) return _speakerHifi!!
        _speakerHifi = phosphorRegularIcon(
            name = "SpeakerHifi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 24.000 L 64.000 24.000 C 55.163 24.000 48.000 31.163 48.000 40.000 L 48.000 216.000 C 48.000 224.837 55.163 232.000 64.000 232.000 L 192.000 232.000 C 200.837 232.000 208.000 224.837 208.000 216.000 L 208.000 40.000 C 208.000 31.163 200.837 24.000 192.000 24.000 ZM 192.000 216.000 L 64.000 216.000 L 64.000 40.000 L 192.000 40.000 ZM 116.000 76.000 C 116.000 69.373 121.373 64.000 128.000 64.000 C 134.627 64.000 140.000 69.373 140.000 76.000 C 140.000 82.627 134.627 88.000 128.000 88.000 C 121.373 88.000 116.000 82.627 116.000 76.000 ZM 128.000 192.000 C 150.091 192.000 168.000 174.091 168.000 152.000 C 168.000 129.909 150.091 112.000 128.000 112.000 C 105.909 112.000 88.000 129.909 88.000 152.000 C 88.000 174.091 105.909 192.000 128.000 192.000 ZM 128.000 128.000 C 141.255 128.000 152.000 138.745 152.000 152.000 C 152.000 165.255 141.255 176.000 128.000 176.000 C 114.745 176.000 104.000 165.255 104.000 152.000 C 104.000 138.745 114.745 128.000 128.000 128.000 Z"),
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
