package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Peace: ImageVector
    get() {
        if (_peace != null) return _peace!!
        _peace = phosphorBoldIcon(
            name = "Peace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM212 128c.023 13.146-3.061 26.112-9 37.84L140 121.75v-76.88c41.299 6.013 71.944 41.396 72 83.13ZM116 44.87v76.88L53 165.84C40.779 141.705 40.941 113.16 53.434 89.165 65.927 65.17 89.22 48.669 116 44.84ZM66.83 185.48 116 151.05v60.08C97.175 208.404 79.837 199.359 66.83 185.48ZM140 211.13v-60.08l49.17 34.43C176.163 199.359 158.825 208.404 140 211.13Z"),
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
        return _peace!!
    }

private var _peace: ImageVector? = null
