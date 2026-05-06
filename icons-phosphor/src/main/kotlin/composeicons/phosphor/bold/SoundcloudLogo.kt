package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SoundcloudLogo: ImageVector
    get() {
        if (_soundcloudLogo != null) return _soundcloudLogo!!
        _soundcloudLogo = phosphorBoldIcon(
            name = "SoundcloudLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M32 120v48c0 6.627-5.373 12-12 12C13.373 180 8 174.627 8 168v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM60 84C53.373 84 48 89.373 48 96v96c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-96C72 89.373 66.627 84 60 84ZM100 44C93.373 44 88 49.373 88 56v136c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-136c0-6.627-5.373-12-12-12ZM222.34 103.33C214.408 64.155 179.97 35.995 140 36c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 30.829-.107 56.683 23.249 59.7 53.93 .531 5.273 4.457 9.573 9.66 10.58 14.174 2.743 23.939 15.812 22.551 30.182C230.523 169.062 218.437 180.021 204 180h-64c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h64c25.136 .015 46.684-17.951 51.189-42.68 4.505-24.729-9.323-49.14-32.849-57.99Z"),
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
        return _soundcloudLogo!!
    }

private var _soundcloudLogo: ImageVector? = null
