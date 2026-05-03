package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Voicemail: ImageVector
    get() {
        if (_voicemail != null) return _voicemail!!
        _voicemail = phosphorDuotoneIcon(
            name = "Voicemail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 104.000 128.000 C 104.000 154.510 82.510 176.000 56.000 176.000 C 29.490 176.000 8.000 154.510 8.000 128.000 C 8.000 101.490 29.490 80.000 56.000 80.000 C 82.510 80.000 104.000 101.490 104.000 128.000 ZM 200.000 80.000 C 173.490 80.000 152.000 101.490 152.000 128.000 C 152.000 154.510 173.490 176.000 200.000 176.000 C 226.510 176.000 248.000 154.510 248.000 128.000 C 248.000 101.490 226.510 80.000 200.000 80.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 200.000 72.000 C 177.256 72.021 156.783 85.797 148.196 106.858 C 139.609 127.919 144.614 152.082 160.860 168.000 L 95.140 168.000 C 114.265 149.262 117.450 119.607 102.740 97.235 C 88.030 74.862 59.542 66.033 34.758 76.164 C 9.974 86.295 -4.171 112.553 1.004 138.823 C 6.179 165.093 29.225 184.025 56.000 184.000 L 200.000 184.000 C 230.928 184.000 256.000 158.928 256.000 128.000 C 256.000 97.072 230.928 72.000 200.000 72.000 ZM 16.000 128.000 C 16.000 105.909 33.909 88.000 56.000 88.000 C 78.091 88.000 96.000 105.909 96.000 128.000 C 96.000 150.091 78.091 168.000 56.000 168.000 C 33.909 168.000 16.000 150.091 16.000 128.000 ZM 200.000 168.000 C 177.909 168.000 160.000 150.091 160.000 128.000 C 160.000 105.909 177.909 88.000 200.000 88.000 C 222.091 88.000 240.000 105.909 240.000 128.000 C 240.000 150.091 222.091 168.000 200.000 168.000 Z"),
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
