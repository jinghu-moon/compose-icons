package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cookie: ImageVector
    get() {
        if (_cookie != null) return _cookie!!
        _cookie = phosphorBoldIcon(
            name = "Cookie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M167.31 160.69c4.578 4.575 5.949 11.458 3.473 17.438-2.476 5.98-8.311 9.879-14.783 9.879-6.472 0-12.307-3.899-14.783-9.879-2.476-5.98-1.105-12.863 3.473-17.438 6.248-6.243 16.372-6.243 22.62 0ZM80.69 152.69c-4.578 4.575-5.949 11.458-3.473 17.438 2.476 5.98 8.311 9.879 14.783 9.879 6.472 0 12.307-3.899 14.783-9.879 2.476-5.98 1.105-12.863-3.473-17.438-6.248-6.243-16.372-6.243-22.62 0ZM95.31 119.31c4.578-4.575 5.949-11.458 3.473-17.438C96.307 95.892 90.472 91.993 84 91.993c-6.472 0-12.307 3.899-14.783 9.879-2.476 5.98-1.105 12.863 3.473 17.438 6.248 6.243 16.372 6.243 22.62 0ZM143.31 112.69c-4.575-4.578-11.458-5.949-17.438-3.473-5.98 2.476-9.879 8.311-9.879 14.783 0 6.472 3.899 12.307 9.879 14.783 5.98 2.476 12.863 1.105 17.438-3.473 6.243-6.248 6.243-16.372 0-22.62ZM236 128c0 59.647-48.353 108-108 108C68.353 236 20 187.647 20 128 20 68.353 68.353 20 128 20c6.627 0 12 5.373 12 12 0 19.882 16.118 36 36 36 6.627 0 12 5.373 12 12 0 19.882 16.118 36 36 36 6.627 0 12 5.373 12 12ZM211.33 138.65C187.72 133.51 169.475 114.745 165 91 141.254 86.53 122.485 68.289 117.34 44.68 74.067 50.228 42.244 87.979 44.098 131.567c1.854 43.588 36.767 78.501 80.355 80.355 43.588 1.854 81.339-29.969 86.887-73.242Z"),
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
        return _cookie!!
    }

private var _cookie: ImageVector? = null
