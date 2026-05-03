package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) return _closedCaptioning!!
        _closedCaptioning = phosphorBoldIcon(
            name = "ClosedCaptioning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 44.000 L 32.000 44.000 C 20.954 44.000 12.000 52.954 12.000 64.000 L 12.000 192.000 C 12.000 203.046 20.954 212.000 32.000 212.000 L 224.000 212.000 C 235.046 212.000 244.000 203.046 244.000 192.000 L 244.000 64.000 C 244.000 52.954 235.046 44.000 224.000 44.000 ZM 220.000 188.000 L 36.000 188.000 L 36.000 68.000 L 220.000 68.000 ZM 52.000 128.000 C 51.998 112.279 60.384 97.752 73.998 89.891 C 87.612 82.030 104.386 82.030 118.000 89.890 C 123.605 93.264 125.474 100.506 122.202 106.172 C 118.931 111.837 111.724 113.838 106.000 110.670 C 97.594 105.827 86.925 107.716 80.691 115.149 C 74.458 122.583 74.458 133.417 80.691 140.851 C 86.925 148.284 97.594 150.173 106.000 145.330 C 109.719 143.017 114.404 142.914 118.221 145.062 C 122.039 147.209 124.383 151.266 124.337 155.646 C 124.291 160.026 121.862 164.033 118.000 166.100 C 104.387 173.959 87.616 173.960 74.002 166.101 C 60.389 158.243 52.002 143.719 52.000 128.000 ZM 132.000 128.000 C 131.998 112.279 140.384 97.752 153.998 89.891 C 167.612 82.030 184.386 82.030 198.000 89.890 C 203.605 93.264 205.474 100.506 202.202 106.172 C 198.931 111.837 191.724 113.838 186.000 110.670 C 177.594 105.827 166.925 107.716 160.691 115.149 C 154.458 122.583 154.458 133.417 160.691 140.851 C 166.925 148.284 177.594 150.173 186.000 145.330 C 189.719 143.017 194.404 142.914 198.221 145.062 C 202.039 147.209 204.383 151.266 204.337 155.646 C 204.291 160.026 201.862 164.033 198.000 166.100 C 184.387 173.959 167.616 173.960 154.002 166.101 C 140.389 158.243 132.002 143.719 132.000 128.000 Z"),
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
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
