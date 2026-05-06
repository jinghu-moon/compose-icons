package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SlackLogo: ImageVector
    get() {
        if (_slackLogo != null) return _slackLogo!!
        _slackLogo = phosphorBoldIcon(
            name = "SlackLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 104C236 92.313 230.326 81.354 220.784 74.607 211.242 67.86 199.018 66.164 188 70.06v-14.06C187.987 41.809 179.639 28.95 166.682 23.163 153.725 17.375 138.577 19.74 128 29.2 115.747 18.256 97.638 16.995 83.987 26.137 70.336 35.278 64.606 52.502 70.06 68h-14.06C41.809 68.013 28.95 76.361 23.163 89.318c-5.787 12.957-3.423 28.105 6.037 38.682-10.944 12.253-12.205 30.361-3.063 44.013 9.142 13.651 26.365 19.381 41.863 13.927v14.06c.013 14.191 8.361 27.05 21.318 32.837 12.957 5.787 28.105 3.423 38.682-6.037 12.253 10.944 30.361 12.205 44.013 3.063 13.651-9.142 19.381-26.365 13.927-41.863h14.06c14.191-.013 27.05-8.361 32.837-21.318 5.787-12.957 3.423-28.105-6.037-38.682 5.93-6.586 9.208-15.137 9.2-24ZM200 92c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-12v-12c0-6.627 5.373-12 12-12ZM152 44c6.627 0 12 5.373 12 12v48c0 6.627-5.373 12-12 12h-12v-60c0-6.627 5.373-12 12-12ZM92 56c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v12h-12C97.373 68 92 62.627 92 56ZM56 92h48c6.627 0 12 5.373 12 12v12h-60c-6.627 0-12-5.373-12-12C44 97.373 49.373 92 56 92ZM56 164c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h12v12c0 6.627-5.373 12-12 12ZM104 212c-6.627 0-12-5.373-12-12v-48c0-6.627 5.373-12 12-12h12v60c0 6.627-5.373 12-12 12ZM164 200c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12h12c6.627 0 12 5.373 12 12ZM200 164h-48c-6.627 0-12-5.373-12-12v-12h60c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
