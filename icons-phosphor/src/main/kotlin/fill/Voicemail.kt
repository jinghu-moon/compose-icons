package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Voicemail: ImageVector
    get() {
        if (_voicemail != null) return _voicemail!!
        _voicemail = phosphorFillIcon(
            name = "Voicemail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 72.000 C 177.256 72.021 156.783 85.797 148.196 106.858 C 139.609 127.919 144.614 152.082 160.860 168.000 L 95.140 168.000 C 114.265 149.262 117.450 119.607 102.740 97.235 C 88.030 74.862 59.542 66.033 34.758 76.164 C 9.974 86.295 -4.171 112.553 1.004 138.823 C 6.179 165.093 29.225 184.025 56.000 184.000 L 200.000 184.000 C 230.928 184.000 256.000 158.928 256.000 128.000 C 256.000 97.072 230.928 72.000 200.000 72.000 ZM 56.000 168.000 C 33.909 168.000 16.000 150.091 16.000 128.000 C 16.000 105.909 33.909 88.000 56.000 88.000 C 78.091 88.000 96.000 105.909 96.000 128.000 C 96.000 150.091 78.091 168.000 56.000 168.000 ZM 200.000 168.000 C 177.909 168.000 160.000 150.091 160.000 128.000 C 160.000 105.909 177.909 88.000 200.000 88.000 C 222.091 88.000 240.000 105.909 240.000 128.000 C 240.000 150.091 222.091 168.000 200.000 168.000 ZM 224.000 128.000 C 224.000 141.255 213.255 152.000 200.000 152.000 C 186.745 152.000 176.000 141.255 176.000 128.000 C 176.000 114.745 186.745 104.000 200.000 104.000 C 213.255 104.000 224.000 114.745 224.000 128.000 ZM 80.000 128.000 C 80.000 141.255 69.255 152.000 56.000 152.000 C 42.745 152.000 32.000 141.255 32.000 128.000 C 32.000 114.745 42.745 104.000 56.000 104.000 C 69.255 104.000 80.000 114.745 80.000 128.000 Z"),
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
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null
