package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FacebookLogo: ImageVector
    get() {
        if (_facebookLogo != null) return _facebookLogo!!
        _facebookLogo = phosphorBoldIcon(
            name = "FacebookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM140 211.13v-55.13h20c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-20v-20c0-6.627 5.373-12 12-12h16c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-16c-19.882 0-36 16.118-36 36v20h-20c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h20v55.13C72.394 204.836 41.061 165.921 44.216 121.976 47.371 78.031 83.942 43.992 128 43.992c44.058 0 80.629 34.04 83.784 77.985 3.155 43.945-28.178 82.86-71.784 89.154Z"),
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
        return _facebookLogo!!
    }

private var _facebookLogo: ImageVector? = null
