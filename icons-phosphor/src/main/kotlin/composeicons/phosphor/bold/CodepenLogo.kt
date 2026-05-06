package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) return _codepenLogo!!
        _codepenLogo = phosphorBoldIcon(
            name = "CodepenLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.68 85.43l-104-56c-3.552-1.913-7.828-1.913-11.38 0l-104 56C14.416 87.527 11.996 91.586 12 96v64c0 4.418 2.428 8.479 6.32 10.57l104 56c3.552 1.913 7.828 1.913 11.38 0l104-56c3.884-2.097 6.304-6.156 6.3-10.57v-64c-0-4.418-2.428-8.479-6.32-10.57ZM220 139.91 197.88 128 220 116.09ZM172.57 114.37 140 96.83v-36.74L206.69 96ZM128 138.37 108.74 128 128 117.63 147.26 128ZM116 60.09v36.74L83.43 114.37 49.31 96ZM36 116.09 58.12 128 36 139.91ZM83.43 141.63 116 159.17v36.74L49.31 160ZM140 195.91v-36.74l32.57-17.54L206.69 160Z"),
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
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
