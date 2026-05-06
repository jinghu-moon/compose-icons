package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Intersect: ImageVector
    get() {
        if (_intersect != null) return _intersect!!
        _intersect = phosphorBoldIcon(
            name = "Intersect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M178 78C169.084 37.21 131.562 9.161 89.917 12.154 48.272 15.146 15.146 48.272 12.154 89.917 9.161 131.562 37.21 169.084 78 178c8.916 40.79 46.438 68.839 88.083 65.846 41.645-2.992 74.771-36.118 77.764-77.764C246.839 124.438 218.79 86.916 178 78ZM155.81 100.19c-.705 10.322-4.086 20.282-9.81 28.9L126.94 110c8.615-5.735 18.575-9.126 28.9-9.84ZM76.31 152.7C49.812 143.524 33.204 117.218 36.313 89.35 39.423 61.481 61.421 39.483 89.29 36.373c27.869-3.11 54.175 13.499 63.35 39.997-40.546 3.619-72.681 35.754-76.3 76.3ZM100.13 155.87c.705-10.322 4.086-20.282 9.81-28.9L129.06 146c-8.615 5.735-18.575 9.126-28.9 9.84ZM160 220c-25.544-.035-48.274-16.215-56.67-40.34 40.568-3.607 72.723-35.762 76.33-76.33 27.646 9.616 44.319 37.776 39.455 66.64C214.251 198.834 189.271 219.975 160 220Z"),
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
        return _intersect!!
    }

private var _intersect: ImageVector? = null
