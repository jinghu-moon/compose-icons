package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpotifyLogo: ImageVector
    get() {
        if (_spotifyLogo != null) return _spotifyLogo!!
        _spotifyLogo = phosphorLightIcon(
            name = "SpotifyLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM157.31 168.8c-.742 1.409-2.014 2.465-3.535 2.936-1.521 .471-3.167 .318-4.575-.426-13.237-7.12-29.163-7.12-42.4 0-2.933 1.546-6.564 .423-8.11-2.51-1.546-2.933-.423-6.564 2.51-8.11 16.768-8.859 36.832-8.859 53.6 0 1.409 .742 2.465 2.014 2.936 3.535 .471 1.521 .318 3.167-.426 4.575ZM189.31 112.8c-1.563 2.921-5.198 4.023-8.12 2.46-33.217-17.78-73.123-17.78-106.34 0-1.893 1.047-4.204 .994-6.047-.14-1.843-1.133-2.933-3.171-2.853-5.333 .08-2.162 1.318-4.114 3.24-5.107 36.752-19.675 80.908-19.675 117.66 0 1.405 .754 2.452 2.036 2.909 3.564 .458 1.527 .289 3.174-.469 4.576ZM173.31 140.8c-1.039 1.969-3.083 3.201-5.31 3.2-.983-.002-1.951-.242-2.82-.7-23.237-12.395-51.123-12.395-74.36 0-2.927 1.557-6.563 .447-8.12-2.48-1.557-2.927-.447-6.563 2.48-8.12 26.763-14.272 58.877-14.272 85.64 0 1.406 .747 2.458 2.023 2.923 3.546 .465 1.523 .306 3.169-.443 4.574Z"),
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
        return _spotifyLogo!!
    }

private var _spotifyLogo: ImageVector? = null
