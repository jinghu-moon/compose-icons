package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerHifi: ImageVector
    get() {
        if (_speakerHifi != null) return _speakerHifi!!
        _speakerHifi = phosphorFillIcon(
            name = "SpeakerHifi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 160.000 C 152.000 173.255 141.255 184.000 128.000 184.000 C 114.745 184.000 104.000 173.255 104.000 160.000 C 104.000 146.745 114.745 136.000 128.000 136.000 C 141.255 136.000 152.000 146.745 152.000 160.000 ZM 208.000 40.000 L 208.000 216.000 C 208.000 224.837 200.837 232.000 192.000 232.000 L 64.000 232.000 C 55.163 232.000 48.000 224.837 48.000 216.000 L 48.000 40.000 C 48.000 31.163 55.163 24.000 64.000 24.000 L 192.000 24.000 C 200.837 24.000 208.000 31.163 208.000 40.000 ZM 116.000 68.000 C 116.000 74.627 121.373 80.000 128.000 80.000 C 134.627 80.000 140.000 74.627 140.000 68.000 C 140.000 61.373 134.627 56.000 128.000 56.000 C 121.373 56.000 116.000 61.373 116.000 68.000 ZM 168.000 160.000 C 168.000 137.909 150.091 120.000 128.000 120.000 C 105.909 120.000 88.000 137.909 88.000 160.000 C 88.000 182.091 105.909 200.000 128.000 200.000 C 150.091 200.000 168.000 182.091 168.000 160.000 Z"),
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
