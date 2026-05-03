package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Voicemail: ImageVector
    get() {
        if (_voicemail != null) return _voicemail!!
        _voicemail = phosphorLightIcon(
            name = "Voicemail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 74.000 C 177.125 74.022 156.746 88.454 149.131 110.024 C 141.516 131.594 148.318 155.622 166.110 170.000 L 89.890 170.000 C 110.349 153.466 115.918 124.596 103.077 101.639 C 90.236 78.681 62.721 68.317 37.925 77.097 C 13.128 85.877 -1.734 111.247 2.733 137.169 C 7.200 163.092 29.695 182.025 56.000 182.000 L 200.000 182.000 C 229.823 182.000 254.000 157.823 254.000 128.000 C 254.000 98.177 229.823 74.000 200.000 74.000 ZM 14.000 128.000 C 14.000 104.804 32.804 86.000 56.000 86.000 C 79.196 86.000 98.000 104.804 98.000 128.000 C 98.000 151.196 79.196 170.000 56.000 170.000 C 32.804 170.000 14.000 151.196 14.000 128.000 ZM 200.000 170.000 C 176.804 170.000 158.000 151.196 158.000 128.000 C 158.000 104.804 176.804 86.000 200.000 86.000 C 223.196 86.000 242.000 104.804 242.000 128.000 C 242.000 151.196 223.196 170.000 200.000 170.000 Z"),
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
