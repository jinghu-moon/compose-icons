package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Smiley: ImageVector
    get() {
        if (_smiley != null) return _smiley!!
        _smiley = phosphorBoldIcon(
            name = "Smiley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M178.39 158C167.39 177.06 149 188 128 188 107 188 88.64 177.07 77.61 158c-3.168-5.724-1.167-12.931 4.498-16.202 5.665-3.272 12.907-1.403 16.282 4.202 3.89 6.73 12.91 18 29.61 18 16.7 0 25.72-11.28 29.61-18 2.101-3.797 6.088-6.163 10.428-6.189 4.339-.026 8.355 2.293 10.501 6.064 2.146 3.771 2.09 8.408-.149 12.125ZM236 128c0 59.647-48.353 108-108 108C68.353 236 20 187.647 20 128 20 68.353 68.353 20 128 20c59.619 .066 107.934 48.381 108 108ZM212 128C212 81.608 174.392 44 128 44 81.608 44 44 81.608 44 128c0 46.392 37.608 84 84 84 46.371-.05 83.95-37.629 84-84ZM92 124c8.837 0 16-7.163 16-16C108 99.163 100.837 92 92 92c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16ZM164 92c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16Z"),
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
        return _smiley!!
    }

private var _smiley: ImageVector? = null
