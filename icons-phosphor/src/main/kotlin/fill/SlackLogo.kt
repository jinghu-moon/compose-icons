package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SlackLogo: ImageVector
    get() {
        if (_slackLogo != null) return _slackLogo!!
        _slackLogo = phosphorFillIcon(
            name = "SlackLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 221.130 128.000 C 233.343 117.103 235.364 98.747 225.815 85.454 C 216.266 72.160 198.226 68.216 184.000 76.310 L 184.000 56.000 C 183.985 42.698 175.742 30.792 163.297 26.096 C 150.851 21.400 136.798 24.893 128.000 34.870 C 117.103 22.657 98.747 20.636 85.454 30.185 C 72.160 39.734 68.216 57.774 76.310 72.000 L 56.000 72.000 C 42.698 72.015 30.792 80.258 26.096 92.703 C 21.400 105.149 24.893 119.202 34.870 128.000 C 22.657 138.897 20.636 157.253 30.185 170.546 C 39.734 183.839 57.774 187.784 72.000 179.690 L 72.000 200.000 C 72.015 213.302 80.258 225.208 92.703 229.904 C 105.149 234.600 119.202 231.107 128.000 221.130 C 138.897 233.343 157.253 235.364 170.546 225.815 C 183.839 216.266 187.784 198.226 179.690 184.000 L 200.000 184.000 C 213.302 183.985 225.208 175.742 229.904 163.297 C 234.600 150.851 231.107 136.798 221.130 128.000 ZM 88.000 56.000 C 88.000 47.163 95.163 40.000 104.000 40.000 C 112.837 40.000 120.000 47.163 120.000 56.000 L 120.000 72.000 L 104.000 72.000 C 95.163 72.000 88.000 64.837 88.000 56.000 ZM 40.000 104.000 C 40.000 95.163 47.163 88.000 56.000 88.000 L 104.000 88.000 C 112.837 88.000 120.000 95.163 120.000 104.000 L 120.000 120.000 L 56.000 120.000 C 47.163 120.000 40.000 112.837 40.000 104.000 ZM 168.000 200.000 C 168.000 208.837 160.837 216.000 152.000 216.000 C 143.163 216.000 136.000 208.837 136.000 200.000 L 136.000 184.000 L 152.000 184.000 C 160.837 184.000 168.000 191.163 168.000 200.000 ZM 200.000 168.000 L 152.000 168.000 C 143.163 168.000 136.000 160.837 136.000 152.000 L 136.000 136.000 L 200.000 136.000 C 208.837 136.000 216.000 143.163 216.000 152.000 C 216.000 160.837 208.837 168.000 200.000 168.000 Z"),
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
        return _slackLogo!!
    }

private var _slackLogo: ImageVector? = null
