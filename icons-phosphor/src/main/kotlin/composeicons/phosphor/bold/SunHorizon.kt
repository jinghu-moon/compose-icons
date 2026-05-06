package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SunHorizon: ImageVector
    get() {
        if (_sunHorizon != null) return _sunHorizon!!
        _sunHorizon = phosphorBoldIcon(
            name = "SunHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 148h-36.11c.07-1.33 .11-2.66 .11-4C204 102.026 169.974 68 128 68 86.026 68 52 102.026 52 144c0 1.34 0 2.67 .11 4h-36.11C9.373 148 4 153.373 4 160c0 6.627 5.373 12 12 12h224c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM76 144C76 115.281 99.281 92 128 92c28.719 0 52 23.281 52 52 0 1.34-.07 2.67-.17 4h-103.66C76.07 146.67 76 145.34 76 144ZM220 200c0 6.627-5.373 12-12 12h-160c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h160c6.627 0 12 5.373 12 12ZM12.62 92.21c2.096-6.283 8.885-9.68 15.17-7.59l12 4c4.113 1.319 7.199 4.746 8.083 8.973 .883 4.228-.574 8.604-3.814 11.458-3.241 2.855-7.766 3.748-11.848 2.338l-12-4c-3.02-1.006-5.516-3.171-6.939-6.018-1.423-2.847-1.658-6.143-.651-9.162ZM68.62 43.8c-1.484-4.1-.628-8.682 2.236-11.969 2.865-3.287 7.287-4.762 11.551-3.852 4.264 .91 7.699 4.061 8.973 8.231l4 12c1.484 4.1 .628 8.682-2.236 11.969-2.865 3.287-7.287 4.762-11.551 3.852-4.264-.91-7.699-4.061-8.973-8.231ZM208.62 103.8c-1.007-3.019-.773-6.315 .651-9.162 1.423-2.847 3.92-5.012 6.939-6.018l12-4c6.262-2.008 12.973 1.398 15.05 7.637 2.077 6.239-1.254 12.987-7.47 15.133l-12 4c-6.285 2.09-13.074-1.307-15.17-7.59ZM160.62 48.21l4-12c1.273-4.17 4.709-7.321 8.973-8.231 4.264-.91 8.686 .565 11.551 3.852 2.865 3.287 3.721 7.869 2.236 11.969l-4 12c-1.273 4.17-4.709 7.321-8.973 8.231-4.264 .91-8.686-.565-11.551-3.852-2.865-3.287-3.721-7.869-2.236-11.969Z"),
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
        return _sunHorizon!!
    }

private var _sunHorizon: ImageVector? = null
