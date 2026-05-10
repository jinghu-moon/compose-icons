package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Balloon: ImageVector
    get() {
        if (_balloon != null) return _balloon!!
        _balloon = phosphorFillIcon(
            name = "Balloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 16C79.422 16.055 40.055 55.422 40 104c0 23.43 9.4 49.42 25.13 69.5 12.08 15.41 26.5 26 41.91 31.09L96.65 228.85c-1.058 2.471-.805 5.309 .674 7.553 1.48 2.244 3.987 3.596 6.676 3.597h48c2.688-.001 5.196-1.353 6.676-3.597 1.48-2.244 1.733-5.082 .674-7.553L149 204.59c15.4-5.07 29.83-15.68 41.91-31.09C206.6 153.42 216 127.43 216 104 215.945 55.422 176.578 16.055 128 16ZM177.32 103.89c-.436 .071-.878 .108-1.32 .11-3.905-.005-7.236-2.829-7.88-6.68C165.09 80.269 151.741 66.92 134.69 63.89c-2.841-.448-5.222-2.387-6.238-5.077-1.016-2.691-.509-5.719 1.327-7.933 1.836-2.213 4.719-3.271 7.551-2.77 23.757 4.215 42.355 22.813 46.57 46.57 .35 2.094-.147 4.241-1.381 5.969-1.234 1.727-3.104 2.894-5.199 3.241Z"),
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
        return _balloon!!
    }

private var _balloon: ImageVector? = null
