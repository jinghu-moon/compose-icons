package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) return _tiktokLogo!!
        _tiktokLogo = phosphorBoldIcon(
            name = "TiktokLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 68C199.711 67.972 180.028 48.289 180 24c0-6.627-5.373-12-12-12h-40c-6.627 0-12 5.373-12 12v132c-.005 7.927-5.814 14.655-13.656 15.817-7.842 1.161-15.352-3.594-17.654-11.18-2.303-7.585 1.296-15.713 8.46-19.107 4.184-1.988 6.851-6.207 6.85-10.84v-42.69c-.001-3.549-1.574-6.916-4.295-9.195C92.984 76.527 89.394 75.569 85.9 76.19 67.417 79.571 50.734 89.401 38.82 103.93 26.688 118.573 20.033 136.984 20 156c0 44.183 35.817 80 80 80 44.183 0 80-35.817 80-80v-33.33c13.844 6.179 28.839 9.358 44 9.33 6.627 0 12-5.373 12-12v-40c0-6.627-5.373-12-12-12ZM212 107.15c-13.362-1.89-26.061-7.008-37-14.91-3.657-2.627-8.478-2.985-12.483-.927C158.511 93.37 155.995 97.497 156 102v54c0 30.928-25.072 56-56 56C69.072 212 44 186.928 44 156c.075-21.85 12.453-41.794 32-51.56v19.56C60.952 135.286 55.8 155.533 63.625 172.638c7.824 17.106 26.51 26.449 44.89 22.445C126.894 191.079 140 174.81 140 156v-120h17.06c5.074 27.973 26.967 49.866 54.94 54.94Z"),
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
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
