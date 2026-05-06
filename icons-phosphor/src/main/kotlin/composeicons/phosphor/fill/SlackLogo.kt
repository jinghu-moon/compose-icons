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
                pathData = parseSvgPathData("M221.13 128c12.213-10.897 14.234-29.253 4.685-42.546C216.266 72.16 198.226 68.216 184 76.31v-20.31C183.985 42.698 175.742 30.792 163.297 26.096 150.851 21.4 136.798 24.893 128 34.87 117.103 22.657 98.747 20.636 85.454 30.185 72.16 39.734 68.216 57.774 76.31 72h-20.31C42.698 72.015 30.792 80.258 26.096 92.703c-4.696 12.446-1.203 26.498 8.774 35.297-12.213 10.897-14.234 29.253-4.685 42.546 9.549 13.293 27.59 17.238 41.815 9.144v20.31c.015 13.302 8.258 25.208 20.703 29.904 12.446 4.696 26.498 1.203 35.297-8.774 10.897 12.213 29.253 14.234 42.546 4.685 13.293-9.549 17.238-27.59 9.144-41.815h20.31c13.302-.015 25.208-8.258 29.904-20.703 4.696-12.446 1.203-26.498-8.774-35.297ZM88 56c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v16h-16C95.163 72 88 64.837 88 56ZM40 104C40 95.163 47.163 88 56 88h48c8.837 0 16 7.163 16 16v16h-64c-8.837 0-16-7.163-16-16ZM168 200c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16v-16h16c8.837 0 16 7.163 16 16ZM200 168h-48c-8.837 0-16-7.163-16-16v-16h64c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
